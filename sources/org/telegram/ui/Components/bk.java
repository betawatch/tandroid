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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bk extends yh {
    public static final /* synthetic */ int c0 = 0;
    public final zi A;
    public final org.telegram.ui.ActionBar.v0 B;
    public final org.telegram.ui.ActionBar.v0 C;
    public final pf.g0 D;
    public AnimatorSet E;
    public final h00 F;
    public boolean G;
    public final jh.x4 H;
    public float I;
    public boolean J;
    public File K;
    public boolean L;
    public sj M;
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
    public final androidx.mediarouter.app.f a0;
    public ValueAnimator b0;
    public int n;
    public final qj r;
    public final qj s;
    public final uj v;
    public final uj w;
    public final dz x;
    public final ak y;

    public bk(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, gi giVar) {
        super(context, c6Var, giVar);
        Cursor cursor;
        this.L = false;
        this.N = new HashMap();
        this.O = new ArrayList();
        this.P = new HashMap();
        this.R = -1;
        this.a0 = new androidx.mediarouter.app.f(this, 7);
        uj ujVar = new uj(this, context);
        this.v = ujVar;
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
                                        vj vjVar = new vj();
                                        vjVar.b = file.getName();
                                        vjVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        vjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        vjVar.c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            vjVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(vjVar);
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
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            } else {
                L(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(ujVar.e, new oj(this, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
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
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.db(this, 4);
        this.B = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vd, this.a));
        org.telegram.ui.ActionBar.v0 a3 = n10.a(6, this.V ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.C = a3;
        a3.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        h00 h00Var = new h00(context, c6Var);
        this.F = h00Var;
        addView(h00Var);
        jh.x4 x4Var = new jh.x4(this, context, h00Var, c6Var);
        this.H = x4Var;
        addView(x4Var, h7.z5.c(-1.0f, -1));
        x4Var.setVisibility(8);
        x4Var.setOnTouchListener(new kh.e(14));
        qj qjVar = new qj(this, context, c6Var, 0);
        this.s = qjVar;
        qjVar.setSectionsType(2);
        qjVar.setVerticalScrollBarEnabled(false);
        dz dzVar = new dz(AndroidUtilities.dp(56.0f), 0, qjVar);
        this.x = dzVar;
        qjVar.setLayoutManager(dzVar);
        qjVar.setClipToPadding(false);
        uj ujVar2 = new uj(this, context);
        this.w = ujVar2;
        qjVar.setAdapter(ujVar2);
        addView(qjVar, h7.z5.c(-1.0f, -1));
        qjVar.setVisibility(8);
        qj qjVar2 = new qj(this, context, c6Var, 1);
        this.r = qjVar2;
        qjVar2.p1();
        this.c = qjVar2;
        this.d = qjVar2;
        this.h = true;
        this.f = true;
        qjVar2.setSectionsType(2);
        qjVar2.setVerticalScrollBarEnabled(false);
        zi ziVar = new zi(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, qjVar2, 1);
        this.A = ziVar;
        qjVar2.setLayoutManager(ziVar);
        qjVar2.setClipToPadding(false);
        qjVar2.setAdapter(this.v);
        addView(qjVar2, h7.z5.c(-1.0f, -1));
        this.y = new ak(this, context);
        qjVar2.setOnScrollListener(new ag.z2(this, 27));
        final int i12 = 0;
        qjVar2.setOnItemClickListener(new pk0(this) { // from class: org.telegram.ui.Components.mj
            public final /* synthetic */ bk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.pk0
            public final void a(int i13, View view) {
                switch (i12) {
                    case 0:
                        bk.K(this.b, view, i13);
                        break;
                    default:
                        bk bkVar = this.b;
                        pf.g0 g0Var = bkVar.D;
                        g0Var.I0(true);
                        ak akVar = bkVar.y;
                        ArrayList arrayList = g0Var.T2;
                        pf.e0 e0Var = arrayList.isEmpty() ? pf.g0.Y2[i13] : (pf.e0) arrayList.get(i13);
                        gi giVar2 = akVar.T.b;
                        ArrayList arrayList2 = akVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((pf.e0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        giVar2.T0.setSearchFilter(e0Var);
                        giVar2.T0.setSearchFieldText("");
                        akVar.a0(null, null, true);
                        break;
                }
            }
        });
        qjVar2.setOnItemLongClickListener(new s(this, 20));
        pf.g0 g0Var = new pf.g0(context, c6Var);
        this.D = g0Var;
        final int i13 = 1;
        g0Var.setOnItemClickListener(new pk0(this) { // from class: org.telegram.ui.Components.mj
            public final /* synthetic */ bk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.pk0
            public final void a(int i132, View view) {
                switch (i13) {
                    case 0:
                        bk.K(this.b, view, i132);
                        break;
                    default:
                        bk bkVar = this.b;
                        pf.g0 g0Var2 = bkVar.D;
                        g0Var2.I0(true);
                        ak akVar = bkVar.y;
                        ArrayList arrayList = g0Var2.T2;
                        pf.e0 e0Var = arrayList.isEmpty() ? pf.g0.Y2[i132] : (pf.e0) arrayList.get(i132);
                        gi giVar2 = akVar.T.b;
                        ArrayList arrayList2 = akVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((pf.e0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        giVar2.T0.setSearchFilter(e0Var);
                        giVar2.T0.setSearchFieldText("");
                        akVar.a0(null, null, true);
                        break;
                }
            }
        });
        g0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, this.a));
        addView(g0Var, h7.z5.e(-1, 44, 48));
        g0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        g0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void K(bk bkVar, View view, int i10) {
        Object O;
        int i11;
        gi giVar = bkVar.b;
        qj qjVar = bkVar.r;
        f2.q0 adapter = qjVar.getAdapter();
        uj ujVar = bkVar.v;
        if (adapter == ujVar) {
            O = ujVar.E(i10);
        } else {
            ak akVar = bkVar.y;
            O = akVar.O(akVar.S(i10), akVar.Q(i10));
        }
        if (!(O instanceof vj)) {
            bkVar.P(view, O);
            return;
        }
        vj vjVar = (vj) O;
        File file = vjVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = vjVar.a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !isExternalStorageManager)) {
            bkVar.M.y();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                bkVar.P(view, vjVar);
                return;
            }
            tj tjVar = new tj();
            View childAt = qjVar.getChildAt(0);
            f2.o1 G = qjVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                tjVar.a = bkVar.K;
                tjVar.b = giVar.T0.getTitle();
                bkVar.Q();
                ujVar.d.add(tjVar);
                if (!bkVar.N(file)) {
                    ujVar.d.remove(tjVar);
                    return;
                } else {
                    bkVar.R(1);
                    giVar.T0.setTitle(vjVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = vjVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
            org.telegram.ui.rn rnVar = n2Var instanceof org.telegram.ui.rn ? (org.telegram.ui.rn) n2Var : null;
            org.telegram.ui.aq0 aq0Var = new org.telegram.ui.aq0(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, rnVar != null, rnVar, false);
            aq0Var.h0 = true;
            aq0Var.o0 = new j9.a(bkVar, hashMap, arrayList);
            aq0Var.f0(bkVar.R, false);
            org.telegram.ui.ActionBar.n2 n2Var2 = giVar.b0;
            if (n2Var2 != null) {
                n2Var2.presentFragment(aq0Var);
            } else {
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(aq0Var);
                }
            }
            giVar.dismiss(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            sj sjVar = bkVar.M;
            if (sjVar != null) {
                sjVar.O();
                return;
            }
            return;
        }
        int topForScroll = bkVar.getTopForScroll();
        bkVar.Q();
        tj tjVar2 = (tj) com.google.android.recaptcha.internal.a.k(1, ujVar.d);
        giVar.T0.setTitle(tjVar2.b);
        File file2 = tjVar2.a;
        if (file2 != null) {
            bkVar.N(file2);
        } else {
            bkVar.O();
        }
        bkVar.V();
        bkVar.A.h1(0, topForScroll);
        bkVar.R(2);
    }

    private int getTopForScroll() {
        qj qjVar = this.r;
        View childAt = qjVar.getChildAt(0);
        f2.o1 G = qjVar.G(childAt);
        int i10 = -qjVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    @Override // org.telegram.ui.Components.yh
    public final void B() {
        uj ujVar = this.v;
        if (ujVar != null) {
            ujVar.l();
        }
        ak akVar = this.y;
        if (akVar != null) {
            akVar.l();
        }
    }

    @Override // org.telegram.ui.Components.yh
    public final void E(yh yhVar) {
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

    @Override // org.telegram.ui.Components.yh
    public final void G() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.yh
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        int size = this.N.size();
        HashMap hashMap = this.P;
        if ((size == 0 && hashMap.size() == 0) || this.M == null || this.G) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) hashMap.get((org.telegram.ui.a10) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.O);
        gi giVar = this.b;
        CharSequence[] charSequenceArr = {giVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(giVar.F1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return y4.b0(giVar.F1, giVar.n1(), giVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() { // from class: org.telegram.ui.Components.pj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                bk bkVar = bk.this;
                bkVar.G = true;
                bkVar.M.l(arrayList2, charSequence, entities, arrayList, z10, i10, j10, z11, ((Long) obj).longValue());
                bkVar.b.dismiss(true);
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
                    vj vjVar = new vj();
                    vjVar.b = file2.getName();
                    vjVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    vjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    vjVar.c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        vjVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(vjVar);
                }
            }
        }
    }

    public final boolean M(File file) {
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !cf.d.i.contains(mimeTypeFromExtension)) {
            new mc(this.b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            new mc(this.b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
        new mc(this.b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
        return false;
    }

    public final boolean N(File file) {
        this.J = false;
        boolean canRead = file.canRead();
        qj qjVar = this.r;
        uj ujVar = this.v;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                S(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.K = file;
            ujVar.c.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(qjVar);
            this.Q = true;
            ujVar.l();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                S(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.K = file;
            ArrayList arrayList = ujVar.c;
            ArrayList arrayList2 = ujVar.d;
            ArrayList arrayList3 = ujVar.c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    vj vjVar = new vj();
                    vjVar.b = file2.getName();
                    vjVar.f = file2;
                    if (file2.isDirectory()) {
                        vjVar.a = R.drawable.files_folder;
                        vjVar.c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.J = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        vjVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        vjVar.c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            vjVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(vjVar);
                }
            }
            vj vjVar2 = new vj();
            vjVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((tj) i0.a.i(1, arrayList2)).a;
                if (file3 == null) {
                    vjVar2.c = LocaleController.getString(R.string.Folder);
                } else {
                    vjVar2.c = file3.toString();
                }
            } else {
                vjVar2.c = LocaleController.getString(R.string.Folder);
            }
            vjVar2.a = R.drawable.files_folder;
            vjVar2.f = null;
            arrayList3.add(0, vjVar2);
            if (this.K != null) {
                Collections.sort(ujVar.c, new oj(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(qjVar);
            this.Q = true;
            int topForScroll = getTopForScroll();
            ujVar.l();
            this.A.h1(0, topForScroll);
            return true;
        } catch (Exception e9) {
            S(e9.getLocalizedMessage());
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
        gi giVar;
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
            vj vjVar = new vj();
            if (Environment.isExternalStorageRemovable()) {
                vjVar.b = LocaleController.getString(R.string.SdCard);
                vjVar.a = R.drawable.files_internal;
                vjVar.c = LocaleController.getString(R.string.ExternalFolderInfo);
            } else {
                vjVar.b = LocaleController.getString(R.string.InternalStorage);
                vjVar.a = R.drawable.files_storage;
                vjVar.c = LocaleController.getString(R.string.InternalFolderInfo);
            }
            vjVar.f = Environment.getExternalStorageDirectory();
            this.v.c.add(vjVar);
            hashSet.add(path);
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
        } catch (Exception e9) {
            e = e9;
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
                                vj vjVar2 = new vj();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    vjVar2.b = LocaleController.getString(R.string.SdCard);
                                } else {
                                    vjVar2.b = LocaleController.getString(R.string.ExternalStorage);
                                }
                                vjVar2.c = LocaleController.getString(R.string.ExternalFolderInfo);
                                vjVar2.a = R.drawable.files_internal;
                                vjVar2.f = new File(nextToken);
                                this.v.c.add(vjVar2);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
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
                vj vjVar3 = new vj();
                vjVar3.b = "Telegram";
                vjVar3.c = LocaleController.getString(R.string.AppFolderInfo);
                vjVar3.a = R.drawable.files_folder;
                vjVar3.f = file;
                this.v.c.add(vjVar3);
            }
        } catch (Exception e14) {
            FileLog.e(e14);
        }
        if (!this.W && ((giVar = this.b) == null || !giVar.D)) {
            vj vjVar4 = new vj();
            vjVar4.b = LocaleController.getString(R.string.Gallery);
            vjVar4.c = LocaleController.getString(R.string.GalleryInfo);
            vjVar4.a = R.drawable.files_gallery;
            vjVar4.f = null;
            this.v.c.add(vjVar4);
        }
        if (this.T) {
            vj vjVar5 = new vj();
            vjVar5.b = LocaleController.getString(R.string.AttachMusic);
            vjVar5.c = LocaleController.getString(R.string.MusicInfo);
            vjVar5.a = R.drawable.files_music;
            vjVar5.f = null;
            this.v.c.add(vjVar5);
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
        boolean z11 = obj instanceof vj;
        ArrayList arrayList = this.O;
        gi giVar = this.b;
        HashMap hashMap = this.N;
        HashMap hashMap2 = this.P;
        boolean z12 = false;
        if (!z11) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.a10 a10Var = new org.telegram.ui.a10(messageObject.getId(), messageObject.getDialogId());
                if (hashMap2.containsKey(a10Var)) {
                    hashMap2.remove(a10Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(a10Var, messageObject);
                    z12 = true;
                }
                z10 = z12;
                if (giVar.D) {
                }
            }
            return false;
        }
        vj vjVar = (vj) obj;
        File file = vjVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = vjVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!vjVar.f.canRead()) {
                    S(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.S && vjVar.e == null) {
                    S(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((vjVar.f.length() > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || vjVar.f.length() > 4194304000L) {
                    ag.i1 i1Var = new ag.i1(6, UserConfig.selectedAccount, giVar.getContainer().getContext(), giVar.b0, null);
                    i1Var.J0 = true;
                    i1Var.L1();
                    i1Var.show();
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
                if ((!this.W || M(vjVar.f)) && vjVar.f.length() != 0) {
                    boolean z13 = giVar.P0;
                    hashMap.put(absolutePath, vjVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.Q = false;
            if (giVar.D) {
                if (view instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) view).b(z10, true);
                }
                giVar.V1(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.M != null && !this.G) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((MessageObject) hashMap2.get((org.telegram.ui.a10) it.next()));
                }
                this.M.l(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void Q() {
        View m10;
        uj ujVar = this.w;
        ujVar.d.clear();
        ArrayList arrayList = ujVar.d;
        uj ujVar2 = this.v;
        arrayList.addAll(ujVar2.d);
        ArrayList arrayList2 = ujVar.c;
        arrayList2.clear();
        arrayList2.addAll(ujVar2.c);
        ArrayList arrayList3 = ujVar.e;
        arrayList3.clear();
        arrayList3.addAll(ujVar2.e);
        ujVar.l();
        qj qjVar = this.s;
        qjVar.setVisibility(0);
        qj qjVar2 = this.r;
        qjVar.setPadding(qjVar2.getPaddingLeft(), qjVar2.getPaddingTop(), qjVar2.getPaddingRight(), qjVar2.getPaddingBottom());
        zi ziVar = this.A;
        int L0 = ziVar.L0();
        if (L0 < 0 || (m10 = ziVar.m(L0)) == null) {
            return;
        }
        this.x.h1(L0, m10.getTop() - qjVar.getPaddingTop());
    }

    public final void R(int i10) {
        qj qjVar;
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
            qjVar = this.r;
            if (i12 >= childCount) {
                i12 = 0;
                break;
            } else if (getChildAt(i12) == qjVar) {
                break;
            } else {
                i12++;
            }
        }
        qj qjVar2 = this.s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            qjVar2.setAlpha(1.0f);
            qjVar2.setScaleX(1.0f);
            qjVar2.setScaleY(1.0f);
            qjVar2.setTranslationX(0.0f);
            removeView(qjVar2);
            addView(qjVar2, i12);
            qjVar2.setVisibility(0);
            qjVar.setTranslationX(dp);
            qjVar.setAlpha(0.0f);
            this.b0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            qjVar.setAlpha(0.0f);
            qjVar.setScaleX(0.95f);
            qjVar.setScaleY(0.95f);
            qjVar2.setScaleX(1.0f);
            qjVar2.setScaleY(1.0f);
            qjVar2.setTranslationX(0.0f);
            qjVar2.setAlpha(1.0f);
            removeView(qjVar2);
            addView(qjVar2, i12 + 1);
            qjVar2.setVisibility(0);
            this.b0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.b0.addUpdateListener(new nj(this, i10, dp, i11));
        this.b0.addListener(new org.telegram.ui.am(this, 15));
        if (i10 == 1) {
            this.b0.setDuration(220L);
        } else {
            this.b0.setDuration(200L);
        }
        this.b0.setInterpolator(er.f);
        this.b0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = string;
        b2Var.P = str;
        i0.a.C(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        f2.q0 adapter = this.r.getAdapter();
        boolean z10 = true;
        ak akVar = this.y;
        if (adapter != akVar ? this.v.h() != 1 : !akVar.s.isEmpty() || !akVar.L.isEmpty()) {
            z10 = false;
        }
        this.H.setVisibility(z10 ? 0 : 8);
        U();
    }

    public final void U() {
        View childAt;
        jh.x4 x4Var = this.H;
        if (x4Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = x4Var.getTranslationY();
            this.I = (childAt.getTop() + (x4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            x4Var.setTranslationY(translationY);
        }
    }

    public final void V() {
        org.telegram.ui.ActionBar.v0 v0Var = this.B;
        if (v0Var == null || v0Var.s()) {
            return;
        }
        v0Var.setVisibility((this.J || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.yh
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.yh
    public int getCurrentItemTop() {
        qj qjVar = this.r;
        if (qjVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = qjVar.getChildAt(0);
        lk0 lk0Var = (lk0) qjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y10 > 0 && lk0Var != null && lk0Var.b() == 0) {
            i10 = y10;
        }
        if (y10 < 0 || lk0Var == null || lk0Var.b() != 0) {
            y10 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y10;
    }

    @Override // org.telegram.ui.Components.yh
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.yh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.yh
    public int getSelectedItemsCount() {
        return this.P.size() + this.N.size();
    }

    @Override // org.telegram.ui.Components.yh
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        qj qjVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 8, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 40, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qjVar, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.yh
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.yh
    public final boolean i() {
        uj ujVar = this.v;
        if (ujVar.d.size() <= 0) {
            return false;
        }
        Q();
        tj tjVar = (tj) com.google.android.recaptcha.internal.a.k(1, ujVar.d);
        this.b.T0.setTitle(tjVar.b);
        int topForScroll = getTopForScroll();
        File file = tjVar.a;
        if (file != null) {
            N(file);
        } else {
            O();
        }
        V();
        this.A.h1(0, topForScroll);
        R(2);
        return true;
    }

    @Override // org.telegram.ui.Components.yh
    public final void m() {
        try {
            if (this.L) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.a0);
                this.L = false;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.b.T0.h(true);
        org.telegram.ui.ActionBar.z n10 = this.b.T0.n();
        n10.removeView(this.C);
        n10.removeView(this.B);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        U();
    }

    @Override // org.telegram.ui.Components.yh
    public final void s() {
        this.C.setVisibility(8);
        this.B.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.S = z10;
    }

    public void setDelegate(sj sjVar) {
        this.M = sjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.R = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.yh
    public final void u(int i10) {
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.V = SharedConfig.sortFilesByName;
            uj ujVar = this.v;
            Collections.sort(ujVar.e, new oj(this, 1));
            if (this.K != null) {
                Collections.sort(ujVar.c, new oj(this, 0));
            }
            ujVar.l();
            this.C.setIcon(this.V ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.yh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(int i10, int i11) {
        int dp;
        int i12;
        gi giVar = this.b;
        if (giVar.T0.j0 || giVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(56.0f);
            giVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(1.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    giVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(1.0f);
            if (dp < 0) {
            }
            giVar.setAllowNestedScroll(true);
        }
        this.r.o1(0, dp + AndroidUtilities.statusBarHeight, 0, this.e);
        ((FrameLayout.LayoutParams) this.D.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }
}
