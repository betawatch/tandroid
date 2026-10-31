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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xj extends uh {
    public static final /* synthetic */ int g0 = 0;
    public final wj D;
    public final ag.d1 E;
    public final org.telegram.ui.ActionBar.t0 F;
    public final org.telegram.ui.ActionBar.t0 G;
    public final zf.g0 H;
    public AnimatorSet I;
    public final zz J;
    public boolean K;
    public final kj L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public nj Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public final androidx.mediarouter.app.f e0;
    public ValueAnimator f0;
    public int n;
    public final lj r;
    public final lj s;
    public final pj w;
    public final pj x;
    public final az y;

    public xj(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
        Cursor cursor;
        final int i11 = 0;
        this.P = false;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.V = -1;
        this.e0 = new androidx.mediarouter.app.f(this, 11);
        pj pjVar = new pj(this, context);
        this.w = pjVar;
        final int i12 = 1;
        this.a0 = i10 == 1;
        int i13 = 2;
        boolean z10 = i10 == 2;
        this.d0 = z10;
        this.c0 = org.telegram.messenger.tz.M0;
        try {
            if (z10) {
                try {
                    Cursor query = org.telegram.messenger.w0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j10 = query.getLong(2);
                            long j11 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j10 <= org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).l4 * 1000) {
                                try {
                                    if (j11 <= org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).m4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        qj qjVar = new qj();
                                        qjVar.b = file.getName();
                                        qjVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        qjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        qjVar.c = org.telegram.messenger.i0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            qjVar.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.w.h).add(qjVar);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    Throwable th3 = th;
                                    if (cursor == null) {
                                        throw th3;
                                    }
                                    try {
                                        cursor.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            }
                            query = cursor;
                        } catch (Throwable th5) {
                            th = th5;
                            cursor = query;
                        }
                    }
                    query.close();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            } else {
                O(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) pjVar.h, new hj(this, 1));
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        this.b0 = false;
        if (!this.P) {
            this.P = true;
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
                org.telegram.messenger.w0.b.registerReceiver(this.e0, intentFilter, 4);
            } else {
                org.telegram.messenger.w0.b.registerReceiver(this.e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y p5 = this.b.R2.p();
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new ag.l3(this, 6);
        this.F = a2;
        a2.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        a2.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i14 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(searchField, i14, p6Var);
        org.telegram.ui.ActionBar.a7.w(searchField, i14, p6Var);
        org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Je, p6Var);
        org.telegram.ui.ActionBar.t0 a10 = p5.a(6, this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.G = a10;
        a10.setContentDescription(org.telegram.messenger.cd.L0(2131754891, null));
        zz zzVar = new zz(context, p6Var);
        this.J = zzVar;
        addView(zzVar);
        kj kjVar = new kj(this, context, zzVar, p6Var);
        this.L = kjVar;
        addView(kjVar, w7.b6.c(-1.0f, -1));
        kjVar.setVisibility(8);
        kjVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(13));
        lj ljVar = new lj(this, context, p6Var, 0);
        this.s = ljVar;
        ljVar.setSectionsType(2);
        ljVar.setVerticalScrollBarEnabled(false);
        az azVar = new az(org.telegram.messenger.i0.L(56.0f), 0, ljVar);
        this.y = azVar;
        ljVar.setLayoutManager(azVar);
        ljVar.setClipToPadding(false);
        pj pjVar2 = new pj(this, context);
        this.x = pjVar2;
        ljVar.setAdapter(pjVar2);
        addView(ljVar, w7.b6.c(-1.0f, -1));
        ljVar.setVisibility(8);
        lj ljVar2 = new lj(this, context, p6Var, 1);
        this.r = ljVar2;
        ljVar2.r1();
        setBlur3Capture(ljVar2);
        this.d = ljVar2;
        this.h = true;
        this.f = true;
        ljVar2.setSectionsType(2);
        ljVar2.setVerticalScrollBarEnabled(false);
        ag.d1 d1Var = new ag.d1(this, org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.m, ljVar2, i13);
        this.E = d1Var;
        ljVar2.setLayoutManager(d1Var);
        ljVar2.setClipToPadding(false);
        ljVar2.setAdapter(this.w);
        addView(ljVar2, w7.b6.c(-1.0f, -1));
        this.D = new wj(this, context);
        ljVar2.setOnScrollListener(new ag.u(this, 16));
        ljVar2.setOnItemClickListener(new gk0(this) { // from class: org.telegram.ui.Components.fj
            public final /* synthetic */ xj b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gk0
            public final void f(int i15, View view) {
                switch (i11) {
                    case 0:
                        xj.N(this.b, view, i15);
                        break;
                    default:
                        xj xjVar = this.b;
                        zf.g0 g0Var = xjVar.H;
                        g0Var.I0(true);
                        wj wjVar = xjVar.D;
                        ArrayList arrayList = g0Var.e3;
                        zf.e0 e0Var = arrayList.isEmpty() ? zf.g0.j3[i15] : (zf.e0) arrayList.get(i15);
                        bi biVar2 = wjVar.X.b;
                        ArrayList arrayList2 = wjVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                if (e0Var.b((zf.e0) arrayList2.get(i16))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        biVar2.R2.setSearchFilter(e0Var);
                        biVar2.R2.setSearchFieldText("");
                        wjVar.a0(null, null, true);
                        break;
                }
            }
        });
        ljVar2.setOnItemLongClickListener(new t(this, 20));
        zf.g0 g0Var = new zf.g0(context, p6Var);
        this.H = g0Var;
        g0Var.setOnItemClickListener(new gk0(this) { // from class: org.telegram.ui.Components.fj
            public final /* synthetic */ xj b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gk0
            public final void f(int i15, View view) {
                switch (i12) {
                    case 0:
                        xj.N(this.b, view, i15);
                        break;
                    default:
                        xj xjVar = this.b;
                        zf.g0 g0Var2 = xjVar.H;
                        g0Var2.I0(true);
                        wj wjVar = xjVar.D;
                        ArrayList arrayList = g0Var2.e3;
                        zf.e0 e0Var = arrayList.isEmpty() ? zf.g0.j3[i15] : (zf.e0) arrayList.get(i15);
                        bi biVar2 = wjVar.X.b;
                        ArrayList arrayList2 = wjVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                if (e0Var.b((zf.e0) arrayList2.get(i16))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        biVar2.R2.setSearchFilter(e0Var);
                        biVar2.R2.setSearchFieldText("");
                        wjVar.a0(null, null, true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, g0Var, p6Var);
        addView(g0Var, w7.b6.e(-1, 44, 48));
        g0Var.setTranslationY(-org.telegram.messenger.i0.L(44.0f));
        g0Var.setVisibility(4);
        R();
        Y();
        W();
    }

    public static void N(xj xjVar, View view, int i10) {
        Object O;
        int i11;
        bi biVar = xjVar.b;
        lj ljVar = xjVar.r;
        s4.g0 adapter = ljVar.getAdapter();
        pj pjVar = xjVar.w;
        if (adapter == pjVar) {
            O = pjVar.E(i10);
        } else {
            wj wjVar = xjVar.D;
            O = wjVar.O(wjVar.S(i10), wjVar.Q(i10));
        }
        if (!(O instanceof qj)) {
            xjVar.S(view, O);
            return;
        }
        qj qjVar = (qj) O;
        File file = qjVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!org.telegram.messenger.v2.b && (((i11 = qjVar.a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !isExternalStorageManager)) {
            ph phVar = biVar.l3;
            int i12 = biVar.D3;
            if (biVar.B3 == null || biVar.B1 - biVar.C1 >= 0) {
                xjVar.Q.A();
                return;
            } else if (org.telegram.messenger.vp.r1(i12).A3() || org.telegram.messenger.vp.r1(i12).V4 <= biVar.C1) {
                new cc(phVar, biVar.I0).t(org.telegram.messenger.cd.L0(2131744066, null), biVar.I0).j();
                return;
            } else {
                new cc(phVar, biVar.I0).f(org.telegram.messenger.vp.r1(i12).V4, new mg(biVar, 3)).j();
                return;
            }
        }
        if (file != null) {
            if (!file.isDirectory()) {
                xjVar.S(view, qjVar);
                return;
            }
            oj ojVar = new oj();
            View childAt = ljVar.getChildAt(0);
            s4.c1 G = ljVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                ojVar.a = xjVar.O;
                ojVar.b = biVar.R2.getTitle();
                xjVar.T();
                pjVar.f.add(ojVar);
                if (!xjVar.Q(file)) {
                    pjVar.f.remove(ojVar);
                    return;
                } else {
                    xjVar.U(1);
                    biVar.R2.setTitle(qjVar.b);
                    return;
                }
            }
            return;
        }
        int i13 = qjVar.a;
        if (i13 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
            org.telegram.ui.un unVar = k2Var instanceof org.telegram.ui.un ? (org.telegram.ui.un) k2Var : null;
            org.telegram.ui.lo0 lo0Var = new org.telegram.ui.lo0(0, MediaController.Y1, hashMap, arrayList, 0, unVar != null, unVar, false);
            lo0Var.l0 = true;
            lo0Var.s0 = new li.k(xjVar, hashMap, arrayList, false, 20);
            lo0Var.j0(xjVar.V, false);
            org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
            if (k2Var2 != null) {
                k2Var2.presentFragment(lo0Var);
            } else {
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(lo0Var);
                }
            }
            biVar.a(true);
            return;
        }
        if (i13 == R.drawable.files_music) {
            nj njVar = xjVar.Q;
            if (njVar != null) {
                njVar.S();
                return;
            }
            return;
        }
        int topForScroll = xjVar.getTopForScroll();
        xjVar.T();
        oj ojVar2 = (oj) i0.a.v(1, pjVar.f);
        biVar.R2.setTitle(ojVar2.b);
        File file2 = ojVar2.a;
        if (file2 != null) {
            xjVar.Q(file2);
        } else {
            xjVar.R();
        }
        xjVar.Y();
        xjVar.E.h1(0, topForScroll);
        xjVar.U(2);
    }

    private int getTopForScroll() {
        lj ljVar = this.r;
        View childAt = ljVar.getChildAt(0);
        s4.c1 G = ljVar.G(childAt);
        int i10 = -ljVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int L;
        int i12;
        bi biVar = this.b;
        if (biVar.R2.n0 || biVar.l3.Q() > org.telegram.messenger.i0.L(20.0f)) {
            L = org.telegram.messenger.i0.L(56.0f);
            biVar.q0 = false;
        } else {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.q;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    L = i12 - org.telegram.messenger.i0.L(1.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    biVar.q0 = true;
                }
            }
            i12 = (i11 / 5) * 2;
            L = i12 - org.telegram.messenger.i0.L(1.0f);
            if (L < 0) {
            }
            biVar.q0 = true;
        }
        this.r.q1(0, L + org.telegram.messenger.i0.m, 0, this.e);
        ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.uh
    public final void C() {
        pj pjVar = this.w;
        if (pjVar != null) {
            pjVar.f();
        }
        wj wjVar = this.D;
        if (wjVar != null) {
            wjVar.f();
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        this.R.clear();
        this.T.clear();
        this.D.R.clear();
        this.S.clear();
        this.w.f.clear();
        R();
        Y();
        W();
        this.b.R2.setTitle(org.telegram.messenger.cd.L0(2131745674, null));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.uh
    public final void I() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean J(final boolean z10, final int i10, int i11, final long j10, final boolean z11) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((org.telegram.messenger.jj) hashMap.get((org.telegram.ui.s00) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        bi biVar = this.b;
        CharSequence[] charSequenceArr = {biVar.Z0().getText()};
        final ArrayList W = org.telegram.messenger.ui.b0(biVar.D3).W(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return s4.a0(biVar.D3, biVar.a1(), biVar.W0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.ij
            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                xj xjVar = xj.this;
                xjVar.K = true;
                xjVar.Q.m(arrayList2, charSequence, W, arrayList, z10, i10, j10, z11, ((Long) obj).longValue());
                xjVar.b.a(true);
            }
        }, 0L);
    }

    public final void O(File file) {
        File[] listFiles = file.listFiles();
        File j10 = org.telegram.messenger.b8.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    O(file2);
                } else if (!file2.equals(j10)) {
                    qj qjVar = new qj();
                    qjVar.b = file2.getName();
                    qjVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    qjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    qjVar.c = org.telegram.messenger.i0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        qjVar.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(qjVar);
                }
            }
        }
    }

    public final boolean P(File file) {
        int i10;
        String D = org.telegram.messenger.b8.D(file);
        String mimeTypeFromExtension = D != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(D) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !of.c.i.contains(mimeTypeFromExtension)) {
            new cc(this.b.c, null).u(org.telegram.messenger.cd.a0("InvalidFormatError", null, 2131749191, new Object[0]), org.telegram.messenger.cd.L0(2131751104, null), null).j();
            return false;
        }
        if (file.length() > org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).m4) {
            new cc(this.b.c, null).u(org.telegram.messenger.cd.a0("TooLargeError", null, 2131744067, new Object[0]), org.telegram.messenger.cd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).m4 / 1024)), null).j();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(org.telegram.messenger.w0.b, Uri.fromFile(file));
            i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i10 <= org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).l4 * 1000) {
            return true;
        }
        new cc(this.b.c, null).u(org.telegram.messenger.cd.a0("TooLongError", null, 2131744066, new Object[0]), org.telegram.messenger.cd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).l4)), null).j();
        return false;
    }

    public final boolean Q(File file) {
        File file2;
        pj pjVar;
        this.N = false;
        boolean canRead = file.canRead();
        lj ljVar = this.r;
        String str = null;
        pj pjVar2 = this.w;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                V(org.telegram.messenger.cd.L0(2131754711, null));
                return false;
            }
            this.O = file;
            pjVar2.e.clear();
            Environment.getExternalStorageState();
            org.telegram.messenger.i0.y(ljVar);
            this.U = true;
            pjVar2.f();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                V(org.telegram.messenger.cd.L0(2131743904, null));
                return false;
            }
            this.O = file;
            ArrayList arrayList = pjVar2.e;
            ArrayList arrayList2 = pjVar2.f;
            ArrayList arrayList3 = pjVar2.e;
            arrayList.clear();
            File j10 = org.telegram.messenger.b8.j(6);
            int i10 = 0;
            while (i10 < listFiles.length) {
                File file3 = listFiles[i10];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j10)) {
                    pjVar = pjVar2;
                } else {
                    qj qjVar = new qj();
                    qjVar.b = file3.getName();
                    qjVar.f = file3;
                    if (file3.isDirectory()) {
                        qjVar.a = R.drawable.files_folder;
                        qjVar.c = org.telegram.messenger.cd.L0(2131750686, str);
                        pjVar = pjVar2;
                    } else {
                        this.N = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        qjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        pjVar = pjVar2;
                        qjVar.c = org.telegram.messenger.i0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            qjVar.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(qjVar);
                }
                i10++;
                pjVar2 = pjVar;
                str = null;
            }
            pj pjVar3 = pjVar2;
            qj qjVar2 = new qj();
            qjVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((oj) i0.a.g(1, arrayList2)).a;
                if (file4 == null) {
                    file2 = null;
                    qjVar2.c = org.telegram.messenger.cd.L0(2131750686, null);
                } else {
                    file2 = null;
                    qjVar2.c = file4.toString();
                }
            } else {
                file2 = null;
                qjVar2.c = org.telegram.messenger.cd.L0(2131750686, null);
            }
            qjVar2.a = R.drawable.files_folder;
            qjVar2.f = file2;
            arrayList3.add(0, qjVar2);
            if (this.O != null) {
                Collections.sort(pjVar3.e, new hj(this, 0));
            }
            Y();
            org.telegram.messenger.i0.y(ljVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            pjVar3.f();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            V(e.getLocalizedMessage());
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
    public final void R() {
        BufferedReader bufferedReader;
        bi biVar;
        int lastIndexOf;
        BufferedReader bufferedReader2 = null;
        this.O = null;
        this.N = false;
        this.w.e.clear();
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 30) {
            Environment.isExternalStorageManager();
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) {
            qj qjVar = new qj();
            if (Environment.isExternalStorageRemovable()) {
                qjVar.b = org.telegram.messenger.cd.L0(2131745857, null);
                qjVar.a = R.drawable.files_internal;
                qjVar.c = org.telegram.messenger.cd.L0(2131750857, null);
            } else {
                qjVar.b = org.telegram.messenger.cd.L0(2131749198, null);
                qjVar.a = R.drawable.files_storage;
                qjVar.c = org.telegram.messenger.cd.L0(2131749199, null);
            }
            qjVar.f = Environment.getExternalStorageDirectory();
            this.w.e.add(qjVar);
            hashSet.add(path);
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
        } catch (Exception e) {
            e = e;
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
                        if (org.telegram.messenger.v2.a) {
                            org.telegram.messenger.f8.b(readLine);
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
                                qj qjVar2 = new qj();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    qjVar2.b = org.telegram.messenger.cd.L0(2131745857, null);
                                } else {
                                    qjVar2.b = org.telegram.messenger.cd.L0(2131750856, null);
                                }
                                qjVar2.c = org.telegram.messenger.cd.L0(2131750857, null);
                                qjVar2.a = R.drawable.files_internal;
                                qjVar2.f = new File(nextToken);
                                this.w.e.add(qjVar2);
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                            }
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    org.telegram.messenger.f8.g(e, true);
                }
                try {
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.f8.g(e11, true);
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e12) {
                        org.telegram.messenger.f8.g(e12, true);
                    }
                }
                throw th;
            }
        }
        bufferedReader.close();
        try {
            File file = new File(org.telegram.messenger.w0.b.getExternalFilesDir(null), "Telegram");
            if (file.exists()) {
                qj qjVar3 = new qj();
                qjVar3.b = "Telegram";
                qjVar3.c = org.telegram.messenger.cd.L0(2131754241, null);
                qjVar3.a = R.drawable.files_folder;
                qjVar3.f = file;
                this.w.e.add(qjVar3);
            }
        } catch (Exception e13) {
            org.telegram.messenger.f8.g(e13, true);
        }
        if (!this.d0 && ((biVar = this.b) == null || !biVar.y1)) {
            qj qjVar4 = new qj();
            qjVar4.b = org.telegram.messenger.cd.L0(2131750493, null);
            qjVar4.c = org.telegram.messenger.cd.L0(2131750486, null);
            qjVar4.a = R.drawable.files_gallery;
            qjVar4.f = null;
            this.w.e.add(qjVar4);
        }
        if (this.a0) {
            qj qjVar5 = new qj();
            qjVar5.b = org.telegram.messenger.cd.L0(2131753952, null);
            qjVar5.c = org.telegram.messenger.cd.L0(2131748330, null);
            qjVar5.a = R.drawable.files_music;
            qjVar5.f = null;
            this.w.e.add(qjVar5);
        }
        if (!((ArrayList) this.w.h).isEmpty()) {
            this.N = true;
        }
        org.telegram.messenger.i0.y(this.r);
        this.U = true;
        this.w.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S(View view, Object obj) {
        boolean z10;
        boolean z11 = obj instanceof qj;
        ArrayList arrayList = this.S;
        bi biVar = this.b;
        HashMap hashMap = this.R;
        HashMap hashMap2 = this.T;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof org.telegram.messenger.jj) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                org.telegram.ui.s00 s00Var = new org.telegram.ui.s00(jjVar.f1(), org.telegram.messenger.jj.B0(jjVar.k));
                if (hashMap2.containsKey(s00Var)) {
                    hashMap2.remove(s00Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(s00Var, jjVar);
                    z12 = true;
                }
                z10 = z12;
                if (biVar.y1) {
                }
            }
            return false;
        }
        qj qjVar = (qj) obj;
        File file = qjVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = qjVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!qjVar.f.canRead()) {
                    V(org.telegram.messenger.cd.L0(2131754711, null));
                    return false;
                }
                if (this.W && qjVar.e == null) {
                    V(org.telegram.messenger.cd.a0("PassportUploadNotImage", null, 2131747466, new Object[0]));
                    return false;
                }
                if ((qjVar.f.length() > 2097152000 && !org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q()) || qjVar.f.length() > 4194304000L) {
                    kg.q0 q0Var = new kg.q0(6, org.telegram.messenger.d20.s0, biVar.c.getContext(), biVar.W1, null);
                    q0Var.F2 = true;
                    q0Var.F1();
                    q0Var.show();
                    return false;
                }
                if (this.V >= 0) {
                    int size = hashMap.size();
                    int i10 = this.V;
                    if (size >= i10) {
                        V(org.telegram.messenger.cd.a0("PassportUploadMaxReached", null, 2131747467, org.telegram.messenger.cd.G(i10, "Files", new Object[0])));
                        return false;
                    }
                }
                if ((!this.d0 || P(qjVar.f)) && qjVar.f.length() != 0) {
                    boolean z13 = biVar.N2;
                    hashMap.put(absolutePath, qjVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.U = false;
            if (biVar.y1) {
                if (view instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) view).b(z10, true);
                }
                biVar.J1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.Q != null && !this.K) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((org.telegram.messenger.jj) hashMap2.get((org.telegram.ui.s00) it.next()));
                }
                this.Q.m(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void T() {
        View m10;
        pj pjVar = this.x;
        pjVar.f.clear();
        ArrayList arrayList = pjVar.f;
        pj pjVar2 = this.w;
        arrayList.addAll(pjVar2.f);
        ArrayList arrayList2 = pjVar.e;
        arrayList2.clear();
        arrayList2.addAll(pjVar2.e);
        ArrayList arrayList3 = (ArrayList) pjVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) pjVar2.h);
        pjVar.f();
        lj ljVar = this.s;
        ljVar.setVisibility(0);
        lj ljVar2 = this.r;
        ljVar.setPadding(ljVar2.getPaddingLeft(), ljVar2.getPaddingTop(), ljVar2.getPaddingRight(), ljVar2.getPaddingBottom());
        ag.d1 d1Var = this.E;
        int L0 = d1Var.L0();
        if (L0 < 0 || (m10 = d1Var.m(L0)) == null) {
            return;
        }
        this.y.h1(L0, m10.getTop() - ljVar.getPaddingTop());
    }

    public final void U(int i10) {
        lj ljVar;
        float L;
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            ljVar = this.r;
            if (i12 >= childCount) {
                i12 = 0;
                break;
            } else if (getChildAt(i12) == ljVar) {
                break;
            } else {
                i12++;
            }
        }
        lj ljVar2 = this.s;
        if (i10 == 1) {
            L = org.telegram.messenger.i0.L(150.0f);
            ljVar2.setAlpha(1.0f);
            ljVar2.setScaleX(1.0f);
            ljVar2.setScaleY(1.0f);
            ljVar2.setTranslationX(0.0f);
            removeView(ljVar2);
            addView(ljVar2, i12);
            ljVar2.setVisibility(0);
            ljVar.setTranslationX(L);
            ljVar.setAlpha(0.0f);
            this.f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.i0.L(150.0f);
            ljVar.setAlpha(0.0f);
            ljVar.setScaleX(0.95f);
            ljVar.setScaleY(0.95f);
            ljVar2.setScaleX(1.0f);
            ljVar2.setScaleY(1.0f);
            ljVar2.setTranslationX(0.0f);
            ljVar2.setAlpha(1.0f);
            removeView(ljVar2);
            addView(ljVar2, i12 + 1);
            ljVar2.setVisibility(0);
            this.f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f0.addUpdateListener(new gj(this, i10, L, i11));
        this.f0.addListener(new w5(this, 11));
        if (i10 == 1) {
            this.f0.setDuration(220L);
        } else {
            this.f0.setDuration(200L);
        }
        this.f0.setInterpolator(gr.f);
        this.f0.start();
    }

    public final void V(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
        String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = str;
        i0.a.w(null, 2131747847, alertDialog$Builder, null);
    }

    public final void W() {
        s4.g0 adapter = this.r.getAdapter();
        boolean z10 = true;
        wj wjVar = this.D;
        if (adapter != wjVar ? this.w.b() != 1 : !wjVar.s.isEmpty() || !wjVar.P.isEmpty()) {
            z10 = false;
        }
        this.L.setVisibility(z10 ? 0 : 8);
        X();
    }

    public final void X() {
        View childAt;
        kj kjVar = this.L;
        if (kjVar.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = kjVar.getTranslationY();
            this.M = (childAt.getTop() + (kjVar.getMeasuredHeight() - getMeasuredHeight())) / 2;
            kjVar.setTranslationY(translationY);
        }
    }

    public final void Y() {
        org.telegram.ui.ActionBar.t0 t0Var = this.F;
        if (t0Var == null || t0Var.v()) {
            return;
        }
        t0Var.setVisibility((this.N || this.w.f.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.uh
    public final void d() {
        org.telegram.ui.ActionBar.t0 t0Var = this.F;
        if (t0Var != null) {
            try {
                if (t0Var.getSearchField() != null) {
                    t0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j5, this.a));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public int getButtonsHideOffset() {
        return org.telegram.messenger.i0.L(62.0f);
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        lj ljVar = this.r;
        if (ljVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = ljVar.getChildAt(0);
        ck0 ck0Var = (ck0) ljVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(4.0f)) - org.telegram.messenger.i0.L(8.0f);
        if (y3 > 0 && ck0Var != null && ck0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || ck0Var == null || ck0Var.b() != 0) {
            y3 = i10;
        }
        return org.telegram.messenger.i0.L(13.0f) + y3;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.uh
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override // org.telegram.ui.Components.uh
    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.F.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.j5));
        int i10 = org.telegram.ui.ActionBar.t6.A5;
        lj ljVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 32, new Class[]{org.telegram.ui.Cells.c7.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 48, new Class[]{org.telegram.ui.Cells.c7.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.t6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 40, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.oj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.pj));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.uh
    public final int i() {
        return 1;
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean j() {
        pj pjVar = this.w;
        if (pjVar.f.size() <= 0) {
            return false;
        }
        T();
        oj ojVar = (oj) i0.a.v(1, pjVar.f);
        this.b.R2.setTitle(ojVar.b);
        int topForScroll = getTopForScroll();
        File file = ojVar.a;
        if (file != null) {
            Q(file);
        } else {
            R();
        }
        Y();
        this.E.h1(0, topForScroll);
        U(2);
        return true;
    }

    @Override // org.telegram.ui.Components.uh
    public final void o() {
        try {
            if (this.P) {
                org.telegram.messenger.w0.b.unregisterReceiver(this.e0);
                this.P = false;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.b.R2.k(true);
        org.telegram.ui.ActionBar.y p5 = this.b.R2.p();
        p5.removeView(this.G);
        p5.removeView(this.F);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        X();
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(nj njVar) {
        this.Q = njVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.uh
    public final void t() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    @Override // org.telegram.ui.Components.uh
    public final void w(int i10) {
        if (i10 == 6) {
            org.telegram.messenger.tz.M0 = !org.telegram.messenger.tz.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.tz.M0);
            edit.apply();
            this.c0 = org.telegram.messenger.tz.M0;
            pj pjVar = this.w;
            Collections.sort((ArrayList) pjVar.h, new hj(this, 1));
            if (this.O != null) {
                Collections.sort(pjVar.e, new hj(this, 0));
            }
            pjVar.f();
            this.G.setIcon(this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
