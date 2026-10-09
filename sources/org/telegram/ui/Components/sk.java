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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sk extends qi {
    public static final /* synthetic */ int g0 = 0;
    public final hg.f0 E;
    public final org.telegram.ui.ActionBar.v0 F;
    public final org.telegram.ui.ActionBar.v0 G;
    public final gg.r0 H;
    public AnimatorSet I;
    public final j10 J;
    public boolean K;
    public final ai.e7 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public jk Q;
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
    public final androidx.mediarouter.app.g e0;
    public ValueAnimator f0;
    public int n;
    public final hk r;
    public final hk s;
    public final lk v;
    public final lk w;
    public final f00 x;
    public final rk y;

    public sk(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, yi yiVar) {
        super(context, e6Var, yiVar);
        Cursor cursor;
        this.P = false;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.V = -1;
        this.e0 = new androidx.mediarouter.app.g(this, 7);
        lk lkVar = new lk(this, context);
        this.v = lkVar;
        this.a0 = i10 == 1;
        boolean z10 = i10 == 2;
        this.d0 = z10;
        this.c0 = SharedConfig.sortFilesByName;
        try {
            if (z10) {
                try {
                    Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(2);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * MediaDataController.MAX_STYLE_RUNS_COUNT) {
                                try {
                                    if (j10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        mk mkVar = new mk();
                                        mkVar.b = file.getName();
                                        mkVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        mkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        mkVar.c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            mkVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(mkVar);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else {
                O(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(lkVar.e, new fk(this, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
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
                ApplicationLoader.applicationContext.registerReceiver(this.e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.z o9 = this.b.a1.o();
        org.telegram.ui.ActionBar.v0 a2 = o9.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.i6.w0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Vd, this.a));
        org.telegram.ui.ActionBar.v0 a10 = o9.a(6, this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        j10 j10Var = new j10(context, e6Var);
        this.J = j10Var;
        addView(j10Var);
        ai.e7 e7Var = new ai.e7(this, context, j10Var, e6Var);
        this.L = e7Var;
        addView(e7Var, w7.x5.d(-1.0f, -1));
        e7Var.setVisibility(8);
        e7Var.setOnTouchListener(new bi.d(14));
        hk hkVar = new hk(this, context, e6Var, 0);
        this.s = hkVar;
        hkVar.setSectionsType(2);
        hkVar.setVerticalScrollBarEnabled(false);
        f00 f00Var = new f00(AndroidUtilities.dp(56.0f), 0, hkVar);
        this.x = f00Var;
        hkVar.setLayoutManager(f00Var);
        hkVar.setClipToPadding(false);
        lk lkVar2 = new lk(this, context);
        this.w = lkVar2;
        hkVar.setAdapter(lkVar2);
        addView(hkVar, w7.x5.d(-1.0f, -1));
        hkVar.setVisibility(8);
        hk hkVar2 = new hk(this, context, e6Var, 1);
        this.r = hkVar2;
        hkVar2.p1();
        this.c = hkVar2;
        this.d = hkVar2;
        this.h = true;
        this.f = true;
        hkVar2.setSectionsType(2);
        hkVar2.setVerticalScrollBarEnabled(false);
        hg.f0 f0Var = new hg.f0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, hkVar2, 2);
        this.E = f0Var;
        hkVar2.setLayoutManager(f0Var);
        hkVar2.setClipToPadding(false);
        hkVar2.setAdapter(this.v);
        addView(hkVar2, w7.x5.d(-1.0f, -1));
        this.y = new rk(this, context);
        hkVar2.setOnScrollListener(new ai.r(this, 19));
        final int i12 = 0;
        hkVar2.setOnItemClickListener(new em0(this) { // from class: org.telegram.ui.Components.dk
            public final /* synthetic */ sk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.em0
            public final void d(int i13, View view) {
                switch (i12) {
                    case 0:
                        sk.N(this.b, view, i13);
                        break;
                    default:
                        sk skVar = this.b;
                        gg.r0 r0Var = skVar.H;
                        r0Var.I0(true);
                        rk rkVar = skVar.y;
                        ArrayList arrayList = r0Var.V2;
                        gg.p0 p0Var = arrayList.isEmpty() ? gg.r0.a3[i13] : (gg.p0) arrayList.get(i13);
                        yi yiVar2 = rkVar.X.b;
                        ArrayList arrayList2 = rkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (p0Var.b((gg.p0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(p0Var);
                        yiVar2.a1.setSearchFilter(p0Var);
                        yiVar2.a1.setSearchFieldText("");
                        rkVar.a0(null, null, true);
                        break;
                }
            }
        });
        hkVar2.setOnItemLongClickListener(new s(this, 20));
        gg.r0 r0Var = new gg.r0(context, e6Var);
        this.H = r0Var;
        final int i13 = 1;
        r0Var.setOnItemClickListener(new em0(this) { // from class: org.telegram.ui.Components.dk
            public final /* synthetic */ sk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.em0
            public final void d(int i132, View view) {
                switch (i13) {
                    case 0:
                        sk.N(this.b, view, i132);
                        break;
                    default:
                        sk skVar = this.b;
                        gg.r0 r0Var2 = skVar.H;
                        r0Var2.I0(true);
                        rk rkVar = skVar.y;
                        ArrayList arrayList = r0Var2.V2;
                        gg.p0 p0Var = arrayList.isEmpty() ? gg.r0.a3[i132] : (gg.p0) arrayList.get(i132);
                        yi yiVar2 = rkVar.X.b;
                        ArrayList arrayList2 = rkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (p0Var.b((gg.p0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(p0Var);
                        yiVar2.a1.setSearchFilter(p0Var);
                        yiVar2.a1.setSearchFieldText("");
                        rkVar.a0(null, null, true);
                        break;
                }
            }
        });
        r0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, this.a));
        addView(r0Var, w7.x5.e(-1, 44, 48));
        r0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        r0Var.setVisibility(4);
        R();
        Y();
        W();
    }

    public static void N(sk skVar, View view, int i10) {
        Object O;
        int i11;
        yi yiVar = skVar.b;
        hk hkVar = skVar.r;
        s4.i0 adapter = hkVar.getAdapter();
        lk lkVar = skVar.v;
        if (adapter == lkVar) {
            O = lkVar.E(i10);
        } else {
            rk rkVar = skVar.y;
            O = rkVar.O(rkVar.S(i10), rkVar.Q(i10));
        }
        if (!(O instanceof mk)) {
            skVar.S(view, O);
            return;
        }
        mk mkVar = (mk) O;
        File file = mkVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = mkVar.a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !isExternalStorageManager)) {
            skVar.Q.x();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                skVar.S(view, mkVar);
                return;
            }
            kk kkVar = new kk();
            View childAt = hkVar.getChildAt(0);
            s4.d1 G = hkVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                kkVar.a = skVar.O;
                kkVar.b = yiVar.a1.getTitle();
                skVar.T();
                lkVar.d.add(kkVar);
                if (!skVar.Q(file)) {
                    lkVar.d.remove(kkVar);
                    return;
                } else {
                    skVar.U(1);
                    yiVar.a1.setTitle(mkVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = mkVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
            org.telegram.ui.zn znVar = n2Var instanceof org.telegram.ui.zn ? (org.telegram.ui.zn) n2Var : null;
            org.telegram.ui.br0 br0Var = new org.telegram.ui.br0(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, znVar != null, znVar, false);
            br0Var.l0 = true;
            br0Var.s0 = new la.h(skVar, hashMap, arrayList, false, 14);
            br0Var.f0(skVar.V, false);
            org.telegram.ui.ActionBar.n2 n2Var2 = yiVar.f0;
            if (n2Var2 != null) {
                n2Var2.presentFragment(br0Var);
            } else {
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(br0Var);
                }
            }
            yiVar.dismiss(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            jk jkVar = skVar.Q;
            if (jkVar != null) {
                jkVar.O();
                return;
            }
            return;
        }
        int topForScroll = skVar.getTopForScroll();
        skVar.T();
        kk kkVar2 = (kk) hg.c.x(1, lkVar.d);
        yiVar.a1.setTitle(kkVar2.b);
        File file2 = kkVar2.a;
        if (file2 != null) {
            skVar.Q(file2);
        } else {
            skVar.R();
        }
        skVar.Y();
        skVar.E.h1(0, topForScroll);
        skVar.U(2);
    }

    private int getTopForScroll() {
        hk hkVar = this.r;
        View childAt = hkVar.getChildAt(0);
        s4.d1 G = hkVar.G(childAt);
        int i10 = -hkVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.qi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i10, int i11) {
        int dp;
        int i12;
        yi yiVar = this.b;
        if (yiVar.a1.n0 || yiVar.u1.R() > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(56.0f);
            yiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(1.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    yiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(1.0f);
            if (dp < 0) {
            }
            yiVar.setAllowNestedScroll(true);
        }
        this.r.o1(0, dp + AndroidUtilities.statusBarHeight, 0, this.e);
        ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.qi
    public final void D() {
        lk lkVar = this.v;
        if (lkVar != null) {
            lkVar.l();
        }
        rk rkVar = this.y;
        if (rkVar != null) {
            rkVar.l();
        }
    }

    @Override // org.telegram.ui.Components.qi
    public final void G(qi qiVar) {
        this.R.clear();
        this.T.clear();
        this.y.R.clear();
        this.S.clear();
        this.v.d.clear();
        R();
        Y();
        W();
        this.b.a1.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.qi
    public final void J() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) hashMap.get((org.telegram.ui.o10) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        yi yiVar = this.b;
        CharSequence[] charSequenceArr = {yiVar.o1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(yiVar.M1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return g5.a0(yiVar.M1, yiVar.p1(), yiVar.l1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() { // from class: org.telegram.ui.Components.gk
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                sk skVar = sk.this;
                skVar.K = true;
                skVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                skVar.b.dismiss(true);
            }
        }, 0L);
    }

    public final void O(File file) {
        File[] listFiles = file.listFiles();
        File checkDirectory = FileLoader.checkDirectory(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    O(file2);
                } else if (!file2.equals(checkDirectory)) {
                    mk mkVar = new mk();
                    mkVar.b = file2.getName();
                    mkVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    mkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    mkVar.c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        mkVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(mkVar);
                }
            }
        }
    }

    public final boolean P(File file) {
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !vf.c.i.contains(mimeTypeFromExtension)) {
            new ad(this.b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            new ad(this.b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
        new ad(this.b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
        return false;
    }

    public final boolean Q(File file) {
        this.N = false;
        boolean canRead = file.canRead();
        hk hkVar = this.r;
        lk lkVar = this.v;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                V(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.O = file;
            lkVar.c.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(hkVar);
            this.U = true;
            lkVar.l();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                V(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.O = file;
            ArrayList arrayList = lkVar.c;
            ArrayList arrayList2 = lkVar.d;
            ArrayList arrayList3 = lkVar.c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    mk mkVar = new mk();
                    mkVar.b = file2.getName();
                    mkVar.f = file2;
                    if (file2.isDirectory()) {
                        mkVar.a = R.drawable.files_folder;
                        mkVar.c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        mkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        mkVar.c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            mkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(mkVar);
                }
            }
            mk mkVar2 = new mk();
            mkVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((kk) hg.c.g(1, arrayList2)).a;
                if (file3 == null) {
                    mkVar2.c = LocaleController.getString(R.string.Folder);
                } else {
                    mkVar2.c = file3.toString();
                }
            } else {
                mkVar2.c = LocaleController.getString(R.string.Folder);
            }
            mkVar2.a = R.drawable.files_folder;
            mkVar2.f = null;
            arrayList3.add(0, mkVar2);
            if (this.O != null) {
                Collections.sort(lkVar.c, new fk(this, 0));
            }
            Y();
            AndroidUtilities.clearDrawableAnimation(hkVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            lkVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e7) {
            V(e7.getLocalizedMessage());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0183, code lost:
    
        if (r3 == null) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R() {
        BufferedReader bufferedReader;
        yi yiVar;
        int lastIndexOf;
        BufferedReader bufferedReader2 = null;
        this.O = null;
        this.N = false;
        this.v.c.clear();
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 30) {
            Environment.isExternalStorageManager();
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) {
            mk mkVar = new mk();
            if (Environment.isExternalStorageRemovable()) {
                mkVar.b = LocaleController.getString(R.string.SdCard);
                mkVar.a = R.drawable.files_internal;
                mkVar.c = LocaleController.getString(R.string.ExternalFolderInfo);
            } else {
                mkVar.b = LocaleController.getString(R.string.InternalStorage);
                mkVar.a = R.drawable.files_storage;
                mkVar.c = LocaleController.getString(R.string.InternalFolderInfo);
            }
            mkVar.f = Environment.getExternalStorageDirectory();
            this.v.c.add(mkVar);
            hashSet.add(path);
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
        } catch (Exception e7) {
            e = e7;
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
                                mk mkVar2 = new mk();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    mkVar2.b = LocaleController.getString(R.string.SdCard);
                                } else {
                                    mkVar2.b = LocaleController.getString(R.string.ExternalStorage);
                                }
                                mkVar2.c = LocaleController.getString(R.string.ExternalFolderInfo);
                                mkVar2.a = R.drawable.files_internal;
                                mkVar2.f = new File(nextToken);
                                this.v.c.add(mkVar2);
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
                mk mkVar3 = new mk();
                mkVar3.b = "Telegram";
                mkVar3.c = LocaleController.getString(R.string.AppFolderInfo);
                mkVar3.a = R.drawable.files_folder;
                mkVar3.f = file;
                this.v.c.add(mkVar3);
            }
        } catch (Exception e14) {
            FileLog.e(e14);
        }
        if (!this.d0 && ((yiVar = this.b) == null || !yiVar.H)) {
            mk mkVar4 = new mk();
            mkVar4.b = LocaleController.getString(R.string.Gallery);
            mkVar4.c = LocaleController.getString(R.string.GalleryInfo);
            mkVar4.a = R.drawable.files_gallery;
            mkVar4.f = null;
            this.v.c.add(mkVar4);
        }
        if (this.a0) {
            mk mkVar5 = new mk();
            mkVar5.b = LocaleController.getString(R.string.AttachMusic);
            mkVar5.c = LocaleController.getString(R.string.MusicInfo);
            mkVar5.a = R.drawable.files_music;
            mkVar5.f = null;
            this.v.c.add(mkVar5);
        }
        if (!this.v.e.isEmpty()) {
            this.N = true;
        }
        AndroidUtilities.clearDrawableAnimation(this.r);
        this.U = true;
        this.v.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S(View view, Object obj) {
        boolean z10;
        boolean z11 = obj instanceof mk;
        ArrayList arrayList = this.S;
        yi yiVar = this.b;
        HashMap hashMap = this.R;
        HashMap hashMap2 = this.T;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.o10 o10Var = new org.telegram.ui.o10(messageObject.getId(), messageObject.getDialogId());
                if (hashMap2.containsKey(o10Var)) {
                    hashMap2.remove(o10Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(o10Var, messageObject);
                    z12 = true;
                }
                z10 = z12;
                if (yiVar.H) {
                }
            }
            return false;
        }
        mk mkVar = (mk) obj;
        File file = mkVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = mkVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!mkVar.f.canRead()) {
                    V(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.W && mkVar.e == null) {
                    V(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((mkVar.f.length() > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || mkVar.f.length() > 4194304000L) {
                    rg.j0 j0Var = new rg.j0(6, UserConfig.selectedAccount, yiVar.getContainer().getContext(), yiVar.f0, null);
                    j0Var.N0 = true;
                    j0Var.M1();
                    j0Var.show();
                    return false;
                }
                if (this.V >= 0) {
                    int size = hashMap.size();
                    int i10 = this.V;
                    if (size >= i10) {
                        V(LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i10, new Object[0])));
                        return false;
                    }
                }
                if ((!this.d0 || P(mkVar.f)) && mkVar.f.length() != 0) {
                    boolean z13 = yiVar.W0;
                    hashMap.put(absolutePath, mkVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.U = false;
            if (yiVar.H) {
                if (view instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) view).b(z10, true);
                }
                yiVar.Z1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.Q != null && !this.K) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((MessageObject) hashMap2.get((org.telegram.ui.o10) it.next()));
                }
                this.Q.k(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void T() {
        View m10;
        lk lkVar = this.w;
        lkVar.d.clear();
        ArrayList arrayList = lkVar.d;
        lk lkVar2 = this.v;
        arrayList.addAll(lkVar2.d);
        ArrayList arrayList2 = lkVar.c;
        arrayList2.clear();
        arrayList2.addAll(lkVar2.c);
        ArrayList arrayList3 = lkVar.e;
        arrayList3.clear();
        arrayList3.addAll(lkVar2.e);
        lkVar.l();
        hk hkVar = this.s;
        hkVar.setVisibility(0);
        hk hkVar2 = this.r;
        hkVar.setPadding(hkVar2.getPaddingLeft(), hkVar2.getPaddingTop(), hkVar2.getPaddingRight(), hkVar2.getPaddingBottom());
        hg.f0 f0Var = this.E;
        int L0 = f0Var.L0();
        if (L0 < 0 || (m10 = f0Var.m(L0)) == null) {
            return;
        }
        this.x.h1(L0, m10.getTop() - hkVar.getPaddingTop());
    }

    public final void U(int i10) {
        hk hkVar;
        float dp;
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            hkVar = this.r;
            if (i12 >= childCount) {
                i12 = 0;
                break;
            } else if (getChildAt(i12) == hkVar) {
                break;
            } else {
                i12++;
            }
        }
        hk hkVar2 = this.s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            hkVar2.setAlpha(1.0f);
            hkVar2.setScaleX(1.0f);
            hkVar2.setScaleY(1.0f);
            hkVar2.setTranslationX(0.0f);
            removeView(hkVar2);
            addView(hkVar2, i12);
            hkVar2.setVisibility(0);
            hkVar.setTranslationX(dp);
            hkVar.setAlpha(0.0f);
            this.f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            hkVar.setAlpha(0.0f);
            hkVar.setScaleX(0.95f);
            hkVar.setScaleY(0.95f);
            hkVar2.setScaleX(1.0f);
            hkVar2.setScaleY(1.0f);
            hkVar2.setTranslationX(0.0f);
            hkVar2.setAlpha(1.0f);
            removeView(hkVar2);
            addView(hkVar2, i12 + 1);
            hkVar2.setVisibility(0);
            this.f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f0.addUpdateListener(new ek(this, i10, dp, i11));
        this.f0.addListener(new t8(this, 7));
        if (i10 == 1) {
            this.f0.setDuration(220L);
        } else {
            this.f0.setDuration(200L);
        }
        this.f0.setInterpolator(hs.f);
        this.f0.start();
    }

    public final void V(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = str;
        org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
    }

    public final void W() {
        s4.i0 adapter = this.r.getAdapter();
        boolean z10 = true;
        rk rkVar = this.y;
        if (adapter != rkVar ? this.v.h() != 1 : !rkVar.s.isEmpty() || !rkVar.P.isEmpty()) {
            z10 = false;
        }
        this.L.setVisibility(z10 ? 0 : 8);
        X();
    }

    public final void X() {
        View childAt;
        ai.e7 e7Var = this.L;
        if (e7Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = e7Var.getTranslationY();
            this.M = (childAt.getTop() + (e7Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            e7Var.setTranslationY(translationY);
        }
    }

    public final void Y() {
        org.telegram.ui.ActionBar.v0 v0Var = this.F;
        if (v0Var == null || v0Var.s()) {
            return;
        }
        v0Var.setVisibility((this.N || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.qi
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.qi
    public int getCurrentItemTop() {
        hk hkVar = this.r;
        if (hkVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = hkVar.getChildAt(0);
        am0 am0Var = (am0) hkVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && am0Var != null && am0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || am0Var == null || am0Var.b() != 0) {
            y3 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y3;
    }

    @Override // org.telegram.ui.Components.qi
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.qi
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.qi
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override // org.telegram.ui.Components.qi
    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.j5));
        int i10 = org.telegram.ui.ActionBar.i6.A5;
        hk hkVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 40, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.k6(hkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Bi));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.qi
    public final int i() {
        return 1;
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean j() {
        lk lkVar = this.v;
        if (lkVar.d.size() <= 0) {
            return false;
        }
        T();
        kk kkVar = (kk) hg.c.x(1, lkVar.d);
        this.b.a1.setTitle(kkVar.b);
        int topForScroll = getTopForScroll();
        File file = kkVar.a;
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

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        X();
    }

    @Override // org.telegram.ui.Components.qi
    public final void p() {
        try {
            if (this.P) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.e0);
                this.P = false;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.b.a1.h(true);
        org.telegram.ui.ActionBar.z o9 = this.b.a1.o();
        o9.removeView(this.G);
        o9.removeView(this.F);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(jk jkVar) {
        this.Q = jkVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.qi
    public final void u() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    @Override // org.telegram.ui.Components.qi
    public final void w(int i10) {
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.c0 = SharedConfig.sortFilesByName;
            lk lkVar = this.v;
            Collections.sort(lkVar.e, new fk(this, 1));
            if (this.O != null) {
                Collections.sort(lkVar.c, new fk(this, 0));
            }
            lkVar.l();
            this.G.setIcon(this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
