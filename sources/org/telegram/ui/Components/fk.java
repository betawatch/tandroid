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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fk extends ci {
    public static final /* synthetic */ int c0 = 0;
    public final dj A;
    public final org.telegram.ui.ActionBar.w0 B;
    public final org.telegram.ui.ActionBar.w0 C;
    public final of.o0 D;
    public AnimatorSet E;
    public final e00 F;
    public boolean G;
    public final ih.b5 H;
    public float I;
    public boolean J;
    public File K;
    public boolean L;
    public wj M;
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
    public final androidx.mediarouter.app.h a0;
    public ValueAnimator b0;
    public int n;
    public final uj r;
    public final uj s;
    public final yj v;
    public final yj w;
    public final bz x;
    public final ek y;

    public fk(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(context, b6Var, kiVar);
        Cursor cursor;
        this.L = false;
        this.N = new HashMap();
        this.O = new ArrayList();
        this.P = new HashMap();
        this.R = -1;
        this.a0 = new androidx.mediarouter.app.h(this, 7);
        yj yjVar = new yj(this, context);
        this.v = yjVar;
        this.T = i9 == 1;
        boolean z10 = i9 == 2;
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
                                        zj zjVar = new zj();
                                        zjVar.b = file.getName();
                                        zjVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        zjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        zjVar.c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            zjVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(zjVar);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (cursor == null) {
                                        throw th2;
                                    }
                                    try {
                                        cursor.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            }
                            query = cursor;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = query;
                        }
                    }
                    query.close();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                K(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(yjVar.e, new sj(this, 1));
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
        org.telegram.ui.ActionBar.z n10 = this.b.T0.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.cb(this, 4);
        this.B = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i10 = org.telegram.ui.ActionBar.f6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i10, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vd, this.a));
        org.telegram.ui.ActionBar.w0 a3 = n10.a(6, this.V ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.C = a3;
        a3.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        e00 e00Var = new e00(context, b6Var);
        this.F = e00Var;
        addView(e00Var);
        ih.b5 b5Var = new ih.b5(this, context, e00Var, b6Var);
        this.H = b5Var;
        addView(b5Var, g7.e6.c(-1.0f, -1));
        b5Var.setVisibility(8);
        b5Var.setOnTouchListener(new jh.d(14));
        uj ujVar = new uj(this, context, b6Var, 0);
        this.s = ujVar;
        ujVar.setSectionsType(2);
        ujVar.setVerticalScrollBarEnabled(false);
        bz bzVar = new bz(AndroidUtilities.dp(56.0f), 0, ujVar);
        this.x = bzVar;
        ujVar.setLayoutManager(bzVar);
        ujVar.setClipToPadding(false);
        yj yjVar2 = new yj(this, context);
        this.w = yjVar2;
        ujVar.setAdapter(yjVar2);
        addView(ujVar, g7.e6.c(-1.0f, -1));
        ujVar.setVisibility(8);
        uj ujVar2 = new uj(this, context, b6Var, 1);
        this.r = ujVar2;
        ujVar2.p1();
        this.c = ujVar2;
        this.d = ujVar2;
        this.h = true;
        this.f = true;
        ujVar2.setSectionsType(2);
        ujVar2.setVerticalScrollBarEnabled(false);
        dj djVar = new dj(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, ujVar2, 1);
        this.A = djVar;
        ujVar2.setLayoutManager(djVar);
        ujVar2.setClipToPadding(false);
        ujVar2.setAdapter(this.v);
        addView(ujVar2, g7.e6.c(-1.0f, -1));
        this.y = new ek(this, context);
        ujVar2.setOnScrollListener(new bg.o2(this, 26));
        final int i11 = 0;
        ujVar2.setOnItemClickListener(new mk0(this) { // from class: org.telegram.ui.Components.qj
            public final /* synthetic */ fk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.mk0
            public final void a(int i12, View view) {
                switch (i11) {
                    case 0:
                        fk.J(this.b, view, i12);
                        break;
                    default:
                        fk fkVar = this.b;
                        of.o0 o0Var = fkVar.D;
                        o0Var.I0(true);
                        ek ekVar = fkVar.y;
                        ArrayList arrayList = o0Var.T2;
                        of.m0 m0Var = arrayList.isEmpty() ? of.o0.Y2[i12] : (of.m0) arrayList.get(i12);
                        ki kiVar2 = ekVar.T.b;
                        ArrayList arrayList2 = ekVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                if (m0Var.b((of.m0) arrayList2.get(i13))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(m0Var);
                        kiVar2.T0.setSearchFilter(m0Var);
                        kiVar2.T0.setSearchFieldText("");
                        ekVar.a0(null, null, true);
                        break;
                }
            }
        });
        ujVar2.setOnItemLongClickListener(new s(this, 20));
        of.o0 o0Var = new of.o0(context, b6Var);
        this.D = o0Var;
        final int i12 = 1;
        o0Var.setOnItemClickListener(new mk0(this) { // from class: org.telegram.ui.Components.qj
            public final /* synthetic */ fk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.mk0
            public final void a(int i122, View view) {
                switch (i12) {
                    case 0:
                        fk.J(this.b, view, i122);
                        break;
                    default:
                        fk fkVar = this.b;
                        of.o0 o0Var2 = fkVar.D;
                        o0Var2.I0(true);
                        ek ekVar = fkVar.y;
                        ArrayList arrayList = o0Var2.T2;
                        of.m0 m0Var = arrayList.isEmpty() ? of.o0.Y2[i122] : (of.m0) arrayList.get(i122);
                        ki kiVar2 = ekVar.T.b;
                        ArrayList arrayList2 = ekVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                if (m0Var.b((of.m0) arrayList2.get(i13))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(m0Var);
                        kiVar2.T0.setSearchFilter(m0Var);
                        kiVar2.T0.setSearchFieldText("");
                        ekVar.a0(null, null, true);
                        break;
                }
            }
        });
        o0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, this.a));
        addView(o0Var, g7.e6.e(-1, 44, 48));
        o0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        o0Var.setVisibility(4);
        N();
        U();
        S();
    }

    public static void J(fk fkVar, View view, int i9) {
        Object O;
        int i10;
        ki kiVar = fkVar.b;
        uj ujVar = fkVar.r;
        f2.r0 adapter = ujVar.getAdapter();
        yj yjVar = fkVar.v;
        if (adapter == yjVar) {
            O = yjVar.E(i9);
        } else {
            ek ekVar = fkVar.y;
            O = ekVar.O(ekVar.S(i9), ekVar.Q(i9));
        }
        if (!(O instanceof zj)) {
            fkVar.O(view, O);
            return;
        }
        zj zjVar = (zj) O;
        File file = zjVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i10 = zjVar.a) == R.drawable.files_storage || i10 == R.drawable.files_internal) && !isExternalStorageManager)) {
            fkVar.M.x();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                fkVar.O(view, zjVar);
                return;
            }
            xj xjVar = new xj();
            View childAt = ujVar.getChildAt(0);
            f2.q1 G = ujVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                xjVar.a = fkVar.K;
                xjVar.b = kiVar.T0.getTitle();
                fkVar.P();
                yjVar.d.add(xjVar);
                if (!fkVar.M(file)) {
                    yjVar.d.remove(xjVar);
                    return;
                } else {
                    fkVar.Q(1);
                    kiVar.T0.setTitle(zjVar.b);
                    return;
                }
            }
            return;
        }
        int i11 = zjVar.a;
        if (i11 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
            org.telegram.ui.qn qnVar = o2Var instanceof org.telegram.ui.qn ? (org.telegram.ui.qn) o2Var : null;
            org.telegram.ui.zp0 zp0Var = new org.telegram.ui.zp0(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, qnVar != null, qnVar, false);
            zp0Var.h0 = true;
            zp0Var.o0 = new j4.c(fkVar, hashMap, arrayList, 19);
            zp0Var.e0(fkVar.R, false);
            org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.b0;
            if (o2Var2 != null) {
                o2Var2.presentFragment(zp0Var);
            } else {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(zp0Var);
                }
            }
            kiVar.dismiss(true);
            return;
        }
        if (i11 == R.drawable.files_music) {
            wj wjVar = fkVar.M;
            if (wjVar != null) {
                wjVar.N();
                return;
            }
            return;
        }
        int topForScroll = fkVar.getTopForScroll();
        fkVar.P();
        xj xjVar2 = (xj) e2.c.k(1, yjVar.d);
        kiVar.T0.setTitle(xjVar2.b);
        File file2 = xjVar2.a;
        if (file2 != null) {
            fkVar.M(file2);
        } else {
            fkVar.N();
        }
        fkVar.U();
        fkVar.A.h1(0, topForScroll);
        fkVar.Q(2);
    }

    private int getTopForScroll() {
        uj ujVar = this.r;
        View childAt = ujVar.getChildAt(0);
        f2.q1 G = ujVar.G(childAt);
        int i9 = -ujVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i9 : childAt.getTop() + i9;
    }

    @Override // org.telegram.ui.Components.ci
    public final void D(ci ciVar) {
        this.N.clear();
        this.P.clear();
        this.y.N.clear();
        this.O.clear();
        this.v.d.clear();
        N();
        U();
        S();
        this.b.T0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.C.setVisibility(0);
        this.A.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ci
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean H(final int i9, final boolean z10, int i10, final boolean z11, final long j10) {
        int size = this.N.size();
        HashMap hashMap = this.P;
        if ((size == 0 && hashMap.size() == 0) || this.M == null || this.G) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) hashMap.get((org.telegram.ui.x00) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.O);
        ki kiVar = this.b;
        CharSequence[] charSequenceArr = {kiVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(kiVar.F1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return y4.b0(kiVar.F1, kiVar.n1(), kiVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() { // from class: org.telegram.ui.Components.tj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                fk fkVar = fk.this;
                fkVar.G = true;
                fkVar.M.l(arrayList2, charSequence, entities, arrayList, z10, i9, j10, z11, ((Long) obj).longValue());
                fkVar.b.dismiss(true);
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
                    zj zjVar = new zj();
                    zjVar.b = file2.getName();
                    zjVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    zjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    zjVar.c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        zjVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(zjVar);
                }
            }
        }
    }

    public final boolean L(File file) {
        int i9;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !bf.d.i.contains(mimeTypeFromExtension)) {
            new oc(this.b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            new oc(this.b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(file));
            i9 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i9 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * MediaDataController.MAX_STYLE_RUNS_COUNT) {
            return true;
        }
        new oc(this.b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
        return false;
    }

    public final boolean M(File file) {
        this.J = false;
        boolean canRead = file.canRead();
        uj ujVar = this.r;
        yj yjVar = this.v;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                R(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.K = file;
            yjVar.c.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(ujVar);
            this.Q = true;
            yjVar.l();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                R(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.K = file;
            ArrayList arrayList = yjVar.c;
            ArrayList arrayList2 = yjVar.d;
            ArrayList arrayList3 = yjVar.c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    zj zjVar = new zj();
                    zjVar.b = file2.getName();
                    zjVar.f = file2;
                    if (file2.isDirectory()) {
                        zjVar.a = R.drawable.files_folder;
                        zjVar.c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.J = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        zjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        zjVar.c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            zjVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(zjVar);
                }
            }
            zj zjVar2 = new zj();
            zjVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((xj) j3.r0.j(1, arrayList2)).a;
                if (file3 == null) {
                    zjVar2.c = LocaleController.getString(R.string.Folder);
                } else {
                    zjVar2.c = file3.toString();
                }
            } else {
                zjVar2.c = LocaleController.getString(R.string.Folder);
            }
            zjVar2.a = R.drawable.files_folder;
            zjVar2.f = null;
            arrayList3.add(0, zjVar2);
            if (this.K != null) {
                Collections.sort(yjVar.c, new sj(this, 0));
            }
            U();
            AndroidUtilities.clearDrawableAnimation(ujVar);
            this.Q = true;
            int topForScroll = getTopForScroll();
            yjVar.l();
            this.A.h1(0, topForScroll);
            return true;
        } catch (Exception e10) {
            R(e10.getLocalizedMessage());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0183, code lost:
    
        if (r3 == null) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        BufferedReader bufferedReader;
        ki kiVar;
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
            zj zjVar = new zj();
            if (Environment.isExternalStorageRemovable()) {
                zjVar.b = LocaleController.getString(R.string.SdCard);
                zjVar.a = R.drawable.files_internal;
                zjVar.c = LocaleController.getString(R.string.ExternalFolderInfo);
            } else {
                zjVar.b = LocaleController.getString(R.string.InternalStorage);
                zjVar.a = R.drawable.files_storage;
                zjVar.c = LocaleController.getString(R.string.InternalFolderInfo);
            }
            zjVar.f = Environment.getExternalStorageDirectory();
            this.v.c.add(zjVar);
            hashSet.add(path);
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
        } catch (Exception e10) {
            e = e10;
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
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
                                zj zjVar2 = new zj();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    zjVar2.b = LocaleController.getString(R.string.SdCard);
                                } else {
                                    zjVar2.b = LocaleController.getString(R.string.ExternalStorage);
                                }
                                zjVar2.c = LocaleController.getString(R.string.ExternalFolderInfo);
                                zjVar2.a = R.drawable.files_internal;
                                zjVar2.f = new File(nextToken);
                                this.v.c.add(zjVar2);
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
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
                zj zjVar3 = new zj();
                zjVar3.b = "Telegram";
                zjVar3.c = LocaleController.getString(R.string.AppFolderInfo);
                zjVar3.a = R.drawable.files_folder;
                zjVar3.f = file;
                this.v.c.add(zjVar3);
            }
        } catch (Exception e15) {
            FileLog.e(e15);
        }
        if (!this.W && ((kiVar = this.b) == null || !kiVar.D)) {
            zj zjVar4 = new zj();
            zjVar4.b = LocaleController.getString(R.string.Gallery);
            zjVar4.c = LocaleController.getString(R.string.GalleryInfo);
            zjVar4.a = R.drawable.files_gallery;
            zjVar4.f = null;
            this.v.c.add(zjVar4);
        }
        if (this.T) {
            zj zjVar5 = new zj();
            zjVar5.b = LocaleController.getString(R.string.AttachMusic);
            zjVar5.c = LocaleController.getString(R.string.MusicInfo);
            zjVar5.a = R.drawable.files_music;
            zjVar5.f = null;
            this.v.c.add(zjVar5);
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
    public final boolean O(View view, Object obj) {
        boolean z10;
        boolean z11 = obj instanceof zj;
        ArrayList arrayList = this.O;
        ki kiVar = this.b;
        HashMap hashMap = this.N;
        HashMap hashMap2 = this.P;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.x00 x00Var = new org.telegram.ui.x00(messageObject.getId(), messageObject.getDialogId());
                if (hashMap2.containsKey(x00Var)) {
                    hashMap2.remove(x00Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(x00Var, messageObject);
                    z12 = true;
                }
                z10 = z12;
                if (kiVar.D) {
                }
            }
            return false;
        }
        zj zjVar = (zj) obj;
        File file = zjVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = zjVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!zjVar.f.canRead()) {
                    R(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.S && zjVar.e == null) {
                    R(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((zjVar.f.length() > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || zjVar.f.length() > 4194304000L) {
                    zf.j0 j0Var = new zf.j0(6, UserConfig.selectedAccount, kiVar.getContainer().getContext(), kiVar.b0, null);
                    j0Var.J0 = true;
                    j0Var.L1();
                    j0Var.show();
                    return false;
                }
                if (this.R >= 0) {
                    int size = hashMap.size();
                    int i9 = this.R;
                    if (size >= i9) {
                        R(LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i9, new Object[0])));
                        return false;
                    }
                }
                if ((!this.W || L(zjVar.f)) && zjVar.f.length() != 0) {
                    boolean z13 = kiVar.P0;
                    hashMap.put(absolutePath, zjVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.Q = false;
            if (kiVar.D) {
                if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).b(z10, true);
                }
                kiVar.V1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.M != null && !this.G) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((MessageObject) hashMap2.get((org.telegram.ui.x00) it.next()));
                }
                this.M.l(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void P() {
        View m10;
        yj yjVar = this.w;
        yjVar.d.clear();
        ArrayList arrayList = yjVar.d;
        yj yjVar2 = this.v;
        arrayList.addAll(yjVar2.d);
        ArrayList arrayList2 = yjVar.c;
        arrayList2.clear();
        arrayList2.addAll(yjVar2.c);
        ArrayList arrayList3 = yjVar.e;
        arrayList3.clear();
        arrayList3.addAll(yjVar2.e);
        yjVar.l();
        uj ujVar = this.s;
        ujVar.setVisibility(0);
        uj ujVar2 = this.r;
        ujVar.setPadding(ujVar2.getPaddingLeft(), ujVar2.getPaddingTop(), ujVar2.getPaddingRight(), ujVar2.getPaddingBottom());
        dj djVar = this.A;
        int L0 = djVar.L0();
        if (L0 < 0 || (m10 = djVar.m(L0)) == null) {
            return;
        }
        this.x.h1(L0, m10.getTop() - ujVar.getPaddingTop());
    }

    public final void Q(int i9) {
        uj ujVar;
        float dp;
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = i9;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            ujVar = this.r;
            if (i11 >= childCount) {
                i11 = 0;
                break;
            } else if (getChildAt(i11) == ujVar) {
                break;
            } else {
                i11++;
            }
        }
        uj ujVar2 = this.s;
        if (i9 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            ujVar2.setAlpha(1.0f);
            ujVar2.setScaleX(1.0f);
            ujVar2.setScaleY(1.0f);
            ujVar2.setTranslationX(0.0f);
            removeView(ujVar2);
            addView(ujVar2, i11);
            ujVar2.setVisibility(0);
            ujVar.setTranslationX(dp);
            ujVar.setAlpha(0.0f);
            this.b0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            ujVar.setAlpha(0.0f);
            ujVar.setScaleX(0.95f);
            ujVar.setScaleY(0.95f);
            ujVar2.setScaleX(1.0f);
            ujVar2.setScaleY(1.0f);
            ujVar2.setTranslationX(0.0f);
            ujVar2.setAlpha(1.0f);
            removeView(ujVar2);
            addView(ujVar2, i11 + 1);
            ujVar2.setVisibility(0);
            this.b0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.b0.addUpdateListener(new rj(this, i9, dp, i10));
        this.b0.addListener(new org.telegram.ui.xp(this, 13));
        if (i9 == 1) {
            this.b0.setDuration(220L);
        } else {
            this.b0.setDuration(200L);
        }
        this.b0.setInterpolator(gr.f);
        this.b0.start();
    }

    public final void R(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = str;
        org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
    }

    public final void S() {
        f2.r0 adapter = this.r.getAdapter();
        boolean z10 = true;
        ek ekVar = this.y;
        if (adapter != ekVar ? this.v.h() != 1 : !ekVar.s.isEmpty() || !ekVar.L.isEmpty()) {
            z10 = false;
        }
        this.H.setVisibility(z10 ? 0 : 8);
        T();
    }

    public final void T() {
        View childAt;
        ih.b5 b5Var = this.H;
        if (b5Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = b5Var.getTranslationY();
            this.I = (childAt.getTop() + (b5Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            b5Var.setTranslationY(translationY);
        }
    }

    public final void U() {
        org.telegram.ui.ActionBar.w0 w0Var = this.B;
        if (w0Var == null || w0Var.s()) {
            return;
        }
        w0Var.setVisibility((this.J || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.ci
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        uj ujVar = this.r;
        if (ujVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i9 = 0;
        View childAt = ujVar.getChildAt(0);
        ik0 ik0Var = (ik0) ujVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y10 > 0 && ik0Var != null && ik0Var.b() == 0) {
            i9 = y10;
        }
        if (y10 < 0 || ik0Var == null || ik0Var.b() != 0) {
            y10 = i9;
        }
        return AndroidUtilities.dp(13.0f) + y10;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
    public int getSelectedItemsCount() {
        return this.P.size() + this.N.size();
    }

    @Override // org.telegram.ui.Components.ci
    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.f6.j5));
        int i9 = org.telegram.ui.ActionBar.f6.A5;
        uj ujVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 40, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Bi));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ci
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean i() {
        yj yjVar = this.v;
        if (yjVar.d.size() <= 0) {
            return false;
        }
        P();
        xj xjVar = (xj) e2.c.k(1, yjVar.d);
        this.b.T0.setTitle(xjVar.b);
        int topForScroll = getTopForScroll();
        File file = xjVar.a;
        if (file != null) {
            M(file);
        } else {
            N();
        }
        U();
        this.A.h1(0, topForScroll);
        Q(2);
        return true;
    }

    @Override // org.telegram.ui.Components.ci
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
        org.telegram.ui.ActionBar.z n10 = this.b.T0.n();
        n10.removeView(this.C);
        n10.removeView(this.B);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        T();
    }

    @Override // org.telegram.ui.Components.ci
    public final void r() {
        this.C.setVisibility(8);
        this.B.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.S = z10;
    }

    public void setDelegate(wj wjVar) {
        this.M = wjVar;
    }

    public void setMaxSelectedFiles(int i9) {
        this.R = i9;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.ci
    public final void t(int i9) {
        if (i9 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.V = SharedConfig.sortFilesByName;
            yj yjVar = this.v;
            Collections.sort(yjVar.e, new sj(this, 1));
            if (this.K != null) {
                Collections.sort(yjVar.c, new sj(this, 0));
            }
            yjVar.l();
            this.C.setIcon(this.V ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i9, int i10) {
        int dp;
        int i11;
        ki kiVar = this.b;
        if (kiVar.T0.j0 || kiVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(56.0f);
            kiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    dp = i11 - AndroidUtilities.dp(1.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    kiVar.setAllowNestedScroll(true);
                }
            }
            i11 = (i10 / 5) * 2;
            dp = i11 - AndroidUtilities.dp(1.0f);
            if (dp < 0) {
            }
            kiVar.setAllowNestedScroll(true);
        }
        this.r.o1(0, dp + AndroidUtilities.statusBarHeight, 0, this.e);
        ((FrameLayout.LayoutParams) this.D.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.ci
    public final void z() {
        yj yjVar = this.v;
        if (yjVar != null) {
            yjVar.l();
        }
        ek ekVar = this.y;
        if (ekVar != null) {
            ekVar.l();
        }
    }
}
