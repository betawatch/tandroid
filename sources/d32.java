// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d32 extends p02 {
    public final c32 E;
    public final z12 F;
    public final r7 G;
    public final r7 H;
    public final tf4 I;
    public AnimatorSet J;
    public final pi4 K;
    public boolean L;
    public final q22 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public t22 R;
    public final HashMap S;
    public final ArrayList T;
    public final HashMap U;
    public boolean V;
    public int W;
    public boolean a0;
    public final boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public final zj f0;
    public ValueAnimator g0;
    public byte n;
    public final r22 r;
    public final r22 s;
    public final v22 w;
    public final v22 x;
    public final wb4 y;

    public d32(int i, x02 x02Var, wjb wjbVar, Context context) {
        super(x02Var, wjbVar, context);
        Cursor cursor;
        final byte b = 0;
        this.Q = false;
        this.S = new HashMap();
        this.T = new ArrayList();
        this.U = new HashMap();
        this.W = -1;
        int i2 = 3;
        this.f0 = new zj(this, (byte) 3);
        v22 v22Var = new v22(this, context);
        this.w = v22Var;
        final byte b2 = 1;
        this.b0 = i == 1;
        byte b3 = 2;
        boolean z = i == 2;
        this.e0 = z;
        this.d0 = gba.J0;
        try {
            if (z) {
                try {
                    Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j = query.getLong(2);
                            long j2 = query.getLong(i2);
                            String string = query.getString(4);
                            cursor = query;
                            if (j <= na7.q1(y6c.t0).k4.S0.f() * 1000) {
                                try {
                                    if (j2 <= na7.q1(y6c.t0).k4.R0.f() && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        w22 w22Var = new w22();
                                        w22Var.b = file.getName();
                                        w22Var.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        w22Var.d = split.length > 1 ? split[split.length - 1] : "?";
                                        w22Var.c = gl.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            w22Var.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.w.h).add(w22Var);
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
                            i2 = 3;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = query;
                        }
                    }
                    query.close();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else {
                P(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) v22Var.h, new n22(this, (byte) 1));
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        this.c0 = false;
        if (!this.Q) {
            this.Q = true;
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
                a.b.registerReceiver(this.f0, intentFilter, 4);
            } else {
                a.b.registerReceiver(this.f0, intentFilter);
            }
        }
        r6 t = this.b.U2.t();
        r7 a = t.a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new q10(this, b3);
        this.G = a;
        a.setSearchFieldHint(k96.M0(2131745644, null));
        a.setContentDescription(k96.M0(2131745644, null));
        EditTextBoldCursor searchField = a.getSearchField();
        int i3 = bkb.i5;
        zkb.X(searchField, i3, wjbVar);
        zkb.v(searchField, i3, wjbVar);
        zkb.D(searchField, bkb.Le, wjbVar);
        r7 a2 = t.a(6, this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.H = a2;
        a2.setContentDescription(k96.M0(2131754891, null));
        pi4 pi4Var = new pi4(context, wjbVar);
        this.K = pi4Var;
        addView(pi4Var);
        q22 q22Var = new q22(this, context, pi4Var, wjbVar);
        this.M = q22Var;
        addView(q22Var, nme.c(-1.0f, -1));
        q22Var.setVisibility(8);
        q22Var.setOnTouchListener(new jz1((byte) 1));
        r22 r22Var = new r22(this, context, wjbVar, (byte) 0);
        this.s = r22Var;
        r22Var.setSectionsType(2);
        r22Var.setVerticalScrollBarEnabled(false);
        wb4 wb4Var = new wb4(gl.L(56.0f), 0, r22Var);
        this.y = wb4Var;
        r22Var.setLayoutManager(wb4Var);
        r22Var.setClipToPadding(false);
        v22 v22Var2 = new v22(this, context);
        this.x = v22Var2;
        r22Var.setAdapter(v22Var2);
        addView(r22Var, nme.c(-1.0f, -1));
        r22Var.setVisibility(8);
        r22 r22Var2 = new r22(this, context, wjbVar, (byte) 1);
        this.r = r22Var2;
        r22Var2.r1();
        setBlur3Capture(r22Var2);
        this.d = r22Var2;
        this.h = true;
        this.f = true;
        r22Var2.setSectionsType(2);
        r22Var2.setVerticalScrollBarEnabled(false);
        z12 z12Var = new z12(this, gl.L(56.0f) + gl.m, r22Var2, b2);
        this.F = z12Var;
        r22Var2.setLayoutManager(z12Var);
        r22Var2.setClipToPadding(false);
        r22Var2.setAdapter(this.w);
        addView(r22Var2, nme.c(-1.0f, -1));
        this.E = new c32(this, context);
        r22Var2.setOnScrollListener(new y(this, (byte) 19));
        r22Var2.setOnItemClickListener(new c39(this) { // from class: l22
            public final /* synthetic */ d32 b;

            {
                this.b = this;
            }

            @Override // c39
            public final void d(int i4, View view) {
                byte b4 = b;
                d32 d32Var = this.b;
                switch (b4) {
                    case 0:
                        d32Var.R(i4, view);
                        break;
                    default:
                        tf4 tf4Var = d32Var.I;
                        tf4Var.J0(true);
                        c32 c32Var = d32Var.E;
                        ArrayList arrayList = tf4Var.f3;
                        rf4 rf4Var = arrayList.isEmpty() ? tf4.k3[i4] : (rf4) arrayList.get(i4);
                        x02 x02Var2 = c32Var.Y.b;
                        ArrayList arrayList2 = c32Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                if (rf4Var.b((rf4) arrayList2.get(i5))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(rf4Var);
                        x02Var2.U2.setSearchFilter(rf4Var);
                        x02Var2.U2.setSearchFieldText("");
                        c32Var.a0(null, null, true);
                        break;
                }
            }
        });
        r22Var2.setOnItemLongClickListener(new rh1((Object) this, (byte) 14));
        tf4 tf4Var = new tf4(context, wjbVar);
        this.I = tf4Var;
        tf4Var.setOnItemClickListener(new c39(this) { // from class: l22
            public final /* synthetic */ d32 b;

            {
                this.b = this;
            }

            @Override // c39
            public final void d(int i4, View view) {
                byte b4 = b2;
                d32 d32Var = this.b;
                switch (b4) {
                    case 0:
                        d32Var.R(i4, view);
                        break;
                    default:
                        tf4 tf4Var2 = d32Var.I;
                        tf4Var2.J0(true);
                        c32 c32Var = d32Var.E;
                        ArrayList arrayList = tf4Var2.f3;
                        rf4 rf4Var = arrayList.isEmpty() ? tf4.k3[i4] : (rf4) arrayList.get(i4);
                        x02 x02Var2 = c32Var.Y.b;
                        ArrayList arrayList2 = c32Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                if (rf4Var.b((rf4) arrayList2.get(i5))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(rf4Var);
                        x02Var2.U2.setSearchFilter(rf4Var);
                        x02Var2.U2.setSearchFieldText("");
                        c32Var.a0(null, null, true);
                        break;
                }
            }
        });
        zkb.h(bkb.g5, wjbVar, tf4Var);
        addView(tf4Var, nme.e(-1, 44, 48));
        tf4Var.setTranslationY(-gl.L(44.0f));
        tf4Var.setVisibility(4);
        T();
        a0();
        Y();
    }

    private int getTopForScroll() {
        r22 r22Var = this.r;
        View childAt = r22Var.getChildAt(0);
        s49 G = r22Var.G(childAt);
        int i = -r22Var.getPaddingTop();
        return (G == null || G.b() != 0) ? i : childAt.getTop() + i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // p02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int L;
        int i3;
        x02 x02Var = this.b;
        if (x02Var.U2.o0 || x02Var.o3.Q() > gl.L(20.0f)) {
            L = gl.L(56.0f);
            x02Var.r0 = false;
        } else {
            if (!gl.O1()) {
                Point point = gl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    L = i3 - gl.L(1.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    x02Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            L = i3 - gl.L(1.0f);
            if (L < 0) {
            }
            x02Var.r0 = true;
        }
        this.r.q1(0, L + gl.m, 0, this.e);
        ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
    }

    @Override // p02
    public final void E() {
        v22 v22Var = this.w;
        if (v22Var != null) {
            v22Var.f();
        }
        c32 c32Var = this.E;
        if (c32Var != null) {
            c32Var.f();
        }
    }

    @Override // p02
    public final void I(p02 p02Var) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.w.f.clear();
        T();
        a0();
        Y();
        this.b.U2.setTitle(k96.M0(2131745465, null));
        this.H.setVisibility(0);
        this.F.g1(0, 0);
    }

    @Override // p02
    public final void K() {
        this.r.z0(0);
    }

    @Override // p02
    public final boolean M(final boolean z, final int i, int i2, final long j, final boolean z2) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((k27) hashMap.get((se4) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        x02 x02Var = this.b;
        CharSequence[] charSequenceArr = {x02Var.U0().getText()};
        final ArrayList Y = hq6.d0(x02Var.G3).Y(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return ij.Y(x02Var.G3, x02Var.V0(), x02Var.R0() + arrayList2.size() + (!TextUtils.isEmpty(charSequence) ? 1 : 0), new p8c() { // from class: o22
            @Override // p8c
            public final void a(Object obj) {
                d32 d32Var = d32.this;
                d32Var.L = true;
                d32Var.R.k(arrayList2, charSequence, Y, arrayList, z, i, j, z2, ((Long) obj).longValue());
                d32Var.b.a(true);
            }
        }, 0L);
    }

    public final void P(File file) {
        File[] listFiles = file.listFiles();
        File j = ba4.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    P(file2);
                } else if (!file2.equals(j)) {
                    w22 w22Var = new w22();
                    w22Var.b = file2.getName();
                    w22Var.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    w22Var.d = split.length > 1 ? split[split.length - 1] : "?";
                    w22Var.c = gl.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        w22Var.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(w22Var);
                }
            }
        }
    }

    public final boolean Q(File file) {
        int i;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(ba4.D(file));
        if (file.length() == 0 || mimeTypeFromExtension == null || !ij9.i.contains(mimeTypeFromExtension)) {
            new u21(this.b.c, null).u(k96.a0("InvalidFormatError", null, 2131748989, new Object[0]), k96.M0(2131751091, null), null).j();
            return false;
        }
        if (file.length() > na7.q1(y6c.t0).k4.R0.f()) {
            new u21(this.b.c, null).u(k96.a0("TooLargeError", null, 2131743802, new Object[0]), k96.a0("ErrorRingtoneSizeTooBig", null, 2131751090, Integer.valueOf(na7.q1(y6c.t0).k4.R0.f() / 1024)), null).j();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(a.b, Uri.fromFile(file));
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i <= na7.q1(y6c.t0).k4.S0.f() * 1000) {
            return true;
        }
        new u21(this.b.c, null).u(k96.a0("TooLongError", null, 2131743801, new Object[0]), k96.a0("ErrorRingtoneDurationTooLong", null, 2131751092, Integer.valueOf(na7.q1(y6c.t0).k4.S0.f())), null).j();
        return false;
    }

    public final void R(int i, View view) {
        Object O;
        int i2;
        r22 r22Var = this.r;
        w39 adapter = r22Var.getAdapter();
        v22 v22Var = this.w;
        if (adapter == v22Var) {
            O = v22Var.E(i);
        } else {
            c32 c32Var = this.E;
            O = c32Var.O(c32Var.S(i), c32Var.Q(i));
        }
        if (!(O instanceof w22)) {
            U(view, O);
            return;
        }
        w22 w22Var = (w22) O;
        File file = w22Var.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        boolean z = w01.b;
        x02 x02Var = this.b;
        if (!z && (((i2 = w22Var.a) == R.drawable.files_storage || i2 == R.drawable.files_internal) && !isExternalStorageManager)) {
            k02 k02Var = x02Var.o3;
            int i3 = x02Var.G3;
            if (x02Var.E3 == null || x02Var.E1 - x02Var.F1 >= 0) {
                this.R.z();
                return;
            } else if (na7.q1(i3).E3() || na7.q1(i3).k4.h1.f() <= x02Var.F1) {
                new u21(k02Var, x02Var.J0).t(k96.M0(2131743801, null), x02Var.J0).j();
                return;
            } else {
                new u21(k02Var, x02Var.J0).f(na7.q1(i3).k4.h1.f(), new vq0(x02Var, (byte) 4)).j();
                return;
            }
        }
        if (file != null) {
            if (!file.isDirectory()) {
                U(view, w22Var);
                return;
            }
            u22 u22Var = new u22();
            View childAt = r22Var.getChildAt(0);
            s49 G = r22Var.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                u22Var.a = this.P;
                u22Var.b = x02Var.U2.getTitle();
                V();
                v22Var.f.add(u22Var);
                if (!S(file)) {
                    v22Var.f.remove(u22Var);
                    return;
                } else {
                    W(1);
                    x02Var.U2.setTitle(w22Var.b);
                    return;
                }
            }
            return;
        }
        int i4 = w22Var.a;
        if (i4 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            d dVar = x02Var.Z1;
            mu1 mu1Var = dVar instanceof mu1 ? (mu1) dVar : null;
            u58 u58Var = new u58(0, MediaController.a2, hashMap, arrayList, 0, mu1Var != null, mu1Var, false);
            u58Var.m0 = true;
            u58Var.t0 = new mv6(this, hashMap, arrayList);
            u58Var.j0(this.W, false);
            d dVar2 = x02Var.Z1;
            if (dVar2 != null) {
                dVar2.presentFragment(u58Var);
            } else {
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(u58Var);
                }
            }
            x02Var.a(true);
            return;
        }
        if (i4 == R.drawable.files_music) {
            t22 t22Var = this.R;
            if (t22Var != null) {
                t22Var.S();
                return;
            }
            return;
        }
        int topForScroll = getTopForScroll();
        V();
        u22 u22Var2 = (u22) tb4.l(1, v22Var.f);
        x02Var.U2.setTitle(u22Var2.b);
        File file2 = u22Var2.a;
        if (file2 != null) {
            S(file2);
        } else {
            T();
        }
        a0();
        this.F.g1(0, topForScroll);
        W(2);
    }

    public final boolean S(File file) {
        File file2;
        v22 v22Var;
        this.O = false;
        boolean canRead = file.canRead();
        r22 r22Var = this.r;
        String str = null;
        v22 v22Var2 = this.w;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                X(k96.M0(2131754710, null));
                return false;
            }
            this.P = file;
            v22Var2.e.clear();
            Environment.getExternalStorageState();
            gl.y(r22Var);
            this.V = true;
            v22Var2.f();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                X(k96.M0(2131743640, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = v22Var2.e;
            ArrayList arrayList2 = v22Var2.f;
            ArrayList arrayList3 = v22Var2.e;
            arrayList.clear();
            File j = ba4.j(6);
            int i = 0;
            while (i < listFiles.length) {
                File file3 = listFiles[i];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j)) {
                    v22Var = v22Var2;
                } else {
                    w22 w22Var = new w22();
                    w22Var.b = file3.getName();
                    w22Var.f = file3;
                    if (file3.isDirectory()) {
                        w22Var.a = R.drawable.files_folder;
                        w22Var.c = k96.M0(2131750668, str);
                        v22Var = v22Var2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        w22Var.d = split.length > 1 ? split[split.length - 1] : "?";
                        v22Var = v22Var2;
                        w22Var.c = gl.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            w22Var.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(w22Var);
                }
                i++;
                v22Var2 = v22Var;
                str = null;
            }
            v22 v22Var3 = v22Var2;
            w22 w22Var2 = new w22();
            w22Var2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((u22) b00.f(1, arrayList2)).a;
                file2 = null;
                if (file4 == null) {
                    w22Var2.c = k96.M0(2131750668, null);
                } else {
                    w22Var2.c = file4.toString();
                }
            } else {
                file2 = null;
                w22Var2.c = k96.M0(2131750668, null);
            }
            w22Var2.a = R.drawable.files_folder;
            w22Var2.f = file2;
            arrayList3.add(0, w22Var2);
            if (this.P != null) {
                Collections.sort(v22Var3.e, new n22(this, (byte) 0));
            }
            a0();
            gl.y(r22Var);
            this.V = true;
            int topForScroll = getTopForScroll();
            v22Var3.f();
            this.F.g1(0, topForScroll);
            return true;
        } catch (Exception e) {
            X(e.getLocalizedMessage());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0174, code lost:
    
        if (r4 == null) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T() {
        BufferedReader bufferedReader;
        x02 x02Var;
        int lastIndexOf;
        BufferedReader bufferedReader2 = null;
        this.P = null;
        this.O = false;
        this.w.e.clear();
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 30) {
            Environment.isExternalStorageManager();
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) {
            w22 w22Var = new w22();
            if (Environment.isExternalStorageRemovable()) {
                w22Var.b = k96.M0(2131745648, null);
                w22Var.a = R.drawable.files_internal;
                w22Var.c = k96.M0(2131750844, null);
            } else {
                w22Var.b = k96.M0(2131748996, null);
                w22Var.a = R.drawable.files_storage;
                w22Var.c = k96.M0(2131748998, null);
            }
            w22Var.f = Environment.getExternalStorageDirectory();
            this.w.e.add(w22Var);
            hashSet.add(path);
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
        } catch (Exception e) {
            e = e;
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.contains("vfat") || readLine.contains("/mnt")) {
                            if (w01.a) {
                                fa4.b(readLine);
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
                                    w22 w22Var2 = new w22();
                                    if (nextToken.toLowerCase().contains("sd")) {
                                        w22Var2.b = k96.M0(2131745648, null);
                                    } else {
                                        w22Var2.b = k96.M0(2131750843, null);
                                    }
                                    w22Var2.c = k96.M0(2131750844, null);
                                    w22Var2.a = R.drawable.files_internal;
                                    w22Var2.f = new File(nextToken);
                                    this.w.e.add(w22Var2);
                                } catch (Exception e2) {
                                    fa4.g(e2, true);
                                }
                            }
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    fa4.g(e, true);
                }
                try {
                    break;
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e5) {
                        fa4.g(e5, true);
                    }
                }
                throw th;
            }
        }
        bufferedReader.close();
        try {
            File file = new File(a.b.getExternalFilesDir(null), "Telegram");
            if (file.exists()) {
                w22 w22Var3 = new w22();
                w22Var3.b = "Telegram";
                w22Var3.c = k96.M0(2131754238, null);
                w22Var3.a = R.drawable.files_folder;
                w22Var3.f = file;
                this.w.e.add(w22Var3);
            }
        } catch (Exception e6) {
            fa4.g(e6, true);
        }
        if (!this.e0 && ((x02Var = this.b) == null || !x02Var.B1)) {
            w22 w22Var4 = new w22();
            w22Var4.b = k96.M0(2131750468, null);
            w22Var4.c = k96.M0(2131750461, null);
            w22Var4.a = R.drawable.files_gallery;
            w22Var4.f = null;
            this.w.e.add(w22Var4);
        }
        if (this.b0) {
            w22 w22Var5 = new w22();
            w22Var5.b = k96.M0(2131753949, null);
            w22Var5.c = k96.M0(2131748123, null);
            w22Var5.a = R.drawable.files_music;
            w22Var5.f = null;
            this.w.e.add(w22Var5);
        }
        if (!((ArrayList) this.w.h).isEmpty()) {
            this.O = true;
        }
        gl.y(this.r);
        this.V = true;
        this.w.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U(View view, Object obj) {
        boolean z;
        boolean z2 = obj instanceof w22;
        ArrayList arrayList = this.T;
        x02 x02Var = this.b;
        HashMap hashMap = this.S;
        HashMap hashMap2 = this.U;
        boolean z3 = false;
        if (!z2) {
            if (obj instanceof k27) {
                k27 k27Var = (k27) obj;
                se4 se4Var = new se4(k27Var.e1(), k27.B0(k27Var.k));
                if (hashMap2.containsKey(se4Var)) {
                    hashMap2.remove(se4Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(se4Var, k27Var);
                    z3 = true;
                }
                z = z3;
                if (x02Var.B1) {
                }
            }
            return false;
        }
        w22 w22Var = (w22) obj;
        File file = w22Var.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = w22Var.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z = false;
            } else {
                if (!w22Var.f.canRead()) {
                    X(k96.M0(2131754710, null));
                    return false;
                }
                if (this.a0 && w22Var.e == null) {
                    X(k96.a0("PassportUploadNotImage", null, 2131747257, new Object[0]));
                    return false;
                }
                if ((w22Var.f.length() > 2097152000 && !y6c.h(y6c.t0).p()) || w22Var.f.length() > 4194304000L) {
                    h26 h26Var = new h26(6, y6c.t0, null, x02Var.c.getContext(), x02Var.Z1);
                    h26Var.I2 = true;
                    h26Var.w1();
                    h26Var.show();
                    return false;
                }
                if (this.W >= 0) {
                    int size = hashMap.size();
                    int i = this.W;
                    if (size >= i) {
                        X(k96.a0("PassportUploadMaxReached", null, 2131747258, k96.G(i, "Files", new Object[0])));
                        return false;
                    }
                }
                if ((!this.e0 || Q(w22Var.f)) && w22Var.f.length() != 0) {
                    boolean z4 = x02Var.Q2;
                    hashMap.put(absolutePath, w22Var);
                    arrayList.add(absolutePath);
                    z = true;
                }
            }
            this.V = false;
            if (x02Var.B1) {
                if (view instanceof iba) {
                    ((iba) view).b(z, true);
                }
                x02Var.F1(z ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.R != null && !this.L) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((k27) hashMap2.get((se4) it.next()));
                }
                this.R.k(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void V() {
        View m;
        v22 v22Var = this.x;
        v22Var.f.clear();
        ArrayList arrayList = v22Var.f;
        v22 v22Var2 = this.w;
        arrayList.addAll(v22Var2.f);
        ArrayList arrayList2 = v22Var.e;
        arrayList2.clear();
        arrayList2.addAll(v22Var2.e);
        ArrayList arrayList3 = (ArrayList) v22Var.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) v22Var2.h);
        v22Var.f();
        r22 r22Var = this.s;
        r22Var.setVisibility(0);
        r22 r22Var2 = this.r;
        r22Var.setPadding(r22Var2.getPaddingLeft(), r22Var2.getPaddingTop(), r22Var2.getPaddingRight(), r22Var2.getPaddingBottom());
        z12 z12Var = this.F;
        int K0 = z12Var.K0();
        if (K0 < 0 || (m = z12Var.m(K0)) == null) {
            return;
        }
        this.y.g1(K0, m.getTop() - r22Var.getPaddingTop());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(final int i) {
        r22 r22Var;
        final float L;
        ValueAnimator ofFloat;
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = i;
        int i2 = 0;
        while (true) {
            int childCount = getChildCount();
            r22Var = this.r;
            if (i2 >= childCount) {
                i2 = 0;
                break;
            } else if (getChildAt(i2) == r22Var) {
                break;
            } else {
                i2++;
            }
        }
        r22 r22Var2 = this.s;
        if (i == 1) {
            L = gl.L(150.0f);
            r22Var2.setAlpha(1.0f);
            r22Var2.setScaleX(1.0f);
            r22Var2.setScaleY(1.0f);
            r22Var2.setTranslationX(0.0f);
            removeView(r22Var2);
            addView(r22Var2, i2);
            r22Var2.setVisibility(0);
            r22Var.setTranslationX(L);
            r22Var.setAlpha(0.0f);
            ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.g0 = ofFloat;
        } else {
            L = gl.L(150.0f);
            r22Var.setAlpha(0.0f);
            r22Var.setScaleX(0.95f);
            r22Var.setScaleY(0.95f);
            r22Var2.setScaleX(1.0f);
            r22Var2.setScaleY(1.0f);
            r22Var2.setTranslationX(0.0f);
            r22Var2.setAlpha(1.0f);
            removeView(r22Var2);
            addView(r22Var2, i2 + 1);
            r22Var2.setVisibility(0);
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g0 = ofFloat;
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m22
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                d32 d32Var = d32.this;
                r22 r22Var3 = d32Var.r;
                r22 r22Var4 = d32Var.s;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                byte b = i;
                float f = L * floatValue;
                if (b == 1) {
                    r22Var3.setTranslationX(f);
                    r22Var3.setAlpha(1.0f - floatValue);
                    r22Var3.invalidate();
                    r22Var4.setAlpha(floatValue);
                    float f2 = (floatValue * 0.05f) + 0.95f;
                    r22Var4.setScaleX(f2);
                    r22Var4.setScaleY(f2);
                    return;
                }
                r22Var4.setTranslationX(f);
                r22Var4.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                r22Var4.invalidate();
                r22Var3.setAlpha(floatValue);
                float f3 = (floatValue * 0.05f) + 0.95f;
                r22Var3.setScaleX(f3);
                r22Var3.setScaleY(f3);
                r22Var4.invalidate();
            }
        });
        this.g0.addListener(new bb1((Object) this, (byte) 15));
        ValueAnimator valueAnimator2 = this.g0;
        if (i == 1) {
            valueAnimator2.setDuration(220L);
        } else {
            valueAnimator2.setDuration(200L);
        }
        this.g0.setInterpolator(s33.f);
        this.g0.start();
    }

    public final void X(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = k96.M0(R.string.AppName, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = str;
        b00.t(null, 2131747638, alertDialog$Builder, null);
    }

    public final void Y() {
        w39 adapter = this.r.getAdapter();
        boolean z = true;
        c32 c32Var = this.E;
        if (adapter != c32Var ? this.w.b() != 1 : !(c32Var.s.isEmpty() && c32Var.Q.isEmpty())) {
            z = false;
        }
        this.M.setVisibility(z ? 0 : 8);
        Z();
    }

    public final void Z() {
        View childAt;
        q22 q22Var = this.M;
        if (q22Var.getVisibility() != 0 || (childAt = this.r.getChildAt(0)) == null) {
            return;
        }
        float translationY = q22Var.getTranslationY();
        this.N = (childAt.getTop() + (q22Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        q22Var.setTranslationY(translationY);
    }

    public final void a0() {
        r7 r7Var = this.G;
        if (r7Var == null || r7Var.w()) {
            return;
        }
        r7Var.setVisibility((this.O || this.w.f.isEmpty()) ? 0 : 8);
    }

    @Override // p02
    public final void d() {
        r7 r7Var = this.G;
        if (r7Var != null) {
            try {
                if (r7Var.getSearchField() != null) {
                    r7Var.getSearchField().setCursorColor(bkb.v0(bkb.i5, this.a));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // p02
    public int getButtonsHideOffset() {
        return gl.L(62.0f);
    }

    @Override // p02
    public int getCurrentItemTop() {
        r22 r22Var = this.r;
        if (r22Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i = 0;
        View childAt = r22Var.getChildAt(0);
        y29 y29Var = (y29) r22Var.G(childAt);
        int y = ((((int) childAt.getY()) - gl.m) - gl.L(4.0f)) - gl.L(8.0f);
        if (y > 0 && y29Var != null && y29Var.b() == 0) {
            i = y;
        }
        if (y < 0 || y29Var == null || y29Var.b() != 0) {
            y = i;
        }
        return gl.L(13.0f) + y;
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(5.0f) + getListTopPadding();
    }

    @Override // p02
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // p02
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override // p02
    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        arrayList.add(new blb(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.i5));
        int i = bkb.z5;
        r22 r22Var = this.r;
        arrayList.add(new blb(r22Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(r22Var, 32, new Class[]{b9a.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.a7));
        arrayList.add(new blb(r22Var, 48, new Class[]{b9a.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        arrayList.add(new blb(r22Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.h6));
        arrayList.add(new blb(r22Var, 0, new Class[]{View.class}, bkb.j0, (Drawable[]) null, (alb) null, bkb.c7));
        arrayList.add(new blb(r22Var, 4, new Class[]{iba.class}, new String[]{"nameTextView"}, (Drawable[]) null, (alb) null, bkb.F6));
        arrayList.add(new blb(r22Var, 4, new Class[]{iba.class}, new String[]{"dateTextView"}, (Drawable[]) null, (alb) null, bkb.z6));
        arrayList.add(new blb(r22Var, TLObject.FLAG_13, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.h7));
        arrayList.add(new blb(r22Var, TLObject.FLAG_14, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.j7));
        arrayList.add(new blb(r22Var, 8, new Class[]{iba.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (alb) null, bkb.pj));
        arrayList.add(new blb(r22Var, 40, new Class[]{iba.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (alb) null, bkb.qj));
        arrayList.add(new blb(r22Var, 4, new Class[]{iba.class}, new String[]{"extTextView"}, (Drawable[]) null, (alb) null, bkb.rj));
        return arrayList;
    }

    @Override // p02
    public final int j() {
        return 1;
    }

    @Override // p02
    public final boolean k() {
        v22 v22Var = this.w;
        if (v22Var.f.size() <= 0) {
            return false;
        }
        V();
        u22 u22Var = (u22) tb4.l(1, v22Var.f);
        this.b.U2.setTitle(u22Var.b);
        int topForScroll = getTopForScroll();
        File file = u22Var.a;
        if (file != null) {
            S(file);
        } else {
            T();
        }
        a0();
        this.F.g1(0, topForScroll);
        W(2);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Z();
    }

    @Override // p02
    public final void q() {
        try {
            if (this.Q) {
                a.b.unregisterReceiver(this.f0);
                this.Q = false;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        this.b.U2.n(true);
        r6 t = this.b.U2.t();
        t.removeView(this.H);
        t.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z) {
        this.a0 = z;
    }

    public void setDelegate(t22 t22Var) {
        this.R = t22Var;
    }

    public void setMaxSelectedFiles(int i) {
        this.W = i;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    @Override // p02
    public final void v() {
        this.H.setVisibility(8);
        this.G.setVisibility(8);
    }

    @Override // p02
    public final void x(int i) {
        if (i == 6) {
            gba.J0 = !gba.J0;
            SharedPreferences.Editor edit = na7.c1().edit();
            edit.putBoolean("sortFilesByName", gba.J0);
            edit.apply();
            this.d0 = gba.J0;
            v22 v22Var = this.w;
            Collections.sort((ArrayList) v22Var.h, new n22(this, (byte) 1));
            if (this.P != null) {
                Collections.sort(v22Var.e, new n22(this, (byte) 0));
            }
            v22Var.f();
            this.H.setIcon(this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
