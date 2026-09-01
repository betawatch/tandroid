package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Point;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jk extends ei {
    public static final /* synthetic */ int d0 = 0;
    public final gj B;
    public final org.telegram.ui.ActionBar.w0 C;
    public final org.telegram.ui.ActionBar.w0 D;
    public final uf.g0 E;
    public AnimatorSet F;
    public final u00 G;
    public boolean H;
    public final oh.z4 I;
    public float J;
    public boolean K;
    public File L;
    public boolean M;
    public zj N;
    public final HashMap O;
    public final ArrayList P;
    public final HashMap Q;
    public boolean R;
    public int S;
    public boolean T;
    public final boolean U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public final androidx.mediarouter.app.h b0;
    public ValueAnimator c0;
    public int n;
    public final xj r;
    public final xj s;
    public final bk v;
    public final bk w;
    public final rz x;
    public final ik y;

    public jk(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(context, g6Var, miVar);
        Cursor cursor;
        this.M = false;
        this.O = new HashMap();
        this.P = new ArrayList();
        this.Q = new HashMap();
        this.S = -1;
        this.b0 = new androidx.mediarouter.app.h(this, 8);
        bk bkVar = new bk(this, context);
        this.v = bkVar;
        this.U = i10 == 1;
        boolean z4 = i10 == 2;
        this.a0 = z4;
        this.W = SharedConfig.sortFilesByName;
        try {
            if (z4) {
                try {
                    Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j10 = query.getLong(2);
                            long j11 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * MediaDataController.MAX_STYLE_RUNS_COUNT) {
                                try {
                                    if (j11 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        ck ckVar = new ck();
                                        ckVar.b = file.getName();
                                        ckVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        ckVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        ckVar.c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            ckVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(ckVar);
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
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            } else {
                K(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(bkVar.e, new vj(this, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.V = false;
        if (!this.M) {
            this.M = true;
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
                ApplicationLoader.applicationContext.registerReceiver(this.b0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.b0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.z n10 = this.b.U0.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new org.telegram.ui.fb(this, 4);
        this.C = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Vd, this.a));
        org.telegram.ui.ActionBar.w0 a10 = n10.a(6, this.W ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.D = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        u00 u00Var = new u00(context, g6Var);
        this.G = u00Var;
        addView(u00Var);
        oh.z4 z4Var = new oh.z4(this, context, u00Var, g6Var);
        this.I = z4Var;
        addView(z4Var, k7.c6.c(-1.0f, -1));
        z4Var.setVisibility(8);
        z4Var.setOnTouchListener(new org.telegram.ui.ActionBar.s2(13));
        xj xjVar = new xj(this, context, g6Var, 0);
        this.s = xjVar;
        xjVar.setSectionsType(2);
        xjVar.setVerticalScrollBarEnabled(false);
        rz rzVar = new rz(AndroidUtilities.dp(56.0f), 0, xjVar);
        this.x = rzVar;
        xjVar.setLayoutManager(rzVar);
        xjVar.setClipToPadding(false);
        bk bkVar2 = new bk(this, context);
        this.w = bkVar2;
        xjVar.setAdapter(bkVar2);
        addView(xjVar, k7.c6.c(-1.0f, -1));
        xjVar.setVisibility(8);
        xj xjVar2 = new xj(this, context, g6Var, 1);
        this.r = xjVar2;
        xjVar2.p1();
        this.c = xjVar2;
        this.d = xjVar2;
        this.h = true;
        this.f = true;
        xjVar2.setSectionsType(2);
        xjVar2.setVerticalScrollBarEnabled(false);
        gj gjVar = new gj(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, xjVar2, 1);
        this.B = gjVar;
        xjVar2.setLayoutManager(gjVar);
        xjVar2.setClipToPadding(false);
        xjVar2.setAdapter(this.v);
        addView(xjVar2, k7.c6.c(-1.0f, -1));
        this.y = new ik(this, context);
        xjVar2.setOnScrollListener(new fg.e2(this, 20));
        final int i12 = 0;
        xjVar2.setOnItemClickListener(new jl0(this) { // from class: org.telegram.ui.Components.tj
            public final /* synthetic */ jk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.jl0
            public final void f(int i13, View view) {
                switch (i12) {
                    case 0:
                        jk.J(this.b, view, i13);
                        break;
                    default:
                        jk jkVar = this.b;
                        uf.g0 g0Var = jkVar.E;
                        g0Var.I0(true);
                        ik ikVar = jkVar.y;
                        ArrayList arrayList = g0Var.U2;
                        uf.e0 e0Var = arrayList.isEmpty() ? uf.g0.Z2[i13] : (uf.e0) arrayList.get(i13);
                        mi miVar2 = ikVar.U.b;
                        ArrayList arrayList2 = ikVar.O;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((uf.e0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        miVar2.U0.setSearchFilter(e0Var);
                        miVar2.U0.setSearchFieldText("");
                        ikVar.a0(null, null, true);
                        break;
                }
            }
        });
        xjVar2.setOnItemLongClickListener(new t(this, 20));
        uf.g0 g0Var = new uf.g0(context, g6Var);
        this.E = g0Var;
        final int i13 = 1;
        g0Var.setOnItemClickListener(new jl0(this) { // from class: org.telegram.ui.Components.tj
            public final /* synthetic */ jk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.jl0
            public final void f(int i132, View view) {
                switch (i13) {
                    case 0:
                        jk.J(this.b, view, i132);
                        break;
                    default:
                        jk jkVar = this.b;
                        uf.g0 g0Var2 = jkVar.E;
                        g0Var2.I0(true);
                        ik ikVar = jkVar.y;
                        ArrayList arrayList = g0Var2.U2;
                        uf.e0 e0Var = arrayList.isEmpty() ? uf.g0.Z2[i132] : (uf.e0) arrayList.get(i132);
                        mi miVar2 = ikVar.U.b;
                        ArrayList arrayList2 = ikVar.O;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((uf.e0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        miVar2.U0.setSearchFilter(e0Var);
                        miVar2.U0.setSearchFieldText("");
                        ikVar.a0(null, null, true);
                        break;
                }
            }
        });
        g0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, this.a));
        addView(g0Var, k7.c6.e(-1, 44, 48));
        g0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        g0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void J(jk jkVar, View view, int i10) {
        Object O;
        int i11;
        mi miVar = jkVar.b;
        xj xjVar = jkVar.r;
        f2.p0 adapter = xjVar.getAdapter();
        bk bkVar = jkVar.v;
        if (adapter == bkVar) {
            O = bkVar.E(i10);
        } else {
            ik ikVar = jkVar.y;
            O = ikVar.O(ikVar.S(i10), ikVar.Q(i10));
        }
        if (!(O instanceof ck)) {
            jkVar.P(view, O);
            return;
        }
        ck ckVar = (ck) O;
        File file = ckVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = ckVar.a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !isExternalStorageManager)) {
            jkVar.N.x();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                jkVar.P(view, ckVar);
                return;
            }
            ak akVar = new ak();
            View childAt = xjVar.getChildAt(0);
            f2.m1 G = xjVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                akVar.a = jkVar.L;
                akVar.b = miVar.U0.getTitle();
                jkVar.Q();
                bkVar.d.add(akVar);
                if (!jkVar.N(file)) {
                    bkVar.d.remove(akVar);
                    return;
                } else {
                    jkVar.R(1);
                    miVar.U0.setTitle(ckVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = ckVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
            org.telegram.ui.xn xnVar = p2Var instanceof org.telegram.ui.xn ? (org.telegram.ui.xn) p2Var : null;
            org.telegram.ui.hq0 hq0Var = new org.telegram.ui.hq0(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, xnVar != null, xnVar, false);
            hq0Var.i0 = true;
            hq0Var.p0 = new l7.w0(jkVar, hashMap, arrayList, 20);
            hq0Var.f0(jkVar.S, false);
            org.telegram.ui.ActionBar.p2 p2Var2 = miVar.c0;
            if (p2Var2 != null) {
                p2Var2.presentFragment(hq0Var);
            } else {
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(hq0Var);
                }
            }
            miVar.dismiss(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            zj zjVar = jkVar.N;
            if (zjVar != null) {
                zjVar.O();
                return;
            }
            return;
        }
        int topForScroll = jkVar.getTopForScroll();
        jkVar.Q();
        ak akVar2 = (ak) e2.c.g(1, bkVar.d);
        miVar.U0.setTitle(akVar2.b);
        File file2 = akVar2.a;
        if (file2 != null) {
            jkVar.N(file2);
        } else {
            jkVar.O();
        }
        jkVar.V();
        jkVar.B.h1(0, topForScroll);
        jkVar.R(2);
    }

    private int getTopForScroll() {
        xj xjVar = this.r;
        View childAt = xjVar.getChildAt(0);
        f2.m1 G = xjVar.G(childAt);
        int i10 = -xjVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    @Override // org.telegram.ui.Components.ei
    public final void A() {
        bk bkVar = this.v;
        if (bkVar != null) {
            bkVar.l();
        }
        ik ikVar = this.y;
        if (ikVar != null) {
            ikVar.l();
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final void D(ei eiVar) {
        this.O.clear();
        this.Q.clear();
        this.y.O.clear();
        this.P.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.b.U0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.D.setVisibility(0);
        this.B.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ei
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean H(final int i10, final boolean z4, int i11, final boolean z10, final long j10) {
        int size = this.O.size();
        HashMap hashMap = this.Q;
        if ((size == 0 && hashMap.size() == 0) || this.N == null || this.H) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) hashMap.get((org.telegram.ui.l10) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.P);
        mi miVar = this.b;
        CharSequence[] charSequenceArr = {miVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(miVar.G1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return z4.b0(miVar.G1, miVar.n1(), miVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() { // from class: org.telegram.ui.Components.wj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                jk jkVar = jk.this;
                jkVar.H = true;
                jkVar.N.l(arrayList2, charSequence, entities, arrayList, z4, i10, j10, z10, ((Long) obj).longValue());
                jkVar.b.dismiss(true);
            }
        }, 0L);
    }

    public final void K(File file) {
        File[] listFiles = file.listFiles();
        File checkDirectory = FileLoader.checkDirectory(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    K(file2);
                } else if (!file2.equals(checkDirectory)) {
                    ck ckVar = new ck();
                    ckVar.b = file2.getName();
                    ckVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    ckVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    ckVar.c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        ckVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(ckVar);
                }
            }
        }
    }

    public final boolean M(File file) {
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !gf.e.i.contains(mimeTypeFromExtension)) {
            new qc(this.b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            new qc(this.b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(file));
            i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * MediaDataController.MAX_STYLE_RUNS_COUNT) {
            return true;
        }
        new qc(this.b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
        return false;
    }

    public final boolean N(File file) {
        this.K = false;
        boolean canRead = file.canRead();
        xj xjVar = this.r;
        bk bkVar = this.v;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                S(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.L = file;
            bkVar.c.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(xjVar);
            this.R = true;
            bkVar.l();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                S(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.L = file;
            ArrayList arrayList = bkVar.c;
            ArrayList arrayList2 = bkVar.d;
            ArrayList arrayList3 = bkVar.c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    ck ckVar = new ck();
                    ckVar.b = file2.getName();
                    ckVar.f = file2;
                    if (file2.isDirectory()) {
                        ckVar.a = R.drawable.files_folder;
                        ckVar.c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.K = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        ckVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        ckVar.c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            ckVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(ckVar);
                }
            }
            ck ckVar2 = new ck();
            ckVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((ak) l.d.i(1, arrayList2)).a;
                if (file3 == null) {
                    ckVar2.c = LocaleController.getString(R.string.Folder);
                } else {
                    ckVar2.c = file3.toString();
                }
            } else {
                ckVar2.c = LocaleController.getString(R.string.Folder);
            }
            ckVar2.a = R.drawable.files_folder;
            ckVar2.f = null;
            arrayList3.add(0, ckVar2);
            if (this.L != null) {
                Collections.sort(bkVar.c, new vj(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(xjVar);
            this.R = true;
            int topForScroll = getTopForScroll();
            bkVar.l();
            this.B.h1(0, topForScroll);
            return true;
        } catch (Exception e6) {
            S(e6.getLocalizedMessage());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0183, code lost:
    
        if (r3 == null) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        BufferedReader bufferedReader;
        mi miVar;
        int lastIndexOf;
        BufferedReader bufferedReader2 = null;
        this.L = null;
        this.K = false;
        this.v.c.clear();
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 30) {
            Environment.isExternalStorageManager();
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) {
            ck ckVar = new ck();
            if (Environment.isExternalStorageRemovable()) {
                ckVar.b = LocaleController.getString(R.string.SdCard);
                ckVar.a = R.drawable.files_internal;
                ckVar.c = LocaleController.getString(R.string.ExternalFolderInfo);
            } else {
                ckVar.b = LocaleController.getString(R.string.InternalStorage);
                ckVar.a = R.drawable.files_storage;
                ckVar.c = LocaleController.getString(R.string.InternalFolderInfo);
            }
            ckVar.f = Environment.getExternalStorageDirectory();
            this.v.c.add(ckVar);
            hashSet.add(path);
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
        } catch (Exception e6) {
            e = e6;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (!readLine.contains("vfat") && !readLine.contains("/mnt")) {
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d(readLine);
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
                                ck ckVar2 = new ck();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    ckVar2.b = LocaleController.getString(R.string.SdCard);
                                } else {
                                    ckVar2.b = LocaleController.getString(R.string.ExternalStorage);
                                }
                                ckVar2.c = LocaleController.getString(R.string.ExternalFolderInfo);
                                ckVar2.a = R.drawable.files_internal;
                                ckVar2.f = new File(nextToken);
                                this.v.c.add(ckVar2);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                FileLog.e(e);
            }
            try {
                break;
            } catch (Exception e13) {
                FileLog.e(e13);
            }
        }
        bufferedReader.close();
        try {
            File file = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
            if (file.exists()) {
                ck ckVar3 = new ck();
                ckVar3.b = "Telegram";
                ckVar3.c = LocaleController.getString(R.string.AppFolderInfo);
                ckVar3.a = R.drawable.files_folder;
                ckVar3.f = file;
                this.v.c.add(ckVar3);
            }
        } catch (Exception e14) {
            FileLog.e(e14);
        }
        if (!this.a0 && ((miVar = this.b) == null || !miVar.E)) {
            ck ckVar4 = new ck();
            ckVar4.b = LocaleController.getString(R.string.Gallery);
            ckVar4.c = LocaleController.getString(R.string.GalleryInfo);
            ckVar4.a = R.drawable.files_gallery;
            ckVar4.f = null;
            this.v.c.add(ckVar4);
        }
        if (this.U) {
            ck ckVar5 = new ck();
            ckVar5.b = LocaleController.getString(R.string.AttachMusic);
            ckVar5.c = LocaleController.getString(R.string.MusicInfo);
            ckVar5.a = R.drawable.files_music;
            ckVar5.f = null;
            this.v.c.add(ckVar5);
        }
        if (!this.v.e.isEmpty()) {
            this.K = true;
        }
        AndroidUtilities.clearDrawableAnimation(this.r);
        this.R = true;
        this.v.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P(View view, Object obj) {
        boolean z4;
        boolean z10 = obj instanceof ck;
        ArrayList arrayList = this.P;
        mi miVar = this.b;
        HashMap hashMap = this.O;
        HashMap hashMap2 = this.Q;
        boolean z11 = false;
        if (!z10) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.l10 l10Var = new org.telegram.ui.l10(messageObject.getId(), messageObject.getDialogId());
                if (hashMap2.containsKey(l10Var)) {
                    hashMap2.remove(l10Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(l10Var, messageObject);
                    z11 = true;
                }
                z4 = z11;
                if (miVar.E) {
                }
            }
            return false;
        }
        ck ckVar = (ck) obj;
        File file = ckVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = ckVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z4 = false;
            } else {
                if (!ckVar.f.canRead()) {
                    S(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.T && ckVar.e == null) {
                    S(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((ckVar.f.length() > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || ckVar.f.length() > 4194304000L) {
                    fg.v0 v0Var = new fg.v0(6, UserConfig.selectedAccount, miVar.getContainer().getContext(), miVar.c0, null);
                    v0Var.K0 = true;
                    v0Var.L1();
                    v0Var.show();
                    return false;
                }
                if (this.S >= 0) {
                    int size = hashMap.size();
                    int i10 = this.S;
                    if (size >= i10) {
                        S(LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i10, new Object[0])));
                        return false;
                    }
                }
                if ((!this.a0 || M(ckVar.f)) && ckVar.f.length() != 0) {
                    boolean z12 = miVar.Q0;
                    hashMap.put(absolutePath, ckVar);
                    arrayList.add(absolutePath);
                    z4 = true;
                }
            }
            this.R = false;
            if (miVar.E) {
                if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).b(z4, true);
                }
                miVar.V1(z4 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.N != null && !this.H) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((MessageObject) hashMap2.get((org.telegram.ui.l10) it.next()));
                }
                this.N.l(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void Q() {
        View m9;
        bk bkVar = this.w;
        bkVar.d.clear();
        ArrayList arrayList = bkVar.d;
        bk bkVar2 = this.v;
        arrayList.addAll(bkVar2.d);
        ArrayList arrayList2 = bkVar.c;
        arrayList2.clear();
        arrayList2.addAll(bkVar2.c);
        ArrayList arrayList3 = bkVar.e;
        arrayList3.clear();
        arrayList3.addAll(bkVar2.e);
        bkVar.l();
        xj xjVar = this.s;
        xjVar.setVisibility(0);
        xj xjVar2 = this.r;
        xjVar.setPadding(xjVar2.getPaddingLeft(), xjVar2.getPaddingTop(), xjVar2.getPaddingRight(), xjVar2.getPaddingBottom());
        gj gjVar = this.B;
        int L0 = gjVar.L0();
        if (L0 < 0 || (m9 = gjVar.m(L0)) == null) {
            return;
        }
        this.x.h1(L0, m9.getTop() - xjVar.getPaddingTop());
    }

    public final void R(int i10) {
        xj xjVar;
        float dp;
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            xjVar = this.r;
            if (i12 >= childCount) {
                i12 = 0;
                break;
            } else if (getChildAt(i12) == xjVar) {
                break;
            } else {
                i12++;
            }
        }
        xj xjVar2 = this.s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            xjVar2.setAlpha(1.0f);
            xjVar2.setScaleX(1.0f);
            xjVar2.setScaleY(1.0f);
            xjVar2.setTranslationX(0.0f);
            removeView(xjVar2);
            addView(xjVar2, i12);
            xjVar2.setVisibility(0);
            xjVar.setTranslationX(dp);
            xjVar.setAlpha(0.0f);
            this.c0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            xjVar.setAlpha(0.0f);
            xjVar.setScaleX(0.95f);
            xjVar.setScaleY(0.95f);
            xjVar2.setScaleX(1.0f);
            xjVar2.setScaleY(1.0f);
            xjVar2.setTranslationX(0.0f);
            xjVar2.setAlpha(1.0f);
            removeView(xjVar2);
            addView(xjVar2, i12 + 1);
            xjVar2.setVisibility(0);
            this.c0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.c0.addUpdateListener(new uj(this, i10, dp, i11));
        this.c0.addListener(new a9(this, 6));
        if (i10 == 1) {
            this.c0.setDuration(220L);
        } else {
            this.c0.setDuration(200L);
        }
        this.c0.setInterpolator(pr.f);
        this.c0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = str;
        l.d.C(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        f2.p0 adapter = this.r.getAdapter();
        boolean z4 = true;
        ik ikVar = this.y;
        if (adapter != ikVar ? this.v.h() != 1 : !ikVar.s.isEmpty() || !ikVar.M.isEmpty()) {
            z4 = false;
        }
        this.I.setVisibility(z4 ? 0 : 8);
        U();
    }

    public final void U() {
        View childAt;
        oh.z4 z4Var = this.I;
        if (z4Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = z4Var.getTranslationY();
            this.J = (childAt.getTop() + (z4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            z4Var.setTranslationY(translationY);
        }
    }

    public final void V() {
        org.telegram.ui.ActionBar.w0 w0Var = this.C;
        if (w0Var == null || w0Var.s()) {
            return;
        }
        w0Var.setVisibility((this.K || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.ei
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.ei
    public int getCurrentItemTop() {
        xj xjVar = this.r;
        if (xjVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = xjVar.getChildAt(0);
        fl0 fl0Var = (fl0) xjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y10 > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = y10;
        }
        if (y10 < 0 || fl0Var == null || fl0Var.b() != 0) {
            y10 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y10;
    }

    @Override // org.telegram.ui.Components.ei
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ei
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ei
    public int getSelectedItemsCount() {
        return this.Q.size() + this.O.size();
    }

    @Override // org.telegram.ui.Components.ei
    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.m6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.k6.j5));
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        xj xjVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 40, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Bi));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ei
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean i() {
        bk bkVar = this.v;
        if (bkVar.d.size() <= 0) {
            return false;
        }
        Q();
        ak akVar = (ak) e2.c.g(1, bkVar.d);
        this.b.U0.setTitle(akVar.b);
        int topForScroll = getTopForScroll();
        File file = akVar.a;
        if (file != null) {
            N(file);
        } else {
            O();
        }
        V();
        this.B.h1(0, topForScroll);
        R(2);
        return true;
    }

    @Override // org.telegram.ui.Components.ei
    public final void m() {
        try {
            if (this.M) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.b0);
                this.M = false;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        this.b.U0.h(true);
        org.telegram.ui.ActionBar.z n10 = this.b.U0.n();
        n10.removeView(this.D);
        n10.removeView(this.C);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        U();
    }

    @Override // org.telegram.ui.Components.ei
    public final void r() {
        this.D.setVisibility(8);
        this.C.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z4) {
        this.T = z4;
    }

    public void setDelegate(zj zjVar) {
        this.N = zjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.S = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.ei
    public final void t(int i10) {
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.W = SharedConfig.sortFilesByName;
            bk bkVar = this.v;
            Collections.sort(bkVar.e, new vj(this, 1));
            if (this.L != null) {
                Collections.sort(bkVar.c, new vj(this, 0));
            }
            bkVar.l();
            this.D.setIcon(this.W ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        mi miVar = this.b;
        if (miVar.U0.k0 || miVar.o1.R() > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(56.0f);
            miVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(1.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    miVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(1.0f);
            if (dp < 0) {
            }
            miVar.setAllowNestedScroll(true);
        }
        this.r.o1(0, dp + AndroidUtilities.statusBarHeight, 0, this.e);
        ((FrameLayout.LayoutParams) this.E.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }
}
