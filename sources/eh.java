// default package

import android.os.Looper;
import android.util.SparseArray;
import android.util.StateSet;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eh implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eh(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:329:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0523  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        long j;
        int i2;
        int i3;
        File file;
        int i4;
        long j2;
        int i5;
        long j3;
        long j4;
        long j5;
        CharSequence S2;
        int i6;
        byte b = this.a;
        int i7 = 3;
        int i8 = 4;
        int i9 = 1;
        boolean z = false;
        boolean z2 = false;
        int i10 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                nm7.f(i10).k(4, new Object[0]);
                gm.d3(new kg((ue7) obj, (byte) 1), 250L);
                break;
            case 1:
                l66 l66Var = (l66) obj;
                ArrayList v = bw2.r(i10).v(11);
                String M0 = jb6.M0(2131751178, null);
                if (v != null && !v.isEmpty()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < v.size()) {
                            if (v.get(i11) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = jb6.M0(2131751178, null);
                            } else {
                                if ((v.get(i11) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i11) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    M0 = jb6.M0(2131751179, null);
                                }
                                i11++;
                            }
                        }
                    }
                }
                l66Var.setText(gm.E2(gm.N2(M0, -1, 0, new sf(v, (byte) 0), null), true, gm.L(2.6666667f), gm.L(0.66f)));
                break;
            case 2:
                oc7.r1(i10).a3(0, ((TLRPC.Chat) obj).id, true);
                break;
            case 3:
                ((e10) obj).b.onAudioFocusChange(i10);
                break;
            case 4:
                o40 o40Var = (o40) ((lx6) obj).c;
                String str = hac.a;
                kp kpVar = ((c74) o40Var).a.C;
                b74 b74Var = new b74(i10);
                kpVar.getClass();
                jte.p(Looper.myLooper() == ((dfb) kpVar.c).a.getLooper());
                kpVar.a++;
                kpVar.j(new x30(kpVar, b74Var, (byte) 6));
                kpVar.p(Integer.valueOf(i10));
                break;
            case 5:
                File file2 = (File) obj;
                Set set = s70.a;
                long currentTimeMillis = System.currentTimeMillis();
                if (e21.a) {
                    fc4.b("checkKeepMedia start task");
                }
                ArrayList arrayList = new ArrayList();
                int i12 = 0;
                boolean z3 = false;
                while (i12 < 4) {
                    if (z8c.h(i12).o()) {
                        v61 v61Var = z8c.h(i12).getMessagesController().h4;
                        arrayList.add(v61Var);
                        if (v61Var.e().size() > 0) {
                            z3 = true;
                        }
                    }
                    i12++;
                    z3 = z3;
                }
                int[] iArr = new int[4];
                boolean z4 = true;
                long j6 = Long.MAX_VALUE;
                for (int i13 = 0; i13 < 4; i13++) {
                    int i14 = gda.q().getInt(hg9.j(i13, "keep_media_type_"), v61.b(i13));
                    iArr[i13] = i14;
                    if (i14 != 2) {
                        z4 = false;
                    }
                    long a = v61.a(i14);
                    if (a < j6) {
                        j6 = a;
                    }
                }
                if (z3) {
                    z4 = false;
                }
                SparseArray h = fn5.z().h();
                long j7 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i15 < h.size()) {
                    if (z4 && (h.keyAt(i15) == i9 || h.keyAt(i15) == i7)) {
                        i4 = i7;
                        j2 = currentTimeMillis;
                        i5 = i9;
                    } else {
                        int i17 = h.keyAt(i15) == i8 ? i9 : 0;
                        try {
                            File[] listFiles = ((File) h.valueAt(i15)).listFiles();
                            i4 = i7;
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                if (listFiles != null) {
                                    for (int i18 = 0; i18 < listFiles.length; i18++) {
                                        if (!listFiles[i18].isDirectory() && !set.contains(listFiles[i18].getAbsolutePath())) {
                                            arrayList2.add(new u61(listFiles[i18]));
                                        }
                                    }
                                }
                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                    ((v61) arrayList.get(i19)).g(arrayList2);
                                }
                                int i20 = 0;
                                while (i20 < arrayList2.size()) {
                                    u61 u61Var = (u61) arrayList2.get(i20);
                                    boolean z5 = u61Var.d;
                                    File file3 = u61Var.a;
                                    try {
                                        if (z5) {
                                            j4 = v61.a(iArr[i4]);
                                            j2 = currentTimeMillis;
                                        } else {
                                            j2 = currentTimeMillis;
                                            int i21 = u61Var.b;
                                            if (i21 == 2) {
                                                continue;
                                            } else {
                                                if (i21 >= 0) {
                                                    j3 = v61.a(i21);
                                                } else {
                                                    int i22 = u61Var.c;
                                                    if (i22 >= 0) {
                                                        j3 = v61.a(iArr[i22]);
                                                    } else if (i17 == 0) {
                                                        j3 = j6;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                if (j3 != Long.MAX_VALUE) {
                                                    j4 = j3;
                                                } else {
                                                    continue;
                                                }
                                            }
                                            i20++;
                                            currentTimeMillis = j2;
                                        }
                                        long lastUsageFileTime = Utilities.getLastUsageFileTime(file3.getAbsolutePath());
                                        if (lastUsageFileTime > 316000000 && lastUsageFileTime < j5 && !set.contains(file3.getPath())) {
                                            try {
                                                if (e21.a) {
                                                    i16++;
                                                    j7 += file3.length();
                                                }
                                                file3.delete();
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                            }
                                        }
                                        i20++;
                                        currentTimeMillis = j2;
                                    } catch (Throwable th) {
                                        th = th;
                                        i5 = 1;
                                        fc4.g(th, true);
                                        i15++;
                                        i9 = i5;
                                        i7 = i4;
                                        currentTimeMillis = j2;
                                        i8 = 4;
                                    }
                                    j5 = i10 - j4;
                                }
                                j2 = currentTimeMillis;
                                i5 = 1;
                            } catch (Throwable th2) {
                                th = th2;
                                j2 = currentTimeMillis;
                                i5 = 1;
                                fc4.g(th, true);
                                i15++;
                                i9 = i5;
                                i7 = i4;
                                currentTimeMillis = j2;
                                i8 = 4;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            i4 = i7;
                        }
                    }
                    i15++;
                    i9 = i5;
                    i7 = i4;
                    currentTimeMillis = j2;
                    i8 = 4;
                }
                long j8 = currentTimeMillis;
                int i23 = i9;
                int i24 = gda.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID);
                if (i24 != Integer.MAX_VALUE) {
                    long j9 = i24 == i23 ? 314572800L : (i24 << 20) * 1000;
                    long j10 = 0;
                    for (int i25 = 0; i25 < h.size(); i25++) {
                        j10 += Utilities.getDirSize(((File) h.valueAt(i25)).getAbsolutePath(), 0, true);
                    }
                    if (j10 > j9) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i26 = 0; i26 < h.size(); i26++) {
                            s70.a((File) h.valueAt(i26), arrayList3);
                        }
                        for (int i27 = 0; i27 < arrayList.size(); i27++) {
                            ((v61) arrayList.get(i27)).g(arrayList3);
                        }
                        Collections.sort(arrayList3, new sa((byte) 4));
                        j = 0;
                        int i28 = 0;
                        i2 = 0;
                        i3 = 0;
                        while (true) {
                            if (i28 < arrayList3.size()) {
                                if (((r70) arrayList3.get(i28)).b == 2) {
                                    i = i16;
                                } else {
                                    i = i16;
                                    if (((r70) arrayList3.get(i28)).e <= 0) {
                                        i2++;
                                    } else {
                                        long length = ((r70) arrayList3.get(i28)).a.length();
                                        j10 -= length;
                                        i3++;
                                        j += length;
                                        try {
                                            ((r70) arrayList3.get(i28)).a.delete();
                                        } catch (Exception unused) {
                                        }
                                        if (j10 >= j9) {
                                        }
                                    }
                                }
                                i28++;
                                i16 = i;
                            } else {
                                i = i16;
                            }
                        }
                        file = new File(file2, "acache");
                        if (file.exists()) {
                            try {
                                Utilities.clearDir(file.getAbsolutePath(), 0, i10 - 86400, false);
                            } catch (Throwable th4) {
                                fc4.g(th4, true);
                            }
                        }
                        oc7.d1().edit().putInt("lastKeepMediaCheckTime", gda.G).apply();
                        if (!e21.a) {
                            fc4.b("checkKeepMedia task end time " + (System.currentTimeMillis() - j8) + " auto deleted info: files " + i + " size " + gm.i0(j7, false, false) + "   deleted by size limit info: files " + i3 + " size " + gm.i0(j, false, false) + " unknownTimeFiles " + i2);
                            break;
                        }
                    }
                }
                i = i16;
                j = 0;
                i2 = 0;
                i3 = 0;
                file = new File(file2, "acache");
                if (file.exists()) {
                }
                oc7.d1().edit().putInt("lastKeepMediaCheckTime", gda.G).apply();
                if (!e21.a) {
                }
                break;
            case 6:
                ((v70) ((nl9) obj).b).a0(i10, true);
                break;
            case 7:
                ((trc) obj).B(i10);
                break;
            case 8:
                he0 he0Var = (he0) obj;
                if (he0Var.b) {
                    qac qacVar = he0Var.d;
                    if (qacVar != null) {
                        qacVar.a(Boolean.valueOf(i10 < 300));
                        try {
                            he0Var.a.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    he0Var.c = true;
                    int max = Math.max(50, i10 - 100);
                    gm.d3(new eh((Object) he0Var, max, (byte) 8), max);
                    break;
                }
                break;
            case 9:
                he[] heVarArr = (he[]) obj;
                he heVar = heVarArr[0];
                if (heVar != null) {
                    try {
                        heVar.setOnCancelListener(new i11(i10, z ? 1 : 0));
                        heVarArr[0].show();
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 10:
                tc1 tc1Var = (tc1) obj;
                hg5 hg5Var = tc1Var.d1;
                if (tc1Var.b1 != i10) {
                    tc1Var.setTimer(i10);
                    qac qacVar2 = tc1Var.r1;
                    if (qacVar2 != null) {
                        qacVar2.a(Integer.valueOf(i10));
                    }
                    if (i10 == 0) {
                        S2 = jb6.M0(tc1Var.q1 ? 2131743813 : 2131743818, null);
                        hg5Var.h = tc1Var.getMeasuredWidth();
                        hg5Var.p(false);
                        hg5Var.m(13.0f, 4.0f, 10.0f, 4.0f);
                        hg5Var.f0 = gm.L(0.0f);
                        hg5Var.e0 = -gm.L(1.0f);
                    } else if (i10 == Integer.MAX_VALUE) {
                        S2 = jb6.M0(tc1Var.q1 ? 2131743812 : 2131743817, null);
                        hg5Var.h = tc1Var.getMeasuredWidth();
                        hg5Var.p(false);
                        hg5Var.m(13.0f, 4.0f, 10.0f, 4.0f);
                        hg5Var.f0 = gm.L(0.0f);
                        hg5Var.e0 = -gm.L(1.0f);
                    } else if (i10 > 0) {
                        S2 = gm.S2(jb6.G(i10, tc1Var.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", new Object[0]));
                        hg5Var.p(true);
                        hg5Var.h = hg5.a(S2, hg5Var.getTextPaint());
                        hg5Var.m(12.0f, 7.0f, 11.0f, 7.0f);
                        hg5Var.f0 = gm.L(2.0f);
                        hg5Var.e0 = 0.0f;
                    }
                    hg5Var.setTranslationY(((-Math.min(gm.L(34.0f), tc1Var.getEditTextHeight())) - gm.L(14.0f)) * (tc1Var instanceof ba8 ? -1.0f : 1.0f));
                    hg5Var.t(S2);
                    p09 p09Var = new p09(i10 > 0 ? R.raw.fire_on : R.raw.fire_off, gm.L(34.0f), gm.L(34.0f));
                    p09Var.start();
                    hg5Var.l(p09Var);
                    hg5Var.v();
                    tc1Var.o1 = false;
                    gm.r(tc1Var.p1);
                    tc1Var.invalidate();
                    break;
                }
                break;
            case 11:
                ((vc1) obj).a(Integer.valueOf(i10));
                break;
            case 12:
                ((vc1) obj).a(Integer.valueOf(i10));
                break;
            case 13:
                ((dk1) obj).f.c(i10);
                break;
            case 14:
                yv1 yv1Var = ((br1) obj).g;
                if (yv1Var.kc == i10) {
                    yv1Var.gb();
                    break;
                }
                break;
            case 15:
                ((ir1) obj).a.J(this.b, 0, 0, 0, true, true);
                break;
            case 16:
                yv1 yv1Var2 = ((cr1) obj).g;
                if (yv1Var2.kc == i10) {
                    yv1Var2.gb();
                    break;
                }
                break;
            case 17:
                yv1 yv1Var3 = ((br1) obj).g;
                if (yv1Var3.kc == i10) {
                    yv1Var3.gb();
                    break;
                }
                break;
            case 18:
                yv1 yv1Var4 = ((cr1) obj).g;
                if (yv1Var4.kc == i10) {
                    yv1Var4.gb();
                    break;
                }
                break;
            case 19:
                yv1 yv1Var5 = ((cr1) obj).g;
                if (yv1Var5.kc == i10) {
                    yv1Var5.gb();
                    break;
                }
                break;
            case 20:
                yv1 yv1Var6 = ((mu1) obj).D0;
                yv1Var6.C0.g1(i10, yv1Var6.O4);
                break;
            case 21:
                i6 = ((d) ((iv1) obj).a).currentAccount;
                ConnectionsManager.getInstance(i6).cancelRequest(i10, true);
                break;
            case 22:
                ((zkc) obj).a(Integer.valueOf(i10));
                break;
            case 23:
                ((zkc) obj).a(Integer.valueOf(i10));
                break;
            case 24:
                la4 la4Var = (la4) obj;
                String f = ia4.f(i10);
                if (f != null) {
                    ia4.d.postRunnable(new ba4(f, la4Var, z2 ? 1 : 0));
                    break;
                }
                break;
            case 25:
                w62 w62Var = (w62) obj;
                UndoView undoView = w62Var.Q.x;
                if (i10 == w62Var.P && undoView.isShown()) {
                    undoView.d(1, true);
                    break;
                }
                break;
            case 26:
                nl9 nl9Var = (nl9) obj;
                nl9Var.getClass();
                try {
                    ((vr1) nl9Var.b).scrollBy(0, i10);
                    break;
                } catch (Throwable th5) {
                    fc4.g(th5, true);
                    return;
                }
            case 27:
                rc2 rc2Var = ((fc2) obj).a;
                int i29 = rc2Var.N5;
                if (i10 == i29) {
                    wp0 wp0Var = (wp0) rc2Var.I5.get(i29);
                    if (wp0Var != null) {
                        fg0 fg0Var = wp0Var.s;
                        if (fg0Var != null) {
                            fg0Var.setState(StateSet.NOTHING);
                        }
                        wp0Var.b(false);
                        if (!rc2Var.Q5.r1) {
                            if (wp0Var.j != null) {
                                rc2Var.o();
                            } else if (wp0Var.i != null) {
                                rc2Var.o();
                                mc2 mc2Var = rc2Var.eb;
                                if (mc2Var != null) {
                                    mc2Var.m0(rc2Var, wp0Var.i);
                                }
                            }
                        }
                    }
                    rc2Var.N5 = -1;
                    rc2Var.r2();
                    break;
                }
                break;
            case 28:
                ConnectionsManager.lambda$onUpdateConfig$21(i10, (TLRPC.TL_config) obj);
                break;
            default:
                my0 my0Var = (my0) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    my0Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i10);
                    S.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ eh(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
