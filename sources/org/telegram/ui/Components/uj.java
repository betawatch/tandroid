package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uj extends th {
    public static final /* synthetic */ int h0 = 0;
    public final tj E;
    public final lg.d0 F;
    public final org.telegram.ui.ActionBar.q0 G;
    public final org.telegram.ui.ActionBar.q0 H;
    public final kg.n0 I;
    public AnimatorSet J;
    public final iz K;
    public boolean L;
    public final ei.f5 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public lj R;
    public final HashMap S;
    public final ArrayList T;
    public final HashMap U;
    public boolean V;
    public int W;
    public boolean a0;
    public final boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public final androidx.mediarouter.app.f f0;
    public ValueAnimator g0;
    public int n;
    public final jj r;
    public final jj s;
    public final nj w;
    public final nj x;
    public final jy y;

    /* JADX WARN: Finally extract failed */
    public uj(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context, e6Var, biVar);
        final int i10 = 0;
        this.Q = false;
        this.S = new HashMap();
        this.T = new ArrayList();
        this.U = new HashMap();
        this.W = -1;
        this.f0 = new androidx.mediarouter.app.f(this, 10);
        nj njVar = new nj(this, context);
        this.w = njVar;
        final int i11 = 1;
        this.b0 = i3 == 1;
        int i12 = 2;
        boolean z10 = i3 == 2;
        this.e0 = z10;
        this.d0 = org.telegram.messenger.az.M0;
        int i13 = 3;
        try {
            if (z10) {
                try {
                    Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j10 = query.getLong(i12);
                            long j11 = query.getLong(i13);
                            String string = query.getString(4);
                            if (j10 <= org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).k4 * 1000 && j11 <= org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).l4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                oj ojVar = new oj();
                                ojVar.b = file.getName();
                                ojVar.f = file;
                                String name = file.getName();
                                String[] split = name.split("\\.");
                                ojVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                ojVar.c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                String lowerCase = name.toLowerCase();
                                if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                    ojVar.e = file.getAbsolutePath();
                                }
                                ((ArrayList) this.w.h).add(ojVar);
                            }
                            i12 = 2;
                            i13 = 3;
                        } catch (Throwable th2) {
                            if (query == null) {
                                throw th2;
                            }
                            try {
                                query.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    }
                    query.close();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else {
                P(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) njVar.h, new hj(this, 1));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.c0 = false;
        if (!this.Q) {
            this.Q = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
            intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
            intentFilter.addAction("android.intent.action.MEDIA_EJECT");
            intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_NOFS");
            intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
            intentFilter.addAction("android.intent.action.MEDIA_SHARED");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
            intentFilter.addDataScheme("file");
            if (Build.VERSION.SDK_INT >= 33) {
                org.telegram.messenger.t0.b.registerReceiver(this.f0, intentFilter, 4);
            } else {
                org.telegram.messenger.t0.b.registerReceiver(this.f0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.x q10 = this.b.S2.q();
        org.telegram.ui.ActionBar.q0 a10 = q10.a(0, R.drawable.outline_header_search);
        a10.N();
        a10.I = new lg.w1(this, 6);
        this.G = a10;
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        a10.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i14 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(searchField, i14, e6Var);
        org.telegram.ui.ActionBar.r6.w(searchField, i14, e6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, e6Var);
        org.telegram.ui.ActionBar.q0 a11 = q10.a(6, this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.H = a11;
        a11.setContentDescription(org.telegram.messenger.bd.M0(2131754891, null));
        iz izVar = new iz(context, e6Var);
        this.K = izVar;
        addView(izVar);
        ei.f5 f5Var = new ei.f5(this, context, izVar, e6Var);
        this.M = f5Var;
        addView(f5Var, b8.mf.c(-1.0f, -1));
        f5Var.setVisibility(8);
        f5Var.setOnTouchListener(new fi.a(14));
        jj jjVar = new jj(this, context, e6Var, 0);
        this.s = jjVar;
        jjVar.setSectionsType(2);
        jjVar.setVerticalScrollBarEnabled(false);
        jy jyVar = new jy(org.telegram.messenger.g0.L(56.0f), 0, jjVar);
        this.y = jyVar;
        jjVar.setLayoutManager(jyVar);
        jjVar.setClipToPadding(false);
        nj njVar2 = new nj(this, context);
        this.x = njVar2;
        jjVar.setAdapter(njVar2);
        addView(jjVar, b8.mf.c(-1.0f, -1));
        jjVar.setVisibility(8);
        jj jjVar2 = new jj(this, context, e6Var, 1);
        this.r = jjVar2;
        jjVar2.r1();
        setBlur3Capture(jjVar2);
        this.d = jjVar2;
        this.h = true;
        this.f = true;
        jjVar2.setSectionsType(2);
        jjVar2.setVerticalScrollBarEnabled(false);
        lg.d0 d0Var = new lg.d0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, jjVar2, 2);
        this.F = d0Var;
        jjVar2.setLayoutManager(d0Var);
        jjVar2.setClipToPadding(false);
        jjVar2.setAdapter(this.w);
        addView(jjVar2, b8.mf.c(-1.0f, -1));
        this.E = new tj(this, context);
        jjVar2.setOnScrollListener(new ji(this, 3));
        jjVar2.setOnItemClickListener(new fj0(this) { // from class: org.telegram.ui.Components.fj
            public final /* synthetic */ uj b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.fj0
            public final void f(int i15, View view) {
                switch (i10) {
                    case 0:
                        uj.O(this.b, view, i15);
                        break;
                    default:
                        uj ujVar = this.b;
                        kg.n0 n0Var = ujVar.I;
                        n0Var.I0(true);
                        tj tjVar = ujVar.E;
                        ArrayList arrayList = n0Var.f3;
                        kg.l0 l0Var = arrayList.isEmpty() ? kg.n0.k3[i15] : (kg.l0) arrayList.get(i15);
                        bi biVar2 = tjVar.Y.b;
                        ArrayList arrayList2 = tjVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                if (l0Var.b((kg.l0) arrayList2.get(i16))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(l0Var);
                        biVar2.S2.setSearchFilter(l0Var);
                        biVar2.S2.setSearchFieldText("");
                        tjVar.a0(null, null, true);
                        break;
                }
            }
        });
        jjVar2.setOnItemLongClickListener(new t(this, 20));
        kg.n0 n0Var = new kg.n0(context, e6Var);
        this.I = n0Var;
        n0Var.setOnItemClickListener(new fj0(this) { // from class: org.telegram.ui.Components.fj
            public final /* synthetic */ uj b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.fj0
            public final void f(int i15, View view) {
                switch (i11) {
                    case 0:
                        uj.O(this.b, view, i15);
                        break;
                    default:
                        uj ujVar = this.b;
                        kg.n0 n0Var2 = ujVar.I;
                        n0Var2.I0(true);
                        tj tjVar = ujVar.E;
                        ArrayList arrayList = n0Var2.f3;
                        kg.l0 l0Var = arrayList.isEmpty() ? kg.n0.k3[i15] : (kg.l0) arrayList.get(i15);
                        bi biVar2 = tjVar.Y.b;
                        ArrayList arrayList2 = tjVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                if (l0Var.b((kg.l0) arrayList2.get(i16))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(l0Var);
                        biVar2.S2.setSearchFilter(l0Var);
                        biVar2.S2.setSearchFieldText("");
                        tjVar.a0(null, null, true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, n0Var, e6Var);
        addView(n0Var, b8.mf.e(-1, 44, 48));
        n0Var.setTranslationY(-org.telegram.messenger.g0.L(44.0f));
        n0Var.setVisibility(4);
        S();
        a0();
        X();
    }

    public static void O(uj ujVar, View view, int i3) {
        Object O;
        int i10;
        bi biVar = ujVar.b;
        jj jjVar = ujVar.r;
        u4.h0 adapter = jjVar.getAdapter();
        nj njVar = ujVar.w;
        if (adapter == njVar) {
            O = njVar.E(i3);
        } else {
            tj tjVar = ujVar.E;
            O = tjVar.O(tjVar.S(i3), tjVar.Q(i3));
        }
        if (!(O instanceof oj)) {
            ujVar.T(view, O);
            return;
        }
        oj ojVar = (oj) O;
        File file = ojVar.f;
        boolean z10 = false;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!org.telegram.messenger.r2.b && (((i10 = ojVar.a) == R.drawable.files_storage || i10 == R.drawable.files_internal) && !isExternalStorageManager)) {
            oh ohVar = biVar.m3;
            int i11 = biVar.E3;
            if (biVar.C3 == null || biVar.C1 - biVar.D1 >= 0) {
                ujVar.R.A();
                return;
            } else if (org.telegram.messenger.hp.s1(i11).D3() || org.telegram.messenger.hp.s1(i11).U4 <= biVar.D1) {
                new fc(ohVar, biVar.J0).t(org.telegram.messenger.bd.M0(2131744051, null), biVar.J0).j();
                return;
            } else {
                new fc(ohVar, biVar.J0).f(org.telegram.messenger.hp.s1(i11).U4, new ng(biVar, 3)).j();
                return;
            }
        }
        if (file != null) {
            if (!file.isDirectory()) {
                ujVar.T(view, ojVar);
                return;
            }
            mj mjVar = new mj();
            View childAt = jjVar.getChildAt(0);
            u4.d1 G = jjVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                mjVar.a = ujVar.P;
                mjVar.b = biVar.S2.getTitle();
                ujVar.U();
                njVar.f.add(mjVar);
                if (!ujVar.R(file)) {
                    njVar.f.remove(mjVar);
                    return;
                } else {
                    ujVar.V(1);
                    biVar.S2.setTitle(ojVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = ojVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
            org.telegram.ui.wm wmVar = d2Var instanceof org.telegram.ui.wm ? (org.telegram.ui.wm) d2Var : null;
            org.telegram.ui.sm0 sm0Var = new org.telegram.ui.sm0(0, MediaController.a2, hashMap, arrayList, 0, wmVar != null, wmVar, false);
            sm0Var.m0 = true;
            sm0Var.t0 = new k4.j(z10, ujVar, hashMap, arrayList);
            sm0Var.k0(ujVar.W, false);
            org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
            if (d2Var2 != null) {
                d2Var2.presentFragment(sm0Var);
            } else {
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(sm0Var);
                }
            }
            biVar.a(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            lj ljVar = ujVar.R;
            if (ljVar != null) {
                ljVar.S();
                return;
            }
            return;
        }
        int topForScroll = ujVar.getTopForScroll();
        ujVar.U();
        mj mjVar2 = (mj) org.telegram.ui.Cells.f1.o(1, njVar.f);
        biVar.S2.setTitle(mjVar2.b);
        File file2 = mjVar2.a;
        if (file2 != null) {
            ujVar.R(file2);
        } else {
            ujVar.S();
        }
        ujVar.a0();
        ujVar.F.h1(0, topForScroll);
        ujVar.V(2);
    }

    private int getTopForScroll() {
        jj jjVar = this.r;
        View childAt = jjVar.getChildAt(0);
        u4.d1 G = jjVar.G(childAt);
        int i3 = -jjVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i3 : childAt.getTop() + i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i3, int i10) {
        int L;
        int i11;
        bi biVar = this.b;
        if (biVar.S2.o0 || biVar.m3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            L = org.telegram.messenger.g0.L(56.0f);
            biVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    L = i11 - org.telegram.messenger.g0.L(1.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    biVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            L = i11 - org.telegram.messenger.g0.L(1.0f);
            if (L < 0) {
            }
            biVar.r0 = true;
        }
        this.r.q1(0, L + org.telegram.messenger.g0.m, 0, this.e);
        ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.th
    public final void C() {
        nj njVar = this.w;
        if (njVar != null) {
            njVar.f();
        }
        tj tjVar = this.E;
        if (tjVar != null) {
            tjVar.f();
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void H(th thVar) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.w.f.clear();
        S();
        a0();
        X();
        this.b.S2.setTitle(org.telegram.messenger.bd.M0(2131745667, null));
        this.H.setVisibility(0);
        this.F.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.th
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.th
    public final boolean L(final boolean z10, final int i3, int i10, final long j10, final boolean z11) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((org.telegram.messenger.zi) hashMap.get((org.telegram.ui.pz) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        bi biVar = this.b;
        CharSequence[] charSequenceArr = {biVar.a1().getText()};
        final ArrayList W = org.telegram.messenger.li.b0(biVar.E3).W(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return t4.a0(biVar.E3, biVar.b1(), biVar.X0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.ij
            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                uj ujVar = uj.this;
                ujVar.L = true;
                ujVar.R.n(arrayList2, charSequence, W, arrayList, z10, i3, j10, z11, ((Long) obj).longValue());
                ujVar.b.a(true);
            }
        }, 0L);
    }

    public final void P(File file) {
        File[] listFiles = file.listFiles();
        File j10 = org.telegram.messenger.w7.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    P(file2);
                } else if (!file2.equals(j10)) {
                    oj ojVar = new oj();
                    ojVar.b = file2.getName();
                    ojVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    ojVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    ojVar.c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        ojVar.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(ojVar);
                }
            }
        }
    }

    public final boolean Q(File file) {
        int i3;
        String D = org.telegram.messenger.w7.D(file);
        String mimeTypeFromExtension = D != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(D) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !zf.c.i.contains(mimeTypeFromExtension)) {
            new fc(this.b.c, null).u(org.telegram.messenger.bd.a0("InvalidFormatError", null, 2131749189, new Object[0]), org.telegram.messenger.bd.M0(2131751104, null), null).j();
            return false;
        }
        if (file.length() > org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).l4) {
            new fc(this.b.c, null).u(org.telegram.messenger.bd.a0("TooLargeError", null, 2131744052, new Object[0]), org.telegram.messenger.bd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).l4 / 1024)), null).j();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.b, Uri.fromFile(file));
            i3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i3 <= org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).k4 * 1000) {
            return true;
        }
        new fc(this.b.c, null).u(org.telegram.messenger.bd.a0("TooLongError", null, 2131744051, new Object[0]), org.telegram.messenger.bd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).k4)), null).j();
        return false;
    }

    public final boolean R(File file) {
        File file2;
        nj njVar;
        this.O = false;
        boolean canRead = file.canRead();
        jj jjVar = this.r;
        String str = null;
        nj njVar2 = this.w;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                W(org.telegram.messenger.bd.M0(2131754711, null));
                return false;
            }
            this.P = file;
            njVar2.e.clear();
            Environment.getExternalStorageState();
            org.telegram.messenger.g0.y(jjVar);
            this.V = true;
            njVar2.f();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                W(org.telegram.messenger.bd.M0(2131743889, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = njVar2.e;
            ArrayList arrayList2 = njVar2.f;
            ArrayList arrayList3 = njVar2.e;
            arrayList.clear();
            File j10 = org.telegram.messenger.w7.j(6);
            int i3 = 0;
            while (i3 < listFiles.length) {
                File file3 = listFiles[i3];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j10)) {
                    njVar = njVar2;
                } else {
                    oj ojVar = new oj();
                    ojVar.b = file3.getName();
                    ojVar.f = file3;
                    if (file3.isDirectory()) {
                        ojVar.a = R.drawable.files_folder;
                        ojVar.c = org.telegram.messenger.bd.M0(2131750686, str);
                        njVar = njVar2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        ojVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        njVar = njVar2;
                        ojVar.c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            ojVar.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(ojVar);
                }
                i3++;
                njVar2 = njVar;
                str = null;
            }
            nj njVar3 = njVar2;
            oj ojVar2 = new oj();
            ojVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((mj) k2.p1.h(1, arrayList2)).a;
                if (file4 == null) {
                    file2 = null;
                    ojVar2.c = org.telegram.messenger.bd.M0(2131750686, null);
                } else {
                    file2 = null;
                    ojVar2.c = file4.toString();
                }
            } else {
                file2 = null;
                ojVar2.c = org.telegram.messenger.bd.M0(2131750686, null);
            }
            ojVar2.a = R.drawable.files_folder;
            ojVar2.f = file2;
            arrayList3.add(0, ojVar2);
            if (this.P != null) {
                Collections.sort(njVar3.e, new hj(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(jjVar);
            this.V = true;
            int topForScroll = getTopForScroll();
            njVar3.f();
            this.F.h1(0, topForScroll);
            return true;
        } catch (Exception e10) {
            W(e10.getLocalizedMessage());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0185, code lost:
    
        if (r4 == null) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0233 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        BufferedReader bufferedReader;
        bi biVar;
        int lastIndexOf;
        BufferedReader bufferedReader2 = null;
        this.P = null;
        this.O = false;
        this.w.e.clear();
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 30) {
            Environment.isExternalStorageManager();
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) {
            oj ojVar = new oj();
            if (Environment.isExternalStorageRemovable()) {
                ojVar.b = org.telegram.messenger.bd.M0(2131745850, null);
                ojVar.a = R.drawable.files_internal;
                ojVar.c = org.telegram.messenger.bd.M0(2131750857, null);
            } else {
                ojVar.b = org.telegram.messenger.bd.M0(2131749196, null);
                ojVar.a = R.drawable.files_storage;
                ojVar.c = org.telegram.messenger.bd.M0(2131749198, null);
            }
            ojVar.f = Environment.getExternalStorageDirectory();
            this.w.e.add(ojVar);
            hashSet.add(path);
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
        } catch (Exception e10) {
            e = e10;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (!readLine.contains("vfat") && !readLine.contains("/mnt")) {
                        }
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b(readLine);
                        }
                        StringTokenizer stringTokenizer = new StringTokenizer(readLine, " ");
                        stringTokenizer.nextToken();
                        String nextToken = stringTokenizer.nextToken();
                        if (!hashSet.contains(nextToken) && readLine.contains("/dev/block/vold") && !readLine.contains("/mnt/secure") && !readLine.contains("/mnt/asec") && !readLine.contains("/mnt/obb") && !readLine.contains("/dev/mapper") && !readLine.contains("tmpfs")) {
                            if (!new File(nextToken).isDirectory() && (lastIndexOf = nextToken.lastIndexOf(47)) != -1) {
                                String str = "/storage/" + nextToken.substring(lastIndexOf + 1);
                                if (new File(str).isDirectory()) {
                                    nextToken = str;
                                }
                            }
                            hashSet.add(nextToken);
                            try {
                                oj ojVar2 = new oj();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    ojVar2.b = org.telegram.messenger.bd.M0(2131745850, null);
                                } else {
                                    ojVar2.b = org.telegram.messenger.bd.M0(2131750856, null);
                                }
                                ojVar2.c = org.telegram.messenger.bd.M0(2131750857, null);
                                ojVar2.a = R.drawable.files_internal;
                                ojVar2.f = new File(nextToken);
                                this.w.e.add(ojVar2);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    org.telegram.messenger.a8.g(e, true);
                }
                try {
                    break;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                throw th;
            }
        }
        bufferedReader.close();
        try {
            File file = new File(org.telegram.messenger.t0.b.getExternalFilesDir(null), "Telegram");
            if (file.exists()) {
                oj ojVar3 = new oj();
                ojVar3.b = "Telegram";
                ojVar3.c = org.telegram.messenger.bd.M0(2131754241, null);
                ojVar3.a = R.drawable.files_folder;
                ojVar3.f = file;
                this.w.e.add(ojVar3);
            }
        } catch (Exception e15) {
            org.telegram.messenger.a8.g(e15, true);
        }
        if (!this.e0 && ((biVar = this.b) == null || !biVar.z1)) {
            oj ojVar4 = new oj();
            ojVar4.b = org.telegram.messenger.bd.M0(2131750492, null);
            ojVar4.c = org.telegram.messenger.bd.M0(2131750485, null);
            ojVar4.a = R.drawable.files_gallery;
            ojVar4.f = null;
            this.w.e.add(ojVar4);
        }
        if (this.b0) {
            oj ojVar5 = new oj();
            ojVar5.b = org.telegram.messenger.bd.M0(2131753952, null);
            ojVar5.c = org.telegram.messenger.bd.M0(2131748323, null);
            ojVar5.a = R.drawable.files_music;
            ojVar5.f = null;
            this.w.e.add(ojVar5);
        }
        if (!((ArrayList) this.w.h).isEmpty()) {
            this.O = true;
        }
        org.telegram.messenger.g0.y(this.r);
        this.V = true;
        this.w.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T(View view, Object obj) {
        boolean z10;
        boolean z11 = obj instanceof oj;
        ArrayList arrayList = this.T;
        bi biVar = this.b;
        HashMap hashMap = this.S;
        HashMap hashMap2 = this.U;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof org.telegram.messenger.zi) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                org.telegram.ui.pz pzVar = new org.telegram.ui.pz(ziVar.f1(), org.telegram.messenger.zi.B0(ziVar.k));
                if (hashMap2.containsKey(pzVar)) {
                    hashMap2.remove(pzVar);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(pzVar, ziVar);
                    z12 = true;
                }
                z10 = z12;
                if (biVar.z1) {
                }
            }
            return false;
        }
        oj ojVar = (oj) obj;
        File file = ojVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = ojVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!ojVar.f.canRead()) {
                    W(org.telegram.messenger.bd.M0(2131754711, null));
                    return false;
                }
                if (this.a0 && ojVar.e == null) {
                    W(org.telegram.messenger.bd.a0("PassportUploadNotImage", null, 2131747458, new Object[0]));
                    return false;
                }
                if ((ojVar.f.length() > 2097152000 && !org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q()) || ojVar.f.length() > 4194304000L) {
                    vg.i0 i0Var = new vg.i0(6, org.telegram.messenger.h10.t0, biVar.c.getContext(), biVar.X1, null);
                    i0Var.G2 = true;
                    i0Var.F1();
                    i0Var.show();
                    return false;
                }
                if (this.W >= 0) {
                    int size = hashMap.size();
                    int i3 = this.W;
                    if (size >= i3) {
                        W(org.telegram.messenger.bd.a0("PassportUploadMaxReached", null, 2131747459, org.telegram.messenger.bd.G(i3, "Files", new Object[0])));
                        return false;
                    }
                }
                if ((!this.e0 || Q(ojVar.f)) && ojVar.f.length() != 0) {
                    boolean z13 = biVar.O2;
                    hashMap.put(absolutePath, ojVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.V = false;
            if (biVar.z1) {
                if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).b(z10, true);
                }
                biVar.K1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.R != null && !this.L) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((org.telegram.messenger.zi) hashMap2.get((org.telegram.ui.pz) it.next()));
                }
                this.R.n(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void U() {
        View m10;
        nj njVar = this.x;
        njVar.f.clear();
        ArrayList arrayList = njVar.f;
        nj njVar2 = this.w;
        arrayList.addAll(njVar2.f);
        ArrayList arrayList2 = njVar.e;
        arrayList2.clear();
        arrayList2.addAll(njVar2.e);
        ArrayList arrayList3 = (ArrayList) njVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) njVar2.h);
        njVar.f();
        jj jjVar = this.s;
        jjVar.setVisibility(0);
        jj jjVar2 = this.r;
        jjVar.setPadding(jjVar2.getPaddingLeft(), jjVar2.getPaddingTop(), jjVar2.getPaddingRight(), jjVar2.getPaddingBottom());
        lg.d0 d0Var = this.F;
        int L0 = d0Var.L0();
        if (L0 < 0 || (m10 = d0Var.m(L0)) == null) {
            return;
        }
        this.y.h1(L0, m10.getTop() - jjVar.getPaddingTop());
    }

    public final void V(int i3) {
        jj jjVar;
        float L;
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = i3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            jjVar = this.r;
            if (i11 >= childCount) {
                i11 = 0;
                break;
            } else if (getChildAt(i11) == jjVar) {
                break;
            } else {
                i11++;
            }
        }
        jj jjVar2 = this.s;
        if (i3 == 1) {
            L = org.telegram.messenger.g0.L(150.0f);
            jjVar2.setAlpha(1.0f);
            jjVar2.setScaleX(1.0f);
            jjVar2.setScaleY(1.0f);
            jjVar2.setTranslationX(0.0f);
            removeView(jjVar2);
            addView(jjVar2, i11);
            jjVar2.setVisibility(0);
            jjVar.setTranslationX(L);
            jjVar.setAlpha(0.0f);
            this.g0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.g0.L(150.0f);
            jjVar.setAlpha(0.0f);
            jjVar.setScaleX(0.95f);
            jjVar.setScaleY(0.95f);
            jjVar2.setScaleX(1.0f);
            jjVar2.setScaleY(1.0f);
            jjVar2.setTranslationX(0.0f);
            jjVar2.setAlpha(1.0f);
            removeView(jjVar2);
            addView(jjVar2, i11 + 1);
            jjVar2.setVisibility(0);
            this.g0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.g0.addUpdateListener(new gj(this, i3, L, i10));
        this.g0.addListener(new x5(this, 11));
        if (i3 == 1) {
            this.g0.setDuration(220L);
        } else {
            this.g0.setDuration(200L);
        }
        this.g0.setInterpolator(xq.f);
        this.g0.start();
    }

    public final void W(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
        String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = str;
        k2.p1.B(null, 2131747839, alertDialog$Builder, null);
    }

    public final void X() {
        u4.h0 adapter = this.r.getAdapter();
        boolean z10 = true;
        tj tjVar = this.E;
        if (adapter != tjVar ? this.w.b() != 1 : !tjVar.s.isEmpty() || !tjVar.Q.isEmpty()) {
            z10 = false;
        }
        this.M.setVisibility(z10 ? 0 : 8);
        Z();
    }

    public final void Z() {
        View childAt;
        ei.f5 f5Var = this.M;
        if (f5Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = f5Var.getTranslationY();
            this.N = (childAt.getTop() + (f5Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            f5Var.setTranslationY(translationY);
        }
    }

    public final void a0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var == null || q0Var.v()) {
            return;
        }
        q0Var.setVisibility((this.O || this.w.f.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.th
    public final void d() {
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var != null) {
            try {
                if (q0Var.getSearchField() != null) {
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.a));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.th
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(62.0f);
    }

    @Override // org.telegram.ui.Components.th
    public int getCurrentItemTop() {
        jj jjVar = this.r;
        if (jjVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i3 = 0;
        View childAt = jjVar.getChildAt(0);
        bj0 bj0Var = (bj0) jjVar.G(childAt);
        int y9 = ((((int) childAt.getY()) - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
        if (y9 > 0 && bj0Var != null && bj0Var.b() == 0) {
            i3 = y9;
        }
        if (y9 < 0 || bj0Var == null || bj0Var.b() != 0) {
            y9 = i3;
        }
        return org.telegram.messenger.g0.L(13.0f) + y9;
    }

    @Override // org.telegram.ui.Components.th
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.th
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.th
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override // org.telegram.ui.Components.th
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        int i3 = org.telegram.ui.ActionBar.k6.A5;
        jj jjVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 32, new Class[]{org.telegram.ui.Cells.x6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 48, new Class[]{org.telegram.ui.Cells.x6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 40, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.oj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.pj));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.th
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.th
    public final boolean k() {
        nj njVar = this.w;
        if (njVar.f.size() <= 0) {
            return false;
        }
        U();
        mj mjVar = (mj) org.telegram.ui.Cells.f1.o(1, njVar.f);
        this.b.S2.setTitle(mjVar.b);
        int topForScroll = getTopForScroll();
        File file = mjVar.a;
        if (file != null) {
            R(file);
        } else {
            S();
        }
        a0();
        this.F.h1(0, topForScroll);
        V(2);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        Z();
    }

    @Override // org.telegram.ui.Components.th
    public final void p() {
        try {
            if (this.Q) {
                org.telegram.messenger.t0.b.unregisterReceiver(this.f0);
                this.Q = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.b.S2.l(true);
        org.telegram.ui.ActionBar.x q10 = this.b.S2.q();
        q10.removeView(this.H);
        q10.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.a0 = z10;
    }

    public void setDelegate(lj ljVar) {
        this.R = ljVar;
    }

    public void setMaxSelectedFiles(int i3) {
        this.W = i3;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.th
    public final void u() {
        this.H.setVisibility(8);
        this.G.setVisibility(8);
    }

    @Override // org.telegram.ui.Components.th
    public final void w(int i3) {
        if (i3 == 6) {
            org.telegram.messenger.az.M0 = !org.telegram.messenger.az.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.az.M0);
            edit.apply();
            this.d0 = org.telegram.messenger.az.M0;
            nj njVar = this.w;
            Collections.sort((ArrayList) njVar.h, new hj(this, 1));
            if (this.P != null) {
                Collections.sort(njVar.e, new hj(this, 0));
            }
            njVar.f();
            this.H.setIcon(this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
