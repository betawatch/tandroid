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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jk extends fi {
    public static final /* synthetic */ int c0 = 0;
    public final gj A;
    public final org.telegram.ui.ActionBar.w0 B;
    public final org.telegram.ui.ActionBar.w0 C;
    public final rf.h0 D;
    public AnimatorSet E;
    public final p00 F;
    public boolean G;
    public final lh.x4 H;
    public float I;
    public boolean J;
    public File K;
    public boolean L;
    public zj M;
    public final HashMap N;
    public final ArrayList O;
    public final HashMap P;
    public boolean Q;
    public int R;
    public boolean S;
    public final boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final af.c a0;
    public ValueAnimator b0;
    public int n;
    public final xj r;
    public final xj s;
    public final bk v;
    public final bk w;
    public final kz x;
    public final ik y;

    public jk(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(context, c6Var, niVar);
        Cursor cursor;
        this.L = false;
        this.N = new HashMap();
        this.O = new ArrayList();
        this.P = new HashMap();
        this.R = -1;
        this.a0 = new af.c(this, 8);
        bk bkVar = new bk(this, context);
        this.v = bkVar;
        this.T = i10 == 1;
        boolean z10 = i10 == 2;
        this.W = z10;
        this.V = SharedConfig.sortFilesByName;
        try {
            if (z10) {
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                K(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(bkVar.e, new vj(this, 1));
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        this.U = false;
        if (!this.L) {
            this.L = true;
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
                ApplicationLoader.applicationContext.registerReceiver(this.a0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.a0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.a0 n10 = this.b.T0.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.bb(this, 4);
        this.B = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vd, this.a));
        org.telegram.ui.ActionBar.w0 a10 = n10.a(6, this.V ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.C = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        p00 p00Var = new p00(context, c6Var);
        this.F = p00Var;
        addView(p00Var);
        lh.x4 x4Var = new lh.x4(this, context, p00Var, c6Var);
        this.H = x4Var;
        addView(x4Var, i7.f6.c(-1.0f, -1));
        x4Var.setVisibility(8);
        x4Var.setOnTouchListener(new mh.d(14));
        xj xjVar = new xj(this, context, c6Var, 0);
        this.s = xjVar;
        xjVar.setSectionsType(2);
        xjVar.setVerticalScrollBarEnabled(false);
        kz kzVar = new kz(AndroidUtilities.dp(56.0f), 0, xjVar);
        this.x = kzVar;
        xjVar.setLayoutManager(kzVar);
        xjVar.setClipToPadding(false);
        bk bkVar2 = new bk(this, context);
        this.w = bkVar2;
        xjVar.setAdapter(bkVar2);
        addView(xjVar, i7.f6.c(-1.0f, -1));
        xjVar.setVisibility(8);
        xj xjVar2 = new xj(this, context, c6Var, 1);
        this.r = xjVar2;
        xjVar2.p1();
        this.c = xjVar2;
        this.d = xjVar2;
        this.h = true;
        this.f = true;
        xjVar2.setSectionsType(2);
        xjVar2.setVerticalScrollBarEnabled(false);
        gj gjVar = new gj(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, xjVar2, 1);
        this.A = gjVar;
        xjVar2.setLayoutManager(gjVar);
        xjVar2.setClipToPadding(false);
        xjVar2.setAdapter(this.v);
        addView(xjVar2, i7.f6.c(-1.0f, -1));
        this.y = new ik(this, context);
        xjVar2.setOnScrollListener(new cg.g2(this, 22));
        final int i12 = 0;
        xjVar2.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.tj
            public final /* synthetic */ jk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void c(int i13, View view) {
                switch (i12) {
                    case 0:
                        jk.J(this.b, view, i13);
                        break;
                    default:
                        jk jkVar = this.b;
                        rf.h0 h0Var = jkVar.D;
                        h0Var.I0(true);
                        ik ikVar = jkVar.y;
                        ArrayList arrayList = h0Var.T2;
                        rf.f0 f0Var = arrayList.isEmpty() ? rf.h0.Y2[i13] : (rf.f0) arrayList.get(i13);
                        ni niVar2 = ikVar.T.b;
                        ArrayList arrayList2 = ikVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (f0Var.b((rf.f0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(f0Var);
                        niVar2.T0.setSearchFilter(f0Var);
                        niVar2.T0.setSearchFieldText("");
                        ikVar.a0(null, null, true);
                        break;
                }
            }
        });
        xjVar2.setOnItemLongClickListener(new u(this, 20));
        rf.h0 h0Var = new rf.h0(context, c6Var);
        this.D = h0Var;
        final int i13 = 1;
        h0Var.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.tj
            public final /* synthetic */ jk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void c(int i132, View view) {
                switch (i13) {
                    case 0:
                        jk.J(this.b, view, i132);
                        break;
                    default:
                        jk jkVar = this.b;
                        rf.h0 h0Var2 = jkVar.D;
                        h0Var2.I0(true);
                        ik ikVar = jkVar.y;
                        ArrayList arrayList = h0Var2.T2;
                        rf.f0 f0Var = arrayList.isEmpty() ? rf.h0.Y2[i132] : (rf.f0) arrayList.get(i132);
                        ni niVar2 = ikVar.T.b;
                        ArrayList arrayList2 = ikVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (f0Var.b((rf.f0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(f0Var);
                        niVar2.T0.setSearchFilter(f0Var);
                        niVar2.T0.setSearchFieldText("");
                        ikVar.a0(null, null, true);
                        break;
                }
            }
        });
        h0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, this.a));
        addView(h0Var, i7.f6.e(-1, 44, 48));
        h0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        h0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void J(jk jkVar, View view, int i10) {
        Object O;
        int i11;
        ni niVar = jkVar.b;
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
            jkVar.M.x();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                jkVar.P(view, ckVar);
                return;
            }
            ak akVar = new ak();
            View childAt = xjVar.getChildAt(0);
            f2.n1 G = xjVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                akVar.a = jkVar.K;
                akVar.b = niVar.T0.getTitle();
                jkVar.Q();
                bkVar.d.add(akVar);
                if (!jkVar.M(file)) {
                    bkVar.d.remove(akVar);
                    return;
                } else {
                    jkVar.R(1);
                    niVar.T0.setTitle(ckVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = ckVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
            org.telegram.ui.tn tnVar = o2Var instanceof org.telegram.ui.tn ? (org.telegram.ui.tn) o2Var : null;
            org.telegram.ui.zp0 zp0Var = new org.telegram.ui.zp0(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, tnVar != null, tnVar, false);
            zp0Var.h0 = true;
            zp0Var.o0 = new l3.g0(jkVar, hashMap, arrayList, 17);
            zp0Var.f0(jkVar.R, false);
            org.telegram.ui.ActionBar.o2 o2Var2 = niVar.b0;
            if (o2Var2 != null) {
                o2Var2.presentFragment(zp0Var);
            } else {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(zp0Var);
                }
            }
            niVar.dismiss(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            zj zjVar = jkVar.M;
            if (zjVar != null) {
                zjVar.O();
                return;
            }
            return;
        }
        int topForScroll = jkVar.getTopForScroll();
        jkVar.Q();
        ak akVar2 = (ak) com.google.android.recaptcha.internal.a.j(1, bkVar.d);
        niVar.T0.setTitle(akVar2.b);
        File file2 = akVar2.a;
        if (file2 != null) {
            jkVar.M(file2);
        } else {
            jkVar.O();
        }
        jkVar.V();
        jkVar.A.h1(0, topForScroll);
        jkVar.R(2);
    }

    private int getTopForScroll() {
        xj xjVar = this.r;
        View childAt = xjVar.getChildAt(0);
        f2.n1 G = xjVar.G(childAt);
        int i10 = -xjVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    @Override // org.telegram.ui.Components.fi
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

    @Override // org.telegram.ui.Components.fi
    public final void D(fi fiVar) {
        this.N.clear();
        this.P.clear();
        this.y.N.clear();
        this.O.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.b.T0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.C.setVisibility(0);
        this.A.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.fi
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean H(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        int size = this.N.size();
        HashMap hashMap = this.P;
        if ((size == 0 && hashMap.size() == 0) || this.M == null || this.G) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) hashMap.get((org.telegram.ui.z00) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.O);
        ni niVar = this.b;
        CharSequence[] charSequenceArr = {niVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(niVar.F1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return c5.b0(niVar.F1, niVar.n1(), niVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() { // from class: org.telegram.ui.Components.wj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                jk jkVar = jk.this;
                jkVar.G = true;
                jkVar.M.l(arrayList2, charSequence, entities, arrayList, z10, i10, j10, z11, ((Long) obj).longValue());
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

    public final boolean L(File file) {
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !ef.e.i.contains(mimeTypeFromExtension)) {
            new tc(this.b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            new tc(this.b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
        new tc(this.b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
        return false;
    }

    public final boolean M(File file) {
        this.J = false;
        boolean canRead = file.canRead();
        xj xjVar = this.r;
        bk bkVar = this.v;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                S(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.K = file;
            bkVar.c.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(xjVar);
            this.Q = true;
            bkVar.l();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                S(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.K = file;
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
                        this.J = true;
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
                File file3 = ((ak) j7.l1.i(1, arrayList2)).a;
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
            if (this.K != null) {
                Collections.sort(bkVar.c, new vj(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(xjVar);
            this.Q = true;
            int topForScroll = getTopForScroll();
            bkVar.l();
            this.A.h1(0, topForScroll);
            return true;
        } catch (Exception e10) {
            S(e10.getLocalizedMessage());
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
        ni niVar;
        int lastIndexOf;
        BufferedReader bufferedReader2 = null;
        this.K = null;
        this.J = false;
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
        } catch (Exception e10) {
            e = e10;
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
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception e12) {
                            FileLog.e(e12);
                        }
                    }
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
                FileLog.e(e);
            }
            try {
                break;
            } catch (Exception e14) {
                FileLog.e(e14);
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
        } catch (Exception e15) {
            FileLog.e(e15);
        }
        if (!this.W && ((niVar = this.b) == null || !niVar.D)) {
            ck ckVar4 = new ck();
            ckVar4.b = LocaleController.getString(R.string.Gallery);
            ckVar4.c = LocaleController.getString(R.string.GalleryInfo);
            ckVar4.a = R.drawable.files_gallery;
            ckVar4.f = null;
            this.v.c.add(ckVar4);
        }
        if (this.T) {
            ck ckVar5 = new ck();
            ckVar5.b = LocaleController.getString(R.string.AttachMusic);
            ckVar5.c = LocaleController.getString(R.string.MusicInfo);
            ckVar5.a = R.drawable.files_music;
            ckVar5.f = null;
            this.v.c.add(ckVar5);
        }
        if (!this.v.e.isEmpty()) {
            this.J = true;
        }
        AndroidUtilities.clearDrawableAnimation(this.r);
        this.Q = true;
        this.v.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P(View view, Object obj) {
        boolean z10;
        boolean z11 = obj instanceof ck;
        ArrayList arrayList = this.O;
        ni niVar = this.b;
        HashMap hashMap = this.N;
        HashMap hashMap2 = this.P;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.z00 z00Var = new org.telegram.ui.z00(messageObject.getId(), messageObject.getDialogId());
                if (hashMap2.containsKey(z00Var)) {
                    hashMap2.remove(z00Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(z00Var, messageObject);
                    z12 = true;
                }
                z10 = z12;
                if (niVar.D) {
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
                z10 = false;
            } else {
                if (!ckVar.f.canRead()) {
                    S(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.S && ckVar.e == null) {
                    S(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((ckVar.f.length() > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || ckVar.f.length() > 4194304000L) {
                    cg.v0 v0Var = new cg.v0(6, UserConfig.selectedAccount, niVar.getContainer().getContext(), niVar.b0, null);
                    v0Var.J0 = true;
                    v0Var.L1();
                    v0Var.show();
                    return false;
                }
                if (this.R >= 0) {
                    int size = hashMap.size();
                    int i10 = this.R;
                    if (size >= i10) {
                        S(LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i10, new Object[0])));
                        return false;
                    }
                }
                if ((!this.W || L(ckVar.f)) && ckVar.f.length() != 0) {
                    boolean z13 = niVar.P0;
                    hashMap.put(absolutePath, ckVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.Q = false;
            if (niVar.D) {
                if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).b(z10, true);
                }
                niVar.V1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.M != null && !this.G) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((MessageObject) hashMap2.get((org.telegram.ui.z00) it.next()));
                }
                this.M.l(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void Q() {
        View m10;
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
        gj gjVar = this.A;
        int L0 = gjVar.L0();
        if (L0 < 0 || (m10 = gjVar.m(L0)) == null) {
            return;
        }
        this.x.h1(L0, m10.getTop() - xjVar.getPaddingTop());
    }

    public final void R(int i10) {
        xj xjVar;
        float dp;
        ValueAnimator valueAnimator = this.b0;
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
            this.b0 = ValueAnimator.ofFloat(1.0f, 0.0f);
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
            this.b0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.b0.addUpdateListener(new uj(this, i10, dp, i11));
        this.b0.addListener(new org.telegram.ui.bm(this, 15));
        if (i10 == 1) {
            this.b0.setDuration(220L);
        } else {
            this.b0.setDuration(200L);
        }
        this.b0.setInterpolator(jr.f);
        this.b0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = str;
        j7.l1.C(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        f2.p0 adapter = this.r.getAdapter();
        boolean z10 = true;
        ik ikVar = this.y;
        if (adapter != ikVar ? this.v.h() != 1 : !ikVar.s.isEmpty() || !ikVar.L.isEmpty()) {
            z10 = false;
        }
        this.H.setVisibility(z10 ? 0 : 8);
        U();
    }

    public final void U() {
        View childAt;
        lh.x4 x4Var = this.H;
        if (x4Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = x4Var.getTranslationY();
            this.I = (childAt.getTop() + (x4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            x4Var.setTranslationY(translationY);
        }
    }

    public final void V() {
        org.telegram.ui.ActionBar.w0 w0Var = this.B;
        if (w0Var == null || w0Var.s()) {
            return;
        }
        w0Var.setVisibility((this.J || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.fi
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.fi
    public int getCurrentItemTop() {
        xj xjVar = this.r;
        if (xjVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = xjVar.getChildAt(0);
        vk0 vk0Var = (vk0) xjVar.G(childAt);
        int y8 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y8 > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = y8;
        }
        if (y8 < 0 || vk0Var == null || vk0Var.b() != 0) {
            y8 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y8;
    }

    @Override // org.telegram.ui.Components.fi
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.fi
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.fi
    public int getSelectedItemsCount() {
        return this.P.size() + this.N.size();
    }

    @Override // org.telegram.ui.Components.fi
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        xj xjVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 48, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 40, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.fi
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean i() {
        bk bkVar = this.v;
        if (bkVar.d.size() <= 0) {
            return false;
        }
        Q();
        ak akVar = (ak) com.google.android.recaptcha.internal.a.j(1, bkVar.d);
        this.b.T0.setTitle(akVar.b);
        int topForScroll = getTopForScroll();
        File file = akVar.a;
        if (file != null) {
            M(file);
        } else {
            O();
        }
        V();
        this.A.h1(0, topForScroll);
        R(2);
        return true;
    }

    @Override // org.telegram.ui.Components.fi
    public final void m() {
        try {
            if (this.L) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.a0);
                this.L = false;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.b.T0.h(true);
        org.telegram.ui.ActionBar.a0 n10 = this.b.T0.n();
        n10.removeView(this.C);
        n10.removeView(this.B);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        U();
    }

    @Override // org.telegram.ui.Components.fi
    public final void r() {
        this.C.setVisibility(8);
        this.B.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.S = z10;
    }

    public void setDelegate(zj zjVar) {
        this.M = zjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.R = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.fi
    public final void t(int i10) {
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.V = SharedConfig.sortFilesByName;
            bk bkVar = this.v;
            Collections.sort(bkVar.e, new vj(this, 1));
            if (this.K != null) {
                Collections.sort(bkVar.c, new vj(this, 0));
            }
            bkVar.l();
            this.C.setIcon(this.V ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.fi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        ni niVar = this.b;
        if (niVar.T0.j0 || niVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(56.0f);
            niVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(1.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    niVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(1.0f);
            if (dp < 0) {
            }
            niVar.setAllowNestedScroll(true);
        }
        this.r.o1(0, dp + AndroidUtilities.statusBarHeight, 0, this.e);
        ((FrameLayout.LayoutParams) this.D.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
    }
}
