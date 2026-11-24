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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class eg implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eg(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:324:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0510  */
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
        File[] listFiles;
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
        int i10 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                kk7.f(i10).k(4, new Object[0]);
                gl.d3(new kf((sc7) obj, (byte) 1), 250L);
                break;
            case 1:
                l46 l46Var = (l46) obj;
                ArrayList v = qu2.r(i10).v(11);
                String M0 = k96.M0(2131751229, null);
                if (v != null && !v.isEmpty()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < v.size()) {
                            if (v.get(i11) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = k96.M0(2131751229, null);
                            } else {
                                if ((v.get(i11) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i11) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    M0 = k96.M0(2131751230, null);
                                }
                                i11++;
                            }
                        }
                    }
                }
                l46Var.setText(gl.E2(gl.N2(M0, -1, 0, new re(v, (byte) 0), null), true, gl.L(2.6666667f), gl.L(0.66f)));
                break;
            case 2:
                na7.q1(i10).Y2(0, ((TLRPC.Chat) obj).id, true);
                break;
            case 3:
                ((e00) obj).b.onAudioFocusChange(i10);
                break;
            case 4:
                o30 o30Var = (o30) ((tg2) obj).c;
                String str = g8c.a;
                ko koVar = ((t54) o30Var).a.C;
                r54 r54Var = new r54(i10);
                koVar.getClass();
                gre.p(Looper.myLooper() == ((cdb) koVar.c).a.getLooper());
                koVar.a++;
                koVar.j(new z20(koVar, r54Var, (byte) 5));
                koVar.p(Integer.valueOf(i10));
                break;
            case 5:
                File file2 = (File) obj;
                Set set = s60.a;
                long currentTimeMillis = System.currentTimeMillis();
                if (w01.a) {
                    fa4.b("checkKeepMedia start task");
                }
                ArrayList arrayList = new ArrayList();
                int i12 = 0;
                boolean z2 = false;
                while (i12 < 4) {
                    if (y6c.h(i12).o()) {
                        o51 o51Var = y6c.h(i12).getMessagesController().h4;
                        arrayList.add(o51Var);
                        if (o51Var.e().size() > 0) {
                            z2 = true;
                        }
                    }
                    i12++;
                    z2 = z2;
                }
                int[] iArr = new int[4];
                boolean z3 = true;
                long j6 = Long.MAX_VALUE;
                for (int i13 = 0; i13 < 4; i13++) {
                    int i14 = gba.q().getInt(de9.k(i13, "keep_media_type_"), o51.b(i13));
                    iArr[i13] = i14;
                    if (i14 != 2) {
                        z3 = false;
                    }
                    long a = o51.a(i14);
                    if (a < j6) {
                        j6 = a;
                    }
                }
                if (z2) {
                    z3 = false;
                }
                SparseArray h = fl5.z().h();
                long j7 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i15 < h.size()) {
                    if (z3 && (h.keyAt(i15) == i9 || h.keyAt(i15) == i7)) {
                        i4 = i7;
                        j2 = currentTimeMillis;
                        i5 = i9;
                    } else {
                        int i17 = h.keyAt(i15) == i8 ? i9 : 0;
                        try {
                            listFiles = ((File) h.valueAt(i15)).listFiles();
                            i4 = i7;
                        } catch (Throwable th) {
                            th = th;
                            i4 = i7;
                        }
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            if (listFiles != null) {
                                for (int i18 = 0; i18 < listFiles.length; i18++) {
                                    if (!listFiles[i18].isDirectory() && !set.contains(listFiles[i18].getAbsolutePath())) {
                                        arrayList2.add(new n51(listFiles[i18]));
                                    }
                                }
                            }
                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                ((o51) arrayList.get(i19)).g(arrayList2);
                            }
                            int i20 = 0;
                            while (i20 < arrayList2.size()) {
                                n51 n51Var = (n51) arrayList2.get(i20);
                                boolean z4 = n51Var.d;
                                File file3 = n51Var.a;
                                try {
                                    if (z4) {
                                        j4 = o51.a(iArr[i4]);
                                        j2 = currentTimeMillis;
                                    } else {
                                        j2 = currentTimeMillis;
                                        int i21 = n51Var.b;
                                        if (i21 == 2) {
                                            continue;
                                        } else {
                                            if (i21 >= 0) {
                                                j3 = o51.a(i21);
                                            } else {
                                                int i22 = n51Var.c;
                                                if (i22 >= 0) {
                                                    j3 = o51.a(iArr[i22]);
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
                                            if (w01.a) {
                                                i16++;
                                                j7 += file3.length();
                                            }
                                            file3.delete();
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                    }
                                    i20++;
                                    currentTimeMillis = j2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    i5 = 1;
                                    fa4.g(th, true);
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
                        } catch (Throwable th3) {
                            th = th3;
                            j2 = currentTimeMillis;
                            i5 = 1;
                            fa4.g(th, true);
                            i15++;
                            i9 = i5;
                            i7 = i4;
                            currentTimeMillis = j2;
                            i8 = 4;
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
                int i24 = gba.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID);
                if (i24 != Integer.MAX_VALUE) {
                    long j9 = i24 == i23 ? 314572800L : (i24 << 20) * 1000;
                    long j10 = 0;
                    for (int i25 = 0; i25 < h.size(); i25++) {
                        j10 += Utilities.getDirSize(((File) h.valueAt(i25)).getAbsolutePath(), 0, true);
                    }
                    if (j10 > j9) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i26 = 0; i26 < h.size(); i26++) {
                            s60.a((File) h.valueAt(i26), arrayList3);
                        }
                        for (int i27 = 0; i27 < arrayList.size(); i27++) {
                            ((o51) arrayList.get(i27)).g(arrayList3);
                        }
                        Collections.sort(arrayList3, new sa((byte) 4));
                        j = 0;
                        int i28 = 0;
                        i2 = 0;
                        i3 = 0;
                        while (true) {
                            if (i28 < arrayList3.size()) {
                                if (((r60) arrayList3.get(i28)).b == 2) {
                                    i = i16;
                                } else {
                                    i = i16;
                                    if (((r60) arrayList3.get(i28)).e <= 0) {
                                        i2++;
                                    } else {
                                        long length = ((r60) arrayList3.get(i28)).a.length();
                                        j10 -= length;
                                        i3++;
                                        j += length;
                                        try {
                                            ((r60) arrayList3.get(i28)).a.delete();
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
                                fa4.g(th4, true);
                            }
                        }
                        na7.c1().edit().putInt("lastKeepMediaCheckTime", gba.G).apply();
                        if (!w01.a) {
                            fa4.b("checkKeepMedia task end time " + (System.currentTimeMillis() - j8) + " auto deleted info: files " + i + " size " + gl.i0(j7, false, false) + "   deleted by size limit info: files " + i3 + " size " + gl.i0(j, false, false) + " unknownTimeFiles " + i2);
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
                na7.c1().edit().putInt("lastKeepMediaCheckTime", gba.G).apply();
                if (!w01.a) {
                }
                break;
            case 6:
                ((v60) ((lj9) obj).b).Z(i10, true);
                break;
            case 7:
                ((spc) obj).B(i10);
                break;
            case 8:
                hd0 hd0Var = (hd0) obj;
                if (hd0Var.b) {
                    p8c p8cVar = hd0Var.d;
                    if (p8cVar != null) {
                        p8cVar.a(Boolean.valueOf(i10 < 300));
                        try {
                            hd0Var.a.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    hd0Var.c = true;
                    int max = Math.max(50, i10 - 100);
                    gl.d3(new eg((Object) hd0Var, max, (byte) 8), max);
                    break;
                }
                break;
            case 9:
                hd[] hdVarArr = (hd[]) obj;
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    try {
                        hdVar.setOnCancelListener(new a01(i10, z ? 1 : 0));
                        hdVarArr[0].show();
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 10:
                mb1 mb1Var = (mb1) obj;
                je5 je5Var = mb1Var.d1;
                if (mb1Var.b1 != i10) {
                    mb1Var.setTimer(i10);
                    p8c p8cVar2 = mb1Var.r1;
                    if (p8cVar2 != null) {
                        p8cVar2.a(Integer.valueOf(i10));
                    }
                    if (i10 == 0) {
                        S2 = k96.M0(mb1Var.q1 ? 2131743887 : 2131743892, null);
                        je5Var.h = mb1Var.getMeasuredWidth();
                        je5Var.p(false);
                        je5Var.m(13.0f, 4.0f, 10.0f, 4.0f);
                        je5Var.f0 = gl.L(0.0f);
                        je5Var.e0 = -gl.L(1.0f);
                    } else if (i10 == Integer.MAX_VALUE) {
                        S2 = k96.M0(mb1Var.q1 ? 2131743886 : 2131743891, null);
                        je5Var.h = mb1Var.getMeasuredWidth();
                        je5Var.p(false);
                        je5Var.m(13.0f, 4.0f, 10.0f, 4.0f);
                        je5Var.f0 = gl.L(0.0f);
                        je5Var.e0 = -gl.L(1.0f);
                    } else if (i10 > 0) {
                        S2 = gl.S2(k96.G(i10, mb1Var.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", new Object[0]));
                        je5Var.p(true);
                        je5Var.h = je5.a(S2, je5Var.getTextPaint());
                        je5Var.m(12.0f, 7.0f, 11.0f, 7.0f);
                        je5Var.f0 = gl.L(2.0f);
                        je5Var.e0 = 0.0f;
                    }
                    je5Var.setTranslationY(((-Math.min(gl.L(34.0f), mb1Var.getEditTextHeight())) - gl.L(14.0f)) * (mb1Var instanceof y78 ? -1.0f : 1.0f));
                    je5Var.t(S2);
                    oy8 oy8Var = new oy8(i10 > 0 ? R.raw.fire_on : R.raw.fire_off, gl.L(34.0f), gl.L(34.0f));
                    oy8Var.start();
                    je5Var.l(oy8Var);
                    je5Var.v();
                    mb1Var.o1 = false;
                    gl.r(mb1Var.p1);
                    mb1Var.invalidate();
                    break;
                }
                break;
            case 11:
                ((ob1) obj).a(Integer.valueOf(i10));
                break;
            case 12:
                ((ob1) obj).a(Integer.valueOf(i10));
                break;
            case 13:
                ((ui1) obj).f.c(i10);
                break;
            case 14:
                mu1 mu1Var = ((op1) obj).g;
                if (mu1Var.ac == i10) {
                    mu1Var.Wa();
                    break;
                }
                break;
            case 15:
                mu1 mu1Var2 = ((pp1) obj).g;
                if (mu1Var2.ac == i10) {
                    mu1Var2.Wa();
                    break;
                }
                break;
            case 16:
                ((vp1) obj).a.J(this.b, 0, 0, 0, true, true);
                break;
            case 17:
                mu1 mu1Var3 = ((op1) obj).g;
                if (mu1Var3.ac == i10) {
                    mu1Var3.Wa();
                    break;
                }
                break;
            case 18:
                mu1 mu1Var4 = ((pp1) obj).g;
                if (mu1Var4.ac == i10) {
                    mu1Var4.Wa();
                    break;
                }
                break;
            case 19:
                mu1 mu1Var5 = ((pp1) obj).g;
                if (mu1Var5.ac == i10) {
                    mu1Var5.Wa();
                    break;
                }
                break;
            case 20:
                mu1 mu1Var6 = ((at1) obj).D0;
                mu1Var6.C0.g1(i10, mu1Var6.O4);
                break;
            case 21:
                i6 = ((d) ((wt1) obj).a).currentAccount;
                ConnectionsManager.getInstance(i6).cancelRequest(i10, true);
                break;
            case 22:
                ((zic) obj).a(Integer.valueOf(i10));
                break;
            case 23:
                ((zic) obj).a(Integer.valueOf(i10));
                break;
            case 24:
                l52 l52Var = (l52) obj;
                UndoView undoView = l52Var.Q.x;
                if (i10 == l52Var.P && undoView.isShown()) {
                    undoView.d(1, true);
                    break;
                }
                break;
            case 25:
                i4d i4dVar = (i4d) obj;
                i4dVar.getClass();
                try {
                    ((jq1) i4dVar.a).scrollBy(0, i10);
                    break;
                } catch (Throwable th5) {
                    fa4.g(th5, true);
                    return;
                }
            case 26:
                gb2 gb2Var = ((ua2) obj).a;
                int i29 = gb2Var.N5;
                if (i10 == i29) {
                    wo0 wo0Var = (wo0) gb2Var.I5.get(i29);
                    if (wo0Var != null) {
                        ff0 ff0Var = wo0Var.s;
                        if (ff0Var != null) {
                            ff0Var.setState(StateSet.NOTHING);
                        }
                        wo0Var.b(false);
                        if (!gb2Var.Q5.r1) {
                            if (wo0Var.j != null) {
                                gb2Var.o();
                            } else if (wo0Var.i != null) {
                                gb2Var.o();
                                bb2 bb2Var = gb2Var.eb;
                                if (bb2Var != null) {
                                    bb2Var.v0(gb2Var, wo0Var.i);
                                }
                            }
                        }
                    }
                    gb2Var.N5 = -1;
                    gb2Var.r2();
                    break;
                }
                break;
            case 27:
                ConnectionsManager.lambda$onUpdateConfig$21(i10, (TLRPC.TL_config) obj);
                break;
            default:
                fx0 fx0Var = (fx0) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    fx0Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i10);
                    S.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ eg(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
