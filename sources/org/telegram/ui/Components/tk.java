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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tk extends qi {
    public static final /* synthetic */ int g0 = 0;
    public final gg.j0 E;
    public final org.telegram.ui.ActionBar.w0 F;
    public final org.telegram.ui.ActionBar.w0 G;
    public final fg.s0 H;
    public AnimatorSet I;
    public final a10 J;
    public boolean K;
    public final hk L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public kk Q;
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
    public final ik r;
    public final ik s;
    public final mk v;
    public final mk w;
    public final wz x;
    public final sk y;

    public tk(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar) {
        super(context, f6Var, yiVar);
        Cursor cursor;
        this.P = false;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.V = -1;
        this.e0 = new androidx.mediarouter.app.g(this, 7);
        mk mkVar = new mk(this, context);
        this.v = mkVar;
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
                                        nk nkVar = new nk();
                                        nkVar.b = file.getName();
                                        nkVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        nkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        nkVar.c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            nkVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(nkVar);
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
                L(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(mkVar.e, new ek(this, 1));
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
        org.telegram.ui.ActionBar.z n10 = this.b.X0.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, this.a));
        org.telegram.ui.ActionBar.w0 a10 = n10.a(6, this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        a10 a10Var = new a10(context, f6Var);
        this.J = a10Var;
        addView(a10Var);
        hk hkVar = new hk(this, context, a10Var, f6Var);
        this.L = hkVar;
        addView(hkVar, w7.a6.c(-1.0f, -1));
        hkVar.setVisibility(8);
        hkVar.setOnTouchListener(new ai.h(14));
        ik ikVar = new ik(this, context, f6Var, 0);
        this.s = ikVar;
        ikVar.setSectionsType(2);
        ikVar.setVerticalScrollBarEnabled(false);
        wz wzVar = new wz(AndroidUtilities.dp(56.0f), 0, ikVar);
        this.x = wzVar;
        ikVar.setLayoutManager(wzVar);
        ikVar.setClipToPadding(false);
        mk mkVar2 = new mk(this, context);
        this.w = mkVar2;
        ikVar.setAdapter(mkVar2);
        addView(ikVar, w7.a6.c(-1.0f, -1));
        ikVar.setVisibility(8);
        ik ikVar2 = new ik(this, context, f6Var, 1);
        this.r = ikVar2;
        ikVar2.o1();
        this.c = ikVar2;
        this.d = ikVar2;
        this.h = true;
        this.f = true;
        ikVar2.setSectionsType(2);
        ikVar2.setVerticalScrollBarEnabled(false);
        gg.j0 j0Var = new gg.j0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, ikVar2, 2);
        this.E = j0Var;
        ikVar2.setLayoutManager(j0Var);
        ikVar2.setClipToPadding(false);
        ikVar2.setAdapter(this.v);
        addView(ikVar2, w7.a6.c(-1.0f, -1));
        this.y = new sk(this, context);
        ikVar2.setOnScrollListener(new bi.a2(this, 17));
        final int i12 = 0;
        ikVar2.setOnItemClickListener(new jl0(this) { // from class: org.telegram.ui.Components.ck
            public final /* synthetic */ tk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.jl0
            public final void d(int i13, View view) {
                switch (i12) {
                    case 0:
                        tk.K(this.b, view, i13);
                        break;
                    default:
                        tk tkVar = this.b;
                        fg.s0 s0Var = tkVar.H;
                        s0Var.I0(true);
                        sk skVar = tkVar.y;
                        ArrayList arrayList = s0Var.X2;
                        fg.q0 q0Var = arrayList.isEmpty() ? fg.s0.c3[i13] : (fg.q0) arrayList.get(i13);
                        yi yiVar2 = skVar.X.b;
                        ArrayList arrayList2 = skVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((fg.q0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        yiVar2.X0.setSearchFilter(q0Var);
                        yiVar2.X0.setSearchFieldText("");
                        skVar.a0(null, null, true);
                        break;
                }
            }
        });
        ikVar2.setOnItemLongClickListener(new t(this, 20));
        fg.s0 s0Var = new fg.s0(context, f6Var);
        this.H = s0Var;
        final int i13 = 1;
        s0Var.setOnItemClickListener(new jl0(this) { // from class: org.telegram.ui.Components.ck
            public final /* synthetic */ tk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.jl0
            public final void d(int i132, View view) {
                switch (i13) {
                    case 0:
                        tk.K(this.b, view, i132);
                        break;
                    default:
                        tk tkVar = this.b;
                        fg.s0 s0Var2 = tkVar.H;
                        s0Var2.I0(true);
                        sk skVar = tkVar.y;
                        ArrayList arrayList = s0Var2.X2;
                        fg.q0 q0Var = arrayList.isEmpty() ? fg.s0.c3[i132] : (fg.q0) arrayList.get(i132);
                        yi yiVar2 = skVar.X.b;
                        ArrayList arrayList2 = skVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((fg.q0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        yiVar2.X0.setSearchFilter(q0Var);
                        yiVar2.X0.setSearchFieldText("");
                        skVar.a0(null, null, true);
                        break;
                }
            }
        });
        s0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, this.a));
        addView(s0Var, w7.a6.e(-1, 44, 48));
        s0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        s0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void K(tk tkVar, View view, int i10) {
        Object O;
        int i11;
        yi yiVar = tkVar.b;
        ik ikVar = tkVar.r;
        s4.h0 adapter = ikVar.getAdapter();
        mk mkVar = tkVar.v;
        if (adapter == mkVar) {
            O = mkVar.E(i10);
        } else {
            sk skVar = tkVar.y;
            O = skVar.O(skVar.S(i10), skVar.Q(i10));
        }
        if (!(O instanceof nk)) {
            tkVar.P(view, O);
            return;
        }
        nk nkVar = (nk) O;
        File file = nkVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = nkVar.a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !isExternalStorageManager)) {
            tkVar.Q.w();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                tkVar.P(view, nkVar);
                return;
            }
            lk lkVar = new lk();
            View childAt = ikVar.getChildAt(0);
            s4.c1 G = ikVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                lkVar.a = tkVar.O;
                lkVar.b = yiVar.X0.getTitle();
                tkVar.Q();
                mkVar.d.add(lkVar);
                if (!tkVar.N(file)) {
                    mkVar.d.remove(lkVar);
                    return;
                } else {
                    tkVar.R(1);
                    yiVar.X0.setTitle(nkVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = nkVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
            org.telegram.ui.eo eoVar = p2Var instanceof org.telegram.ui.eo ? (org.telegram.ui.eo) p2Var : null;
            org.telegram.ui.br0 br0Var = new org.telegram.ui.br0(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, eoVar != null, eoVar, false);
            br0Var.l0 = true;
            br0Var.s0 = new m.e3(tkVar, hashMap, arrayList, false, 12);
            br0Var.f0(tkVar.V, false);
            org.telegram.ui.ActionBar.p2 p2Var2 = yiVar.f0;
            if (p2Var2 != null) {
                p2Var2.presentFragment(br0Var);
            } else {
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(br0Var);
                }
            }
            yiVar.dismiss(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            kk kkVar = tkVar.Q;
            if (kkVar != null) {
                kkVar.O();
                return;
            }
            return;
        }
        int topForScroll = tkVar.getTopForScroll();
        tkVar.Q();
        lk lkVar2 = (lk) hc.b.z(1, mkVar.d);
        yiVar.X0.setTitle(lkVar2.b);
        File file2 = lkVar2.a;
        if (file2 != null) {
            tkVar.N(file2);
        } else {
            tkVar.O();
        }
        tkVar.V();
        tkVar.E.h1(0, topForScroll);
        tkVar.R(2);
    }

    private int getTopForScroll() {
        ik ikVar = this.r;
        View childAt = ikVar.getChildAt(0);
        s4.c1 G = ikVar.G(childAt);
        int i10 = -ikVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    @Override // org.telegram.ui.Components.qi
    public final void D(qi qiVar) {
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

    @Override // org.telegram.ui.Components.qi
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) hashMap.get((org.telegram.ui.r10) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        yi yiVar = this.b;
        CharSequence[] charSequenceArr = {yiVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(yiVar.J1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return d5.b0(yiVar.J1, yiVar.n1(), yiVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() { // from class: org.telegram.ui.Components.fk
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                tk tkVar = tk.this;
                tkVar.K = true;
                tkVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                tkVar.b.dismiss(true);
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
                    nk nkVar = new nk();
                    nkVar.b = file2.getName();
                    nkVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    nkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    nkVar.c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        nkVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(nkVar);
                }
            }
        }
    }

    public final boolean M(File file) {
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !tf.c.i.contains(mimeTypeFromExtension)) {
            new wc(this.b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            new wc(this.b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
        new wc(this.b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
        return false;
    }

    public final boolean N(File file) {
        this.N = false;
        boolean canRead = file.canRead();
        ik ikVar = this.r;
        mk mkVar = this.v;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                S(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.O = file;
            mkVar.c.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(ikVar);
            this.U = true;
            mkVar.l();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                S(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.O = file;
            ArrayList arrayList = mkVar.c;
            ArrayList arrayList2 = mkVar.d;
            ArrayList arrayList3 = mkVar.c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    nk nkVar = new nk();
                    nkVar.b = file2.getName();
                    nkVar.f = file2;
                    if (file2.isDirectory()) {
                        nkVar.a = R.drawable.files_folder;
                        nkVar.c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        nkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        nkVar.c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            nkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(nkVar);
                }
            }
            nk nkVar2 = new nk();
            nkVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((lk) hc.b.i(1, arrayList2)).a;
                if (file3 == null) {
                    nkVar2.c = LocaleController.getString(R.string.Folder);
                } else {
                    nkVar2.c = file3.toString();
                }
            } else {
                nkVar2.c = LocaleController.getString(R.string.Folder);
            }
            nkVar2.a = R.drawable.files_folder;
            nkVar2.f = null;
            arrayList3.add(0, nkVar2);
            if (this.O != null) {
                Collections.sort(mkVar.c, new ek(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(ikVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            mkVar.l();
            this.E.h1(0, topForScroll);
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
            nk nkVar = new nk();
            if (Environment.isExternalStorageRemovable()) {
                nkVar.b = LocaleController.getString(R.string.SdCard);
                nkVar.a = R.drawable.files_internal;
                nkVar.c = LocaleController.getString(R.string.ExternalFolderInfo);
            } else {
                nkVar.b = LocaleController.getString(R.string.InternalStorage);
                nkVar.a = R.drawable.files_storage;
                nkVar.c = LocaleController.getString(R.string.InternalFolderInfo);
            }
            nkVar.f = Environment.getExternalStorageDirectory();
            this.v.c.add(nkVar);
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
                                nk nkVar2 = new nk();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    nkVar2.b = LocaleController.getString(R.string.SdCard);
                                } else {
                                    nkVar2.b = LocaleController.getString(R.string.ExternalStorage);
                                }
                                nkVar2.c = LocaleController.getString(R.string.ExternalFolderInfo);
                                nkVar2.a = R.drawable.files_internal;
                                nkVar2.f = new File(nextToken);
                                this.v.c.add(nkVar2);
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
                nk nkVar3 = new nk();
                nkVar3.b = "Telegram";
                nkVar3.c = LocaleController.getString(R.string.AppFolderInfo);
                nkVar3.a = R.drawable.files_folder;
                nkVar3.f = file;
                this.v.c.add(nkVar3);
            }
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        if (!this.d0 && ((yiVar = this.b) == null || !yiVar.H)) {
            nk nkVar4 = new nk();
            nkVar4.b = LocaleController.getString(R.string.Gallery);
            nkVar4.c = LocaleController.getString(R.string.GalleryInfo);
            nkVar4.a = R.drawable.files_gallery;
            nkVar4.f = null;
            this.v.c.add(nkVar4);
        }
        if (this.a0) {
            nk nkVar5 = new nk();
            nkVar5.b = LocaleController.getString(R.string.AttachMusic);
            nkVar5.c = LocaleController.getString(R.string.MusicInfo);
            nkVar5.a = R.drawable.files_music;
            nkVar5.f = null;
            this.v.c.add(nkVar5);
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
        boolean z11 = obj instanceof nk;
        ArrayList arrayList = this.S;
        yi yiVar = this.b;
        HashMap hashMap = this.R;
        HashMap hashMap2 = this.T;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.r10 r10Var = new org.telegram.ui.r10(messageObject.getId(), messageObject.getDialogId());
                if (hashMap2.containsKey(r10Var)) {
                    hashMap2.remove(r10Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(r10Var, messageObject);
                    z12 = true;
                }
                z10 = z12;
                if (yiVar.H) {
                }
            }
            return false;
        }
        nk nkVar = (nk) obj;
        File file = nkVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = nkVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!nkVar.f.canRead()) {
                    S(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.W && nkVar.e == null) {
                    S(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((nkVar.f.length() > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || nkVar.f.length() > 4194304000L) {
                    qg.k0 k0Var = new qg.k0(6, UserConfig.selectedAccount, yiVar.getContainer().getContext(), yiVar.f0, null);
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
                if ((!this.d0 || M(nkVar.f)) && nkVar.f.length() != 0) {
                    boolean z13 = yiVar.T0;
                    hashMap.put(absolutePath, nkVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.U = false;
            if (yiVar.H) {
                if (view instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) view).b(z10, true);
                }
                yiVar.V1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.Q != null && !this.K) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((MessageObject) hashMap2.get((org.telegram.ui.r10) it.next()));
                }
                this.Q.k(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void Q() {
        View m10;
        mk mkVar = this.w;
        mkVar.d.clear();
        ArrayList arrayList = mkVar.d;
        mk mkVar2 = this.v;
        arrayList.addAll(mkVar2.d);
        ArrayList arrayList2 = mkVar.c;
        arrayList2.clear();
        arrayList2.addAll(mkVar2.c);
        ArrayList arrayList3 = mkVar.e;
        arrayList3.clear();
        arrayList3.addAll(mkVar2.e);
        mkVar.l();
        ik ikVar = this.s;
        ikVar.setVisibility(0);
        ik ikVar2 = this.r;
        ikVar.setPadding(ikVar2.getPaddingLeft(), ikVar2.getPaddingTop(), ikVar2.getPaddingRight(), ikVar2.getPaddingBottom());
        gg.j0 j0Var = this.E;
        int L0 = j0Var.L0();
        if (L0 < 0 || (m10 = j0Var.m(L0)) == null) {
            return;
        }
        this.x.h1(L0, m10.getTop() - ikVar.getPaddingTop());
    }

    public final void R(int i10) {
        ik ikVar;
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
            ikVar = this.r;
            if (i12 >= childCount) {
                i12 = 0;
                break;
            } else if (getChildAt(i12) == ikVar) {
                break;
            } else {
                i12++;
            }
        }
        ik ikVar2 = this.s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            ikVar2.setAlpha(1.0f);
            ikVar2.setScaleX(1.0f);
            ikVar2.setScaleY(1.0f);
            ikVar2.setTranslationX(0.0f);
            removeView(ikVar2);
            addView(ikVar2, i12);
            ikVar2.setVisibility(0);
            ikVar.setTranslationX(dp);
            ikVar.setAlpha(0.0f);
            this.f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            ikVar.setAlpha(0.0f);
            ikVar.setScaleX(0.95f);
            ikVar.setScaleY(0.95f);
            ikVar2.setScaleX(1.0f);
            ikVar2.setScaleY(1.0f);
            ikVar2.setTranslationX(0.0f);
            ikVar2.setAlpha(1.0f);
            removeView(ikVar2);
            addView(ikVar2, i12 + 1);
            ikVar2.setVisibility(0);
            this.f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f0.addUpdateListener(new dk(this, i10, dp, i11));
        this.f0.addListener(new org.telegram.ui.Cells.v5(this, 27));
        if (i10 == 1) {
            this.f0.setDuration(220L);
        } else {
            this.f0.setDuration(200L);
        }
        this.f0.setInterpolator(wr.f);
        this.f0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        d2Var.T = str;
        hc.b.A(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        s4.h0 adapter = this.r.getAdapter();
        boolean z10 = true;
        sk skVar = this.y;
        if (adapter != skVar ? this.v.h() != 1 : !skVar.s.isEmpty() || !skVar.P.isEmpty()) {
            z10 = false;
        }
        this.L.setVisibility(z10 ? 0 : 8);
        U();
    }

    public final void U() {
        View childAt;
        hk hkVar = this.L;
        if (hkVar.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = hkVar.getTranslationY();
            this.M = (childAt.getTop() + (hkVar.getMeasuredHeight() - getMeasuredHeight())) / 2;
            hkVar.setTranslationY(translationY);
        }
    }

    public final void V() {
        org.telegram.ui.ActionBar.w0 w0Var = this.F;
        if (w0Var == null || w0Var.s()) {
            return;
        }
        w0Var.setVisibility((this.N || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.qi
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.qi
    public int getCurrentItemTop() {
        ik ikVar = this.r;
        if (ikVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = ikVar.getChildAt(0);
        fl0 fl0Var = (fl0) ikVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || fl0Var == null || fl0Var.b() != 0) {
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
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.j5));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        ik ikVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 48, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 40, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ikVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.qi
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean i() {
        mk mkVar = this.v;
        if (mkVar.d.size() <= 0) {
            return false;
        }
        Q();
        lk lkVar = (lk) hc.b.z(1, mkVar.d);
        this.b.X0.setTitle(lkVar.b);
        int topForScroll = getTopForScroll();
        File file = lkVar.a;
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

    @Override // org.telegram.ui.Components.qi
    public final void m() {
        try {
            if (this.P) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
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

    @Override // org.telegram.ui.Components.qi
    public final void r() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(kk kkVar) {
        this.Q = kkVar;
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
    public final void t(int i10) {
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.c0 = SharedConfig.sortFilesByName;
            mk mkVar = this.v;
            Collections.sort(mkVar.e, new ek(this, 1));
            if (this.O != null) {
                Collections.sort(mkVar.c, new ek(this, 0));
            }
            mkVar.l();
            this.G.setIcon(this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.qi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        yi yiVar = this.b;
        if (yiVar.X0.n0 || yiVar.r1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.r.n1(0, dp + AndroidUtilities.statusBarHeight, 0, this.e);
        ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.qi
    public final void z() {
        mk mkVar = this.v;
        if (mkVar != null) {
            mkVar.l();
        }
        sk skVar = this.y;
        if (skVar != null) {
            skVar.l();
        }
    }
}
