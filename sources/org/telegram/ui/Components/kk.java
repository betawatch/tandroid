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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class kk extends ki {
    public static final /* synthetic */ int h0 = 0;
    public final jk E;
    public final kg.c0 F;
    public final org.telegram.ui.ActionBar.r0 G;
    public final org.telegram.ui.ActionBar.r0 H;
    public final jg.q0 I;
    public AnimatorSet J;
    public final wz K;
    public boolean L;
    public final fi.v4 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public ak R;
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
    public final yj r;
    public final yj s;
    public final ck w;
    public final ck x;
    public final wy y;

    public kk(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, si siVar) {
        super(context, i6Var, siVar);
        Cursor cursor;
        final int i10 = 0;
        this.Q = false;
        this.S = new HashMap();
        this.T = new ArrayList();
        this.U = new HashMap();
        this.W = -1;
        this.f0 = new androidx.mediarouter.app.f(this, 8);
        ck ckVar = new ck(this, context);
        this.w = ckVar;
        final int i11 = 1;
        this.b0 = i7 == 1;
        int i12 = 2;
        boolean z10 = i7 == 2;
        this.e0 = z10;
        this.d0 = org.telegram.messenger.bz.M0;
        int i13 = 4;
        try {
            if (z10) {
                try {
                    Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(i12);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).n4 * 1000) {
                                try {
                                    if (j10 <= org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).o4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        dk dkVar = new dk();
                                        dkVar.b = file.getName();
                                        dkVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        dkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        dkVar.c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            dkVar.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.w.h).add(dkVar);
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
                            i12 = 2;
                        } catch (Throwable th5) {
                            th = th5;
                            cursor = query;
                        }
                    }
                    query.close();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else {
                Q(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) ckVar.h, new wj(this, 1));
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
        org.telegram.ui.ActionBar.z t6 = this.b.V2.t();
        org.telegram.ui.ActionBar.r0 a10 = t6.a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new bi.s1(this, 7);
        this.G = a10;
        a10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, null));
        a10.setContentDescription(org.telegram.messenger.gd.M0(2131745641, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i14 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(searchField, i14, i6Var);
        org.telegram.ui.ActionBar.u6.v(searchField, i14, i6Var);
        org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Me, i6Var);
        org.telegram.ui.ActionBar.r0 a11 = t6.a(6, this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.H = a11;
        a11.setContentDescription(org.telegram.messenger.gd.M0(2131754891, null));
        wz wzVar = new wz(context, i6Var);
        this.K = wzVar;
        addView(wzVar);
        fi.v4 v4Var = new fi.v4(this, context, wzVar, i6Var);
        this.M = v4Var;
        addView(v4Var, c8.ma.c(-1.0f, -1));
        v4Var.setVisibility(8);
        v4Var.setOnTouchListener(new gi.a(15));
        yj yjVar = new yj(this, context, i6Var, 0);
        this.s = yjVar;
        yjVar.setSectionsType(2);
        yjVar.setVerticalScrollBarEnabled(false);
        wy wyVar = new wy(org.telegram.messenger.g0.L(56.0f), 0, yjVar);
        this.y = wyVar;
        yjVar.setLayoutManager(wyVar);
        yjVar.setClipToPadding(false);
        ck ckVar2 = new ck(this, context);
        this.x = ckVar2;
        yjVar.setAdapter(ckVar2);
        addView(yjVar, c8.ma.c(-1.0f, -1));
        yjVar.setVisibility(8);
        yj yjVar2 = new yj(this, context, i6Var, 1);
        this.r = yjVar2;
        yjVar2.r1();
        setBlur3Capture(yjVar2);
        this.d = yjVar2;
        this.h = true;
        this.f = true;
        yjVar2.setSectionsType(2);
        yjVar2.setVerticalScrollBarEnabled(false);
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, yjVar2, 2);
        this.F = c0Var;
        yjVar2.setLayoutManager(c0Var);
        yjVar2.setClipToPadding(false);
        yjVar2.setAdapter(this.w);
        addView(yjVar2, c8.ma.c(-1.0f, -1));
        this.E = new jk(this, context);
        yjVar2.setOnScrollListener(new oa(this, i13));
        yjVar2.setOnItemClickListener(new oj0(this) { // from class: org.telegram.ui.Components.uj
            public final /* synthetic */ kk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.oj0
            public final void c(int i15, View view) {
                switch (i10) {
                    case 0:
                        kk.P(this.b, view, i15);
                        break;
                    default:
                        kk kkVar = this.b;
                        jg.q0 q0Var = kkVar.I;
                        q0Var.I0(true);
                        jk jkVar = kkVar.E;
                        ArrayList arrayList = q0Var.f3;
                        jg.o0 o0Var = arrayList.isEmpty() ? jg.q0.k3[i15] : (jg.o0) arrayList.get(i15);
                        si siVar2 = jkVar.Y.b;
                        ArrayList arrayList2 = jkVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i16))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        siVar2.V2.setSearchFilter(o0Var);
                        siVar2.V2.setSearchFieldText("");
                        jkVar.a0(null, null, true);
                        break;
                }
            }
        });
        yjVar2.setOnItemLongClickListener(new b0(this, 19));
        jg.q0 q0Var = new jg.q0(context, i6Var);
        this.I = q0Var;
        q0Var.setOnItemClickListener(new oj0(this) { // from class: org.telegram.ui.Components.uj
            public final /* synthetic */ kk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.oj0
            public final void c(int i15, View view) {
                switch (i11) {
                    case 0:
                        kk.P(this.b, view, i15);
                        break;
                    default:
                        kk kkVar = this.b;
                        jg.q0 q0Var2 = kkVar.I;
                        q0Var2.I0(true);
                        jk jkVar = kkVar.E;
                        ArrayList arrayList = q0Var2.f3;
                        jg.o0 o0Var = arrayList.isEmpty() ? jg.q0.k3[i15] : (jg.o0) arrayList.get(i15);
                        si siVar2 = jkVar.Y.b;
                        ArrayList arrayList2 = jkVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i16))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        siVar2.V2.setSearchFilter(o0Var);
                        siVar2.V2.setSearchFieldText("");
                        jkVar.a0(null, null, true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, q0Var, i6Var);
        addView(q0Var, c8.ma.e(-1, 44, 48));
        q0Var.setTranslationY(-org.telegram.messenger.g0.L(44.0f));
        q0Var.setVisibility(4);
        T();
        a0();
        Y();
    }

    public static void P(kk kkVar, View view, int i7) {
        Object O;
        int i10;
        si siVar = kkVar.b;
        yj yjVar = kkVar.r;
        v4.i0 adapter = yjVar.getAdapter();
        ck ckVar = kkVar.w;
        if (adapter == ckVar) {
            O = ckVar.E(i7);
        } else {
            jk jkVar = kkVar.E;
            O = jkVar.O(jkVar.S(i7), jkVar.Q(i7));
        }
        if (!(O instanceof dk)) {
            kkVar.U(view, O);
            return;
        }
        dk dkVar = (dk) O;
        File file = dkVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!org.telegram.messenger.s2.b && (((i10 = dkVar.a) == R.drawable.files_storage || i10 == R.drawable.files_internal) && !isExternalStorageManager)) {
            fi fiVar = siVar.p3;
            int i11 = siVar.H3;
            if (siVar.F3 == null || siVar.F1 - siVar.G1 >= 0) {
                kkVar.R.A();
                return;
            } else if (org.telegram.messenger.mp.u1(i11).K3() || org.telegram.messenger.mp.u1(i11).X4 <= siVar.G1) {
                new lc(fiVar, siVar.J0).t(org.telegram.messenger.gd.M0(2131743806, null), siVar.J0).j();
                return;
            } else {
                new lc(fiVar, siVar.J0).f(org.telegram.messenger.mp.u1(i11).X4, new eh(siVar, 3)).j();
                return;
            }
        }
        if (file != null) {
            if (!file.isDirectory()) {
                kkVar.U(view, dkVar);
                return;
            }
            bk bkVar = new bk();
            View childAt = yjVar.getChildAt(0);
            v4.f1 G = yjVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                bkVar.a = kkVar.P;
                bkVar.b = siVar.V2.getTitle();
                kkVar.V();
                ckVar.f.add(bkVar);
                if (!kkVar.S(file)) {
                    ckVar.f.remove(bkVar);
                    return;
                } else {
                    kkVar.W(1);
                    siVar.V2.setTitle(dkVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = dkVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
            org.telegram.ui.bn bnVar = h2Var instanceof org.telegram.ui.bn ? (org.telegram.ui.bn) h2Var : null;
            org.telegram.ui.cn0 cn0Var = new org.telegram.ui.cn0(0, MediaController.a2, hashMap, arrayList, 0, bnVar != null, bnVar, false);
            cn0Var.m0 = true;
            cn0Var.t0 = new h6.m(kkVar, hashMap, arrayList, 26);
            cn0Var.k0(kkVar.W, false);
            org.telegram.ui.ActionBar.h2 h2Var2 = siVar.a2;
            if (h2Var2 != null) {
                h2Var2.presentFragment(cn0Var);
            } else {
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(cn0Var);
                }
            }
            siVar.a(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            ak akVar = kkVar.R;
            if (akVar != null) {
                akVar.T();
                return;
            }
            return;
        }
        int topForScroll = kkVar.getTopForScroll();
        kkVar.V();
        bk bkVar2 = (bk) p5.c.g(1, ckVar.f);
        siVar.V2.setTitle(bkVar2.b);
        File file2 = bkVar2.a;
        if (file2 != null) {
            kkVar.S(file2);
        } else {
            kkVar.T();
        }
        kkVar.a0();
        kkVar.F.h1(0, topForScroll);
        kkVar.W(2);
    }

    private int getTopForScroll() {
        yj yjVar = this.r;
        View childAt = yjVar.getChildAt(0);
        v4.f1 G = yjVar.G(childAt);
        int i7 = -yjVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i7 : childAt.getTop() + i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.ki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        int i11;
        si siVar = this.b;
        if (siVar.V2.o0 || siVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            L = org.telegram.messenger.g0.L(56.0f);
            siVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    L = i11 - org.telegram.messenger.g0.L(1.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    siVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            L = i11 - org.telegram.messenger.g0.L(1.0f);
            if (L < 0) {
            }
            siVar.r0 = true;
        }
        this.r.q1(0, L + org.telegram.messenger.g0.m, 0, this.e);
        ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.ki
    public final void C() {
        ck ckVar = this.w;
        if (ckVar != null) {
            ckVar.f();
        }
        jk jkVar = this.E;
        if (jkVar != null) {
            jkVar.f();
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void I(ki kiVar) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.w.f.clear();
        T();
        a0();
        Y();
        this.b.V2.setTitle(org.telegram.messenger.gd.M0(2131745462, null));
        this.H.setVisibility(0);
        this.F.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ki
    public final void K() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean M(final boolean z10, final int i7, int i10, final long j3, final boolean z11) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((org.telegram.messenger.fj) hashMap.get((org.telegram.ui.vz) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        si siVar = this.b;
        CharSequence[] charSequenceArr = {siVar.b1().getText()};
        final ArrayList Y = org.telegram.messenger.ri.d0(siVar.H3).Y(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return b5.Y(siVar.H3, siVar.c1(), siVar.Y0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.xj
            @Override // org.telegram.messenger.x10
            public final void a(Object obj) {
                kk kkVar = kk.this;
                kkVar.L = true;
                kkVar.R.n(arrayList2, charSequence, Y, arrayList, z10, i7, j3, z11, ((Long) obj).longValue());
                kkVar.b.a(true);
            }
        }, 0L);
    }

    public final void Q(File file) {
        File[] listFiles = file.listFiles();
        File j3 = org.telegram.messenger.w7.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    Q(file2);
                } else if (!file2.equals(j3)) {
                    dk dkVar = new dk();
                    dkVar.b = file2.getName();
                    dkVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    dkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    dkVar.c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        dkVar.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(dkVar);
                }
            }
        }
    }

    public final boolean R(File file) {
        int i7;
        String D = org.telegram.messenger.w7.D(file);
        String mimeTypeFromExtension = D != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(D) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !yf.c.i.contains(mimeTypeFromExtension)) {
            new lc(this.b.c, null).u(org.telegram.messenger.gd.a0("InvalidFormatError", null, 2131748989, new Object[0]), org.telegram.messenger.gd.M0(2131751092, null), null).j();
            return false;
        }
        if (file.length() > org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).o4) {
            new lc(this.b.c, null).u(org.telegram.messenger.gd.a0("TooLargeError", null, 2131743807, new Object[0]), org.telegram.messenger.gd.a0("ErrorRingtoneSizeTooBig", null, 2131751091, Integer.valueOf(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).o4 / 1024)), null).j();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.b, Uri.fromFile(file));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i7 <= org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).n4 * 1000) {
            return true;
        }
        new lc(this.b.c, null).u(org.telegram.messenger.gd.a0("TooLongError", null, 2131743806, new Object[0]), org.telegram.messenger.gd.a0("ErrorRingtoneDurationTooLong", null, 2131751093, Integer.valueOf(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).n4)), null).j();
        return false;
    }

    public final boolean S(File file) {
        File file2;
        ck ckVar;
        this.O = false;
        boolean canRead = file.canRead();
        yj yjVar = this.r;
        String str = null;
        ck ckVar2 = this.w;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                X(org.telegram.messenger.gd.M0(2131754711, null));
                return false;
            }
            this.P = file;
            ckVar2.e.clear();
            Environment.getExternalStorageState();
            org.telegram.messenger.g0.y(yjVar);
            this.V = true;
            ckVar2.f();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                X(org.telegram.messenger.gd.M0(2131743642, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = ckVar2.e;
            ArrayList arrayList2 = ckVar2.f;
            ArrayList arrayList3 = ckVar2.e;
            arrayList.clear();
            File j3 = org.telegram.messenger.w7.j(6);
            int i7 = 0;
            while (i7 < listFiles.length) {
                File file3 = listFiles[i7];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j3)) {
                    ckVar = ckVar2;
                } else {
                    dk dkVar = new dk();
                    dkVar.b = file3.getName();
                    dkVar.f = file3;
                    if (file3.isDirectory()) {
                        dkVar.a = R.drawable.files_folder;
                        dkVar.c = org.telegram.messenger.gd.M0(2131750669, str);
                        ckVar = ckVar2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        dkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        ckVar = ckVar2;
                        dkVar.c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            dkVar.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(dkVar);
                }
                i7++;
                ckVar2 = ckVar;
                str = null;
            }
            ck ckVar3 = ckVar2;
            dk dkVar2 = new dk();
            dkVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((bk) i5.c.h(1, arrayList2)).a;
                if (file4 == null) {
                    file2 = null;
                    dkVar2.c = org.telegram.messenger.gd.M0(2131750669, null);
                } else {
                    file2 = null;
                    dkVar2.c = file4.toString();
                }
            } else {
                file2 = null;
                dkVar2.c = org.telegram.messenger.gd.M0(2131750669, null);
            }
            dkVar2.a = R.drawable.files_folder;
            dkVar2.f = file2;
            arrayList3.add(0, dkVar2);
            if (this.P != null) {
                Collections.sort(ckVar3.e, new wj(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(yjVar);
            this.V = true;
            int topForScroll = getTopForScroll();
            ckVar3.f();
            this.F.h1(0, topForScroll);
            return true;
        } catch (Exception e10) {
            X(e10.getLocalizedMessage());
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
    public final void T() {
        BufferedReader bufferedReader;
        si siVar;
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
            dk dkVar = new dk();
            if (Environment.isExternalStorageRemovable()) {
                dkVar.b = org.telegram.messenger.gd.M0(2131745645, null);
                dkVar.a = R.drawable.files_internal;
                dkVar.c = org.telegram.messenger.gd.M0(2131750845, null);
            } else {
                dkVar.b = org.telegram.messenger.gd.M0(2131748996, null);
                dkVar.a = R.drawable.files_storage;
                dkVar.c = org.telegram.messenger.gd.M0(2131748998, null);
            }
            dkVar.f = Environment.getExternalStorageDirectory();
            this.w.e.add(dkVar);
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
                        if (org.telegram.messenger.s2.a) {
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
                                dk dkVar2 = new dk();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    dkVar2.b = org.telegram.messenger.gd.M0(2131745645, null);
                                } else {
                                    dkVar2.b = org.telegram.messenger.gd.M0(2131750844, null);
                                }
                                dkVar2.c = org.telegram.messenger.gd.M0(2131750845, null);
                                dkVar2.a = R.drawable.files_internal;
                                dkVar2.f = new File(nextToken);
                                this.w.e.add(dkVar2);
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
                dk dkVar3 = new dk();
                dkVar3.b = "Telegram";
                dkVar3.c = org.telegram.messenger.gd.M0(2131754239, null);
                dkVar3.a = R.drawable.files_folder;
                dkVar3.f = file;
                this.w.e.add(dkVar3);
            }
        } catch (Exception e15) {
            org.telegram.messenger.a8.g(e15, true);
        }
        if (!this.e0 && ((siVar = this.b) == null || !siVar.C1)) {
            dk dkVar4 = new dk();
            dkVar4.b = org.telegram.messenger.gd.M0(2131750468, null);
            dkVar4.c = org.telegram.messenger.gd.M0(2131750461, null);
            dkVar4.a = R.drawable.files_gallery;
            dkVar4.f = null;
            this.w.e.add(dkVar4);
        }
        if (this.b0) {
            dk dkVar5 = new dk();
            dkVar5.b = org.telegram.messenger.gd.M0(2131753950, null);
            dkVar5.c = org.telegram.messenger.gd.M0(2131748123, null);
            dkVar5.a = R.drawable.files_music;
            dkVar5.f = null;
            this.w.e.add(dkVar5);
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
    public final boolean U(View view, Object obj) {
        boolean z10;
        boolean z11 = obj instanceof dk;
        ArrayList arrayList = this.T;
        si siVar = this.b;
        HashMap hashMap = this.S;
        HashMap hashMap2 = this.U;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof org.telegram.messenger.fj) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                org.telegram.ui.vz vzVar = new org.telegram.ui.vz(fjVar.e1(), org.telegram.messenger.fj.B0(fjVar.k));
                if (hashMap2.containsKey(vzVar)) {
                    hashMap2.remove(vzVar);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(vzVar, fjVar);
                    z12 = true;
                }
                z10 = z12;
                if (siVar.C1) {
                }
            }
            return false;
        }
        dk dkVar = (dk) obj;
        File file = dkVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = dkVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!dkVar.f.canRead()) {
                    X(org.telegram.messenger.gd.M0(2131754711, null));
                    return false;
                }
                if (this.a0 && dkVar.e == null) {
                    X(org.telegram.messenger.gd.a0("PassportUploadNotImage", null, 2131747257, new Object[0]));
                    return false;
                }
                if ((dkVar.f.length() > 2097152000 && !org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q()) || dkVar.f.length() > 4194304000L) {
                    ug.l0 l0Var = new ug.l0(6, org.telegram.messenger.j10.t0, siVar.c.getContext(), siVar.a2, null);
                    l0Var.J2 = true;
                    l0Var.G1();
                    l0Var.show();
                    return false;
                }
                if (this.W >= 0) {
                    int size = hashMap.size();
                    int i7 = this.W;
                    if (size >= i7) {
                        X(org.telegram.messenger.gd.a0("PassportUploadMaxReached", null, 2131747258, org.telegram.messenger.gd.G(i7, "Files", new Object[0])));
                        return false;
                    }
                }
                if ((!this.e0 || R(dkVar.f)) && dkVar.f.length() != 0) {
                    boolean z13 = siVar.R2;
                    hashMap.put(absolutePath, dkVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.V = false;
            if (siVar.C1) {
                if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).b(z10, true);
                }
                siVar.L1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.R != null && !this.L) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((org.telegram.messenger.fj) hashMap2.get((org.telegram.ui.vz) it.next()));
                }
                this.R.n(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void V() {
        View m10;
        ck ckVar = this.x;
        ckVar.f.clear();
        ArrayList arrayList = ckVar.f;
        ck ckVar2 = this.w;
        arrayList.addAll(ckVar2.f);
        ArrayList arrayList2 = ckVar.e;
        arrayList2.clear();
        arrayList2.addAll(ckVar2.e);
        ArrayList arrayList3 = (ArrayList) ckVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) ckVar2.h);
        ckVar.f();
        yj yjVar = this.s;
        yjVar.setVisibility(0);
        yj yjVar2 = this.r;
        yjVar.setPadding(yjVar2.getPaddingLeft(), yjVar2.getPaddingTop(), yjVar2.getPaddingRight(), yjVar2.getPaddingBottom());
        kg.c0 c0Var = this.F;
        int L0 = c0Var.L0();
        if (L0 < 0 || (m10 = c0Var.m(L0)) == null) {
            return;
        }
        this.y.h1(L0, m10.getTop() - yjVar.getPaddingTop());
    }

    public final void W(int i7) {
        yj yjVar;
        float L;
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = i7;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            yjVar = this.r;
            if (i11 >= childCount) {
                i11 = 0;
                break;
            } else if (getChildAt(i11) == yjVar) {
                break;
            } else {
                i11++;
            }
        }
        yj yjVar2 = this.s;
        if (i7 == 1) {
            L = org.telegram.messenger.g0.L(150.0f);
            yjVar2.setAlpha(1.0f);
            yjVar2.setScaleX(1.0f);
            yjVar2.setScaleY(1.0f);
            yjVar2.setTranslationX(0.0f);
            removeView(yjVar2);
            addView(yjVar2, i11);
            yjVar2.setVisibility(0);
            yjVar.setTranslationX(L);
            yjVar.setAlpha(0.0f);
            this.g0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.g0.L(150.0f);
            yjVar.setAlpha(0.0f);
            yjVar.setScaleX(0.95f);
            yjVar.setScaleY(0.95f);
            yjVar2.setScaleX(1.0f);
            yjVar2.setScaleY(1.0f);
            yjVar2.setTranslationX(0.0f);
            yjVar2.setAlpha(1.0f);
            removeView(yjVar2);
            addView(yjVar2, i11 + 1);
            yjVar2.setVisibility(0);
            this.g0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.g0.addUpdateListener(new vj(this, i7, L, i10));
        this.g0.addListener(new x(this, 12));
        if (i7 == 1) {
            this.g0.setDuration(220L);
        } else {
            this.g0.setDuration(200L);
        }
        this.g0.setInterpolator(lr.f);
        this.g0.start();
    }

    public final void X(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
        String M0 = org.telegram.messenger.gd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = str;
        org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
    }

    public final void Y() {
        v4.i0 adapter = this.r.getAdapter();
        boolean z10 = true;
        jk jkVar = this.E;
        if (adapter != jkVar ? this.w.b() != 1 : !jkVar.s.isEmpty() || !jkVar.Q.isEmpty()) {
            z10 = false;
        }
        this.M.setVisibility(z10 ? 0 : 8);
        Z();
    }

    public final void Z() {
        View childAt;
        fi.v4 v4Var = this.M;
        if (v4Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = v4Var.getTranslationY();
            this.N = (childAt.getTop() + (v4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            v4Var.setTranslationY(translationY);
        }
    }

    public final void a0() {
        org.telegram.ui.ActionBar.r0 r0Var = this.G;
        if (r0Var == null || r0Var.w()) {
            return;
        }
        r0Var.setVisibility((this.O || this.w.f.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.ki
    public final void d() {
        org.telegram.ui.ActionBar.r0 r0Var = this.G;
        if (r0Var != null) {
            try {
                if (r0Var.getSearchField() != null) {
                    r0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, this.a));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ki
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(62.0f);
    }

    @Override // org.telegram.ui.Components.ki
    public int getCurrentItemTop() {
        yj yjVar = this.r;
        if (yjVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i7 = 0;
        View childAt = yjVar.getChildAt(0);
        kj0 kj0Var = (kj0) yjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
        if (y10 > 0 && kj0Var != null && kj0Var.b() == 0) {
            i7 = y10;
        }
        if (y10 < 0 || kj0Var == null || kj0Var.b() != 0) {
            y10 = i7;
        }
        return org.telegram.messenger.g0.L(13.0f) + y10;
    }

    @Override // org.telegram.ui.Components.ki
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ki
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ki
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override // org.telegram.ui.Components.ki
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.j5));
        int i7 = org.telegram.ui.ActionBar.n6.A5;
        yj yjVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 32, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 48, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.n6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.qj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 40, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.sj));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ki
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean k() {
        ck ckVar = this.w;
        if (ckVar.f.size() <= 0) {
            return false;
        }
        V();
        bk bkVar = (bk) p5.c.g(1, ckVar.f);
        this.b.V2.setTitle(bkVar.b);
        int topForScroll = getTopForScroll();
        File file = bkVar.a;
        if (file != null) {
            S(file);
        } else {
            T();
        }
        a0();
        this.F.h1(0, topForScroll);
        W(2);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        Z();
    }

    @Override // org.telegram.ui.Components.ki
    public final void p() {
        try {
            if (this.Q) {
                org.telegram.messenger.t0.b.unregisterReceiver(this.f0);
                this.Q = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.b.V2.o(true);
        org.telegram.ui.ActionBar.z t6 = this.b.V2.t();
        t6.removeView(this.H);
        t6.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.a0 = z10;
    }

    public void setDelegate(ak akVar) {
        this.R = akVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.W = i7;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.ki
    public final void u() {
        this.H.setVisibility(8);
        this.G.setVisibility(8);
    }

    @Override // org.telegram.ui.Components.ki
    public final void w(int i7) {
        if (i7 == 6) {
            org.telegram.messenger.bz.M0 = !org.telegram.messenger.bz.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.bz.M0);
            edit.apply();
            this.d0 = org.telegram.messenger.bz.M0;
            ck ckVar = this.w;
            Collections.sort((ArrayList) ckVar.h, new wj(this, 1));
            if (this.P != null) {
                Collections.sort(ckVar.e, new wj(this, 0));
            }
            ckVar.f();
            this.H.setIcon(this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
