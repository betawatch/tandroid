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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class vj extends vh {
    public static final /* synthetic */ int g0 = 0;
    public final uj D;
    public final kg.c0 E;
    public final org.telegram.ui.ActionBar.r0 F;
    public final org.telegram.ui.ActionBar.r0 G;
    public final jg.q0 H;
    public AnimatorSet I;
    public final lz J;
    public boolean K;
    public final di.f5 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public mj Q;
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
    public final kj r;
    public final kj s;
    public final oj w;
    public final oj x;
    public final ly y;

    public vj(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, di diVar) {
        super(context, f6Var, diVar);
        Cursor cursor;
        final int i10 = 0;
        this.P = false;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.V = -1;
        this.e0 = new androidx.mediarouter.app.f(this, 8);
        oj ojVar = new oj(this, context);
        this.w = ojVar;
        final int i11 = 1;
        this.a0 = i7 == 1;
        int i12 = 2;
        boolean z9 = i7 == 2;
        this.d0 = z9;
        this.c0 = org.telegram.messenger.iz.M0;
        try {
            if (z9) {
                try {
                    Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(i12);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).k4 * 1000) {
                                try {
                                    if (j10 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).l4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        pj pjVar = new pj();
                                        pjVar.b = file.getName();
                                        pjVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        pjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        pjVar.c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            pjVar.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.w.h).add(pjVar);
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
                P(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) ojVar.h, new ij(this, 1));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
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
                org.telegram.messenger.t0.b.registerReceiver(this.e0, intentFilter, 4);
            } else {
                org.telegram.messenger.t0.b.registerReceiver(this.e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y q10 = this.b.R2.q();
        org.telegram.ui.ActionBar.r0 a10 = q10.a(0, R.drawable.outline_header_search);
        a10.N();
        a10.H = new kg.v1(this, 6);
        this.F = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745837, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i13 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(searchField, i13, f6Var);
        org.telegram.ui.ActionBar.r6.w(searchField, i13, f6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, f6Var);
        org.telegram.ui.ActionBar.r0 a11 = q10.a(6, this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.G = a11;
        a11.setContentDescription(org.telegram.messenger.hd.M0(2131754891, null));
        lz lzVar = new lz(context, f6Var);
        this.J = lzVar;
        addView(lzVar);
        di.f5 f5Var = new di.f5(this, context, lzVar, f6Var);
        this.L = f5Var;
        addView(f5Var, c8.ha.c(-1.0f, -1));
        f5Var.setVisibility(8);
        f5Var.setOnTouchListener(new ei.b(14));
        kj kjVar = new kj(this, context, f6Var, 0);
        this.s = kjVar;
        kjVar.setSectionsType(2);
        kjVar.setVerticalScrollBarEnabled(false);
        ly lyVar = new ly(org.telegram.messenger.g0.L(56.0f), 0, kjVar);
        this.y = lyVar;
        kjVar.setLayoutManager(lyVar);
        kjVar.setClipToPadding(false);
        oj ojVar2 = new oj(this, context);
        this.x = ojVar2;
        kjVar.setAdapter(ojVar2);
        addView(kjVar, c8.ha.c(-1.0f, -1));
        kjVar.setVisibility(8);
        kj kjVar2 = new kj(this, context, f6Var, 1);
        this.r = kjVar2;
        kjVar2.r1();
        setBlur3Capture(kjVar2);
        this.d = kjVar2;
        this.h = true;
        this.f = true;
        kjVar2.setSectionsType(2);
        kjVar2.setVerticalScrollBarEnabled(false);
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, kjVar2, 2);
        this.E = c0Var;
        kjVar2.setLayoutManager(c0Var);
        kjVar2.setClipToPadding(false);
        kjVar2.setAdapter(this.w);
        addView(kjVar2, c8.ha.c(-1.0f, -1));
        this.D = new uj(this, context);
        kjVar2.setOnScrollListener(new ui(this, i11));
        kjVar2.setOnItemClickListener(new bj0(this) { // from class: org.telegram.ui.Components.gj
            public final /* synthetic */ vj b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.bj0
            public final void c(int i14, View view) {
                switch (i10) {
                    case 0:
                        vj.O(this.b, view, i14);
                        break;
                    default:
                        vj vjVar = this.b;
                        jg.q0 q0Var = vjVar.H;
                        q0Var.I0(true);
                        uj ujVar = vjVar.D;
                        ArrayList arrayList = q0Var.e3;
                        jg.o0 o0Var = arrayList.isEmpty() ? jg.q0.j3[i14] : (jg.o0) arrayList.get(i14);
                        di diVar2 = ujVar.X.b;
                        ArrayList arrayList2 = ujVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i15))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        diVar2.R2.setSearchFilter(o0Var);
                        diVar2.R2.setSearchFieldText("");
                        ujVar.a0(null, null, true);
                        break;
                }
            }
        });
        kjVar2.setOnItemLongClickListener(new u(this, 20));
        jg.q0 q0Var = new jg.q0(context, f6Var);
        this.H = q0Var;
        q0Var.setOnItemClickListener(new bj0(this) { // from class: org.telegram.ui.Components.gj
            public final /* synthetic */ vj b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.bj0
            public final void c(int i14, View view) {
                switch (i11) {
                    case 0:
                        vj.O(this.b, view, i14);
                        break;
                    default:
                        vj vjVar = this.b;
                        jg.q0 q0Var2 = vjVar.H;
                        q0Var2.I0(true);
                        uj ujVar = vjVar.D;
                        ArrayList arrayList = q0Var2.e3;
                        jg.o0 o0Var = arrayList.isEmpty() ? jg.q0.j3[i14] : (jg.o0) arrayList.get(i14);
                        di diVar2 = ujVar.X.b;
                        ArrayList arrayList2 = ujVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i15))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        diVar2.R2.setSearchFilter(o0Var);
                        diVar2.R2.setSearchFieldText("");
                        ujVar.a0(null, null, true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, q0Var, f6Var);
        addView(q0Var, c8.ha.e(-1, 44, 48));
        q0Var.setTranslationY(-org.telegram.messenger.g0.L(44.0f));
        q0Var.setVisibility(4);
        S();
        a0();
        X();
    }

    public static void O(vj vjVar, View view, int i7) {
        Object O;
        int i10;
        di diVar = vjVar.b;
        kj kjVar = vjVar.r;
        v4.g0 adapter = kjVar.getAdapter();
        oj ojVar = vjVar.w;
        if (adapter == ojVar) {
            O = ojVar.E(i7);
        } else {
            uj ujVar = vjVar.D;
            O = ujVar.O(ujVar.S(i7), ujVar.Q(i7));
        }
        if (!(O instanceof pj)) {
            vjVar.T(view, O);
            return;
        }
        pj pjVar = (pj) O;
        File file = pjVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!org.telegram.messenger.r2.b && (((i10 = pjVar.a) == R.drawable.files_storage || i10 == R.drawable.files_internal) && !isExternalStorageManager)) {
            qh qhVar = diVar.l3;
            int i11 = diVar.D3;
            if (diVar.B3 == null || diVar.B1 - diVar.C1 >= 0) {
                vjVar.Q.A();
                return;
            } else if (org.telegram.messenger.qp.s1(i11).D3() || org.telegram.messenger.qp.s1(i11).U4 <= diVar.C1) {
                new hc(qhVar, diVar.I0).t(org.telegram.messenger.hd.M0(2131744042, null), diVar.I0).j();
                return;
            } else {
                new hc(qhVar, diVar.I0).f(org.telegram.messenger.qp.s1(i11).U4, new qg(diVar, 3)).j();
                return;
            }
        }
        if (file != null) {
            if (!file.isDirectory()) {
                vjVar.T(view, pjVar);
                return;
            }
            nj njVar = new nj();
            View childAt = kjVar.getChildAt(0);
            v4.d1 G = kjVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                njVar.a = vjVar.O;
                njVar.b = diVar.R2.getTitle();
                vjVar.U();
                ojVar.f.add(njVar);
                if (!vjVar.R(file)) {
                    ojVar.f.remove(njVar);
                    return;
                } else {
                    vjVar.V(1);
                    diVar.R2.setTitle(pjVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = pjVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
            org.telegram.ui.an anVar = f2Var instanceof org.telegram.ui.an ? (org.telegram.ui.an) f2Var : null;
            org.telegram.ui.xm0 xm0Var = new org.telegram.ui.xm0(0, MediaController.Z1, hashMap, arrayList, 0, anVar != null, anVar, false);
            xm0Var.l0 = true;
            xm0Var.s0 = new h6.m(vjVar, hashMap, arrayList, false, 25);
            xm0Var.k0(vjVar.V, false);
            org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
            if (f2Var2 != null) {
                f2Var2.presentFragment(xm0Var);
            } else {
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(xm0Var);
                }
            }
            diVar.a(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            mj mjVar = vjVar.Q;
            if (mjVar != null) {
                mjVar.S();
                return;
            }
            return;
        }
        int topForScroll = vjVar.getTopForScroll();
        vjVar.U();
        nj njVar2 = (nj) org.telegram.ui.Cells.f1.k(1, ojVar.f);
        diVar.R2.setTitle(njVar2.b);
        File file2 = njVar2.a;
        if (file2 != null) {
            vjVar.R(file2);
        } else {
            vjVar.S();
        }
        vjVar.a0();
        vjVar.E.h1(0, topForScroll);
        vjVar.V(2);
    }

    private int getTopForScroll() {
        kj kjVar = this.r;
        View childAt = kjVar.getChildAt(0);
        v4.d1 G = kjVar.G(childAt);
        int i7 = -kjVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i7 : childAt.getTop() + i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        int i11;
        di diVar = this.b;
        if (diVar.R2.n0 || diVar.l3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            L = org.telegram.messenger.g0.L(56.0f);
            diVar.q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    L = i11 - org.telegram.messenger.g0.L(1.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    diVar.q0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            L = i11 - org.telegram.messenger.g0.L(1.0f);
            if (L < 0) {
            }
            diVar.q0 = true;
        }
        this.r.q1(0, L + org.telegram.messenger.g0.m, 0, this.e);
        ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.vh
    public final void C() {
        oj ojVar = this.w;
        if (ojVar != null) {
            ojVar.f();
        }
        uj ujVar = this.D;
        if (ujVar != null) {
            ujVar.f();
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void H(vh vhVar) {
        this.R.clear();
        this.T.clear();
        this.D.R.clear();
        this.S.clear();
        this.w.f.clear();
        S();
        a0();
        X();
        this.b.R2.setTitle(org.telegram.messenger.hd.M0(2131745658, null));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.vh
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean L(final boolean z9, final int i7, int i10, final long j3, final boolean z10) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((org.telegram.messenger.ij) hashMap.get((org.telegram.ui.rz) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        di diVar = this.b;
        CharSequence[] charSequenceArr = {diVar.a1().getText()};
        final ArrayList W = org.telegram.messenger.ui.b0(diVar.D3).W(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return v4.Y(diVar.D3, diVar.b1(), diVar.X0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.jj
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                vj vjVar = vj.this;
                vjVar.K = true;
                vjVar.Q.n(arrayList2, charSequence, W, arrayList, z9, i7, j3, z10, ((Long) obj).longValue());
                vjVar.b.a(true);
            }
        }, 0L);
    }

    public final void P(File file) {
        File[] listFiles = file.listFiles();
        File j3 = org.telegram.messenger.w7.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    P(file2);
                } else if (!file2.equals(j3)) {
                    pj pjVar = new pj();
                    pjVar.b = file2.getName();
                    pjVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    pjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    pjVar.c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        pjVar.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(pjVar);
                }
            }
        }
    }

    public final boolean Q(File file) {
        int i7;
        String D = org.telegram.messenger.w7.D(file);
        String mimeTypeFromExtension = D != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(D) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !yf.c.i.contains(mimeTypeFromExtension)) {
            new hc(this.b.c, null).u(org.telegram.messenger.hd.a0("InvalidFormatError", null, 2131749180, new Object[0]), org.telegram.messenger.hd.M0(2131751104, null), null).j();
            return false;
        }
        if (file.length() > org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).l4) {
            new hc(this.b.c, null).u(org.telegram.messenger.hd.a0("TooLargeError", null, 2131744043, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).l4 / 1024)), null).j();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.b, Uri.fromFile(file));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i7 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).k4 * 1000) {
            return true;
        }
        new hc(this.b.c, null).u(org.telegram.messenger.hd.a0("TooLongError", null, 2131744042, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).k4)), null).j();
        return false;
    }

    public final boolean R(File file) {
        File file2;
        oj ojVar;
        this.N = false;
        boolean canRead = file.canRead();
        kj kjVar = this.r;
        String str = null;
        oj ojVar2 = this.w;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                W(org.telegram.messenger.hd.M0(2131754711, null));
                return false;
            }
            this.O = file;
            ojVar2.e.clear();
            Environment.getExternalStorageState();
            org.telegram.messenger.g0.y(kjVar);
            this.U = true;
            ojVar2.f();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                W(org.telegram.messenger.hd.M0(2131743880, null));
                return false;
            }
            this.O = file;
            ArrayList arrayList = ojVar2.e;
            ArrayList arrayList2 = ojVar2.f;
            ArrayList arrayList3 = ojVar2.e;
            arrayList.clear();
            File j3 = org.telegram.messenger.w7.j(6);
            int i7 = 0;
            while (i7 < listFiles.length) {
                File file3 = listFiles[i7];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j3)) {
                    ojVar = ojVar2;
                } else {
                    pj pjVar = new pj();
                    pjVar.b = file3.getName();
                    pjVar.f = file3;
                    if (file3.isDirectory()) {
                        pjVar.a = R.drawable.files_folder;
                        pjVar.c = org.telegram.messenger.hd.M0(2131750686, str);
                        ojVar = ojVar2;
                    } else {
                        this.N = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        pjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        ojVar = ojVar2;
                        pjVar.c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            pjVar.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(pjVar);
                }
                i7++;
                ojVar2 = ojVar;
                str = null;
            }
            oj ojVar3 = ojVar2;
            pj pjVar2 = new pj();
            pjVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((nj) jg.g.i(1, arrayList2)).a;
                if (file4 == null) {
                    file2 = null;
                    pjVar2.c = org.telegram.messenger.hd.M0(2131750686, null);
                } else {
                    file2 = null;
                    pjVar2.c = file4.toString();
                }
            } else {
                file2 = null;
                pjVar2.c = org.telegram.messenger.hd.M0(2131750686, null);
            }
            pjVar2.a = R.drawable.files_folder;
            pjVar2.f = file2;
            arrayList3.add(0, pjVar2);
            if (this.O != null) {
                Collections.sort(ojVar3.e, new ij(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(kjVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            ojVar3.f();
            this.E.h1(0, topForScroll);
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
        di diVar;
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
            pj pjVar = new pj();
            if (Environment.isExternalStorageRemovable()) {
                pjVar.b = org.telegram.messenger.hd.M0(2131745841, null);
                pjVar.a = R.drawable.files_internal;
                pjVar.c = org.telegram.messenger.hd.M0(2131750857, null);
            } else {
                pjVar.b = org.telegram.messenger.hd.M0(2131749187, null);
                pjVar.a = R.drawable.files_storage;
                pjVar.c = org.telegram.messenger.hd.M0(2131749189, null);
            }
            pjVar.f = Environment.getExternalStorageDirectory();
            this.w.e.add(pjVar);
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
                                pj pjVar2 = new pj();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    pjVar2.b = org.telegram.messenger.hd.M0(2131745841, null);
                                } else {
                                    pjVar2.b = org.telegram.messenger.hd.M0(2131750856, null);
                                }
                                pjVar2.c = org.telegram.messenger.hd.M0(2131750857, null);
                                pjVar2.a = R.drawable.files_internal;
                                pjVar2.f = new File(nextToken);
                                this.w.e.add(pjVar2);
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
                pj pjVar3 = new pj();
                pjVar3.b = "Telegram";
                pjVar3.c = org.telegram.messenger.hd.M0(2131754241, null);
                pjVar3.a = R.drawable.files_folder;
                pjVar3.f = file;
                this.w.e.add(pjVar3);
            }
        } catch (Exception e15) {
            org.telegram.messenger.a8.g(e15, true);
        }
        if (!this.d0 && ((diVar = this.b) == null || !diVar.y1)) {
            pj pjVar4 = new pj();
            pjVar4.b = org.telegram.messenger.hd.M0(2131750483, null);
            pjVar4.c = org.telegram.messenger.hd.M0(2131750476, null);
            pjVar4.a = R.drawable.files_gallery;
            pjVar4.f = null;
            this.w.e.add(pjVar4);
        }
        if (this.a0) {
            pj pjVar5 = new pj();
            pjVar5.b = org.telegram.messenger.hd.M0(2131753952, null);
            pjVar5.c = org.telegram.messenger.hd.M0(2131748314, null);
            pjVar5.a = R.drawable.files_music;
            pjVar5.f = null;
            this.w.e.add(pjVar5);
        }
        if (!((ArrayList) this.w.h).isEmpty()) {
            this.N = true;
        }
        org.telegram.messenger.g0.y(this.r);
        this.U = true;
        this.w.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T(View view, Object obj) {
        boolean z9;
        boolean z10 = obj instanceof pj;
        ArrayList arrayList = this.S;
        di diVar = this.b;
        HashMap hashMap = this.R;
        HashMap hashMap2 = this.T;
        boolean z11 = false;
        if (!z10) {
            if (obj instanceof org.telegram.messenger.ij) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                org.telegram.ui.rz rzVar = new org.telegram.ui.rz(ijVar.f1(), org.telegram.messenger.ij.B0(ijVar.k));
                if (hashMap2.containsKey(rzVar)) {
                    hashMap2.remove(rzVar);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(rzVar, ijVar);
                    z11 = true;
                }
                z9 = z11;
                if (diVar.y1) {
                }
            }
            return false;
        }
        pj pjVar = (pj) obj;
        File file = pjVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = pjVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z9 = false;
            } else {
                if (!pjVar.f.canRead()) {
                    W(org.telegram.messenger.hd.M0(2131754711, null));
                    return false;
                }
                if (this.W && pjVar.e == null) {
                    W(org.telegram.messenger.hd.a0("PassportUploadNotImage", null, 2131747449, new Object[0]));
                    return false;
                }
                if ((pjVar.f.length() > 2097152000 && !org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()) || pjVar.f.length() > 4194304000L) {
                    ug.i0 i0Var = new ug.i0(6, org.telegram.messenger.p10.s0, diVar.c.getContext(), diVar.W1, null);
                    i0Var.F2 = true;
                    i0Var.F1();
                    i0Var.show();
                    return false;
                }
                if (this.V >= 0) {
                    int size = hashMap.size();
                    int i7 = this.V;
                    if (size >= i7) {
                        W(org.telegram.messenger.hd.a0("PassportUploadMaxReached", null, 2131747450, org.telegram.messenger.hd.G(i7, "Files", new Object[0])));
                        return false;
                    }
                }
                if ((!this.d0 || Q(pjVar.f)) && pjVar.f.length() != 0) {
                    boolean z12 = diVar.N2;
                    hashMap.put(absolutePath, pjVar);
                    arrayList.add(absolutePath);
                    z9 = true;
                }
            }
            this.U = false;
            if (diVar.y1) {
                if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).b(z9, true);
                }
                diVar.K1(z9 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.Q != null && !this.K) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((org.telegram.messenger.ij) hashMap2.get((org.telegram.ui.rz) it.next()));
                }
                this.Q.n(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void U() {
        View m10;
        oj ojVar = this.x;
        ojVar.f.clear();
        ArrayList arrayList = ojVar.f;
        oj ojVar2 = this.w;
        arrayList.addAll(ojVar2.f);
        ArrayList arrayList2 = ojVar.e;
        arrayList2.clear();
        arrayList2.addAll(ojVar2.e);
        ArrayList arrayList3 = (ArrayList) ojVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) ojVar2.h);
        ojVar.f();
        kj kjVar = this.s;
        kjVar.setVisibility(0);
        kj kjVar2 = this.r;
        kjVar.setPadding(kjVar2.getPaddingLeft(), kjVar2.getPaddingTop(), kjVar2.getPaddingRight(), kjVar2.getPaddingBottom());
        kg.c0 c0Var = this.E;
        int L0 = c0Var.L0();
        if (L0 < 0 || (m10 = c0Var.m(L0)) == null) {
            return;
        }
        this.y.h1(L0, m10.getTop() - kjVar.getPaddingTop());
    }

    public final void V(int i7) {
        kj kjVar;
        float L;
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = i7;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            kjVar = this.r;
            if (i11 >= childCount) {
                i11 = 0;
                break;
            } else if (getChildAt(i11) == kjVar) {
                break;
            } else {
                i11++;
            }
        }
        kj kjVar2 = this.s;
        if (i7 == 1) {
            L = org.telegram.messenger.g0.L(150.0f);
            kjVar2.setAlpha(1.0f);
            kjVar2.setScaleX(1.0f);
            kjVar2.setScaleY(1.0f);
            kjVar2.setTranslationX(0.0f);
            removeView(kjVar2);
            addView(kjVar2, i11);
            kjVar2.setVisibility(0);
            kjVar.setTranslationX(L);
            kjVar.setAlpha(0.0f);
            this.f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.g0.L(150.0f);
            kjVar.setAlpha(0.0f);
            kjVar.setScaleX(0.95f);
            kjVar.setScaleY(0.95f);
            kjVar2.setScaleX(1.0f);
            kjVar2.setScaleY(1.0f);
            kjVar2.setTranslationX(0.0f);
            kjVar2.setAlpha(1.0f);
            removeView(kjVar2);
            addView(kjVar2, i11 + 1);
            kjVar2.setVisibility(0);
            this.f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f0.addUpdateListener(new hj(this, i7, L, i10));
        this.f0.addListener(new z5(this, 11));
        if (i7 == 1) {
            this.f0.setDuration(220L);
        } else {
            this.f0.setDuration(200L);
        }
        this.f0.setInterpolator(xq.f);
        this.f0.start();
    }

    public final void W(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
        String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = str;
        jg.g.C(null, 2131747830, alertDialog$Builder, null);
    }

    public final void X() {
        v4.g0 adapter = this.r.getAdapter();
        boolean z9 = true;
        uj ujVar = this.D;
        if (adapter != ujVar ? this.w.b() != 1 : !ujVar.s.isEmpty() || !ujVar.P.isEmpty()) {
            z9 = false;
        }
        this.L.setVisibility(z9 ? 0 : 8);
        Z();
    }

    public final void Z() {
        View childAt;
        di.f5 f5Var = this.L;
        if (f5Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = f5Var.getTranslationY();
            this.M = (childAt.getTop() + (f5Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            f5Var.setTranslationY(translationY);
        }
    }

    public final void a0() {
        org.telegram.ui.ActionBar.r0 r0Var = this.F;
        if (r0Var == null || r0Var.v()) {
            return;
        }
        r0Var.setVisibility((this.N || this.w.f.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.vh
    public final void d() {
        org.telegram.ui.ActionBar.r0 r0Var = this.F;
        if (r0Var != null) {
            try {
                if (r0Var.getSearchField() != null) {
                    r0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.a));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.vh
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(62.0f);
    }

    @Override // org.telegram.ui.Components.vh
    public int getCurrentItemTop() {
        kj kjVar = this.r;
        if (kjVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i7 = 0;
        View childAt = kjVar.getChildAt(0);
        xi0 xi0Var = (xi0) kjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
        if (y10 > 0 && xi0Var != null && xi0Var.b() == 0) {
            i7 = y10;
        }
        if (y10 < 0 || xi0Var == null || xi0Var.b() != 0) {
            y10 = i7;
        }
        return org.telegram.messenger.g0.L(13.0f) + y10;
    }

    @Override // org.telegram.ui.Components.vh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.vh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.vh
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override // org.telegram.ui.Components.vh
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        int i7 = org.telegram.ui.ActionBar.k6.A5;
        kj kjVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 32, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 48, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 40, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.oj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.pj));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.vh
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean k() {
        oj ojVar = this.w;
        if (ojVar.f.size() <= 0) {
            return false;
        }
        U();
        nj njVar = (nj) org.telegram.ui.Cells.f1.k(1, ojVar.f);
        this.b.R2.setTitle(njVar.b);
        int topForScroll = getTopForScroll();
        File file = njVar.a;
        if (file != null) {
            R(file);
        } else {
            S();
        }
        a0();
        this.E.h1(0, topForScroll);
        V(2);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        Z();
    }

    @Override // org.telegram.ui.Components.vh
    public final void p() {
        try {
            if (this.P) {
                org.telegram.messenger.t0.b.unregisterReceiver(this.e0);
                this.P = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.b.R2.l(true);
        org.telegram.ui.ActionBar.y q10 = this.b.R2.q();
        q10.removeView(this.G);
        q10.removeView(this.F);
    }

    public void setCanSelectOnlyImageFiles(boolean z9) {
        this.W = z9;
    }

    public void setDelegate(mj mjVar) {
        this.Q = mjVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.V = i7;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.vh
    public final void u() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    @Override // org.telegram.ui.Components.vh
    public final void w(int i7) {
        if (i7 == 6) {
            org.telegram.messenger.iz.M0 = !org.telegram.messenger.iz.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.iz.M0);
            edit.apply();
            this.c0 = org.telegram.messenger.iz.M0;
            oj ojVar = this.w;
            Collections.sort((ArrayList) ojVar.h, new ij(this, 1));
            if (this.O != null) {
                Collections.sort(ojVar.e, new ij(this, 0));
            }
            ojVar.f();
            this.G.setIcon(this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
