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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class pk extends oi {
    public static final /* synthetic */ int g0 = 0;
    public final hg.g0 E;
    public final org.telegram.ui.ActionBar.u0 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final gg.s0 H;
    public AnimatorSet I;
    public final u00 J;
    public boolean K;
    public final ai.d7 L;
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
    public final androidx.mediarouter.app.g e0;
    public ValueAnimator f0;
    public int n;
    public final ek r;
    public final ek s;
    public final ik v;
    public final ik w;
    public final qz x;
    public final ok y;

    public pk(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        Cursor cursor;
        this.P = false;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.V = -1;
        this.e0 = new androidx.mediarouter.app.g(this, 7);
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
                            long j3 = query.getLong(2);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * MediaDataController.MAX_STYLE_RUNS_COUNT) {
                                try {
                                    if (j10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
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
                L(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
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
        org.telegram.ui.ActionBar.y n10 = this.b.X0.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Vd, this.a));
        org.telegram.ui.ActionBar.u0 a10 = n10.a(6, this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        u00 u00Var = new u00(context, d6Var);
        this.J = u00Var;
        addView(u00Var);
        ai.d7 d7Var = new ai.d7(this, context, u00Var, d6Var);
        this.L = d7Var;
        addView(d7Var, w7.y5.c(-1.0f, -1));
        d7Var.setVisibility(8);
        d7Var.setOnTouchListener(new bi.d(14));
        ek ekVar = new ek(this, context, d6Var, 0);
        this.s = ekVar;
        ekVar.setSectionsType(2);
        ekVar.setVerticalScrollBarEnabled(false);
        qz qzVar = new qz(AndroidUtilities.dp(56.0f), 0, ekVar);
        this.x = qzVar;
        ekVar.setLayoutManager(qzVar);
        ekVar.setClipToPadding(false);
        ik ikVar2 = new ik(this, context);
        this.w = ikVar2;
        ekVar.setAdapter(ikVar2);
        addView(ekVar, w7.y5.c(-1.0f, -1));
        ekVar.setVisibility(8);
        ek ekVar2 = new ek(this, context, d6Var, 1);
        this.r = ekVar2;
        ekVar2.p1();
        this.c = ekVar2;
        this.d = ekVar2;
        this.h = true;
        this.f = true;
        ekVar2.setSectionsType(2);
        ekVar2.setVerticalScrollBarEnabled(false);
        hg.g0 g0Var = new hg.g0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, ekVar2, 2);
        this.E = g0Var;
        ekVar2.setLayoutManager(g0Var);
        ekVar2.setClipToPadding(false);
        ekVar2.setAdapter(this.v);
        addView(ekVar2, w7.y5.c(-1.0f, -1));
        this.y = new ok(this, context);
        ekVar2.setOnScrollListener(new ai.r(this, 19));
        final int i12 = 0;
        ekVar2.setOnItemClickListener(new kl0(this) { // from class: org.telegram.ui.Components.ak
            public final /* synthetic */ pk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.kl0
            public final void d(int i13, View view) {
                switch (i12) {
                    case 0:
                        pk.K(this.b, view, i13);
                        break;
                    default:
                        pk pkVar = this.b;
                        gg.s0 s0Var = pkVar.H;
                        s0Var.I0(true);
                        ok okVar = pkVar.y;
                        ArrayList arrayList = s0Var.X2;
                        gg.q0 q0Var = arrayList.isEmpty() ? gg.s0.c3[i13] : (gg.q0) arrayList.get(i13);
                        wi wiVar2 = okVar.X.b;
                        ArrayList arrayList2 = okVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((gg.q0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        wiVar2.X0.setSearchFilter(q0Var);
                        wiVar2.X0.setSearchFieldText("");
                        okVar.a0(null, null, true);
                        break;
                }
            }
        });
        ekVar2.setOnItemLongClickListener(new s(this, 20));
        gg.s0 s0Var = new gg.s0(context, d6Var);
        this.H = s0Var;
        final int i13 = 1;
        s0Var.setOnItemClickListener(new kl0(this) { // from class: org.telegram.ui.Components.ak
            public final /* synthetic */ pk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.kl0
            public final void d(int i132, View view) {
                switch (i13) {
                    case 0:
                        pk.K(this.b, view, i132);
                        break;
                    default:
                        pk pkVar = this.b;
                        gg.s0 s0Var2 = pkVar.H;
                        s0Var2.I0(true);
                        ok okVar = pkVar.y;
                        ArrayList arrayList = s0Var2.X2;
                        gg.q0 q0Var = arrayList.isEmpty() ? gg.s0.c3[i132] : (gg.q0) arrayList.get(i132);
                        wi wiVar2 = okVar.X.b;
                        ArrayList arrayList2 = okVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (q0Var.b((gg.q0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(q0Var);
                        wiVar2.X0.setSearchFilter(q0Var);
                        wiVar2.X0.setSearchFieldText("");
                        okVar.a0(null, null, true);
                        break;
                }
            }
        });
        s0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, this.a));
        addView(s0Var, w7.y5.e(-1, 44, 48));
        s0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        s0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void K(pk pkVar, View view, int i10) {
        Object O;
        int i11;
        wi wiVar = pkVar.b;
        ek ekVar = pkVar.r;
        s4.h0 adapter = ekVar.getAdapter();
        ik ikVar = pkVar.v;
        if (adapter == ikVar) {
            O = ikVar.E(i10);
        } else {
            ok okVar = pkVar.y;
            O = okVar.O(okVar.S(i10), okVar.Q(i10));
        }
        if (!(O instanceof jk)) {
            pkVar.P(view, O);
            return;
        }
        jk jkVar = (jk) O;
        File file = jkVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = jkVar.a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !isExternalStorageManager)) {
            pkVar.Q.w();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                pkVar.P(view, jkVar);
                return;
            }
            hk hkVar = new hk();
            View childAt = ekVar.getChildAt(0);
            s4.c1 G = ekVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                hkVar.a = pkVar.O;
                hkVar.b = wiVar.X0.getTitle();
                pkVar.Q();
                ikVar.d.add(hkVar);
                if (!pkVar.N(file)) {
                    ikVar.d.remove(hkVar);
                    return;
                } else {
                    pkVar.R(1);
                    wiVar.X0.setTitle(jkVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = jkVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.m2 m2Var = wiVar.f0;
            org.telegram.ui.wn wnVar = m2Var instanceof org.telegram.ui.wn ? (org.telegram.ui.wn) m2Var : null;
            org.telegram.ui.tq0 tq0Var = new org.telegram.ui.tq0(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, wnVar != null, wnVar, false);
            tq0Var.l0 = true;
            tq0Var.s0 = new la.h(pkVar, hashMap, arrayList, false, 15);
            tq0Var.f0(pkVar.V, false);
            org.telegram.ui.ActionBar.m2 m2Var2 = wiVar.f0;
            if (m2Var2 != null) {
                m2Var2.presentFragment(tq0Var);
            } else {
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(tq0Var);
                }
            }
            wiVar.dismiss(true);
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
        pkVar.Q();
        hk hkVar2 = (hk) hg.c.x(1, ikVar.d);
        wiVar.X0.setTitle(hkVar2.b);
        File file2 = hkVar2.a;
        if (file2 != null) {
            pkVar.N(file2);
        } else {
            pkVar.O();
        }
        pkVar.V();
        pkVar.E.h1(0, topForScroll);
        pkVar.R(2);
    }

    private int getTopForScroll() {
        ek ekVar = this.r;
        View childAt = ekVar.getChildAt(0);
        s4.c1 G = ekVar.G(childAt);
        int i10 = -ekVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    @Override // org.telegram.ui.Components.oi
    public final void E(oi oiVar) {
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

    @Override // org.telegram.ui.Components.oi
    public final void G() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.oi
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) hashMap.get((org.telegram.ui.l10) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        wi wiVar = this.b;
        CharSequence[] charSequenceArr = {wiVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(wiVar.J1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return e5.b0(wiVar.J1, wiVar.n1(), wiVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() { // from class: org.telegram.ui.Components.dk
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                pk pkVar = pk.this;
                pkVar.K = true;
                pkVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                pkVar.b.dismiss(true);
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
        ek ekVar = this.r;
        ik ikVar = this.v;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                S(LocaleController.getString(R.string.AccessError));
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
                S(LocaleController.getString(R.string.UnknownError));
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
                File file3 = ((hk) hg.c.g(1, arrayList2)).a;
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
            V();
            AndroidUtilities.clearDrawableAnimation(ekVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            ikVar.l();
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
        wi wiVar;
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
        if (!this.d0 && ((wiVar = this.b) == null || !wiVar.H)) {
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P(View view, Object obj) {
        boolean z10;
        boolean z11 = obj instanceof jk;
        ArrayList arrayList = this.S;
        wi wiVar = this.b;
        HashMap hashMap = this.R;
        HashMap hashMap2 = this.T;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.l10 l10Var = new org.telegram.ui.l10(messageObject.getId(), messageObject.getDialogId());
                if (hashMap2.containsKey(l10Var)) {
                    hashMap2.remove(l10Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(l10Var, messageObject);
                    z12 = true;
                }
                z10 = z12;
                if (wiVar.H) {
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
                    S(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.W && jkVar.e == null) {
                    S(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((jkVar.f.length() > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || jkVar.f.length() > 4194304000L) {
                    rg.j0 j0Var = new rg.j0(6, UserConfig.selectedAccount, wiVar.getContainer().getContext(), wiVar.f0, null);
                    j0Var.N0 = true;
                    j0Var.L1();
                    j0Var.show();
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
                if ((!this.d0 || M(jkVar.f)) && jkVar.f.length() != 0) {
                    boolean z13 = wiVar.T0;
                    hashMap.put(absolutePath, jkVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.U = false;
            if (wiVar.H) {
                if (view instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) view).b(z10, true);
                }
                wiVar.V1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.Q != null && !this.K) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((MessageObject) hashMap2.get((org.telegram.ui.l10) it.next()));
                }
                this.Q.k(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void Q() {
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
        hg.g0 g0Var = this.E;
        int L0 = g0Var.L0();
        if (L0 < 0 || (m10 = g0Var.m(L0)) == null) {
            return;
        }
        this.x.h1(L0, m10.getTop() - ekVar.getPaddingTop());
    }

    public final void R(int i10) {
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
        this.f0.addListener(new r8(this, 7));
        if (i10 == 1) {
            this.f0.setDuration(220L);
        } else {
            this.f0.setDuration(200L);
        }
        this.f0.setInterpolator(rr.f);
        this.f0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        a2Var.T = str;
        org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        s4.h0 adapter = this.r.getAdapter();
        boolean z10 = true;
        ok okVar = this.y;
        if (adapter != okVar ? this.v.h() != 1 : !okVar.s.isEmpty() || !okVar.P.isEmpty()) {
            z10 = false;
        }
        this.L.setVisibility(z10 ? 0 : 8);
        U();
    }

    public final void U() {
        View childAt;
        ai.d7 d7Var = this.L;
        if (d7Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = d7Var.getTranslationY();
            this.M = (childAt.getTop() + (d7Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            d7Var.setTranslationY(translationY);
        }
    }

    public final void V() {
        org.telegram.ui.ActionBar.u0 u0Var = this.F;
        if (u0Var == null || u0Var.s()) {
            return;
        }
        u0Var.setVisibility((this.N || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.oi
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.oi
    public int getCurrentItemTop() {
        ek ekVar = this.r;
        if (ekVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = ekVar.getChildAt(0);
        gl0 gl0Var = (gl0) ekVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && gl0Var != null && gl0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || gl0Var == null || gl0Var.b() != 0) {
            y3 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y3;
    }

    @Override // org.telegram.ui.Components.oi
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.oi
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.oi
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override // org.telegram.ui.Components.oi
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.j5));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ek ekVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 40, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ekVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.oi
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.oi
    public final boolean i() {
        ik ikVar = this.v;
        if (ikVar.d.size() <= 0) {
            return false;
        }
        Q();
        hk hkVar = (hk) hg.c.x(1, ikVar.d);
        this.b.X0.setTitle(hkVar.b);
        int topForScroll = getTopForScroll();
        File file = hkVar.a;
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

    @Override // org.telegram.ui.Components.oi
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
        org.telegram.ui.ActionBar.y n10 = this.b.X0.n();
        n10.removeView(this.G);
        n10.removeView(this.F);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        U();
    }

    @Override // org.telegram.ui.Components.oi
    public final void r() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
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

    @Override // org.telegram.ui.Components.oi
    public final void t(int i10) {
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.oi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        wi wiVar = this.b;
        if (wiVar.X0.n0 || wiVar.r1.R() > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(56.0f);
            wiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(1.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    wiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(1.0f);
            if (dp < 0) {
            }
            wiVar.setAllowNestedScroll(true);
        }
        this.r.o1(0, dp + AndroidUtilities.statusBarHeight, 0, this.e);
        ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.oi
    public final void z() {
        ik ikVar = this.v;
        if (ikVar != null) {
            ikVar.l();
        }
        ok okVar = this.y;
        if (okVar != null) {
            okVar.l();
        }
    }
}
