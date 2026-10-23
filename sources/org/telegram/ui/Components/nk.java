package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class nk extends li {
    public static final /* synthetic */ int g0 = 0;
    public final ig.d0 E;
    public final org.telegram.ui.ActionBar.u0 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final hg.q0 H;
    public AnimatorSet I;
    public final b10 J;
    public boolean K;
    public final ci.n5 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public ek Q;
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
    public final ck r;
    public final ck s;
    public final gk v;
    public final gk w;
    public final yz x;
    public final mk y;

    public nk(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, ti tiVar) {
        super(context, g6Var, tiVar);
        Cursor cursor;
        this.P = false;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.V = -1;
        this.e0 = new androidx.mediarouter.app.f(this, 8);
        gk gkVar = new gk(this, context);
        this.v = gkVar;
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
                                        hk hkVar = new hk();
                                        hkVar.b = file.getName();
                                        hkVar.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        hkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                                        hkVar.c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            hkVar.e = file.getAbsolutePath();
                                        }
                                        this.v.e.add(hkVar);
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
                Collections.sort(gkVar.e, new ak(this, 1));
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
        org.telegram.ui.ActionBar.y m10 = this.b.a1.m();
        org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.W(searchField, i11, g6Var);
        org.telegram.ui.ActionBar.r6.x(searchField, i11, g6Var);
        org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Vd, g6Var);
        org.telegram.ui.ActionBar.u0 a10 = m10.a(6, this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        b10 b10Var = new b10(context, g6Var);
        this.J = b10Var;
        addView(b10Var);
        ci.n5 n5Var = new ci.n5(this, context, b10Var, g6Var);
        this.L = n5Var;
        addView(n5Var, w7.z5.c(-1.0f, -1));
        n5Var.setVisibility(8);
        n5Var.setOnTouchListener(new di.d(14));
        ck ckVar = new ck(this, context, g6Var, 0);
        this.s = ckVar;
        ckVar.setSectionsType(2);
        ckVar.setVerticalScrollBarEnabled(false);
        yz yzVar = new yz(AndroidUtilities.dp(56.0f), 0, ckVar);
        this.x = yzVar;
        ckVar.setLayoutManager(yzVar);
        ckVar.setClipToPadding(false);
        gk gkVar2 = new gk(this, context);
        this.w = gkVar2;
        ckVar.setAdapter(gkVar2);
        addView(ckVar, w7.z5.c(-1.0f, -1));
        ckVar.setVisibility(8);
        ck ckVar2 = new ck(this, context, g6Var, 1);
        this.r = ckVar2;
        ckVar2.t1();
        this.c = ckVar2;
        this.d = ckVar2;
        this.h = true;
        this.f = true;
        ckVar2.setSectionsType(2);
        ckVar2.setVerticalScrollBarEnabled(false);
        ig.d0 d0Var = new ig.d0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, ckVar2, 2);
        this.E = d0Var;
        ckVar2.setLayoutManager(d0Var);
        ckVar2.setClipToPadding(false);
        ckVar2.setAdapter(this.v);
        addView(ckVar2, w7.z5.c(-1.0f, -1));
        this.y = new mk(this, context);
        ckVar2.setOnScrollListener(new ah.d0(this, 24));
        final int i12 = 0;
        ckVar2.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.yj
            public final /* synthetic */ nk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.am0
            public final void d(int i13, View view) {
                switch (i12) {
                    case 0:
                        nk.N(this.b, view, i13);
                        break;
                    default:
                        nk nkVar = this.b;
                        hg.q0 q0Var = nkVar.H;
                        q0Var.I0(true);
                        mk mkVar = nkVar.y;
                        ArrayList arrayList = q0Var.Y2;
                        hg.o0 o0Var = arrayList.isEmpty() ? hg.q0.d3[i13] : (hg.o0) arrayList.get(i13);
                        ti tiVar2 = mkVar.X.b;
                        ArrayList arrayList2 = mkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((hg.o0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        tiVar2.a1.setSearchFilter(o0Var);
                        tiVar2.a1.setSearchFieldText("");
                        mkVar.a0(null, null, true);
                        break;
                }
            }
        });
        ckVar2.setOnItemLongClickListener(new s(this, 20));
        hg.q0 q0Var = new hg.q0(context, g6Var);
        this.H = q0Var;
        final int i13 = 1;
        q0Var.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.yj
            public final /* synthetic */ nk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.am0
            public final void d(int i132, View view) {
                switch (i13) {
                    case 0:
                        nk.N(this.b, view, i132);
                        break;
                    default:
                        nk nkVar = this.b;
                        hg.q0 q0Var2 = nkVar.H;
                        q0Var2.I0(true);
                        mk mkVar = nkVar.y;
                        ArrayList arrayList = q0Var2.Y2;
                        hg.o0 o0Var = arrayList.isEmpty() ? hg.q0.d3[i132] : (hg.o0) arrayList.get(i132);
                        ti tiVar2 = mkVar.X.b;
                        ArrayList arrayList2 = mkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((hg.o0) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        tiVar2.a1.setSearchFilter(o0Var);
                        tiVar2.a1.setSearchFieldText("");
                        mkVar.a0(null, null, true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, q0Var, g6Var);
        addView(q0Var, w7.z5.e(-1, 44, 48));
        q0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        q0Var.setVisibility(4);
        R();
        Y();
        W();
    }

    public static void N(nk nkVar, View view, int i10) {
        Object O;
        int i11;
        ti tiVar = nkVar.b;
        ck ckVar = nkVar.r;
        s4.g0 adapter = ckVar.getAdapter();
        gk gkVar = nkVar.v;
        if (adapter == gkVar) {
            O = gkVar.E(i10);
        } else {
            mk mkVar = nkVar.y;
            O = mkVar.O(mkVar.S(i10), mkVar.Q(i10));
        }
        if (!(O instanceof hk)) {
            nkVar.S(view, O);
            return;
        }
        hk hkVar = (hk) O;
        File file = hkVar.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = hkVar.a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !isExternalStorageManager)) {
            nkVar.Q.y();
            return;
        }
        if (file != null) {
            if (!file.isDirectory()) {
                nkVar.S(view, hkVar);
                return;
            }
            fk fkVar = new fk();
            View childAt = ckVar.getChildAt(0);
            s4.b1 G = ckVar.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                fkVar.a = nkVar.O;
                fkVar.b = tiVar.a1.getTitle();
                nkVar.T();
                gkVar.d.add(fkVar);
                if (!nkVar.Q(file)) {
                    gkVar.d.remove(fkVar);
                    return;
                } else {
                    nkVar.U(1);
                    tiVar.a1.setTitle(hkVar.b);
                    return;
                }
            }
            return;
        }
        int i12 = hkVar.a;
        if (i12 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
            org.telegram.ui.sn snVar = o2Var instanceof org.telegram.ui.sn ? (org.telegram.ui.sn) o2Var : null;
            org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, snVar != null, snVar, false);
            mq0Var.l0 = true;
            mq0Var.s0 = new m.g3(nkVar, hashMap, arrayList, false, 13);
            mq0Var.f0(nkVar.V, false);
            org.telegram.ui.ActionBar.o2 o2Var2 = tiVar.f0;
            if (o2Var2 != null) {
                o2Var2.presentFragment(mq0Var);
            } else {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(mq0Var);
                }
            }
            tiVar.dismiss(true);
            return;
        }
        if (i12 == R.drawable.files_music) {
            ek ekVar = nkVar.Q;
            if (ekVar != null) {
                ekVar.O();
                return;
            }
            return;
        }
        int topForScroll = nkVar.getTopForScroll();
        nkVar.T();
        fk fkVar2 = (fk) i2.o1.A(1, gkVar.d);
        tiVar.a1.setTitle(fkVar2.b);
        File file2 = fkVar2.a;
        if (file2 != null) {
            nkVar.Q(file2);
        } else {
            nkVar.R();
        }
        nkVar.Y();
        nkVar.E.h1(0, topForScroll);
        nkVar.U(2);
    }

    private int getTopForScroll() {
        ck ckVar = this.r;
        View childAt = ckVar.getChildAt(0);
        s4.b1 G = ckVar.G(childAt);
        int i10 = -ckVar.getPaddingTop();
        return (G == null || G.b() != 0) ? i10 : childAt.getTop() + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int dp;
        int i12;
        ti tiVar = this.b;
        if (tiVar.a1.n0 || tiVar.u1.Q() > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(56.0f);
            tiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(1.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    tiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(1.0f);
            if (dp < 0) {
            }
            tiVar.setAllowNestedScroll(true);
        }
        this.r.s1(0, dp + AndroidUtilities.statusBarHeight, 0, this.e);
        ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.li
    public final void C() {
        gk gkVar = this.v;
        if (gkVar != null) {
            gkVar.l();
        }
        mk mkVar = this.y;
        if (mkVar != null) {
            mkVar.l();
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void F(li liVar) {
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

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) hashMap.get((org.telegram.ui.a10) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        ti tiVar = this.b;
        CharSequence[] charSequenceArr = {tiVar.r1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(tiVar.M1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return f5.b0(tiVar.M1, tiVar.s1(), tiVar.o1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() { // from class: org.telegram.ui.Components.bk
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                nk nkVar = nk.this;
                nkVar.K = true;
                nkVar.Q.l(arrayList2, charSequence, entities, arrayList, z10, i10, j10, z11, ((Long) obj).longValue());
                nkVar.b.dismiss(true);
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
                    hk hkVar = new hk();
                    hkVar.b = file2.getName();
                    hkVar.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    hkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                    hkVar.c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        hkVar.e = file2.getAbsolutePath();
                    }
                    this.v.e.add(hkVar);
                }
            }
        }
    }

    public final boolean P(File file) {
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !wf.c.i.contains(mimeTypeFromExtension)) {
            new xc(this.b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            new xc(this.b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
        new xc(this.b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
        return false;
    }

    public final boolean Q(File file) {
        this.N = false;
        boolean canRead = file.canRead();
        ck ckVar = this.r;
        gk gkVar = this.v;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                V(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.O = file;
            gkVar.c.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(ckVar);
            this.U = true;
            gkVar.l();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                V(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.O = file;
            ArrayList arrayList = gkVar.c;
            ArrayList arrayList2 = gkVar.d;
            ArrayList arrayList3 = gkVar.c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    hk hkVar = new hk();
                    hkVar.b = file2.getName();
                    hkVar.f = file2;
                    if (file2.isDirectory()) {
                        hkVar.a = R.drawable.files_folder;
                        hkVar.c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        hkVar.d = split.length > 1 ? split[split.length - 1] : "?";
                        hkVar.c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            hkVar.e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(hkVar);
                }
            }
            hk hkVar2 = new hk();
            hkVar2.b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((fk) i2.o1.i(1, arrayList2)).a;
                if (file3 == null) {
                    hkVar2.c = LocaleController.getString(R.string.Folder);
                } else {
                    hkVar2.c = file3.toString();
                }
            } else {
                hkVar2.c = LocaleController.getString(R.string.Folder);
            }
            hkVar2.a = R.drawable.files_folder;
            hkVar2.f = null;
            arrayList3.add(0, hkVar2);
            if (this.O != null) {
                Collections.sort(gkVar.c, new ak(this, 0));
            }
            Y();
            AndroidUtilities.clearDrawableAnimation(ckVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            gkVar.l();
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
        ti tiVar;
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
            hk hkVar = new hk();
            if (Environment.isExternalStorageRemovable()) {
                hkVar.b = LocaleController.getString(R.string.SdCard);
                hkVar.a = R.drawable.files_internal;
                hkVar.c = LocaleController.getString(R.string.ExternalFolderInfo);
            } else {
                hkVar.b = LocaleController.getString(R.string.InternalStorage);
                hkVar.a = R.drawable.files_storage;
                hkVar.c = LocaleController.getString(R.string.InternalFolderInfo);
            }
            hkVar.f = Environment.getExternalStorageDirectory();
            this.v.c.add(hkVar);
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
                                hk hkVar2 = new hk();
                                if (nextToken.toLowerCase().contains("sd")) {
                                    hkVar2.b = LocaleController.getString(R.string.SdCard);
                                } else {
                                    hkVar2.b = LocaleController.getString(R.string.ExternalStorage);
                                }
                                hkVar2.c = LocaleController.getString(R.string.ExternalFolderInfo);
                                hkVar2.a = R.drawable.files_internal;
                                hkVar2.f = new File(nextToken);
                                this.v.c.add(hkVar2);
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
                hk hkVar3 = new hk();
                hkVar3.b = "Telegram";
                hkVar3.c = LocaleController.getString(R.string.AppFolderInfo);
                hkVar3.a = R.drawable.files_folder;
                hkVar3.f = file;
                this.v.c.add(hkVar3);
            }
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        if (!this.d0 && ((tiVar = this.b) == null || !tiVar.H)) {
            hk hkVar4 = new hk();
            hkVar4.b = LocaleController.getString(R.string.Gallery);
            hkVar4.c = LocaleController.getString(R.string.GalleryInfo);
            hkVar4.a = R.drawable.files_gallery;
            hkVar4.f = null;
            this.v.c.add(hkVar4);
        }
        if (this.a0) {
            hk hkVar5 = new hk();
            hkVar5.b = LocaleController.getString(R.string.AttachMusic);
            hkVar5.c = LocaleController.getString(R.string.MusicInfo);
            hkVar5.a = R.drawable.files_music;
            hkVar5.f = null;
            this.v.c.add(hkVar5);
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
        boolean z11 = obj instanceof hk;
        ArrayList arrayList = this.S;
        ti tiVar = this.b;
        HashMap hashMap = this.R;
        HashMap hashMap2 = this.T;
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
                if (tiVar.H) {
                }
            }
            return false;
        }
        hk hkVar = (hk) obj;
        File file = hkVar.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = hkVar.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z10 = false;
            } else {
                if (!hkVar.f.canRead()) {
                    V(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.W && hkVar.e == null) {
                    V(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((hkVar.f.length() > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || hkVar.f.length() > 4194304000L) {
                    sg.j0 j0Var = new sg.j0(6, UserConfig.selectedAccount, tiVar.getContainer().getContext(), tiVar.f0, null);
                    j0Var.N0 = true;
                    j0Var.P1();
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
                if ((!this.d0 || P(hkVar.f)) && hkVar.f.length() != 0) {
                    boolean z13 = tiVar.W0;
                    hashMap.put(absolutePath, hkVar);
                    arrayList.add(absolutePath);
                    z10 = true;
                }
            }
            this.U = false;
            if (tiVar.H) {
                if (view instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) view).b(z10, true);
                }
                tiVar.d2(z10 ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.Q != null && !this.K) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((MessageObject) hashMap2.get((org.telegram.ui.a10) it.next()));
                }
                this.Q.l(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void T() {
        View m10;
        gk gkVar = this.w;
        gkVar.d.clear();
        ArrayList arrayList = gkVar.d;
        gk gkVar2 = this.v;
        arrayList.addAll(gkVar2.d);
        ArrayList arrayList2 = gkVar.c;
        arrayList2.clear();
        arrayList2.addAll(gkVar2.c);
        ArrayList arrayList3 = gkVar.e;
        arrayList3.clear();
        arrayList3.addAll(gkVar2.e);
        gkVar.l();
        ck ckVar = this.s;
        ckVar.setVisibility(0);
        ck ckVar2 = this.r;
        ckVar.setPadding(ckVar2.getPaddingLeft(), ckVar2.getPaddingTop(), ckVar2.getPaddingRight(), ckVar2.getPaddingBottom());
        ig.d0 d0Var = this.E;
        int L0 = d0Var.L0();
        if (L0 < 0 || (m10 = d0Var.m(L0)) == null) {
            return;
        }
        this.x.h1(L0, m10.getTop() - ckVar.getPaddingTop());
    }

    public final void U(int i10) {
        ck ckVar;
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
            ckVar = this.r;
            if (i12 >= childCount) {
                i12 = 0;
                break;
            } else if (getChildAt(i12) == ckVar) {
                break;
            } else {
                i12++;
            }
        }
        ck ckVar2 = this.s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            ckVar2.setAlpha(1.0f);
            ckVar2.setScaleX(1.0f);
            ckVar2.setScaleY(1.0f);
            ckVar2.setTranslationX(0.0f);
            removeView(ckVar2);
            addView(ckVar2, i12);
            ckVar2.setVisibility(0);
            ckVar.setTranslationX(dp);
            ckVar.setAlpha(0.0f);
            this.f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            ckVar.setAlpha(0.0f);
            ckVar.setScaleX(0.95f);
            ckVar.setScaleY(0.95f);
            ckVar2.setScaleX(1.0f);
            ckVar2.setScaleY(1.0f);
            ckVar2.setTranslationX(0.0f);
            ckVar2.setAlpha(1.0f);
            removeView(ckVar2);
            addView(ckVar2, i12 + 1);
            ckVar2.setVisibility(0);
            this.f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f0.addUpdateListener(new zj(this, i10, dp, i11));
        this.f0.addListener(new org.telegram.ui.pq(this, 12));
        if (i10 == 1) {
            this.f0.setDuration(220L);
        } else {
            this.f0.setDuration(200L);
        }
        this.f0.setInterpolator(bs.f);
        this.f0.start();
    }

    public final void V(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = str;
        org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
    }

    public final void W() {
        s4.g0 adapter = this.r.getAdapter();
        boolean z10 = true;
        mk mkVar = this.y;
        if (adapter != mkVar ? this.v.h() != 1 : !mkVar.s.isEmpty() || !mkVar.P.isEmpty()) {
            z10 = false;
        }
        this.L.setVisibility(z10 ? 0 : 8);
        X();
    }

    public final void X() {
        View childAt;
        ci.n5 n5Var = this.L;
        if (n5Var.getVisibility() == 0 && (childAt = this.r.getChildAt(0)) != null) {
            float translationY = n5Var.getTranslationY();
            this.M = (childAt.getTop() + (n5Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
            n5Var.setTranslationY(translationY);
        }
    }

    public final void Y() {
        org.telegram.ui.ActionBar.u0 u0Var = this.F;
        if (u0Var == null || u0Var.s()) {
            return;
        }
        u0Var.setVisibility((this.N || this.v.d.isEmpty()) ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.li
    public final void d() {
        org.telegram.ui.ActionBar.u0 u0Var = this.F;
        if (u0Var != null) {
            try {
                if (u0Var.getSearchField() != null) {
                    u0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.a));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        ck ckVar = this.r;
        if (ckVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = ckVar.getChildAt(0);
        wl0 wl0Var = (wl0) ckVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || wl0Var == null || wl0Var.b() != 0) {
            y3 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y3;
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.li
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override // org.telegram.ui.Components.li
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        ck ckVar = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 32, new Class[]{org.telegram.ui.Cells.b7.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 48, new Class[]{org.telegram.ui.Cells.b7.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 40, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ckVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Bi));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.li
    public final int i() {
        return 1;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean j() {
        gk gkVar = this.v;
        if (gkVar.d.size() <= 0) {
            return false;
        }
        T();
        fk fkVar = (fk) i2.o1.A(1, gkVar.d);
        this.b.a1.setTitle(fkVar.b);
        int topForScroll = getTopForScroll();
        File file = fkVar.a;
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

    @Override // org.telegram.ui.Components.li
    public final void p() {
        try {
            if (this.P) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.e0);
                this.P = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.b.a1.g(true);
        org.telegram.ui.ActionBar.y m10 = this.b.a1.m();
        m10.removeView(this.G);
        m10.removeView(this.F);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(ek ekVar) {
        this.Q = ekVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.li
    public final void u() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    @Override // org.telegram.ui.Components.li
    public final void w(int i10) {
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.c0 = SharedConfig.sortFilesByName;
            gk gkVar = this.v;
            Collections.sort(gkVar.e, new ak(this, 1));
            if (this.O != null) {
                Collections.sort(gkVar.c, new ak(this, 0));
            }
            gkVar.l();
            this.G.setIcon(this.c0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
