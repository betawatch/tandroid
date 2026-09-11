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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ok extends ni {
    public static final /* synthetic */ int g0 = 0;
    public final ig.e0 E;
    public final org.telegram.ui.ActionBar.v0 F;
    public final org.telegram.ui.ActionBar.v0 G;
    public final hg.s0 H;
    public AnimatorSet I;
    public final t00 J;
    public boolean K;
    public final bi.m6 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public fk Q;
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
    public final dk r;
    public final dk s;
    public final hk v;
    public final hk w;
    public final pz x;
    public final nk y;

    public ok(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        Cursor cursor;
        this.P = false;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.V = -1;
        this.e0 = new androidx.mediarouter.app.g(this, 7);
        hk hkVar = new hk(this, context);
        this.v = hkVar;
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
                                        ik ikVar = new ik();
                                        ikVar.b = file.getName();
                                        ikVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        ikVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        ikVar.c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            ikVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(ikVar);
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
                L(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(hkVar.e, new bk(this, 1));
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
        org.telegram.ui.ActionBar.z n10 = this.b.X0.n();
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, this.a));
        org.telegram.ui.ActionBar.v0 a10 = n10.a(6, this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        t00 t00Var = new t00(context, f6Var);
        this.J = t00Var;
        addView(t00Var);
        bi.m6 m6Var = new bi.m6(this, context, t00Var, f6Var);
        this.L = m6Var;
        addView(m6Var, w7.x5.c(-1.0f, -1));
        m6Var.setVisibility(8);
        m6Var.setOnTouchListener(new ci.d(14));
        dk dkVar = new dk(this, context, f6Var, 0);
        this.s = dkVar;
        dkVar.setSectionsType(2);
        dkVar.setVerticalScrollBarEnabled(false);
        pz pzVar = new pz(AndroidUtilities.dp(56.0f), 0, dkVar);
        this.x = pzVar;
        dkVar.setLayoutManager(pzVar);
        dkVar.setClipToPadding(false);
        hk hkVar2 = new hk(this, context);
        this.w = hkVar2;
        dkVar.setAdapter(hkVar2);
        addView(dkVar, w7.x5.c(-1.0f, -1));
        dkVar.setVisibility(8);
        dk dkVar2 = new dk(this, context, f6Var, 1);
        this.r = dkVar2;
        dkVar2.o1();
        this.c = dkVar2;
        this.d = dkVar2;
        this.h = true;
        this.f = true;
        dkVar2.setSectionsType(2);
        dkVar2.setVerticalScrollBarEnabled(false);
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, dkVar2, 2);
        this.E = e0Var;
        dkVar2.setLayoutManager(e0Var);
        dkVar2.setClipToPadding(false);
        dkVar2.setAdapter(this.v);
        addView(dkVar2, w7.x5.c(-1.0f, -1));
        this.y = new nk(this, context);
        dkVar2.setOnScrollListener(new ah.e0(this, 20));
        final int i12 = 0;
        dkVar2.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.zj
            public final /* synthetic */ ok b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void a(int i13, View view) {
                switch (i12) {
                    case 0:
                        ok.K(this.b, view, i13);
                        break;
                    default:
                        ok okVar = this.b;
                        hg.s0 s0Var = okVar.H;
                        s0Var.I0(true);
                        nk nkVar = okVar.y;
                        ArrayList arrayList = s0Var.X2;
                        hg.q0 q0Var = arrayList.isEmpty() ? hg.s0.c3[i13] : (hg.q0) arrayList.get(i13);
                        vi viVar2 = nkVar.X.b;
                        ArrayList arrayList2 = nkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((hg.q0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        viVar2.X0.setSearchFilter(q0Var);
                        viVar2.X0.setSearchFieldText("");
                        nkVar.a0(null, null, true);
                        break;
                }
            }
        });
        dkVar2.setOnItemLongClickListener(new t(this, 20));
        hg.s0 s0Var = new hg.s0(context, f6Var);
        this.H = s0Var;
        final int i13 = 1;
        s0Var.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.zj
            public final /* synthetic */ ok b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void a(int i132, View view) {
                switch (i13) {
                    case 0:
                        ok.K(this.b, view, i132);
                        break;
                    default:
                        ok okVar = this.b;
                        hg.s0 s0Var2 = okVar.H;
                        s0Var2.I0(true);
                        nk nkVar = okVar.y;
                        ArrayList arrayList = s0Var2.X2;
                        hg.q0 q0Var = arrayList.isEmpty() ? hg.s0.c3[i132] : (hg.q0) arrayList.get(i132);
                        vi viVar2 = nkVar.X.b;
                        ArrayList arrayList2 = nkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((hg.q0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        viVar2.X0.setSearchFilter(q0Var);
                        viVar2.X0.setSearchFieldText("");
                        nkVar.a0(null, null, true);
                        break;
                }
            }
        });
        s0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, this.a));
        addView(s0Var, w7.x5.e(-1, 44, 48));
        s0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        s0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void K(ok okVar, View view, int i10) {
        Object O;
        int i11;
        vi viVar = okVar.b;
        dk dkVar = okVar.r;
        s4.h0 adapter = dkVar.getAdapter();
        hk hkVar = okVar.v;
        if (adapter == hkVar) {
            O = hkVar.E(i10);
        } else {
            nk nkVar = okVar.y;
            O = nkVar.O(nkVar.S(i10), nkVar.Q(i10));
        }
        if (!(O instanceof ik)) {
            okVar.P(view, O);
            return;
        }
        ik ikVar = (ik) O;
        File file = ikVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = ikVar.a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !isExternalStorageManager)) {
            okVar.Q.w();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                okVar.P(view, ikVar);
                return;
            }
            gk gkVar = new gk();
            View childAt = dkVar.getChildAt(0);
            s4.c1 G = dkVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                gkVar.a = okVar.O;
                gkVar.b = viVar.X0.getTitle();
                okVar.Q();
                hkVar.d.add(gkVar);
                if (!okVar.N(file)) {
                    hkVar.d.remove(gkVar);
                    return;
                } else {
                    okVar.R(1);
                    viVar.X0.setTitle(ikVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = ikVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
            org.telegram.ui.co coVar = n2Var instanceof org.telegram.ui.co ? (org.telegram.ui.co) n2Var : null;
            org.telegram.ui.br0 br0Var = new org.telegram.ui.br0(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, coVar != null, coVar, false);
            br0Var.l0 = true;
            br0Var.s0 = new m2.t(okVar, hashMap, arrayList);
            br0Var.f0(okVar.V, false);
            org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f0;
            if (n2Var2 != null) {
                n2Var2.presentFragment(br0Var);
            } else {
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(br0Var);
                }
            }
            viVar.dismiss(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            fk fkVar = okVar.Q;
            if (fkVar != null) {
                fkVar.O();
                return;
            }
            return;
        }
        int topForScroll = okVar.getTopForScroll();
        okVar.Q();
        gk gkVar2 = (gk) i2.g.z(1, hkVar.d);
        viVar.X0.setTitle(gkVar2.b);
        File file2 = gkVar2.a;
        if (file2 != null) {
            okVar.N(file2);
        } else {
            okVar.O();
        }
        okVar.V();
        okVar.E.h1(0, topForScroll);
        okVar.R(2);
    }

    private int getTopForScroll() {
        dk dkVar = this.r;
        View childAt = dkVar.getChildAt(0);
        s4.c1 G = dkVar.G(childAt);
        int i10 = -dkVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    @Override // org.telegram.ui.Components.ni
    public final void A() {
        hk hkVar = this.v;
        if (hkVar != null) {
            hkVar.l();
        }
        nk nkVar = this.y;
        if (nkVar != null) {
            nkVar.l();
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void D(ni niVar) {
        this.R.clear();
        this.T.clear();
        this.y.R.clear();
        this.S.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.b.X0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ni
    public final void G() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) hashMap.get((org.telegram.ui.p10) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        vi viVar = this.b;
        CharSequence[] charSequenceArr = {viVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(viVar.J1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return e5.b0(viVar.J1, viVar.n1(), viVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() { // from class: org.telegram.ui.Components.ck
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ok okVar = ok.this;
                okVar.K = true;
                okVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                okVar.b.dismiss(true);
            }
        }, 0L);
    }

    public final void L(File file) {
        File[] listFiles = file.listFiles();
        File checkDirectory = FileLoader.checkDirectory(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    L(file2);
                } else if (!file2.equals(checkDirectory)) {
                    ik ikVar = new ik();
                    ikVar.b = file2.getName();
                    ikVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    ikVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    ikVar.c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        ikVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(ikVar);
                }
            }
        }
    }

    public final boolean M(File file) {
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !uf.c.i.contains(mimeTypeFromExtension)) {
            new yc(this.b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            new yc(this.b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
        new yc(this.b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
        return false;
    }

    public final boolean N(File file) {
        this.N = false;
        boolean canRead = file.canRead();
        dk dkVar = this.r;
        hk hkVar = this.v;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                S(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.O = file;
            hkVar.c.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(dkVar);
            this.U = true;
            hkVar.l();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                S(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.O = file;
            ArrayList arrayList = hkVar.c;
            ArrayList arrayList2 = hkVar.d;
            ArrayList arrayList3 = hkVar.c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    ik ikVar = new ik();
                    ikVar.b = file2.getName();
                    ikVar.f = file2;
                    if (file2.isDirectory()) {
                        ikVar.a = R.drawable.files_folder;
                        ikVar.c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        ikVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        ikVar.c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            ikVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(ikVar);
                }
            }
            ik ikVar2 = new ik();
            ikVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((gk) i2.g.h(1, arrayList2)).a;
                if (file3 == null) {
                    ikVar2.c = LocaleController.getString(R.string.Folder);
                } else {
                    ikVar2.c = file3.toString();
                }
            } else {
                ikVar2.c = LocaleController.getString(R.string.Folder);
            }
            ikVar2.a = R.drawable.files_folder;
            ikVar2.f = null;
            arrayList3.add(0, ikVar2);
            if (this.O != null) {
                Collections.sort(hkVar.c, new bk(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(dkVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            hkVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e7) {
            S(e7.getLocalizedMessage());
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
            ik ikVar = new ik();
            if (Environment.isExternalStorageRemovable()) {
                ikVar.b = LocaleController.getString(R.string.SdCard);
                ikVar.a = R.drawable.files_internal;
                ikVar.c = LocaleController.getString(R.string.ExternalFolderInfo);
            } else {
                ikVar.b = LocaleController.getString(R.string.InternalStorage);
                ikVar.a = R.drawable.files_storage;
                ikVar.c = LocaleController.getString(R.string.InternalFolderInfo);
            }
            ikVar.f = Environment.getExternalStorageDirectory();
            this.v.c.add(ikVar);
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
                                ik ikVar2 = new ik();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    ikVar2.b = LocaleController.getString(R.string.SdCard);
                                } else {
                                    ikVar2.b = LocaleController.getString(R.string.ExternalStorage);
                                }
                                ikVar2.c = LocaleController.getString(R.string.ExternalFolderInfo);
                                ikVar2.a = R.drawable.files_internal;
                                ikVar2.f = new File(nextToken);
                                this.v.c.add(ikVar2);
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
                ik ikVar3 = new ik();
                ikVar3.b = "Telegram";
                ikVar3.c = LocaleController.getString(R.string.AppFolderInfo);
                ikVar3.a = R.drawable.files_folder;
                ikVar3.f = file;
                this.v.c.add(ikVar3);
            }
        } catch (Exception e14) {
            FileLog.e(e14);
        }
        if (!this.d0 && ((viVar = this.b) == null || !viVar.H)) {
            ik ikVar4 = new ik();
            ikVar4.b = LocaleController.getString(R.string.Gallery);
            ikVar4.c = LocaleController.getString(R.string.GalleryInfo);
            ikVar4.a = R.drawable.files_gallery;
            ikVar4.f = null;
            this.v.c.add(ikVar4);
        }
        if (this.a0) {
            ik ikVar5 = new ik();
            ikVar5.b = LocaleController.getString(R.string.AttachMusic);
            ikVar5.c = LocaleController.getString(R.string.MusicInfo);
            ikVar5.a = R.drawable.files_music;
            ikVar5.f = null;
            this.v.c.add(ikVar5);
        }
        if (!this.v.e.isEmpty()) {
            this.N = true;
        }
        AndroidUtilities.clearDrawableAnimation(this.r);
        this.U = true;
        this.v.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P(View view, Object obj) {
        boolean z10;
        boolean z11 = obj instanceof ik;
        ArrayList arrayList = this.S;
        vi viVar = this.b;
        HashMap hashMap = this.R;
        HashMap hashMap2 = this.T;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.p10 p10Var = new org.telegram.ui.p10(messageObject.getId(), messageObject.getDialogId());
                if (hashMap2.containsKey(p10Var)) {
                    hashMap2.remove(p10Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(p10Var, messageObject);
                    z12 = true;
                }
                z10 = z12;
                if (viVar.H) {
                }
            }
            return false;
        }
        ik ikVar = (ik) obj;
        File file = ikVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = ikVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!ikVar.f.canRead()) {
                    S(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.W && ikVar.e == null) {
                    S(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((ikVar.f.length() > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || ikVar.f.length() > 4194304000L) {
                    sg.k0 k0Var = new sg.k0(6, UserConfig.selectedAccount, viVar.getContainer().getContext(), viVar.f0, null);
                    k0Var.N0 = true;
                    k0Var.L1();
                    k0Var.show();
                    return false;
                }
                if (this.V >= 0) {
                    int size = hashMap.size();
                    int i10 = this.V;
                    if (size >= i10) {
                        S(LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i10, new Object[0])));
                        return false;
                    }
                }
                if ((!this.d0 || M(ikVar.f)) && ikVar.f.length() != 0) {
                    boolean z13 = viVar.T0;
                    hashMap.put(absolutePath, ikVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.U = false;
            if (viVar.H) {
                if (view instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) view).b(z10, true);
                }
                viVar.V1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.Q != null && !this.K) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((MessageObject) hashMap2.get((org.telegram.ui.p10) it.next()));
                }
                this.Q.k(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void Q() {
        View m10;
        hk hkVar = this.w;
        hkVar.d.clear();
        ArrayList arrayList = hkVar.d;
        hk hkVar2 = this.v;
        arrayList.addAll(hkVar2.d);
        ArrayList arrayList2 = hkVar.c;
        arrayList2.clear();
        arrayList2.addAll(hkVar2.c);
        ArrayList arrayList3 = hkVar.e;
        arrayList3.clear();
        arrayList3.addAll(hkVar2.e);
        hkVar.l();
        dk dkVar = this.s;
        dkVar.setVisibility(0);
        dk dkVar2 = this.r;
        dkVar.setPadding(dkVar2.getPaddingLeft(), dkVar2.getPaddingTop(), dkVar2.getPaddingRight(), dkVar2.getPaddingBottom());
        ig.e0 e0Var = this.E;
        int L0 = e0Var.L0();
        if (L0 < 0 || (m10 = e0Var.m(L0)) == null) {
            return;
        }
        this.x.h1(L0, m10.getTop() - dkVar.getPaddingTop());
    }

    public final void R(int i10) {
        dk dkVar;
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
            dkVar = this.r;
            if (i12 >= childCount) {
                i12 = 0;
                break;
            } else if (getChildAt(i12) == dkVar) {
                break;
            } else {
                i12++;
            }
        }
        dk dkVar2 = this.s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            dkVar2.setAlpha(1.0f);
            dkVar2.setScaleX(1.0f);
            dkVar2.setScaleY(1.0f);
            dkVar2.setTranslationX(0.0f);
            removeView(dkVar2);
            addView(dkVar2, i12);
            dkVar2.setVisibility(0);
            dkVar.setTranslationX(dp);
            dkVar.setAlpha(0.0f);
            this.f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            dkVar.setAlpha(0.0f);
            dkVar.setScaleX(0.95f);
            dkVar.setScaleY(0.95f);
            dkVar2.setScaleX(1.0f);
            dkVar2.setScaleY(1.0f);
            dkVar2.setTranslationX(0.0f);
            dkVar2.setAlpha(1.0f);
            removeView(dkVar2);
            addView(dkVar2, i12 + 1);
            dkVar2.setVisibility(0);
            this.f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f0.addUpdateListener(new ak(this, i10, dp, i11));
        this.f0.addListener(new j6(this, 10));
        if (i10 == 1) {
            this.f0.setDuration(220L);
        } else {
            this.f0.setDuration(200L);
        }
        this.f0.setInterpolator(pr.f);
        this.f0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = str;
        i2.g.B(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        s4.h0 adapter = this.r.getAdapter();
        boolean z10 = true;
        nk nkVar = this.y;
        if (adapter != nkVar ? this.v.h() != 1 : !nkVar.s.isEmpty() || !nkVar.P.isEmpty()) {
            z10 = false;
        }
        this.L.setVisibility(z10 ? 0 : 8);
        U();
    }

    public final void U() {
        View childAt;
        bi.m6 m6Var = this.L;
        if (m6Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = m6Var.getTranslationY();
            this.M = (childAt.getTop() + (m6Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            m6Var.setTranslationY(translationY);
        }
    }

    public final void V() {
        org.telegram.ui.ActionBar.v0 v0Var = this.F;
        if (v0Var == null || v0Var.s()) {
            return;
        }
        v0Var.setVisibility((this.N || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.ni
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        dk dkVar = this.r;
        if (dkVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = dkVar.getChildAt(0);
        vk0 vk0Var = (vk0) dkVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || vk0Var == null || vk0Var.b() != 0) {
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
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.j5));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        dk dkVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 40, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(dkVar, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ni
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean i() {
        hk hkVar = this.v;
        if (hkVar.d.size() <= 0) {
            return false;
        }
        Q();
        gk gkVar = (gk) i2.g.z(1, hkVar.d);
        this.b.X0.setTitle(gkVar.b);
        int topForScroll = getTopForScroll();
        File file = gkVar.a;
        if (file != null) {
            N(file);
        } else {
            O();
        }
        V();
        this.E.h1(0, topForScroll);
        R(2);
        return true;
    }

    @Override // org.telegram.ui.Components.ni
    public final void m() {
        try {
            if (this.P) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.e0);
                this.P = false;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.b.X0.h(true);
        org.telegram.ui.ActionBar.z n10 = this.b.X0.n();
        n10.removeView(this.G);
        n10.removeView(this.F);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        U();
    }

    @Override // org.telegram.ui.Components.ni
    public final void r() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(fk fkVar) {
        this.Q = fkVar;
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
    public final void t(int i10) {
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.c0 = SharedConfig.sortFilesByName;
            hk hkVar = this.v;
            Collections.sort(hkVar.e, new bk(this, 1));
            if (this.O != null) {
                Collections.sort(hkVar.c, new bk(this, 0));
            }
            hkVar.l();
            this.G.setIcon(this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.ni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        vi viVar = this.b;
        if (viVar.X0.n0 || viVar.r1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.r.n1(0, dp + AndroidUtilities.statusBarHeight, 0, this.e);
        ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }
}
