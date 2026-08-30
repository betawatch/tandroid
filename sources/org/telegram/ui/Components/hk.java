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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hk extends di {
    public static final /* synthetic */ int d0 = 0;
    public final ej B;
    public final org.telegram.ui.ActionBar.w0 C;
    public final org.telegram.ui.ActionBar.w0 D;
    public final tf.g0 E;
    public AnimatorSet F;
    public final t00 G;
    public boolean H;
    public final nh.y4 I;
    public float J;
    public boolean K;
    public File L;
    public boolean M;
    public xj N;
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
    public final vj r;
    public final vj s;
    public final zj v;
    public final zj w;
    public final pz x;
    public final gk y;

    public hk(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, li liVar) {
        super(context, f6Var, liVar);
        Cursor cursor;
        this.M = false;
        this.O = new HashMap();
        this.P = new ArrayList();
        this.Q = new HashMap();
        this.S = -1;
        this.b0 = new androidx.mediarouter.app.h(this, 8);
        zj zjVar = new zj(this, context);
        this.v = zjVar;
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
                                        ak akVar = new ak();
                                        akVar.b = file.getName();
                                        akVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        akVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        akVar.c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            akVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(akVar);
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
                    FileLog.e(e);
                }
            } else {
                K(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(zjVar.e, new tj(this, 1));
            }
        } catch (Exception e6) {
            FileLog.e(e6);
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
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, this.a));
        org.telegram.ui.ActionBar.w0 a10 = n10.a(6, this.W ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.D = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        t00 t00Var = new t00(context, f6Var);
        this.G = t00Var;
        addView(t00Var);
        nh.y4 y4Var = new nh.y4(this, context, t00Var, f6Var);
        this.I = y4Var;
        addView(y4Var, k7.b6.c(-1.0f, -1));
        y4Var.setVisibility(8);
        y4Var.setOnTouchListener(new oh.d(14));
        vj vjVar = new vj(this, context, f6Var, 0);
        this.s = vjVar;
        vjVar.setSectionsType(2);
        vjVar.setVerticalScrollBarEnabled(false);
        pz pzVar = new pz(AndroidUtilities.dp(56.0f), 0, vjVar);
        this.x = pzVar;
        vjVar.setLayoutManager(pzVar);
        vjVar.setClipToPadding(false);
        zj zjVar2 = new zj(this, context);
        this.w = zjVar2;
        vjVar.setAdapter(zjVar2);
        addView(vjVar, k7.b6.c(-1.0f, -1));
        vjVar.setVisibility(8);
        vj vjVar2 = new vj(this, context, f6Var, 1);
        this.r = vjVar2;
        vjVar2.p1();
        this.c = vjVar2;
        this.d = vjVar2;
        this.h = true;
        this.f = true;
        vjVar2.setSectionsType(2);
        vjVar2.setVerticalScrollBarEnabled(false);
        ej ejVar = new ej(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, vjVar2, 1);
        this.B = ejVar;
        vjVar2.setLayoutManager(ejVar);
        vjVar2.setClipToPadding(false);
        vjVar2.setAdapter(this.v);
        addView(vjVar2, k7.b6.c(-1.0f, -1));
        this.y = new gk(this, context);
        vjVar2.setOnScrollListener(new eg.f2(this, 20));
        final int i12 = 0;
        vjVar2.setOnItemClickListener(new il0(this) { // from class: org.telegram.ui.Components.rj
            public final /* synthetic */ hk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.il0
            public final void f(int i13, View view) {
                switch (i12) {
                    case 0:
                        hk.J(this.b, view, i13);
                        break;
                    default:
                        hk hkVar = this.b;
                        tf.g0 g0Var = hkVar.E;
                        g0Var.I0(true);
                        gk gkVar = hkVar.y;
                        ArrayList arrayList = g0Var.U2;
                        tf.e0 e0Var = arrayList.isEmpty() ? tf.g0.Z2[i13] : (tf.e0) arrayList.get(i13);
                        li liVar2 = gkVar.U.b;
                        ArrayList arrayList2 = gkVar.O;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((tf.e0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        liVar2.U0.setSearchFilter(e0Var);
                        liVar2.U0.setSearchFieldText("");
                        gkVar.a0(null, null, true);
                        break;
                }
            }
        });
        vjVar2.setOnItemLongClickListener(new t(this, 20));
        tf.g0 g0Var = new tf.g0(context, f6Var);
        this.E = g0Var;
        final int i13 = 1;
        g0Var.setOnItemClickListener(new il0(this) { // from class: org.telegram.ui.Components.rj
            public final /* synthetic */ hk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.il0
            public final void f(int i132, View view) {
                switch (i13) {
                    case 0:
                        hk.J(this.b, view, i132);
                        break;
                    default:
                        hk hkVar = this.b;
                        tf.g0 g0Var2 = hkVar.E;
                        g0Var2.I0(true);
                        gk gkVar = hkVar.y;
                        ArrayList arrayList = g0Var2.U2;
                        tf.e0 e0Var = arrayList.isEmpty() ? tf.g0.Z2[i132] : (tf.e0) arrayList.get(i132);
                        li liVar2 = gkVar.U.b;
                        ArrayList arrayList2 = gkVar.O;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((tf.e0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        liVar2.U0.setSearchFilter(e0Var);
                        liVar2.U0.setSearchFieldText("");
                        gkVar.a0(null, null, true);
                        break;
                }
            }
        });
        g0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, this.a));
        addView(g0Var, k7.b6.e(-1, 44, 48));
        g0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        g0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void J(hk hkVar, View view, int i10) {
        Object O;
        int i11;
        li liVar = hkVar.b;
        vj vjVar = hkVar.r;
        f2.o0 adapter = vjVar.getAdapter();
        zj zjVar = hkVar.v;
        if (adapter == zjVar) {
            O = zjVar.E(i10);
        } else {
            gk gkVar = hkVar.y;
            O = gkVar.O(gkVar.S(i10), gkVar.Q(i10));
        }
        if (!(O instanceof ak)) {
            hkVar.P(view, O);
            return;
        }
        ak akVar = (ak) O;
        File file = akVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = akVar.a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !isExternalStorageManager)) {
            hkVar.N.x();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                hkVar.P(view, akVar);
                return;
            }
            yj yjVar = new yj();
            View childAt = vjVar.getChildAt(0);
            f2.l1 G = vjVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                yjVar.a = hkVar.L;
                yjVar.b = liVar.U0.getTitle();
                hkVar.Q();
                zjVar.d.add(yjVar);
                if (!hkVar.N(file)) {
                    zjVar.d.remove(yjVar);
                    return;
                } else {
                    hkVar.R(1);
                    liVar.U0.setTitle(akVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = akVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
            org.telegram.ui.xn xnVar = p2Var instanceof org.telegram.ui.xn ? (org.telegram.ui.xn) p2Var : null;
            org.telegram.ui.fq0 fq0Var = new org.telegram.ui.fq0(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, xnVar != null, xnVar, false);
            fq0Var.i0 = true;
            fq0Var.p0 = new l7.w0(hkVar, hashMap, arrayList, 20);
            fq0Var.f0(hkVar.S, false);
            org.telegram.ui.ActionBar.p2 p2Var2 = liVar.c0;
            if (p2Var2 != null) {
                p2Var2.presentFragment(fq0Var);
            } else {
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(fq0Var);
                }
            }
            liVar.dismiss(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            xj xjVar = hkVar.N;
            if (xjVar != null) {
                xjVar.O();
                return;
            }
            return;
        }
        int topForScroll = hkVar.getTopForScroll();
        hkVar.Q();
        yj yjVar2 = (yj) e2.c.g(1, zjVar.d);
        liVar.U0.setTitle(yjVar2.b);
        File file2 = yjVar2.a;
        if (file2 != null) {
            hkVar.N(file2);
        } else {
            hkVar.O();
        }
        hkVar.V();
        hkVar.B.h1(0, topForScroll);
        hkVar.R(2);
    }

    private int getTopForScroll() {
        vj vjVar = this.r;
        View childAt = vjVar.getChildAt(0);
        f2.l1 G = vjVar.G(childAt);
        int i10 = -vjVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    @Override // org.telegram.ui.Components.di
    public final void A() {
        zj zjVar = this.v;
        if (zjVar != null) {
            zjVar.l();
        }
        gk gkVar = this.y;
        if (gkVar != null) {
            gkVar.l();
        }
    }

    @Override // org.telegram.ui.Components.di
    public final void D(di diVar) {
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

    @Override // org.telegram.ui.Components.di
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.di
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
        li liVar = this.b;
        CharSequence[] charSequenceArr = {liVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(liVar.G1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return z4.b0(liVar.G1, liVar.n1(), liVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() { // from class: org.telegram.ui.Components.uj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                hk hkVar = hk.this;
                hkVar.H = true;
                hkVar.N.l(arrayList2, charSequence, entities, arrayList, z4, i10, j10, z10, ((Long) obj).longValue());
                hkVar.b.dismiss(true);
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
                    ak akVar = new ak();
                    akVar.b = file2.getName();
                    akVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    akVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    akVar.c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        akVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(akVar);
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
        vj vjVar = this.r;
        zj zjVar = this.v;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                S(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.L = file;
            zjVar.c.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(vjVar);
            this.R = true;
            zjVar.l();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                S(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.L = file;
            ArrayList arrayList = zjVar.c;
            ArrayList arrayList2 = zjVar.d;
            ArrayList arrayList3 = zjVar.c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    ak akVar = new ak();
                    akVar.b = file2.getName();
                    akVar.f = file2;
                    if (file2.isDirectory()) {
                        akVar.a = R.drawable.files_folder;
                        akVar.c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.K = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        akVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        akVar.c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            akVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(akVar);
                }
            }
            ak akVar2 = new ak();
            akVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((yj) kh.a2.i(1, arrayList2)).a;
                if (file3 == null) {
                    akVar2.c = LocaleController.getString(R.string.Folder);
                } else {
                    akVar2.c = file3.toString();
                }
            } else {
                akVar2.c = LocaleController.getString(R.string.Folder);
            }
            akVar2.a = R.drawable.files_folder;
            akVar2.f = null;
            arrayList3.add(0, akVar2);
            if (this.L != null) {
                Collections.sort(zjVar.c, new tj(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(vjVar);
            this.R = true;
            int topForScroll = getTopForScroll();
            zjVar.l();
            this.B.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            S(e.getLocalizedMessage());
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
        li liVar;
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
            ak akVar = new ak();
            if (Environment.isExternalStorageRemovable()) {
                akVar.b = LocaleController.getString(R.string.SdCard);
                akVar.a = R.drawable.files_internal;
                akVar.c = LocaleController.getString(R.string.ExternalFolderInfo);
            } else {
                akVar.b = LocaleController.getString(R.string.InternalStorage);
                akVar.a = R.drawable.files_storage;
                akVar.c = LocaleController.getString(R.string.InternalFolderInfo);
            }
            akVar.f = Environment.getExternalStorageDirectory();
            this.v.c.add(akVar);
            hashSet.add(path);
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
        } catch (Exception e) {
            e = e;
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
                                ak akVar2 = new ak();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    akVar2.b = LocaleController.getString(R.string.SdCard);
                                } else {
                                    akVar2.b = LocaleController.getString(R.string.ExternalStorage);
                                }
                                akVar2.c = LocaleController.getString(R.string.ExternalFolderInfo);
                                akVar2.a = R.drawable.files_internal;
                                akVar2.f = new File(nextToken);
                                this.v.c.add(akVar2);
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                FileLog.e(e);
            }
            try {
                break;
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
        bufferedReader.close();
        try {
            File file = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
            if (file.exists()) {
                ak akVar3 = new ak();
                akVar3.b = "Telegram";
                akVar3.c = LocaleController.getString(R.string.AppFolderInfo);
                akVar3.a = R.drawable.files_folder;
                akVar3.f = file;
                this.v.c.add(akVar3);
            }
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        if (!this.a0 && ((liVar = this.b) == null || !liVar.E)) {
            ak akVar4 = new ak();
            akVar4.b = LocaleController.getString(R.string.Gallery);
            akVar4.c = LocaleController.getString(R.string.GalleryInfo);
            akVar4.a = R.drawable.files_gallery;
            akVar4.f = null;
            this.v.c.add(akVar4);
        }
        if (this.U) {
            ak akVar5 = new ak();
            akVar5.b = LocaleController.getString(R.string.AttachMusic);
            akVar5.c = LocaleController.getString(R.string.MusicInfo);
            akVar5.a = R.drawable.files_music;
            akVar5.f = null;
            this.v.c.add(akVar5);
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
        boolean z10 = obj instanceof ak;
        ArrayList arrayList = this.P;
        li liVar = this.b;
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
                if (liVar.E) {
                }
            }
            return false;
        }
        ak akVar = (ak) obj;
        File file = akVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = akVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z4 = false;
            } else {
                if (!akVar.f.canRead()) {
                    S(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.T && akVar.e == null) {
                    S(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((akVar.f.length() > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || akVar.f.length() > 4194304000L) {
                    eg.v0 v0Var = new eg.v0(6, UserConfig.selectedAccount, liVar.getContainer().getContext(), liVar.c0, null);
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
                if ((!this.a0 || M(akVar.f)) && akVar.f.length() != 0) {
                    boolean z12 = liVar.Q0;
                    hashMap.put(absolutePath, akVar);
                    arrayList.add(absolutePath);
                    z4 = true;
                }
            }
            this.R = false;
            if (liVar.E) {
                if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).b(z4, true);
                }
                liVar.V1(z4 ? 1 : 2);
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
        zj zjVar = this.w;
        zjVar.d.clear();
        ArrayList arrayList = zjVar.d;
        zj zjVar2 = this.v;
        arrayList.addAll(zjVar2.d);
        ArrayList arrayList2 = zjVar.c;
        arrayList2.clear();
        arrayList2.addAll(zjVar2.c);
        ArrayList arrayList3 = zjVar.e;
        arrayList3.clear();
        arrayList3.addAll(zjVar2.e);
        zjVar.l();
        vj vjVar = this.s;
        vjVar.setVisibility(0);
        vj vjVar2 = this.r;
        vjVar.setPadding(vjVar2.getPaddingLeft(), vjVar2.getPaddingTop(), vjVar2.getPaddingRight(), vjVar2.getPaddingBottom());
        ej ejVar = this.B;
        int L0 = ejVar.L0();
        if (L0 < 0 || (m9 = ejVar.m(L0)) == null) {
            return;
        }
        this.x.h1(L0, m9.getTop() - vjVar.getPaddingTop());
    }

    public final void R(int i10) {
        vj vjVar;
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
            vjVar = this.r;
            if (i12 >= childCount) {
                i12 = 0;
                break;
            } else if (getChildAt(i12) == vjVar) {
                break;
            } else {
                i12++;
            }
        }
        vj vjVar2 = this.s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            vjVar2.setAlpha(1.0f);
            vjVar2.setScaleX(1.0f);
            vjVar2.setScaleY(1.0f);
            vjVar2.setTranslationX(0.0f);
            removeView(vjVar2);
            addView(vjVar2, i12);
            vjVar2.setVisibility(0);
            vjVar.setTranslationX(dp);
            vjVar.setAlpha(0.0f);
            this.c0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            vjVar.setAlpha(0.0f);
            vjVar.setScaleX(0.95f);
            vjVar.setScaleY(0.95f);
            vjVar2.setScaleX(1.0f);
            vjVar2.setScaleY(1.0f);
            vjVar2.setTranslationX(0.0f);
            vjVar2.setAlpha(1.0f);
            removeView(vjVar2);
            addView(vjVar2, i12 + 1);
            vjVar2.setVisibility(0);
            this.c0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.c0.addUpdateListener(new sj(this, i10, dp, i11));
        this.c0.addListener(new a9(this, 6));
        if (i10 == 1) {
            this.c0.setDuration(220L);
        } else {
            this.c0.setDuration(200L);
        }
        this.c0.setInterpolator(nr.f);
        this.c0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = str;
        kh.a2.C(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        f2.o0 adapter = this.r.getAdapter();
        boolean z4 = true;
        gk gkVar = this.y;
        if (adapter != gkVar ? this.v.h() != 1 : !gkVar.s.isEmpty() || !gkVar.M.isEmpty()) {
            z4 = false;
        }
        this.I.setVisibility(z4 ? 0 : 8);
        U();
    }

    public final void U() {
        View childAt;
        nh.y4 y4Var = this.I;
        if (y4Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = y4Var.getTranslationY();
            this.J = (childAt.getTop() + (y4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            y4Var.setTranslationY(translationY);
        }
    }

    public final void V() {
        org.telegram.ui.ActionBar.w0 w0Var = this.C;
        if (w0Var == null || w0Var.s()) {
            return;
        }
        w0Var.setVisibility((this.K || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.di
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.di
    public int getCurrentItemTop() {
        vj vjVar = this.r;
        if (vjVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = vjVar.getChildAt(0);
        el0 el0Var = (el0) vjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y10 > 0 && el0Var != null && el0Var.b() == 0) {
            i10 = y10;
        }
        if (y10 < 0 || el0Var == null || el0Var.b() != 0) {
            y10 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y10;
    }

    @Override // org.telegram.ui.Components.di
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.di
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.di
    public int getSelectedItemsCount() {
        return this.Q.size() + this.O.size();
    }

    @Override // org.telegram.ui.Components.di
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.j5));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        vj vjVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 40, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.di
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.di
    public final boolean i() {
        zj zjVar = this.v;
        if (zjVar.d.size() <= 0) {
            return false;
        }
        Q();
        yj yjVar = (yj) e2.c.g(1, zjVar.d);
        this.b.U0.setTitle(yjVar.b);
        int topForScroll = getTopForScroll();
        File file = yjVar.a;
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

    @Override // org.telegram.ui.Components.di
    public final void m() {
        try {
            if (this.M) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.b0);
                this.M = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
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

    @Override // org.telegram.ui.Components.di
    public final void r() {
        this.D.setVisibility(8);
        this.C.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z4) {
        this.T = z4;
    }

    public void setDelegate(xj xjVar) {
        this.N = xjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.S = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.di
    public final void t(int i10) {
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.W = SharedConfig.sortFilesByName;
            zj zjVar = this.v;
            Collections.sort(zjVar.e, new tj(this, 1));
            if (this.L != null) {
                Collections.sort(zjVar.c, new tj(this, 0));
            }
            zjVar.l();
            this.D.setIcon(this.W ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        li liVar = this.b;
        if (liVar.U0.k0 || liVar.o1.R() > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(56.0f);
            liVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(1.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    liVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(1.0f);
            if (dp < 0) {
            }
            liVar.setAllowNestedScroll(true);
        }
        this.r.o1(0, dp + AndroidUtilities.statusBarHeight, 0, this.e);
        ((FrameLayout.LayoutParams) this.E.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }
}
