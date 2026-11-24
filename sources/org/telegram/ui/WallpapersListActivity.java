package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class WallpapersListActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public static final int[][] h0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] i0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] j0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] k0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] l0 = {2131753673, 2131746150, 2131747575, 2131742583, 2131749311, 2131744012, 2131746383, 2131747041, 2131752867, 2131753694, 2131749312, 2131742620};
    public krc E;
    public lrc F;
    public o39 G;
    public mrc H;
    public orc I;
    public zr J;
    public xha K;
    public g24 L;
    public hd M;
    public gl2 N;
    public byte O;
    public String P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public boolean W;
    public boolean X;
    public final ArrayList Y;
    public final HashMap Z;
    public int a;
    public final HashMap a0;
    public int b;
    public final ArrayList b0;
    public int c;
    public final ArrayList c0;
    public int d;
    public ArrayList d0;
    public int e;
    public final HashMap e0;
    public int f;
    public final LongSparseArray f0;
    public boolean g0;
    public int h;
    public int n;
    public final boolean r;
    public Paint s;
    private int uploadImageRow;
    public Paint w;
    public krc x;
    public lrc y;

    /* JADX WARN: Multi-variable type inference failed */
    public WallpapersListActivity(int i) {
        super(null);
        this.O = (byte) 3;
        this.P = "";
        this.Y = new ArrayList();
        this.Z = new HashMap();
        this.a0 = new HashMap();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = new HashMap();
        this.f0 = new LongSparseArray();
        this.r = i;
    }

    public static void z0(ArrayList arrayList, boolean z) {
        for (int[] iArr : z ? i0 : h0) {
            if (iArr.length == 1) {
                arrayList.add(new krc(iArr[0], 0, 45, "c"));
            } else {
                arrayList.add(new krc(iArr[0], iArr[1], iArr[2], iArr[3], "c"));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14, types: [org.telegram.tgnet.TLRPC$TL_wallPaper, org.telegram.tgnet.TLRPC$WallPaper] */
    /* JADX WARN: Type inference failed for: r5v15, types: [krc] */
    public final void A0() {
        HashMap hashMap;
        TLRPC.TL_wallPaper tL_wallPaper;
        final String str;
        final long j;
        Object obj;
        TLRPC.TL_wallPaper tL_wallPaper2;
        TLRPC.WallPaper wallPaper;
        krc krcVar;
        int i;
        int i2;
        krc krcVar2;
        int i3;
        int i4;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper3;
        Object obj2;
        ?? r0 = this.r;
        if (r0 == 0 || r0 == 2) {
            na7.c1();
            krc krcVar3 = this.x;
            ArrayList arrayList = this.b0;
            if (krcVar3 != null) {
                arrayList.remove(krcVar3);
                this.x = null;
            }
            lrc lrcVar = this.y;
            if (lrcVar != null) {
                arrayList.remove(lrcVar);
                this.y = null;
            }
            krc krcVar4 = this.E;
            if (krcVar4 == null) {
                krc krcVar5 = new krc(-2368069, -9722489, -2762611, -7817084, "d");
                this.E = krcVar5;
                krcVar5.h = 0.34f;
            } else {
                arrayList.remove(krcVar4);
            }
            lrc lrcVar2 = this.F;
            if (lrcVar2 != null) {
                arrayList.remove(lrcVar2);
            }
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                hashMap = this.Z;
                if (i5 >= size) {
                    tL_wallPaper = 0;
                    break;
                }
                Object obj3 = arrayList.get(i5);
                if (obj3 instanceof krc) {
                    tL_wallPaper = (krc) obj3;
                    String str3 = tL_wallPaper.a;
                    if (str3 != null) {
                        tL_wallPaper.g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(tL_wallPaper.a)) {
                        String str4 = tL_wallPaper.a;
                        if (str4 != null && !TextUtils.equals(this.P, str4)) {
                            i5++;
                        }
                    }
                    if (this.Q == tL_wallPaper.b) {
                        int i6 = this.R;
                        if (i6 != tL_wallPaper.c) {
                            continue;
                        } else if (this.S != tL_wallPaper.d) {
                            continue;
                        } else if (this.T != tL_wallPaper.e) {
                            continue;
                        } else if (i6 == 0 || this.U == tL_wallPaper.f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i5++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                        if (tL_wallPaper.settings != null && TextUtils.equals(this.P, tL_wallPaper.slug) && this.Q == bkb.Y0(tL_wallPaper.settings.background_color) && this.R == bkb.Y0(tL_wallPaper.settings.second_background_color) && this.S == bkb.Y0(tL_wallPaper.settings.third_background_color) && this.T == bkb.Y0(tL_wallPaper.settings.fourth_background_color) && ((this.R == 0 || this.U == gl.q1(tL_wallPaper.settings.rotation, false)) && Math.abs(bkb.S0(tL_wallPaper.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i5++;
                }
            }
            if (tL_wallPaper instanceof TLRPC.WallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper;
                vjb vjbVar = bkb.I.j0;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper4.settings;
                if (wallPaperSettings != null && this.Q == bkb.Y0(wallPaperSettings.background_color) && this.R == bkb.Y0(tL_wallPaper4.settings.second_background_color) && this.S == bkb.Y0(tL_wallPaper4.settings.third_background_color) && this.T == bkb.Y0(tL_wallPaper4.settings.fourth_background_color) && (this.R == 0 || this.S != 0 || this.U == gl.q1(tL_wallPaper4.settings.rotation, false) || Math.abs(bkb.S0(tL_wallPaper4.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
                    str2 = this.P;
                    tL_wallPaper3 = null;
                    obj2 = tL_wallPaper;
                } else {
                    str2 = "";
                    tL_wallPaper3 = tL_wallPaper4;
                    obj2 = null;
                }
                str = str2;
                tL_wallPaper2 = tL_wallPaper3;
                obj = obj2;
                j = tL_wallPaper4.id;
            } else {
                str = this.P;
                j = (!(tL_wallPaper instanceof krc) || (wallPaper = tL_wallPaper.k) == null) ? 0L : wallPaper.id;
                obj = tL_wallPaper;
                tL_wallPaper2 = null;
            }
            final boolean o = bkb.B0().o();
            try {
                Collections.sort(arrayList, new Comparator() { // from class: drc
                    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
                    
                        if (r7 == false) goto L36;
                     */
                    @Override // java.util.Comparator
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final int compare(Object obj4, Object obj5) {
                        ArrayList arrayList2 = WallpapersListActivity.this.Y;
                        if (obj4 instanceof krc) {
                            obj4 = ((krc) obj4).k;
                        }
                        if (obj5 instanceof krc) {
                            obj5 = ((krc) obj5).k;
                        }
                        if (!(obj4 instanceof TLRPC.WallPaper) || !(obj5 instanceof TLRPC.WallPaper)) {
                            return 0;
                        }
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j2 = j;
                        if (j2 == 0) {
                            String str5 = wallPaper2.slug;
                            String str6 = str;
                            if (str6.equals(str5)) {
                                return -1;
                            }
                            if (str6.equals(wallPaper3.slug)) {
                                return 1;
                            }
                        } else {
                            if (wallPaper2.id == j2) {
                                return -1;
                            }
                            if (wallPaper3.id == j2) {
                                return 1;
                            }
                        }
                        boolean z = o;
                        if (!z) {
                            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper2.slug)) {
                                return -1;
                            }
                            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper3.slug)) {
                                return 1;
                            }
                        }
                        int indexOf = arrayList2.indexOf(wallPaper2);
                        int indexOf2 = arrayList2.indexOf(wallPaper3);
                        boolean z2 = wallPaper2.dark;
                        boolean z3 = wallPaper3.dark;
                        if (z2) {
                            if (!z3) {
                                if (!z3) {
                                    return z ? -1 : 1;
                                }
                                return z ? 1 : -1;
                            }
                            if (indexOf <= indexOf2) {
                                return indexOf < indexOf2 ? -1 : 0;
                            }
                            return 1;
                        }
                    }
                });
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (bkb.e1() && TextUtils.isEmpty(bkb.g0)) {
                lrc lrcVar3 = this.F;
                if (lrcVar3 == null) {
                    lrcVar3 = new lrc();
                    lrcVar3.a = "t";
                    lrcVar3.b = -2;
                    lrcVar3.c = -2;
                    this.F = lrcVar3;
                }
                arrayList.add(0, lrcVar3);
            } else {
                this.F = null;
            }
            akb akbVar = bkb.I;
            if (TextUtils.isEmpty(this.P) || (!"d".equals(this.P) && obj == null)) {
                if ("c".equals(this.P) || (i2 = this.Q) == 0) {
                    int i7 = this.Q;
                    if (i7 != 0) {
                        int i8 = this.R;
                        if (i8 == 0 || (i = this.S) == 0) {
                            krcVar = new krc(i7, i8, this.U, this.P);
                            this.x = krcVar;
                        } else {
                            krcVar = new krc(i7, i8, i, this.T, this.P);
                            this.x = krcVar;
                            krcVar.f = this.U;
                        }
                        arrayList.add(0, krcVar);
                    } else if (akbVar.j0 != null && !hashMap.containsKey(this.P)) {
                        lrc lrcVar4 = new lrc(sqc.e(akbVar.j0.a), sqc.e(akbVar.j0.b), this.P);
                        this.y = lrcVar4;
                        arrayList.add(this.F != null ? 1 : 0, lrcVar4);
                    }
                } else if (akbVar.j0 != null) {
                    krc krcVar6 = new krc(this.P, i2, this.R, this.S, this.T, this.U, this.V, this.W);
                    this.x = krcVar6;
                    krcVar6.g = tL_wallPaper2;
                    arrayList.add(0, krcVar6);
                }
            } else if (obj == null && this.Q != 0 && "c".equals(this.P)) {
                int i9 = this.R;
                if (i9 == 0 || (i3 = this.S) == 0 || (i4 = this.T) == 0) {
                    krcVar2 = new krc(this.Q, i9, this.U, this.P);
                    this.x = krcVar2;
                } else {
                    krcVar2 = new krc(this.Q, i9, i3, i4, this.P);
                    this.x = krcVar2;
                    krcVar2.f = this.U;
                }
                arrayList.add(0, krcVar2);
            }
            if ("d".equals(this.P) || arrayList.isEmpty()) {
                arrayList.add(0, this.E);
            } else {
                arrayList.add(1, this.E);
            }
            G0();
        }
    }

    public final void B0() {
        if (this.simpleActionBar.x()) {
            this.f0.clear();
            this.simpleActionBar.w();
            H0();
        }
        hd hdVar = new hd(3, null, getParentActivity());
        this.M = hdVar;
        hdVar.j0 = false;
        hdVar.show();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetWallPapers(), new wx9(this, (byte) 24));
    }

    public final void C0(int i) {
        if (getParentActivity() == null || this.G.getAdapter() == this.I) {
            return;
        }
        if (i == this.uploadImageRow) {
            this.N.K();
            return;
        }
        if (i == this.b) {
            WallpapersListActivity wallpapersListActivity = new WallpapersListActivity(1);
            wallpapersListActivity.d0 = this.d0;
            presentFragment(wallpapersListActivity);
        } else if (i == this.e) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131745913, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131745914, null);
            alertDialog$Builder.j(k96.M0(2131745925, null), new erc(this));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, null);
            }
        }
    }

    public final void D0(boolean z) {
        long j = 0;
        if (!z) {
            ArrayList arrayList = this.Y;
            int size = arrayList.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof TLRPC.WallPaper) {
                    long j3 = ((TLRPC.WallPaper) obj).id;
                    if (j3 >= 0) {
                        j2 = hq6.r(j2, j3);
                    }
                }
            }
            j = j2;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new i81((byte) 13, this, z)), this.classGuid);
    }

    public final void E0(u12 u12Var, Object obj, int i) {
        Object obj2 = obj;
        boolean z = true;
        if (this.simpleActionBar.x()) {
            Object obj3 = obj2 instanceof krc ? ((krc) obj2).k : obj2;
            if (obj3 instanceof TLRPC.WallPaper) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj3;
                long j = wallPaper.id;
                LongSparseArray longSparseArray = this.f0;
                int indexOfKey = longSparseArray.indexOfKey(j);
                long j2 = wallPaper.id;
                if (indexOfKey >= 0) {
                    longSparseArray.remove(j2);
                } else {
                    longSparseArray.put(j2, obj2);
                }
                int size = longSparseArray.size();
                pha phaVar = this.simpleActionBar;
                if (size == 0) {
                    phaVar.w();
                } else {
                    phaVar.F(longSparseArray.size(), true);
                }
                this.g0 = false;
                u12Var.c(i, longSparseArray.indexOfKey(wallPaper.id) >= 0, true);
                return;
            }
            return;
        }
        boolean z2 = obj2 instanceof TLRPC.TL_wallPaper;
        Bitmap bitmap = null;
        String str = z2 ? ((TLRPC.TL_wallPaper) obj2).slug : obj2 instanceof krc ? ((krc) obj2).a : obj2 instanceof lrc ? ((lrc) obj2).a : null;
        if (z2) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                krc krcVar = new krc(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, gl.q1(wallPaperSettings.rotation, false), r1.intensity / 100.0f, tL_wallPaper.settings.motion);
                krcVar.g = tL_wallPaper;
                krcVar.k = tL_wallPaper;
                obj2 = krcVar;
            }
        }
        nd2 nd2Var = new nd2(obj2, bitmap, z, (byte) 4);
        if (this.r) {
            nd2Var.K1 = new erc(this);
        }
        if (this.P.equals(str)) {
            boolean z3 = this.X;
            boolean z4 = this.W;
            float f = this.V;
            nd2Var.H1 = z3;
            nd2Var.G1 = z4;
            nd2Var.p1 = f;
        }
        nd2Var.W0 = this.d0;
        if (nd2Var.b == 1 || (nd2Var.D1 instanceof krc)) {
            ((krc) nd2Var.D1).getClass();
        }
        nd2Var.g1(0L);
        ag0 ag0Var = new ag0();
        ag0Var.a = true;
        nd2Var.a.a = this.resourceProvider;
        ag0Var.c = new cza((byte) 16);
        ag0Var.e = true;
        showAsSheet(nd2Var, ag0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean F0(u12 u12Var, Object obj, int i) {
        boolean z = this.r;
        if (z != 2 && z != 3) {
            Object obj2 = obj instanceof krc ? ((krc) obj).k : obj;
            if (!this.simpleActionBar.x() && getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                gl.t1(getParentActivity().getCurrentFocus());
                this.f0.put(((TLRPC.WallPaper) obj2).id, obj);
                this.simpleActionBar.F(1, false);
                this.g0 = false;
                this.simpleActionBar.J();
                u12Var.c(i, true, true);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G0() {
        this.a = 0;
        boolean z = this.r;
        if (z == 0) {
            this.uploadImageRow = 0;
            this.a = 2;
            this.b = 1;
            this.h = -1;
            this.n = -1;
        } else if (z == 2) {
            this.uploadImageRow = -1;
            this.b = -1;
            this.h = 0;
            this.a = 2;
            this.n = 1;
        } else {
            this.uploadImageRow = -1;
            this.b = -1;
            this.h = -1;
            this.n = -1;
        }
        if (this.b0.isEmpty()) {
            this.c = -1;
        } else {
            int ceil = (int) Math.ceil(r0.size() / this.O);
            this.d = ceil;
            int i = this.a;
            this.c = i;
            this.a = i + ceil;
        }
        if (z == 0) {
            int i2 = this.a;
            this.e = i2;
            this.a = i2 + 2;
            this.f = i2 + 1;
        } else {
            this.e = -1;
            this.f = -1;
        }
        mrc mrcVar = this.H;
        if (mrcVar != null) {
            this.g0 = true;
            mrcVar.f();
        }
    }

    public final void H0() {
        int childCount = this.G.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.G.getChildAt(i);
            if (childAt instanceof qqc) {
                qqc qqcVar = (qqc) childAt;
                for (int i2 = 0; i2 < 5; i2++) {
                    qqcVar.c(i2, false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        int i = 1;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        paint.setStrokeWidth(gl.L(1.0f));
        this.w.setStyle(Paint.Style.STROKE);
        this.w.setColor(855638016);
        this.N = new gl2(getParentActivity(), this, new grc(this));
        this.hasOwnBackground = true;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.r;
        if (z == 0) {
            this.simpleActionBar.setTitle(k96.M0(2131752232, null));
        } else if (z == 2) {
            this.simpleActionBar.setTitle("Channel Wallpaper");
        } else if (z == 1) {
            this.simpleActionBar.setTitle(k96.M0(2131745470, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new irc(this));
        boolean z2 = false;
        if (z == 0) {
            xha a = this.simpleActionBar.t().a(0, R.drawable.outline_header_search);
            a.N();
            a.C0 = new q10(this, (byte) 24);
            this.K = a;
            a.setSearchFieldHint(k96.M0(2131745624, null));
            wha q = this.simpleActionBar.q();
            q.c(3, R.drawable.msg_forward, gl.L(54.0f), k96.M0(2131750570, null));
            q.c(4, R.drawable.msg_delete, gl.L(54.0f), k96.M0(2131751586, null));
            this.f0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.G = o39Var;
        o39Var.r1();
        o39 o39Var2 = this.G;
        int i2 = bkb.Z6;
        zkb.h(i2, getResourceProvider(), o39Var2);
        this.G.setHorizontalScrollBarEnabled(false);
        this.G.setVerticalScrollBarEnabled(false);
        this.G.setItemAnimator(null);
        this.G.setLayoutAnimation(null);
        o39 o39Var3 = this.G;
        zr zrVar = new zr((byte) 19, i, z2);
        this.J = zrVar;
        o39Var3.setLayoutManager(zrVar);
        frameLayout.addView(this.G, nme.e(-1, -1, 51));
        o39 o39Var4 = this.G;
        mrc mrcVar = new mrc(this, context);
        this.H = mrcVar;
        o39Var4.setAdapter(mrcVar);
        this.I = new orc(this, context);
        zkb.H(this.G, bkb.d8, null);
        this.G.setOnItemClickListener(new f09(this, (byte) 29));
        this.G.setOnScrollListener(new vdb(this, (byte) 12));
        g24 g24Var = new g24(context, null);
        this.L = g24Var;
        g24Var.setVisibility(8);
        this.L.setShowAtCenter(true);
        zkb.h(i2, null, this.L);
        this.L.setText(k96.M0(2131747975, null));
        this.G.setEmptyView(this.L);
        frameLayout.addView(this.L, nme.c(-1.0f, -1));
        G0();
        return this.fragmentView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        ArrayList arrayList;
        krc krcVar;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i3;
        boolean z2;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        boolean z3 = true;
        if (i != kk7.g4) {
            if (i != kk7.B4) {
                if (i == kk7.h4) {
                    getMessagesStorage().m0();
                    return;
                }
                return;
            }
            o39 o39Var = this.G;
            if (o39Var != null) {
                o39Var.h1();
            }
            pha phaVar = this.simpleActionBar;
            if (phaVar != null) {
                phaVar.n(true);
                return;
            }
            return;
        }
        ArrayList arrayList2 = (ArrayList) objArr[0];
        this.d0.clear();
        HashMap hashMap2 = this.e0;
        hashMap2.clear();
        HashMap hashMap3 = this.Z;
        ArrayList arrayList3 = this.c0;
        boolean z4 = this.r;
        HashMap hashMap4 = this.a0;
        ArrayList arrayList4 = this.b0;
        if (z4 != 1 && z4 != 2) {
            arrayList4.clear();
            arrayList3.clear();
            hashMap4.clear();
            ArrayList arrayList5 = this.Y;
            arrayList5.clear();
            hashMap3.clear();
            arrayList5.addAll(arrayList2);
        }
        int size = arrayList2.size();
        int i4 = 0;
        ArrayList arrayList6 = null;
        boolean z5 = z4;
        while (i4 < size) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList2.get(i4);
            if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                arrayList = arrayList2;
                hashMap = hashMap2;
                z = z5;
            } else {
                if (wallPaper instanceof TLRPC.TL_wallPaper) {
                    TLRPC.Document document = wallPaper.document;
                    if (!(document instanceof TLRPC.TL_documentEmpty)) {
                        if (!wallPaper.pattern || document == null) {
                            z = z5;
                        } else {
                            z = z5;
                            if (!hashMap2.containsKey(Long.valueOf(document.id))) {
                                this.d0.add(wallPaper);
                                hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                            }
                        }
                        hashMap3.put(wallPaper.slug, wallPaper);
                        if (z != z3 && ((!(z2 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((z != 2 || z2) && (bkb.I.o() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                            arrayList4.add(wallPaper);
                        }
                        arrayList = arrayList2;
                        hashMap = hashMap2;
                    }
                }
                z = z5;
                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                int i5 = wallPaperSettings4.background_color;
                if (i5 != 0) {
                    int i6 = wallPaperSettings4.second_background_color;
                    if (i6 == 0 || (i3 = wallPaperSettings4.third_background_color) == 0) {
                        arrayList = arrayList2;
                        hashMap = hashMap2;
                        krcVar = new krc(i5, i6, wallPaperSettings4.rotation, null);
                    } else {
                        arrayList = arrayList2;
                        krcVar = new krc(i5, i6, i3, wallPaperSettings4.fourth_background_color, null);
                        hashMap = hashMap2;
                    }
                    krcVar.a = wallPaper.slug;
                    krcVar.h = wallPaperSettings4.intensity / 100.0f;
                    krcVar.f = gl.q1(wallPaperSettings4.rotation, false);
                    krcVar.k = wallPaper;
                    if (wallPaper.id < 0) {
                        String a = krcVar.a();
                        if (hashMap4.containsKey(a)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(wallPaper);
                        } else {
                            arrayList3.add(krcVar);
                            hashMap4.put(a, krcVar);
                        }
                    }
                    if (bkb.I.o() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                        arrayList4.add(krcVar);
                    }
                }
                arrayList = arrayList2;
                hashMap = hashMap2;
            }
            i4++;
            z5 = z;
            hashMap2 = hashMap;
            arrayList2 = arrayList;
            z3 = true;
        }
        if (arrayList6 != null) {
            int size2 = arrayList6.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ad7 messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new ua7(messagesStorage, ((TLRPC.WallPaper) arrayList6.get(i7)).id, (byte) 1));
            }
        }
        this.P = bkb.I0();
        A0();
        D0(false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.G;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        arrayList.add(new blb(this.L, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.L, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.N.F(i, i2, intent);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o39 o39Var = this.G;
        if (o39Var != null) {
            o39Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        int i = kk7.g4;
        boolean z = this.r;
        if (z == 0 || z == 2) {
            kk7.e().b(this, i);
            kk7.e().b(this, kk7.B4);
            kk7.e().b(this, kk7.h4);
            getMessagesStorage().m0();
        } else {
            z0(this.b0, bkb.I.o());
            if (z == 1 && this.d0.isEmpty()) {
                kk7.e().b(this, i);
                getMessagesStorage().m0();
            }
        }
        return super.onFragmentCreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        int i = kk7.g4;
        boolean z = this.r;
        if (z == 0 || z == 2) {
            orc orcVar = this.I;
            if (orcVar.s != 0) {
                ConnectionsManager.getInstance(orcVar.F.currentAccount).cancelRequest(orcVar.s, true);
                orcVar.s = 0;
            }
            kk7.e().n(this, i);
            kk7.e().n(this, kk7.B4);
            kk7.e().n(this, kk7.h4);
        } else if (z == 1) {
            kk7.e().n(this, i);
        }
        this.N.getClass();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        na7.c1();
        vjb vjbVar = bkb.I.j0;
        if (vjbVar != null) {
            String str = vjbVar.c;
            this.P = str;
            if (str == null) {
                this.P = "";
            }
            this.Q = vjbVar.d;
            this.R = vjbVar.e;
            this.S = vjbVar.f;
            this.T = vjbVar.g;
            this.U = vjbVar.h;
            this.V = vjbVar.k;
            this.W = vjbVar.j;
            this.X = vjbVar.i;
        } else {
            this.P = bkb.e1() ? "t" : "d";
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 45;
            this.V = 1.0f;
            this.W = false;
            this.X = false;
        }
        A0();
        o39 o39Var = this.G;
        if (o39Var != null) {
            o39Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 11));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void restoreSelfArgs(Bundle bundle) {
        this.N.b = bundle.getString("path");
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void saveSelfArgs(Bundle bundle) {
        String str = (String) this.N.b;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
