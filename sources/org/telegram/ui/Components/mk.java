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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class mk extends mi {
    public static final /* synthetic */ int h0 = 0;
    public final lk E;
    public final kg.d0 F;
    public final org.telegram.ui.ActionBar.q0 G;
    public final org.telegram.ui.ActionBar.q0 H;
    public final jg.q0 I;
    public AnimatorSet J;
    public final yz K;
    public boolean L;
    public final fi.w4 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public ck R;
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
    public final ak r;
    public final ak s;
    public final ek w;
    public final ek x;
    public final yy y;

    public mk(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, ui uiVar) {
        super(context, h6Var, uiVar);
        Cursor cursor;
        final int i10 = 0;
        this.Q = false;
        this.S = new HashMap();
        this.T = new ArrayList();
        this.U = new HashMap();
        this.W = -1;
        this.f0 = new androidx.mediarouter.app.f(this, 8);
        ek ekVar = new ek(this, context);
        this.w = ekVar;
        final int i11 = 1;
        this.b0 = i7 == 1;
        int i12 = 2;
        boolean z10 = i7 == 2;
        this.e0 = z10;
        this.d0 = org.telegram.messenger.cz.M0;
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
                            if (j3 <= org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).n4 * 1000) {
                                try {
                                    if (j10 <= org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).o4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        fk fkVar = new fk();
                                        fkVar.b = file.getName();
                                        fkVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        fkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        fkVar.c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            fkVar.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.w.h).add(fkVar);
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
                Collections.sort((ArrayList) ekVar.h, new yj(this, 1));
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
        a10.I = new bi.w1(this, 7);
        this.G = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        a10.setContentDescription(org.telegram.messenger.hd.N0(2131745640, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i14 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(searchField, i14, h6Var);
        org.telegram.ui.ActionBar.t6.v(searchField, i14, h6Var);
        org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Me, h6Var);
        org.telegram.ui.ActionBar.q0 a11 = s5.a(6, this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.H = a11;
        a11.setContentDescription(org.telegram.messenger.hd.N0(2131754891, null));
        yz yzVar = new yz(context, h6Var);
        this.K = yzVar;
        addView(yzVar);
        fi.w4 w4Var = new fi.w4(this, context, yzVar, h6Var);
        this.M = w4Var;
        addView(w4Var, c8.ma.c(-1.0f, -1));
        w4Var.setVisibility(8);
        w4Var.setOnTouchListener(new gi.a(15));
        ak akVar = new ak(this, context, h6Var, 0);
        this.s = akVar;
        akVar.setSectionsType(2);
        akVar.setVerticalScrollBarEnabled(false);
        yy yyVar = new yy(org.telegram.messenger.g0.L(56.0f), 0, akVar);
        this.y = yyVar;
        akVar.setLayoutManager(yyVar);
        akVar.setClipToPadding(false);
        ek ekVar2 = new ek(this, context);
        this.x = ekVar2;
        akVar.setAdapter(ekVar2);
        addView(akVar, c8.ma.c(-1.0f, -1));
        akVar.setVisibility(8);
        ak akVar2 = new ak(this, context, h6Var, 1);
        this.r = akVar2;
        akVar2.r1();
        setBlur3Capture(akVar2);
        this.d = akVar2;
        this.h = true;
        this.f = true;
        akVar2.setSectionsType(2);
        akVar2.setVerticalScrollBarEnabled(false);
        kg.d0 d0Var = new kg.d0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, akVar2, 2);
        this.F = d0Var;
        akVar2.setLayoutManager(d0Var);
        akVar2.setClipToPadding(false);
        akVar2.setAdapter(this.w);
        addView(akVar2, c8.ma.c(-1.0f, -1));
        this.E = new lk(this, context);
        akVar2.setOnScrollListener(new oa(this, i13));
        akVar2.setOnItemClickListener(new qj0(this) { // from class: org.telegram.ui.Components.wj
            public final /* synthetic */ mk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.qj0
            public final void c(int i15, View view) {
                switch (i10) {
                    case 0:
                        mk.P(this.b, view, i15);
                        break;
                    default:
                        mk mkVar = this.b;
                        jg.q0 q0Var = mkVar.I;
                        q0Var.I0(true);
                        lk lkVar = mkVar.E;
                        ArrayList arrayList = q0Var.f3;
                        jg.o0 o0Var = arrayList.isEmpty() ? jg.q0.k3[i15] : (jg.o0) arrayList.get(i15);
                        ui uiVar2 = lkVar.Y.b;
                        ArrayList arrayList2 = lkVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i16))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        uiVar2.V2.setSearchFilter(o0Var);
                        uiVar2.V2.setSearchFieldText("");
                        lkVar.a0(null, null, true);
                        break;
                }
            }
        });
        akVar2.setOnItemLongClickListener(new c0(this, 19));
        jg.q0 q0Var = new jg.q0(context, h6Var);
        this.I = q0Var;
        q0Var.setOnItemClickListener(new qj0(this) { // from class: org.telegram.ui.Components.wj
            public final /* synthetic */ mk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.qj0
            public final void c(int i15, View view) {
                switch (i11) {
                    case 0:
                        mk.P(this.b, view, i15);
                        break;
                    default:
                        mk mkVar = this.b;
                        jg.q0 q0Var2 = mkVar.I;
                        q0Var2.I0(true);
                        lk lkVar = mkVar.E;
                        ArrayList arrayList = q0Var2.f3;
                        jg.o0 o0Var = arrayList.isEmpty() ? jg.q0.k3[i15] : (jg.o0) arrayList.get(i15);
                        ui uiVar2 = lkVar.Y.b;
                        ArrayList arrayList2 = lkVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i16))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        uiVar2.V2.setSearchFilter(o0Var);
                        uiVar2.V2.setSearchFieldText("");
                        lkVar.a0(null, null, true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, q0Var, h6Var);
        addView(q0Var, c8.ma.e(-1, 44, 48));
        q0Var.setTranslationY(-org.telegram.messenger.g0.L(44.0f));
        q0Var.setVisibility(4);
        T();
        a0();
        Y();
    }

    public static void P(mk mkVar, View view, int i7) {
        Object O;
        int i10;
        ui uiVar = mkVar.b;
        ak akVar = mkVar.r;
        v4.i0 adapter = akVar.getAdapter();
        ek ekVar = mkVar.w;
        if (adapter == ekVar) {
            O = ekVar.E(i7);
        } else {
            lk lkVar = mkVar.E;
            O = lkVar.O(lkVar.S(i7), lkVar.Q(i7));
        }
        if (!(O instanceof fk)) {
            mkVar.U(view, O);
            return;
        }
        fk fkVar = (fk) O;
        File file = fkVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!org.telegram.messenger.s2.b && (((i10 = fkVar.a) == R.drawable.files_storage || i10 == R.drawable.files_internal) && !isExternalStorageManager)) {
            hi hiVar = uiVar.p3;
            int i11 = uiVar.H3;
            if (uiVar.F3 == null || uiVar.F1 - uiVar.G1 >= 0) {
                mkVar.R.A();
                return;
            } else if (org.telegram.messenger.np.u1(i11).K3() || org.telegram.messenger.np.u1(i11).X4 <= uiVar.G1) {
                new lc(hiVar, uiVar.J0).t(org.telegram.messenger.hd.N0(2131743798, null), uiVar.J0).j();
                return;
            } else {
                new lc(hiVar, uiVar.J0).f(org.telegram.messenger.np.u1(i11).X4, new gh(uiVar, 3)).j();
                return;
            }
        }
        if (file != null) {
            if (!file.isDirectory()) {
                mkVar.U(view, fkVar);
                return;
            }
            dk dkVar = new dk();
            View childAt = akVar.getChildAt(0);
            v4.f1 G = akVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                dkVar.a = mkVar.P;
                dkVar.b = uiVar.V2.getTitle();
                mkVar.V();
                ekVar.f.add(dkVar);
                if (!mkVar.S(file)) {
                    ekVar.f.remove(dkVar);
                    return;
                } else {
                    mkVar.W(1);
                    uiVar.V2.setTitle(fkVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = fkVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
            org.telegram.ui.bn bnVar = g2Var instanceof org.telegram.ui.bn ? (org.telegram.ui.bn) g2Var : null;
            org.telegram.ui.cn0 cn0Var = new org.telegram.ui.cn0(0, MediaController.a2, hashMap, arrayList, 0, bnVar != null, bnVar, false);
            cn0Var.m0 = true;
            cn0Var.t0 = new h6.m(mkVar, hashMap, arrayList, 26);
            cn0Var.k0(mkVar.W, false);
            org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.a2;
            if (g2Var2 != null) {
                g2Var2.presentFragment(cn0Var);
            } else {
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(cn0Var);
                }
            }
            uiVar.a(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            ck ckVar = mkVar.R;
            if (ckVar != null) {
                ckVar.T();
                return;
            }
            return;
        }
        int topForScroll = mkVar.getTopForScroll();
        mkVar.V();
        dk dkVar2 = (dk) p5.c.g(1, ekVar.f);
        uiVar.V2.setTitle(dkVar2.b);
        File file2 = dkVar2.a;
        if (file2 != null) {
            mkVar.S(file2);
        } else {
            mkVar.T();
        }
        mkVar.a0();
        mkVar.F.h1(0, topForScroll);
        mkVar.W(2);
    }

    private int getTopForScroll() {
        ak akVar = this.r;
        View childAt = akVar.getChildAt(0);
        v4.f1 G = akVar.G(childAt);
        int i7 = -akVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i7 : childAt.getTop() + i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        int i11;
        ui uiVar = this.b;
        if (uiVar.V2.o0 || uiVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            L = org.telegram.messenger.g0.L(56.0f);
            uiVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    L = i11 - org.telegram.messenger.g0.L(1.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    uiVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            L = i11 - org.telegram.messenger.g0.L(1.0f);
            if (L < 0) {
            }
            uiVar.r0 = true;
        }
        this.r.q1(0, L + org.telegram.messenger.g0.m, 0, this.e);
        ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.mi
    public final void C() {
        ek ekVar = this.w;
        if (ekVar != null) {
            ekVar.f();
        }
        lk lkVar = this.E;
        if (lkVar != null) {
            lkVar.f();
        }
    }

    @Override // org.telegram.ui.Components.mi
    public final void I(mi miVar) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.w.f.clear();
        T();
        a0();
        Y();
        this.b.V2.setTitle(org.telegram.messenger.hd.N0(2131745461, null));
        this.H.setVisibility(0);
        this.F.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.mi
    public final void K() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.mi
    public final boolean M(final boolean z10, final int i7, int i10, final long j3, final boolean z11) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((org.telegram.messenger.gj) hashMap.get((org.telegram.ui.vz) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        ui uiVar = this.b;
        CharSequence[] charSequenceArr = {uiVar.b1().getText()};
        final ArrayList Y = org.telegram.messenger.si.d0(uiVar.H3).Y(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return c5.Y(uiVar.H3, uiVar.c1(), uiVar.Y0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.zj
            @Override // org.telegram.messenger.y10
            public final void a(Object obj) {
                mk mkVar = mk.this;
                mkVar.L = true;
                mkVar.R.n(arrayList2, charSequence, Y, arrayList, z10, i7, j3, z11, ((Long) obj).longValue());
                mkVar.b.a(true);
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
                    fk fkVar = new fk();
                    fkVar.b = file2.getName();
                    fkVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    fkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    fkVar.c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        fkVar.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(fkVar);
                }
            }
        }
    }

    public final boolean R(File file) {
        int i7;
        String D = org.telegram.messenger.w7.D(file);
        String mimeTypeFromExtension = D != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(D) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !yf.c.i.contains(mimeTypeFromExtension)) {
            new lc(this.b.c, null).u(org.telegram.messenger.hd.a0("InvalidFormatError", null, 2131748988, new Object[0]), org.telegram.messenger.hd.N0(2131751091, null), null).j();
            return false;
        }
        if (file.length() > org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).o4) {
            new lc(this.b.c, null).u(org.telegram.messenger.hd.a0("TooLargeError", null, 2131743799, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneSizeTooBig", null, 2131751090, Integer.valueOf(org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).o4 / 1024)), null).j();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.b, Uri.fromFile(file));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i7 <= org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).n4 * 1000) {
            return true;
        }
        new lc(this.b.c, null).u(org.telegram.messenger.hd.a0("TooLongError", null, 2131743798, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneDurationTooLong", null, 2131751092, Integer.valueOf(org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).n4)), null).j();
        return false;
    }

    public final boolean S(File file) {
        File file2;
        ek ekVar;
        this.O = false;
        boolean canRead = file.canRead();
        ak akVar = this.r;
        String str = null;
        ek ekVar2 = this.w;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                X(org.telegram.messenger.hd.N0(2131754710, null));
                return false;
            }
            this.P = file;
            ekVar2.e.clear();
            Environment.getExternalStorageState();
            org.telegram.messenger.g0.y(akVar);
            this.V = true;
            ekVar2.f();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                X(org.telegram.messenger.hd.N0(2131743634, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = ekVar2.e;
            ArrayList arrayList2 = ekVar2.f;
            ArrayList arrayList3 = ekVar2.e;
            arrayList.clear();
            File j3 = org.telegram.messenger.w7.j(6);
            int i7 = 0;
            while (i7 < listFiles.length) {
                File file3 = listFiles[i7];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j3)) {
                    ekVar = ekVar2;
                } else {
                    fk fkVar = new fk();
                    fkVar.b = file3.getName();
                    fkVar.f = file3;
                    if (file3.isDirectory()) {
                        fkVar.a = R.drawable.files_folder;
                        fkVar.c = org.telegram.messenger.hd.N0(2131750668, str);
                        ekVar = ekVar2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        fkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        ekVar = ekVar2;
                        fkVar.c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            fkVar.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(fkVar);
                }
                i7++;
                ekVar2 = ekVar;
                str = null;
            }
            ek ekVar3 = ekVar2;
            fk fkVar2 = new fk();
            fkVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((dk) i5.c.h(1, arrayList2)).a;
                if (file4 == null) {
                    file2 = null;
                    fkVar2.c = org.telegram.messenger.hd.N0(2131750668, null);
                } else {
                    file2 = null;
                    fkVar2.c = file4.toString();
                }
            } else {
                file2 = null;
                fkVar2.c = org.telegram.messenger.hd.N0(2131750668, null);
            }
            fkVar2.a = R.drawable.files_folder;
            fkVar2.f = file2;
            arrayList3.add(0, fkVar2);
            if (this.P != null) {
                Collections.sort(ekVar3.e, new yj(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(akVar);
            this.V = true;
            int topForScroll = getTopForScroll();
            ekVar3.f();
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
        ui uiVar;
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
            fk fkVar = new fk();
            if (Environment.isExternalStorageRemovable()) {
                fkVar.b = org.telegram.messenger.hd.N0(2131745644, null);
                fkVar.a = R.drawable.files_internal;
                fkVar.c = org.telegram.messenger.hd.N0(2131750844, null);
            } else {
                fkVar.b = org.telegram.messenger.hd.N0(2131748995, null);
                fkVar.a = R.drawable.files_storage;
                fkVar.c = org.telegram.messenger.hd.N0(2131748997, null);
            }
            fkVar.f = Environment.getExternalStorageDirectory();
            this.w.e.add(fkVar);
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
                                fk fkVar2 = new fk();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    fkVar2.b = org.telegram.messenger.hd.N0(2131745644, null);
                                } else {
                                    fkVar2.b = org.telegram.messenger.hd.N0(2131750843, null);
                                }
                                fkVar2.c = org.telegram.messenger.hd.N0(2131750844, null);
                                fkVar2.a = R.drawable.files_internal;
                                fkVar2.f = new File(nextToken);
                                this.w.e.add(fkVar2);
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
                fk fkVar3 = new fk();
                fkVar3.b = "Telegram";
                fkVar3.c = org.telegram.messenger.hd.N0(2131754238, null);
                fkVar3.a = R.drawable.files_folder;
                fkVar3.f = file;
                this.w.e.add(fkVar3);
            }
        } catch (Exception e15) {
            org.telegram.messenger.a8.g(e15, true);
        }
        if (!this.e0 && ((uiVar = this.b) == null || !uiVar.C1)) {
            fk fkVar4 = new fk();
            fkVar4.b = org.telegram.messenger.hd.N0(2131750467, null);
            fkVar4.c = org.telegram.messenger.hd.N0(2131750460, null);
            fkVar4.a = R.drawable.files_gallery;
            fkVar4.f = null;
            this.w.e.add(fkVar4);
        }
        if (this.b0) {
            fk fkVar5 = new fk();
            fkVar5.b = org.telegram.messenger.hd.N0(2131753949, null);
            fkVar5.c = org.telegram.messenger.hd.N0(2131748122, null);
            fkVar5.a = R.drawable.files_music;
            fkVar5.f = null;
            this.w.e.add(fkVar5);
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
        boolean z11 = obj instanceof fk;
        ArrayList arrayList = this.T;
        ui uiVar = this.b;
        HashMap hashMap = this.S;
        HashMap hashMap2 = this.U;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof org.telegram.messenger.gj) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                org.telegram.ui.vz vzVar = new org.telegram.ui.vz(gjVar.e1(), org.telegram.messenger.gj.B0(gjVar.k));
                if (hashMap2.containsKey(vzVar)) {
                    hashMap2.remove(vzVar);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(vzVar, gjVar);
                    z12 = true;
                }
                z10 = z12;
                if (uiVar.C1) {
                }
            }
            return false;
        }
        fk fkVar = (fk) obj;
        File file = fkVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = fkVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!fkVar.f.canRead()) {
                    X(org.telegram.messenger.hd.N0(2131754710, null));
                    return false;
                }
                if (this.a0 && fkVar.e == null) {
                    X(org.telegram.messenger.hd.a0("PassportUploadNotImage", null, 2131747256, new Object[0]));
                    return false;
                }
                if ((fkVar.f.length() > 2097152000 && !org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).q()) || fkVar.f.length() > 4194304000L) {
                    ug.k0 k0Var = new ug.k0(6, org.telegram.messenger.k10.t0, uiVar.c.getContext(), uiVar.a2, null);
                    k0Var.J2 = true;
                    k0Var.G1();
                    k0Var.show();
                    return false;
                }
                if (this.W >= 0) {
                    int size = hashMap.size();
                    int i7 = this.W;
                    if (size >= i7) {
                        X(org.telegram.messenger.hd.a0("PassportUploadMaxReached", null, 2131747257, org.telegram.messenger.hd.G(i7, "Files", new Object[0])));
                        return false;
                    }
                }
                if ((!this.e0 || R(fkVar.f)) && fkVar.f.length() != 0) {
                    boolean z13 = uiVar.R2;
                    hashMap.put(absolutePath, fkVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.V = false;
            if (uiVar.C1) {
                if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).b(z10, true);
                }
                uiVar.L1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.R != null && !this.L) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((org.telegram.messenger.gj) hashMap2.get((org.telegram.ui.vz) it.next()));
                }
                this.R.n(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void V() {
        View m10;
        ek ekVar = this.x;
        ekVar.f.clear();
        ArrayList arrayList = ekVar.f;
        ek ekVar2 = this.w;
        arrayList.addAll(ekVar2.f);
        ArrayList arrayList2 = ekVar.e;
        arrayList2.clear();
        arrayList2.addAll(ekVar2.e);
        ArrayList arrayList3 = (ArrayList) ekVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) ekVar2.h);
        ekVar.f();
        ak akVar = this.s;
        akVar.setVisibility(0);
        ak akVar2 = this.r;
        akVar.setPadding(akVar2.getPaddingLeft(), akVar2.getPaddingTop(), akVar2.getPaddingRight(), akVar2.getPaddingBottom());
        kg.d0 d0Var = this.F;
        int L0 = d0Var.L0();
        if (L0 < 0 || (m10 = d0Var.m(L0)) == null) {
            return;
        }
        this.y.h1(L0, m10.getTop() - akVar.getPaddingTop());
    }

    public final void W(int i7) {
        ak akVar;
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
            akVar = this.r;
            if (i11 >= childCount) {
                i11 = 0;
                break;
            } else if (getChildAt(i11) == akVar) {
                break;
            } else {
                i11++;
            }
        }
        ak akVar2 = this.s;
        if (i7 == 1) {
            L = org.telegram.messenger.g0.L(150.0f);
            akVar2.setAlpha(1.0f);
            akVar2.setScaleX(1.0f);
            akVar2.setScaleY(1.0f);
            akVar2.setTranslationX(0.0f);
            removeView(akVar2);
            addView(akVar2, i11);
            akVar2.setVisibility(0);
            akVar.setTranslationX(L);
            akVar.setAlpha(0.0f);
            this.g0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.g0.L(150.0f);
            akVar.setAlpha(0.0f);
            akVar.setScaleX(0.95f);
            akVar.setScaleY(0.95f);
            akVar2.setScaleX(1.0f);
            akVar2.setScaleY(1.0f);
            akVar2.setTranslationX(0.0f);
            akVar2.setAlpha(1.0f);
            removeView(akVar2);
            addView(akVar2, i11 + 1);
            akVar2.setVisibility(0);
            this.g0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.g0.addUpdateListener(new xj(this, i7, L, i10));
        this.g0.addListener(new y(this, 12));
        if (i7 == 1) {
            this.g0.setDuration(220L);
        } else {
            this.g0.setDuration(200L);
        }
        this.g0.setInterpolator(nr.f);
        this.g0.start();
    }

    public final void X(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
        String N0 = org.telegram.messenger.hd.N0(R.string.AppName, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = str;
        org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
    }

    public final void Y() {
        v4.i0 adapter = this.r.getAdapter();
        boolean z10 = true;
        lk lkVar = this.E;
        if (adapter != lkVar ? this.w.b() != 1 : !lkVar.s.isEmpty() || !lkVar.Q.isEmpty()) {
            z10 = false;
        }
        this.M.setVisibility(z10 ? 0 : 8);
        Z();
    }

    public final void Z() {
        View childAt;
        fi.w4 w4Var = this.M;
        if (w4Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = w4Var.getTranslationY();
            this.N = (childAt.getTop() + (w4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            w4Var.setTranslationY(translationY);
        }
    }

    public final void a0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var == null || q0Var.w()) {
            return;
        }
        q0Var.setVisibility((this.O || this.w.f.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.mi
    public final void d() {
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var != null) {
            try {
                if (q0Var.getSearchField() != null) {
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.j5, this.a));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.mi
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(62.0f);
    }

    @Override // org.telegram.ui.Components.mi
    public int getCurrentItemTop() {
        ak akVar = this.r;
        if (akVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i7 = 0;
        View childAt = akVar.getChildAt(0);
        mj0 mj0Var = (mj0) akVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
        if (y10 > 0 && mj0Var != null && mj0Var.b() == 0) {
            i7 = y10;
        }
        if (y10 < 0 || mj0Var == null || mj0Var.b() != 0) {
            y10 = i7;
        }
        return org.telegram.messenger.g0.L(13.0f) + y10;
    }

    @Override // org.telegram.ui.Components.mi
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.mi
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.mi
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override // org.telegram.ui.Components.mi
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.j5));
        int i7 = org.telegram.ui.ActionBar.m6.A5;
        ak akVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 32, new Class[]{org.telegram.ui.Cells.z6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 48, new Class[]{org.telegram.ui.Cells.z6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.m6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.qj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 40, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.sj));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.mi
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.mi
    public final boolean k() {
        ek ekVar = this.w;
        if (ekVar.f.size() <= 0) {
            return false;
        }
        V();
        dk dkVar = (dk) p5.c.g(1, ekVar.f);
        this.b.V2.setTitle(dkVar.b);
        int topForScroll = getTopForScroll();
        File file = dkVar.a;
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

    @Override // org.telegram.ui.Components.mi
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

    public void setDelegate(ck ckVar) {
        this.R = ckVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.W = i7;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.mi
    public final void u() {
        this.H.setVisibility(8);
        this.G.setVisibility(8);
    }

    @Override // org.telegram.ui.Components.mi
    public final void w(int i7) {
        if (i7 == 6) {
            org.telegram.messenger.cz.M0 = !org.telegram.messenger.cz.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.cz.M0);
            edit.apply();
            this.d0 = org.telegram.messenger.cz.M0;
            ek ekVar = this.w;
            Collections.sort((ArrayList) ekVar.h, new yj(this, 1));
            if (this.P != null) {
                Collections.sort(ekVar.e, new yj(this, 0));
            }
            ekVar.f();
            this.H.setIcon(this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
