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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pk extends ni {
    public static final /* synthetic */ int g0 = 0;
    public final ig.e0 E;
    public final org.telegram.ui.ActionBar.u0 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final hg.r0 H;
    public AnimatorSet I;
    public final f10 J;
    public boolean K;
    public final bi.p6 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public gk Q;
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
    public final ek r;
    public final ek s;
    public final ik v;
    public final ik w;
    public final b00 x;
    public final ok y;

    public pk(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, vi viVar) {
        super(context, c6Var, viVar);
        Cursor cursor;
        this.P = false;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.V = -1;
        this.e0 = new androidx.mediarouter.app.f(this, 8);
        ik ikVar = new ik(this, context);
        this.v = ikVar;
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
                            long j10 = query.getLong(2);
                            long j11 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * MediaDataController.MAX_STYLE_RUNS_COUNT) {
                                try {
                                    if (j11 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        jk jkVar = new jk();
                                        jkVar.b = file.getName();
                                        jkVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        jkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        jkVar.c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            jkVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(jkVar);
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
                O(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(ikVar.e, new ck(this, 1));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
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
        org.telegram.ui.ActionBar.y n10 = this.b.a1.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Vd, this.a));
        org.telegram.ui.ActionBar.u0 a10 = n10.a(6, this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        f10 f10Var = new f10(context, c6Var);
        this.J = f10Var;
        addView(f10Var);
        bi.p6 p6Var = new bi.p6(this, context, f10Var, c6Var);
        this.L = p6Var;
        addView(p6Var, w7.a6.d(-1.0f, -1));
        p6Var.setVisibility(8);
        p6Var.setOnTouchListener(new ci.d(14));
        ek ekVar = new ek(this, context, c6Var, 0);
        this.s = ekVar;
        ekVar.setSectionsType(2);
        ekVar.setVerticalScrollBarEnabled(false);
        b00 b00Var = new b00(AndroidUtilities.dp(56.0f), 0, ekVar);
        this.x = b00Var;
        ekVar.setLayoutManager(b00Var);
        ekVar.setClipToPadding(false);
        ik ikVar2 = new ik(this, context);
        this.w = ikVar2;
        ekVar.setAdapter(ikVar2);
        addView(ekVar, w7.a6.d(-1.0f, -1));
        ekVar.setVisibility(8);
        ek ekVar2 = new ek(this, context, c6Var, 1);
        this.r = ekVar2;
        ekVar2.p1();
        this.c = ekVar2;
        this.d = ekVar2;
        this.h = true;
        this.f = true;
        ekVar2.setSectionsType(2);
        ekVar2.setVerticalScrollBarEnabled(false);
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, ekVar2, 2);
        this.E = e0Var;
        ekVar2.setLayoutManager(e0Var);
        ekVar2.setClipToPadding(false);
        ekVar2.setAdapter(this.v);
        addView(ekVar2, w7.a6.d(-1.0f, -1));
        this.y = new ok(this, context);
        ekVar2.setOnScrollListener(new ah.d0(this, 20));
        final int i12 = 0;
        ekVar2.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.ak
            public final /* synthetic */ pk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.am0
            public final void a(int i13, View view) {
                switch (i12) {
                    case 0:
                        pk.N(this.b, view, i13);
                        break;
                    default:
                        pk pkVar = this.b;
                        hg.r0 r0Var = pkVar.H;
                        r0Var.I0(true);
                        ok okVar = pkVar.y;
                        ArrayList arrayList = r0Var.V2;
                        hg.p0 p0Var = arrayList.isEmpty() ? hg.r0.a3[i13] : (hg.p0) arrayList.get(i13);
                        vi viVar2 = okVar.X.b;
                        ArrayList arrayList2 = okVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (p0Var.b((hg.p0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(p0Var);
                        viVar2.a1.setSearchFilter(p0Var);
                        viVar2.a1.setSearchFieldText("");
                        okVar.a0(null, null, true);
                        break;
                }
            }
        });
        ekVar2.setOnItemLongClickListener(new s(this, 20));
        hg.r0 r0Var = new hg.r0(context, c6Var);
        this.H = r0Var;
        final int i13 = 1;
        r0Var.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.ak
            public final /* synthetic */ pk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.am0
            public final void a(int i132, View view) {
                switch (i13) {
                    case 0:
                        pk.N(this.b, view, i132);
                        break;
                    default:
                        pk pkVar = this.b;
                        hg.r0 r0Var2 = pkVar.H;
                        r0Var2.I0(true);
                        ok okVar = pkVar.y;
                        ArrayList arrayList = r0Var2.V2;
                        hg.p0 p0Var = arrayList.isEmpty() ? hg.r0.a3[i132] : (hg.p0) arrayList.get(i132);
                        vi viVar2 = okVar.X.b;
                        ArrayList arrayList2 = okVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (p0Var.b((hg.p0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(p0Var);
                        viVar2.a1.setSearchFilter(p0Var);
                        viVar2.a1.setSearchFieldText("");
                        okVar.a0(null, null, true);
                        break;
                }
            }
        });
        r0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, this.a));
        addView(r0Var, w7.a6.e(-1, 44, 48));
        r0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        r0Var.setVisibility(4);
        R();
        Y();
        W();
    }

    public static void N(pk pkVar, View view, int i10) {
        Object O;
        int i11;
        vi viVar = pkVar.b;
        ek ekVar = pkVar.r;
        s4.g0 adapter = ekVar.getAdapter();
        ik ikVar = pkVar.v;
        if (adapter == ikVar) {
            O = ikVar.E(i10);
        } else {
            ok okVar = pkVar.y;
            O = okVar.O(okVar.S(i10), okVar.Q(i10));
        }
        if (!(O instanceof jk)) {
            pkVar.S(view, O);
            return;
        }
        jk jkVar = (jk) O;
        File file = jkVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = jkVar.a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !isExternalStorageManager)) {
            pkVar.Q.y();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                pkVar.S(view, jkVar);
                return;
            }
            hk hkVar = new hk();
            View childAt = ekVar.getChildAt(0);
            s4.b1 G = ekVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                hkVar.a = pkVar.O;
                hkVar.b = viVar.a1.getTitle();
                pkVar.T();
                ikVar.d.add(hkVar);
                if (!pkVar.Q(file)) {
                    ikVar.d.remove(hkVar);
                    return;
                } else {
                    pkVar.U(1);
                    viVar.a1.setTitle(jkVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = jkVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
            org.telegram.ui.fo foVar = m2Var instanceof org.telegram.ui.fo ? (org.telegram.ui.fo) m2Var : null;
            org.telegram.ui.hr0 hr0Var = new org.telegram.ui.hr0(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, foVar != null, foVar, false);
            hr0Var.l0 = true;
            hr0Var.s0 = new li.k(pkVar, hashMap, arrayList, false, 14);
            hr0Var.f0(pkVar.V, false);
            org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f0;
            if (m2Var2 != null) {
                m2Var2.presentFragment(hr0Var);
            } else {
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(hr0Var);
                }
            }
            viVar.dismiss(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            gk gkVar = pkVar.Q;
            if (gkVar != null) {
                gkVar.O();
                return;
            }
            return;
        }
        int topForScroll = pkVar.getTopForScroll();
        pkVar.T();
        hk hkVar2 = (hk) i2.d.x(1, ikVar.d);
        viVar.a1.setTitle(hkVar2.b);
        File file2 = hkVar2.a;
        if (file2 != null) {
            pkVar.Q(file2);
        } else {
            pkVar.R();
        }
        pkVar.Y();
        pkVar.E.h1(0, topForScroll);
        pkVar.U(2);
    }

    private int getTopForScroll() {
        ek ekVar = this.r;
        View childAt = ekVar.getChildAt(0);
        s4.b1 G = ekVar.G(childAt);
        int i10 = -ekVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.ni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int dp;
        int i12;
        vi viVar = this.b;
        if (viVar.a1.n0 || viVar.u1.R() > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(56.0f);
            viVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(1.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    viVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(1.0f);
            if (dp < 0) {
            }
            viVar.setAllowNestedScroll(true);
        }
        this.r.o1(0, dp + AndroidUtilities.statusBarHeight, 0, this.e);
        ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.ni
    public final void D() {
        ik ikVar = this.v;
        if (ikVar != null) {
            ikVar.l();
        }
        ok okVar = this.y;
        if (okVar != null) {
            okVar.l();
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void G(ni niVar) {
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

    @Override // org.telegram.ui.Components.ni
    public final void J() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) hashMap.get((org.telegram.ui.u10) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        vi viVar = this.b;
        CharSequence[] charSequenceArr = {viVar.o1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(viVar.M1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return g5.a0(viVar.M1, viVar.p1(), viVar.l1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() { // from class: org.telegram.ui.Components.dk
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                pk pkVar = pk.this;
                pkVar.K = true;
                pkVar.Q.l(arrayList2, charSequence, entities, arrayList, z10, i10, j10, z11, ((Long) obj).longValue());
                pkVar.b.dismiss(true);
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
                    jk jkVar = new jk();
                    jkVar.b = file2.getName();
                    jkVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    jkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    jkVar.c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        jkVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(jkVar);
                }
            }
        }
    }

    public final boolean P(File file) {
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !wf.c.i.contains(mimeTypeFromExtension)) {
            new zc(this.b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            new zc(this.b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
        new zc(this.b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
        return false;
    }

    public final boolean Q(File file) {
        this.N = false;
        boolean canRead = file.canRead();
        ek ekVar = this.r;
        ik ikVar = this.v;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                V(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.O = file;
            ikVar.c.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(ekVar);
            this.U = true;
            ikVar.l();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                V(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.O = file;
            ArrayList arrayList = ikVar.c;
            ArrayList arrayList2 = ikVar.d;
            ArrayList arrayList3 = ikVar.c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    jk jkVar = new jk();
                    jkVar.b = file2.getName();
                    jkVar.f = file2;
                    if (file2.isDirectory()) {
                        jkVar.a = R.drawable.files_folder;
                        jkVar.c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        jkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        jkVar.c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            jkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(jkVar);
                }
            }
            jk jkVar2 = new jk();
            jkVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((hk) i2.d.g(1, arrayList2)).a;
                if (file3 == null) {
                    jkVar2.c = LocaleController.getString(R.string.Folder);
                } else {
                    jkVar2.c = file3.toString();
                }
            } else {
                jkVar2.c = LocaleController.getString(R.string.Folder);
            }
            jkVar2.a = R.drawable.files_folder;
            jkVar2.f = null;
            arrayList3.add(0, jkVar2);
            if (this.O != null) {
                Collections.sort(ikVar.c, new ck(this, 0));
            }
            Y();
            AndroidUtilities.clearDrawableAnimation(ekVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            ikVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            V(e.getLocalizedMessage());
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
        vi viVar;
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
            jk jkVar = new jk();
            if (Environment.isExternalStorageRemovable()) {
                jkVar.b = LocaleController.getString(R.string.SdCard);
                jkVar.a = R.drawable.files_internal;
                jkVar.c = LocaleController.getString(R.string.ExternalFolderInfo);
            } else {
                jkVar.b = LocaleController.getString(R.string.InternalStorage);
                jkVar.a = R.drawable.files_storage;
                jkVar.c = LocaleController.getString(R.string.InternalFolderInfo);
            }
            jkVar.f = Environment.getExternalStorageDirectory();
            this.v.c.add(jkVar);
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
                                jk jkVar2 = new jk();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    jkVar2.b = LocaleController.getString(R.string.SdCard);
                                } else {
                                    jkVar2.b = LocaleController.getString(R.string.ExternalStorage);
                                }
                                jkVar2.c = LocaleController.getString(R.string.ExternalFolderInfo);
                                jkVar2.a = R.drawable.files_internal;
                                jkVar2.f = new File(nextToken);
                                this.v.c.add(jkVar2);
                            } catch (Exception e7) {
                                FileLog.e(e7);
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
                jk jkVar3 = new jk();
                jkVar3.b = "Telegram";
                jkVar3.c = LocaleController.getString(R.string.AppFolderInfo);
                jkVar3.a = R.drawable.files_folder;
                jkVar3.f = file;
                this.v.c.add(jkVar3);
            }
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        if (!this.d0 && ((viVar = this.b) == null || !viVar.H)) {
            jk jkVar4 = new jk();
            jkVar4.b = LocaleController.getString(R.string.Gallery);
            jkVar4.c = LocaleController.getString(R.string.GalleryInfo);
            jkVar4.a = R.drawable.files_gallery;
            jkVar4.f = null;
            this.v.c.add(jkVar4);
        }
        if (this.a0) {
            jk jkVar5 = new jk();
            jkVar5.b = LocaleController.getString(R.string.AttachMusic);
            jkVar5.c = LocaleController.getString(R.string.MusicInfo);
            jkVar5.a = R.drawable.files_music;
            jkVar5.f = null;
            this.v.c.add(jkVar5);
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
        boolean z11 = obj instanceof jk;
        ArrayList arrayList = this.S;
        vi viVar = this.b;
        HashMap hashMap = this.R;
        HashMap hashMap2 = this.T;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.u10 u10Var = new org.telegram.ui.u10(messageObject.getId(), messageObject.getDialogId());
                if (hashMap2.containsKey(u10Var)) {
                    hashMap2.remove(u10Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(u10Var, messageObject);
                    z12 = true;
                }
                z10 = z12;
                if (viVar.H) {
                }
            }
            return false;
        }
        jk jkVar = (jk) obj;
        File file = jkVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = jkVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!jkVar.f.canRead()) {
                    V(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.W && jkVar.e == null) {
                    V(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((jkVar.f.length() > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || jkVar.f.length() > 4194304000L) {
                    sg.j0 j0Var = new sg.j0(6, UserConfig.selectedAccount, viVar.getContainer().getContext(), viVar.f0, null);
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
                if ((!this.d0 || P(jkVar.f)) && jkVar.f.length() != 0) {
                    boolean z13 = viVar.W0;
                    hashMap.put(absolutePath, jkVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.U = false;
            if (viVar.H) {
                if (view instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) view).b(z10, true);
                }
                viVar.Z1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.Q != null && !this.K) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((MessageObject) hashMap2.get((org.telegram.ui.u10) it.next()));
                }
                this.Q.l(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void T() {
        View m10;
        ik ikVar = this.w;
        ikVar.d.clear();
        ArrayList arrayList = ikVar.d;
        ik ikVar2 = this.v;
        arrayList.addAll(ikVar2.d);
        ArrayList arrayList2 = ikVar.c;
        arrayList2.clear();
        arrayList2.addAll(ikVar2.c);
        ArrayList arrayList3 = ikVar.e;
        arrayList3.clear();
        arrayList3.addAll(ikVar2.e);
        ikVar.l();
        ek ekVar = this.s;
        ekVar.setVisibility(0);
        ek ekVar2 = this.r;
        ekVar.setPadding(ekVar2.getPaddingLeft(), ekVar2.getPaddingTop(), ekVar2.getPaddingRight(), ekVar2.getPaddingBottom());
        ig.e0 e0Var = this.E;
        int L0 = e0Var.L0();
        if (L0 < 0 || (m10 = e0Var.m(L0)) == null) {
            return;
        }
        this.x.h1(L0, m10.getTop() - ekVar.getPaddingTop());
    }

    public final void U(int i10) {
        ek ekVar;
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
            ekVar = this.r;
            if (i12 >= childCount) {
                i12 = 0;
                break;
            } else if (getChildAt(i12) == ekVar) {
                break;
            } else {
                i12++;
            }
        }
        ek ekVar2 = this.s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            ekVar2.setAlpha(1.0f);
            ekVar2.setScaleX(1.0f);
            ekVar2.setScaleY(1.0f);
            ekVar2.setTranslationX(0.0f);
            removeView(ekVar2);
            addView(ekVar2, i12);
            ekVar2.setVisibility(0);
            ekVar.setTranslationX(dp);
            ekVar.setAlpha(0.0f);
            this.f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            ekVar.setAlpha(0.0f);
            ekVar.setScaleX(0.95f);
            ekVar.setScaleY(0.95f);
            ekVar2.setScaleX(1.0f);
            ekVar2.setScaleY(1.0f);
            ekVar2.setTranslationX(0.0f);
            ekVar2.setAlpha(1.0f);
            removeView(ekVar2);
            addView(ekVar2, i12 + 1);
            ekVar2.setVisibility(0);
            this.f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f0.addUpdateListener(new bk(this, i10, dp, i11));
        this.f0.addListener(new l6(this, 10));
        if (i10 == 1) {
            this.f0.setDuration(220L);
        } else {
            this.f0.setDuration(200L);
        }
        this.f0.setInterpolator(es.f);
        this.f0.start();
    }

    public final void V(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        a2Var.T = str;
        org.telegram.messenger.q.A(R.string.OK, alertDialog$Builder, null);
    }

    public final void W() {
        s4.g0 adapter = this.r.getAdapter();
        boolean z10 = true;
        ok okVar = this.y;
        if (adapter != okVar ? this.v.h() != 1 : !okVar.s.isEmpty() || !okVar.P.isEmpty()) {
            z10 = false;
        }
        this.L.setVisibility(z10 ? 0 : 8);
        X();
    }

    public final void X() {
        View childAt;
        bi.p6 p6Var = this.L;
        if (p6Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = p6Var.getTranslationY();
            this.M = (childAt.getTop() + (p6Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            p6Var.setTranslationY(translationY);
        }
    }

    public final void Y() {
        org.telegram.ui.ActionBar.u0 u0Var = this.F;
        if (u0Var == null || u0Var.s()) {
            return;
        }
        u0Var.setVisibility((this.N || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.ni
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        ek ekVar = this.r;
        if (ekVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = ekVar.getChildAt(0);
        wl0 wl0Var = (wl0) ekVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || wl0Var == null || wl0Var.b() != 0) {
            y3 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y3;
    }

    @Override // org.telegram.ui.Components.ni
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ni
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ni
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override // org.telegram.ui.Components.ni
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        ek ekVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 40, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(ekVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ni
    public final int i() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean j() {
        ik ikVar = this.v;
        if (ikVar.d.size() <= 0) {
            return false;
        }
        T();
        hk hkVar = (hk) i2.d.x(1, ikVar.d);
        this.b.a1.setTitle(hkVar.b);
        int topForScroll = getTopForScroll();
        File file = hkVar.a;
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

    @Override // org.telegram.ui.Components.ni
    public final void o() {
        try {
            if (this.P) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.b.a1.h(true);
        org.telegram.ui.ActionBar.y n10 = this.b.a1.n();
        n10.removeView(this.G);
        n10.removeView(this.F);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        X();
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(gk gkVar) {
        this.Q = gkVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.ni
    public final void u() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    @Override // org.telegram.ui.Components.ni
    public final void w(int i10) {
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.c0 = SharedConfig.sortFilesByName;
            ik ikVar = this.v;
            Collections.sort(ikVar.e, new ck(this, 1));
            if (this.O != null) {
                Collections.sort(ikVar.c, new ck(this, 0));
            }
            ikVar.l();
            this.G.setIcon(this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
