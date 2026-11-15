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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dk extends ci {
    public static final /* synthetic */ int h0 = 0;
    public final ck E;
    public final kg.c0 F;
    public final org.telegram.ui.ActionBar.q0 G;
    public final org.telegram.ui.ActionBar.q0 H;
    public final jg.q0 I;
    public AnimatorSet J;
    public final pz K;
    public boolean L;
    public final fi.x4 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public tj R;
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
    public final rj r;
    public final rj s;
    public final vj w;
    public final vj x;
    public final qy y;

    public dk(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar) {
        super(context, e6Var, kiVar);
        Cursor cursor;
        final int i10 = 0;
        this.Q = false;
        this.S = new HashMap();
        this.T = new ArrayList();
        this.U = new HashMap();
        this.W = -1;
        this.f0 = new androidx.mediarouter.app.f(this, 8);
        vj vjVar = new vj(this, context);
        this.w = vjVar;
        final int i11 = 1;
        this.b0 = i7 == 1;
        int i12 = 2;
        boolean z10 = i7 == 2;
        this.e0 = z10;
        this.d0 = org.telegram.messenger.gz.M0;
        int i13 = 3;
        try {
            if (z10) {
                try {
                    Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(i12);
                            long j10 = query.getLong(i13);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).l4 * 1000) {
                                try {
                                    if (j10 <= org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).m4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        wj wjVar = new wj();
                                        wjVar.b = file.getName();
                                        wjVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        wjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        wjVar.c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            wjVar.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.w.h).add(wjVar);
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
                            i13 = 3;
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
                Collections.sort((ArrayList) vjVar.h, new pj(this, 1));
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
        org.telegram.ui.ActionBar.y s5 = this.b.V2.s();
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new kg.x1(this, 6);
        this.G = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i14 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(searchField, i14, e6Var);
        org.telegram.ui.ActionBar.q6.v(searchField, i14, e6Var);
        org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Me, e6Var);
        org.telegram.ui.ActionBar.q0 a11 = s5.a(6, this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.H = a11;
        a11.setContentDescription(org.telegram.messenger.hd.M0(2131754891, null));
        pz pzVar = new pz(context, e6Var);
        this.K = pzVar;
        addView(pzVar);
        fi.x4 x4Var = new fi.x4(this, context, pzVar, e6Var);
        this.M = x4Var;
        addView(x4Var, c8.ja.c(-1.0f, -1));
        x4Var.setVisibility(8);
        x4Var.setOnTouchListener(new gi.a(15));
        rj rjVar = new rj(this, context, e6Var, 0);
        this.s = rjVar;
        rjVar.setSectionsType(2);
        rjVar.setVerticalScrollBarEnabled(false);
        qy qyVar = new qy(org.telegram.messenger.g0.L(56.0f), 0, rjVar);
        this.y = qyVar;
        rjVar.setLayoutManager(qyVar);
        rjVar.setClipToPadding(false);
        vj vjVar2 = new vj(this, context);
        this.x = vjVar2;
        rjVar.setAdapter(vjVar2);
        addView(rjVar, c8.ja.c(-1.0f, -1));
        rjVar.setVisibility(8);
        rj rjVar2 = new rj(this, context, e6Var, 1);
        this.r = rjVar2;
        rjVar2.r1();
        setBlur3Capture(rjVar2);
        this.d = rjVar2;
        this.h = true;
        this.f = true;
        rjVar2.setSectionsType(2);
        rjVar2.setVerticalScrollBarEnabled(false);
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, rjVar2, 2);
        this.F = c0Var;
        rjVar2.setLayoutManager(c0Var);
        rjVar2.setClipToPadding(false);
        rjVar2.setAdapter(this.w);
        addView(rjVar2, c8.ja.c(-1.0f, -1));
        this.E = new ck(this, context);
        rjVar2.setOnScrollListener(new ri(this, 3));
        rjVar2.setOnItemClickListener(new gj0(this) { // from class: org.telegram.ui.Components.nj
            public final /* synthetic */ dk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gj0
            public final void b(int i15, View view) {
                switch (i10) {
                    case 0:
                        dk.P(this.b, view, i15);
                        break;
                    default:
                        dk dkVar = this.b;
                        jg.q0 q0Var = dkVar.I;
                        q0Var.I0(true);
                        ck ckVar = dkVar.E;
                        ArrayList arrayList = q0Var.f3;
                        jg.o0 o0Var = arrayList.isEmpty() ? jg.q0.k3[i15] : (jg.o0) arrayList.get(i15);
                        ki kiVar2 = ckVar.Y.b;
                        ArrayList arrayList2 = ckVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i16))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        kiVar2.V2.setSearchFilter(o0Var);
                        kiVar2.V2.setSearchFieldText("");
                        ckVar.a0(null, null, true);
                        break;
                }
            }
        });
        rjVar2.setOnItemLongClickListener(new s(this, 20));
        jg.q0 q0Var = new jg.q0(context, e6Var);
        this.I = q0Var;
        q0Var.setOnItemClickListener(new gj0(this) { // from class: org.telegram.ui.Components.nj
            public final /* synthetic */ dk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gj0
            public final void b(int i15, View view) {
                switch (i11) {
                    case 0:
                        dk.P(this.b, view, i15);
                        break;
                    default:
                        dk dkVar = this.b;
                        jg.q0 q0Var2 = dkVar.I;
                        q0Var2.I0(true);
                        ck ckVar = dkVar.E;
                        ArrayList arrayList = q0Var2.f3;
                        jg.o0 o0Var = arrayList.isEmpty() ? jg.q0.k3[i15] : (jg.o0) arrayList.get(i15);
                        ki kiVar2 = ckVar.Y.b;
                        ArrayList arrayList2 = ckVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i16))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        kiVar2.V2.setSearchFilter(o0Var);
                        kiVar2.V2.setSearchFieldText("");
                        ckVar.a0(null, null, true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, q0Var, e6Var);
        addView(q0Var, c8.ja.e(-1, 44, 48));
        q0Var.setTranslationY(-org.telegram.messenger.g0.L(44.0f));
        q0Var.setVisibility(4);
        T();
        a0();
        Y();
    }

    public static void P(dk dkVar, View view, int i7) {
        Object O;
        int i10;
        ki kiVar = dkVar.b;
        rj rjVar = dkVar.r;
        v4.h0 adapter = rjVar.getAdapter();
        vj vjVar = dkVar.w;
        if (adapter == vjVar) {
            O = vjVar.E(i7);
        } else {
            ck ckVar = dkVar.E;
            O = ckVar.O(ckVar.S(i7), ckVar.Q(i7));
        }
        if (!(O instanceof wj)) {
            dkVar.U(view, O);
            return;
        }
        wj wjVar = (wj) O;
        File file = wjVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!org.telegram.messenger.r2.b && (((i10 = wjVar.a) == R.drawable.files_storage || i10 == R.drawable.files_internal) && !isExternalStorageManager)) {
            xh xhVar = kiVar.p3;
            int i11 = kiVar.H3;
            if (kiVar.F3 == null || kiVar.F1 - kiVar.G1 >= 0) {
                dkVar.R.A();
                return;
            } else if (org.telegram.messenger.np.s1(i11).D3() || org.telegram.messenger.np.s1(i11).V4 <= kiVar.G1) {
                new cc(xhVar, kiVar.J0).t(org.telegram.messenger.hd.M0(2131744041, null), kiVar.J0).j();
                return;
            } else {
                new cc(xhVar, kiVar.J0).f(org.telegram.messenger.np.s1(i11).V4, new vg(kiVar, 3)).j();
                return;
            }
        }
        if (file != null) {
            if (!file.isDirectory()) {
                dkVar.U(view, wjVar);
                return;
            }
            uj ujVar = new uj();
            View childAt = rjVar.getChildAt(0);
            v4.e1 G = rjVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                ujVar.a = dkVar.P;
                ujVar.b = kiVar.V2.getTitle();
                dkVar.V();
                vjVar.f.add(ujVar);
                if (!dkVar.S(file)) {
                    vjVar.f.remove(ujVar);
                    return;
                } else {
                    dkVar.W(1);
                    kiVar.V2.setTitle(wjVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = wjVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
            org.telegram.ui.an anVar = e2Var instanceof org.telegram.ui.an ? (org.telegram.ui.an) e2Var : null;
            org.telegram.ui.zm0 zm0Var = new org.telegram.ui.zm0(0, MediaController.a2, hashMap, arrayList, 0, anVar != null, anVar, false);
            zm0Var.m0 = true;
            zm0Var.t0 = new h6.m(dkVar, hashMap, arrayList, 26);
            zm0Var.k0(dkVar.W, false);
            org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.a2;
            if (e2Var2 != null) {
                e2Var2.presentFragment(zm0Var);
            } else {
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(zm0Var);
                }
            }
            kiVar.a(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            tj tjVar = dkVar.R;
            if (tjVar != null) {
                tjVar.T();
                return;
            }
            return;
        }
        int topForScroll = dkVar.getTopForScroll();
        dkVar.V();
        uj ujVar2 = (uj) r.b.g(1, vjVar.f);
        kiVar.V2.setTitle(ujVar2.b);
        File file2 = ujVar2.a;
        if (file2 != null) {
            dkVar.S(file2);
        } else {
            dkVar.T();
        }
        dkVar.a0();
        dkVar.F.h1(0, topForScroll);
        dkVar.W(2);
    }

    private int getTopForScroll() {
        rj rjVar = this.r;
        View childAt = rjVar.getChildAt(0);
        v4.e1 G = rjVar.G(childAt);
        int i7 = -rjVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i7 : childAt.getTop() + i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        int i11;
        ki kiVar = this.b;
        if (kiVar.V2.o0 || kiVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            L = org.telegram.messenger.g0.L(56.0f);
            kiVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    L = i11 - org.telegram.messenger.g0.L(1.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    kiVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            L = i11 - org.telegram.messenger.g0.L(1.0f);
            if (L < 0) {
            }
            kiVar.r0 = true;
        }
        this.r.q1(0, L + org.telegram.messenger.g0.m, 0, this.e);
        ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.ci
    public final void C() {
        vj vjVar = this.w;
        if (vjVar != null) {
            vjVar.f();
        }
        ck ckVar = this.E;
        if (ckVar != null) {
            ckVar.f();
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void I(ci ciVar) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.w.f.clear();
        T();
        a0();
        Y();
        this.b.V2.setTitle(org.telegram.messenger.hd.M0(2131745657, null));
        this.H.setVisibility(0);
        this.F.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ci
    public final void K() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean M(final boolean z10, final int i7, int i10, final long j3, final boolean z11) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((org.telegram.messenger.gj) hashMap.get((org.telegram.ui.sz) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        ki kiVar = this.b;
        CharSequence[] charSequenceArr = {kiVar.a1().getText()};
        final ArrayList W = org.telegram.messenger.si.b0(kiVar.H3).W(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return t4.Y(kiVar.H3, kiVar.b1(), kiVar.X0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.qj
            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                dk dkVar = dk.this;
                dkVar.L = true;
                dkVar.R.n(arrayList2, charSequence, W, arrayList, z10, i7, j3, z11, ((Long) obj).longValue());
                dkVar.b.a(true);
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
                    wj wjVar = new wj();
                    wjVar.b = file2.getName();
                    wjVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    wjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    wjVar.c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        wjVar.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(wjVar);
                }
            }
        }
    }

    public final boolean R(File file) {
        int i7;
        String D = org.telegram.messenger.w7.D(file);
        String mimeTypeFromExtension = D != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(D) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !yf.c.i.contains(mimeTypeFromExtension)) {
            new cc(this.b.c, null).u(org.telegram.messenger.hd.a0("InvalidFormatError", null, 2131749181, new Object[0]), org.telegram.messenger.hd.M0(2131751103, null), null).j();
            return false;
        }
        if (file.length() > org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).m4) {
            new cc(this.b.c, null).u(org.telegram.messenger.hd.a0("TooLargeError", null, 2131744042, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneSizeTooBig", null, 2131751102, Integer.valueOf(org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).m4 / 1024)), null).j();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.b, Uri.fromFile(file));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i7 <= org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).l4 * 1000) {
            return true;
        }
        new cc(this.b.c, null).u(org.telegram.messenger.hd.a0("TooLongError", null, 2131744041, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneDurationTooLong", null, 2131751104, Integer.valueOf(org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).l4)), null).j();
        return false;
    }

    public final boolean S(File file) {
        File file2;
        vj vjVar;
        this.O = false;
        boolean canRead = file.canRead();
        rj rjVar = this.r;
        String str = null;
        vj vjVar2 = this.w;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                X(org.telegram.messenger.hd.M0(2131754711, null));
                return false;
            }
            this.P = file;
            vjVar2.e.clear();
            Environment.getExternalStorageState();
            org.telegram.messenger.g0.y(rjVar);
            this.V = true;
            vjVar2.f();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                X(org.telegram.messenger.hd.M0(2131743879, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = vjVar2.e;
            ArrayList arrayList2 = vjVar2.f;
            ArrayList arrayList3 = vjVar2.e;
            arrayList.clear();
            File j3 = org.telegram.messenger.w7.j(6);
            int i7 = 0;
            while (i7 < listFiles.length) {
                File file3 = listFiles[i7];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j3)) {
                    vjVar = vjVar2;
                } else {
                    wj wjVar = new wj();
                    wjVar.b = file3.getName();
                    wjVar.f = file3;
                    if (file3.isDirectory()) {
                        wjVar.a = R.drawable.files_folder;
                        wjVar.c = org.telegram.messenger.hd.M0(2131750685, str);
                        vjVar = vjVar2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        wjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        vjVar = vjVar2;
                        wjVar.c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            wjVar.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(wjVar);
                }
                i7++;
                vjVar2 = vjVar;
                str = null;
            }
            vj vjVar3 = vjVar2;
            wj wjVar2 = new wj();
            wjVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((uj) i5.c.h(1, arrayList2)).a;
                if (file4 == null) {
                    file2 = null;
                    wjVar2.c = org.telegram.messenger.hd.M0(2131750685, null);
                } else {
                    file2 = null;
                    wjVar2.c = file4.toString();
                }
            } else {
                file2 = null;
                wjVar2.c = org.telegram.messenger.hd.M0(2131750685, null);
            }
            wjVar2.a = R.drawable.files_folder;
            wjVar2.f = file2;
            arrayList3.add(0, wjVar2);
            if (this.P != null) {
                Collections.sort(vjVar3.e, new pj(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(rjVar);
            this.V = true;
            int topForScroll = getTopForScroll();
            vjVar3.f();
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
        ki kiVar;
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
            wj wjVar = new wj();
            if (Environment.isExternalStorageRemovable()) {
                wjVar.b = org.telegram.messenger.hd.M0(2131745840, null);
                wjVar.a = R.drawable.files_internal;
                wjVar.c = org.telegram.messenger.hd.M0(2131750856, null);
            } else {
                wjVar.b = org.telegram.messenger.hd.M0(2131749188, null);
                wjVar.a = R.drawable.files_storage;
                wjVar.c = org.telegram.messenger.hd.M0(2131749190, null);
            }
            wjVar.f = Environment.getExternalStorageDirectory();
            this.w.e.add(wjVar);
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
                                wj wjVar2 = new wj();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    wjVar2.b = org.telegram.messenger.hd.M0(2131745840, null);
                                } else {
                                    wjVar2.b = org.telegram.messenger.hd.M0(2131750855, null);
                                }
                                wjVar2.c = org.telegram.messenger.hd.M0(2131750856, null);
                                wjVar2.a = R.drawable.files_internal;
                                wjVar2.f = new File(nextToken);
                                this.w.e.add(wjVar2);
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
                wj wjVar3 = new wj();
                wjVar3.b = "Telegram";
                wjVar3.c = org.telegram.messenger.hd.M0(2131754241, null);
                wjVar3.a = R.drawable.files_folder;
                wjVar3.f = file;
                this.w.e.add(wjVar3);
            }
        } catch (Exception e15) {
            org.telegram.messenger.a8.g(e15, true);
        }
        if (!this.e0 && ((kiVar = this.b) == null || !kiVar.C1)) {
            wj wjVar4 = new wj();
            wjVar4.b = org.telegram.messenger.hd.M0(2131750484, null);
            wjVar4.c = org.telegram.messenger.hd.M0(2131750477, null);
            wjVar4.a = R.drawable.files_gallery;
            wjVar4.f = null;
            this.w.e.add(wjVar4);
        }
        if (this.b0) {
            wj wjVar5 = new wj();
            wjVar5.b = org.telegram.messenger.hd.M0(2131753952, null);
            wjVar5.c = org.telegram.messenger.hd.M0(2131748315, null);
            wjVar5.a = R.drawable.files_music;
            wjVar5.f = null;
            this.w.e.add(wjVar5);
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
        boolean z11 = obj instanceof wj;
        ArrayList arrayList = this.T;
        ki kiVar = this.b;
        HashMap hashMap = this.S;
        HashMap hashMap2 = this.U;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof org.telegram.messenger.gj) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                org.telegram.ui.sz szVar = new org.telegram.ui.sz(gjVar.e1(), org.telegram.messenger.gj.B0(gjVar.k));
                if (hashMap2.containsKey(szVar)) {
                    hashMap2.remove(szVar);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(szVar, gjVar);
                    z12 = true;
                }
                z10 = z12;
                if (kiVar.C1) {
                }
            }
            return false;
        }
        wj wjVar = (wj) obj;
        File file = wjVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = wjVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!wjVar.f.canRead()) {
                    X(org.telegram.messenger.hd.M0(2131754711, null));
                    return false;
                }
                if (this.a0 && wjVar.e == null) {
                    X(org.telegram.messenger.hd.a0("PassportUploadNotImage", null, 2131747450, new Object[0]));
                    return false;
                }
                if ((wjVar.f.length() > 2097152000 && !org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q()) || wjVar.f.length() > 4194304000L) {
                    ug.j0 j0Var = new ug.j0(6, org.telegram.messenger.m10.t0, kiVar.c.getContext(), kiVar.a2, null);
                    j0Var.J2 = true;
                    j0Var.F1();
                    j0Var.show();
                    return false;
                }
                if (this.W >= 0) {
                    int size = hashMap.size();
                    int i7 = this.W;
                    if (size >= i7) {
                        X(org.telegram.messenger.hd.a0("PassportUploadMaxReached", null, 2131747451, org.telegram.messenger.hd.G(i7, "Files", new Object[0])));
                        return false;
                    }
                }
                if ((!this.e0 || R(wjVar.f)) && wjVar.f.length() != 0) {
                    boolean z13 = kiVar.R2;
                    hashMap.put(absolutePath, wjVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.V = false;
            if (kiVar.C1) {
                if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).b(z10, true);
                }
                kiVar.K1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.R != null && !this.L) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((org.telegram.messenger.gj) hashMap2.get((org.telegram.ui.sz) it.next()));
                }
                this.R.n(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void V() {
        View m10;
        vj vjVar = this.x;
        vjVar.f.clear();
        ArrayList arrayList = vjVar.f;
        vj vjVar2 = this.w;
        arrayList.addAll(vjVar2.f);
        ArrayList arrayList2 = vjVar.e;
        arrayList2.clear();
        arrayList2.addAll(vjVar2.e);
        ArrayList arrayList3 = (ArrayList) vjVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) vjVar2.h);
        vjVar.f();
        rj rjVar = this.s;
        rjVar.setVisibility(0);
        rj rjVar2 = this.r;
        rjVar.setPadding(rjVar2.getPaddingLeft(), rjVar2.getPaddingTop(), rjVar2.getPaddingRight(), rjVar2.getPaddingBottom());
        kg.c0 c0Var = this.F;
        int L0 = c0Var.L0();
        if (L0 < 0 || (m10 = c0Var.m(L0)) == null) {
            return;
        }
        this.y.h1(L0, m10.getTop() - rjVar.getPaddingTop());
    }

    public final void W(int i7) {
        rj rjVar;
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
            rjVar = this.r;
            if (i11 >= childCount) {
                i11 = 0;
                break;
            } else if (getChildAt(i11) == rjVar) {
                break;
            } else {
                i11++;
            }
        }
        rj rjVar2 = this.s;
        if (i7 == 1) {
            L = org.telegram.messenger.g0.L(150.0f);
            rjVar2.setAlpha(1.0f);
            rjVar2.setScaleX(1.0f);
            rjVar2.setScaleY(1.0f);
            rjVar2.setTranslationX(0.0f);
            removeView(rjVar2);
            addView(rjVar2, i11);
            rjVar2.setVisibility(0);
            rjVar.setTranslationX(L);
            rjVar.setAlpha(0.0f);
            this.g0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.g0.L(150.0f);
            rjVar.setAlpha(0.0f);
            rjVar.setScaleX(0.95f);
            rjVar.setScaleY(0.95f);
            rjVar2.setScaleX(1.0f);
            rjVar2.setScaleY(1.0f);
            rjVar2.setTranslationX(0.0f);
            rjVar2.setAlpha(1.0f);
            removeView(rjVar2);
            addView(rjVar2, i11 + 1);
            rjVar2.setVisibility(0);
            this.g0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.g0.addUpdateListener(new oj(this, i7, L, i10));
        this.g0.addListener(new x5(this, 11));
        if (i7 == 1) {
            this.g0.setDuration(220L);
        } else {
            this.g0.setDuration(200L);
        }
        this.g0.setInterpolator(er.f);
        this.g0.start();
    }

    public final void X(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
        String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = str;
        i5.c.C(null, 2131747831, alertDialog$Builder, null);
    }

    public final void Y() {
        v4.h0 adapter = this.r.getAdapter();
        boolean z10 = true;
        ck ckVar = this.E;
        if (adapter != ckVar ? this.w.b() != 1 : !ckVar.s.isEmpty() || !ckVar.Q.isEmpty()) {
            z10 = false;
        }
        this.M.setVisibility(z10 ? 0 : 8);
        Z();
    }

    public final void Z() {
        View childAt;
        fi.x4 x4Var = this.M;
        if (x4Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = x4Var.getTranslationY();
            this.N = (childAt.getTop() + (x4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            x4Var.setTranslationY(translationY);
        }
    }

    public final void a0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var == null || q0Var.w()) {
            return;
        }
        q0Var.setVisibility((this.O || this.w.f.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.ci
    public final void d() {
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var != null) {
            try {
                if (q0Var.getSearchField() != null) {
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.j5, this.a));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(62.0f);
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        rj rjVar = this.r;
        if (rjVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i7 = 0;
        View childAt = rjVar.getChildAt(0);
        cj0 cj0Var = (cj0) rjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
        if (y10 > 0 && cj0Var != null && cj0Var.b() == 0) {
            i7 = y10;
        }
        if (y10 < 0 || cj0Var == null || cj0Var.b() != 0) {
            y10 = i7;
        }
        return org.telegram.messenger.g0.L(13.0f) + y10;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override // org.telegram.ui.Components.ci
    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.s6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.j5));
        int i7 = org.telegram.ui.ActionBar.j6.A5;
        rj rjVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 32, new Class[]{org.telegram.ui.Cells.x6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 48, new Class[]{org.telegram.ui.Cells.x6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.qj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 40, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.sj));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ci
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean k() {
        vj vjVar = this.w;
        if (vjVar.f.size() <= 0) {
            return false;
        }
        V();
        uj ujVar = (uj) r.b.g(1, vjVar.f);
        this.b.V2.setTitle(ujVar.b);
        int topForScroll = getTopForScroll();
        File file = ujVar.a;
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

    @Override // org.telegram.ui.Components.ci
    public final void p() {
        try {
            if (this.Q) {
                org.telegram.messenger.t0.b.unregisterReceiver(this.f0);
                this.Q = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.b.V2.n(true);
        org.telegram.ui.ActionBar.y s5 = this.b.V2.s();
        s5.removeView(this.H);
        s5.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.a0 = z10;
    }

    public void setDelegate(tj tjVar) {
        this.R = tjVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.W = i7;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.ci
    public final void u() {
        this.H.setVisibility(8);
        this.G.setVisibility(8);
    }

    @Override // org.telegram.ui.Components.ci
    public final void w(int i7) {
        if (i7 == 6) {
            org.telegram.messenger.gz.M0 = !org.telegram.messenger.gz.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.gz.M0);
            edit.apply();
            this.d0 = org.telegram.messenger.gz.M0;
            vj vjVar = this.w;
            Collections.sort((ArrayList) vjVar.h, new pj(this, 1));
            if (this.P != null) {
                Collections.sort(vjVar.e, new pj(this, 0));
            }
            vjVar.f();
            this.H.setIcon(this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
