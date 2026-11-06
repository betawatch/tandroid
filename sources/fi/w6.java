package fi;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.fc;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.kp;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w6 extends org.telegram.ui.Components.na implements ls, org.telegram.messenger.x5, te.b {
    public int A2;
    public final s6 B2;
    public boolean C2;
    public final te.a P1;
    public final int Q1;
    public boolean R1;
    public final w6 S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final kp W1;
    public final c20 X1;
    public ij Y1;
    public boolean Z1;
    public boolean a2;
    public final FrameLayout b2;
    public final ci c2;
    public final dh.g d2;
    public final ri.c e2;
    public final dh.c f2;
    public final u6 g2;
    public f41 h2;
    public ij i2;
    public String j2;
    public int k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public String o2;
    public int p2;
    public final s6 q2;
    public String r2;
    public boolean s2;
    public boolean t2;
    public boolean u2;
    public TLRPC.User v2;
    public boolean w2;
    public boolean x2;
    public int y2;
    public String z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [fi.s6] */
    /* JADX WARN: Type inference failed for: r1v3, types: [fi.s6] */
    /* JADX WARN: Type inference failed for: r4v10, types: [fi.u6] */
    public w6(Context context, boolean z9, w6 w6Var, c20 c20Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(2, context, f6Var, true);
        final int i7 = 2;
        final int i10 = 1;
        xq xqVar = xq.h;
        this.P1 = new te.a(0, this, xqVar, 380L, false);
        this.T1 = new ArrayList();
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.p2 = -1;
        this.q2 = new Runnable(this) { // from class: fi.s6
            public final /* synthetic */ w6 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v24 */
            /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursor;
                switch (i10) {
                    case 0:
                        w6 w6Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            int i11 = -2000000000;
                            Cursor cursor2 = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            while (cursor2.moveToNext()) {
                                try {
                                    cursor2.getInt(0);
                                    String string = cursor2.getString(r42);
                                    String string2 = cursor2.getString(2);
                                    String string3 = cursor2.getString(3);
                                    int i12 = (int) (cursor2.getLong(4) / 1000);
                                    cursor2.getString(5);
                                    File file = new File(string3);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = r42;
                                    tL_message.id = i11;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = cursor2;
                                    try {
                                        long e10 = p10.i(w6Var2.a).e();
                                        tL_peerUser.user_id = e10;
                                        peer.user_id = e10;
                                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                        tL_message.message = "";
                                        tL_message.attachPath = string3;
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                        tL_message.media = tL_messageMediaDocument;
                                        tL_messageMediaDocument.flags |= 3;
                                        tL_messageMediaDocument.document = new TLRPC.TL_document();
                                        tL_message.flags |= 768;
                                        String D = org.telegram.messenger.w7.D(file);
                                        TLRPC.Document document = tL_message.media.document;
                                        document.id = 0L;
                                        document.access_hash = 0L;
                                        document.file_reference = new byte[0];
                                        document.date = tL_message.date;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("audio/");
                                        if (D.length() <= 0) {
                                            D = "mp3";
                                        }
                                        sb2.append(D);
                                        document.mime_type = sb2.toString();
                                        tL_message.media.document.size = (int) file.length();
                                        tL_message.media.document.dc_id = 0;
                                        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                        tL_documentAttributeAudio.duration = i12;
                                        tL_documentAttributeAudio.title = string2;
                                        tL_documentAttributeAudio.performer = string;
                                        tL_documentAttributeAudio.flags |= 3;
                                        tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                        tL_documentAttributeFilename.file_name = file.getName();
                                        tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                        arrayList.add(new ij(w6Var2.a, tL_message, false, true));
                                        i11--;
                                        cursor2 = cursor;
                                        r42 = 1;
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
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursor = cursor2;
                                }
                            }
                            cursor2.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new f2.h(14, w6Var2, arrayList));
                        return;
                    case 1:
                        this.b.h1();
                        return;
                    default:
                        this.b.g1();
                        return;
                }
            }
        };
        this.y2 = -1;
        this.A2 = -2000000000;
        this.B2 = new Runnable(this) { // from class: fi.s6
            public final /* synthetic */ w6 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v24 */
            /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursor;
                switch (i7) {
                    case 0:
                        w6 w6Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            int i11 = -2000000000;
                            Cursor cursor2 = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            while (cursor2.moveToNext()) {
                                try {
                                    cursor2.getInt(0);
                                    String string = cursor2.getString(r42);
                                    String string2 = cursor2.getString(2);
                                    String string3 = cursor2.getString(3);
                                    int i12 = (int) (cursor2.getLong(4) / 1000);
                                    cursor2.getString(5);
                                    File file = new File(string3);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = r42;
                                    tL_message.id = i11;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = cursor2;
                                    try {
                                        long e10 = p10.i(w6Var2.a).e();
                                        tL_peerUser.user_id = e10;
                                        peer.user_id = e10;
                                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                        tL_message.message = "";
                                        tL_message.attachPath = string3;
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                        tL_message.media = tL_messageMediaDocument;
                                        tL_messageMediaDocument.flags |= 3;
                                        tL_messageMediaDocument.document = new TLRPC.TL_document();
                                        tL_message.flags |= 768;
                                        String D = org.telegram.messenger.w7.D(file);
                                        TLRPC.Document document = tL_message.media.document;
                                        document.id = 0L;
                                        document.access_hash = 0L;
                                        document.file_reference = new byte[0];
                                        document.date = tL_message.date;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("audio/");
                                        if (D.length() <= 0) {
                                            D = "mp3";
                                        }
                                        sb2.append(D);
                                        document.mime_type = sb2.toString();
                                        tL_message.media.document.size = (int) file.length();
                                        tL_message.media.document.dc_id = 0;
                                        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                        tL_documentAttributeAudio.duration = i12;
                                        tL_documentAttributeAudio.title = string2;
                                        tL_documentAttributeAudio.performer = string;
                                        tL_documentAttributeAudio.flags |= 3;
                                        tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                        tL_documentAttributeFilename.file_name = file.getName();
                                        tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                        arrayList.add(new ij(w6Var2.a, tL_message, false, true));
                                        i11--;
                                        cursor2 = cursor;
                                        r42 = 1;
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
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursor = cursor2;
                                }
                            }
                            cursor2.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new f2.h(14, w6Var2, arrayList));
                        return;
                    case 1:
                        this.b.h1();
                        return;
                    default:
                        this.b.g1();
                        return;
                }
            }
        };
        this.r1 = 0.35f;
        N();
        Y0();
        this.z1 = org.telegram.messenger.g0.L(4.0f);
        this.A1 = org.telegram.messenger.g0.L(-20.0f);
        this.R1 = z9;
        this.Q1 = org.telegram.messenger.z5.q(this.a).k();
        this.S1 = w6Var;
        this.X1 = c20Var;
        ri.c d = this.X0.d(new t6(this));
        this.e2 = d;
        final int i11 = 0;
        if (Build.VERSION.SDK_INT < 31 || !iz.f()) {
            this.d2 = null;
            this.f2 = new dh.c(d, d, d);
        } else {
            dh.g gVar = new dh.g(false);
            this.d2 = gVar;
            this.X0.a(gVar);
            ri.f fVar = new ri.f(d);
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f2 = cVar;
            cVar.k = true;
            int L = rc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            cVar.j = this.X0;
        }
        this.g2 = new eh.a() { // from class: fi.u6
            @Override // eh.a
            public final void c(dh.a aVar, RectF rectF) {
                aVar.a = true;
            }

            @Override // eh.a
            public final void d(Canvas canvas, RectF rectF) {
                w6 w6Var2 = w6.this;
                pj0 pj0Var = w6Var2.k1;
                ih.d.b(pj0Var, canvas, rectF, pj0Var, w6Var2.b, qs.e4);
            }
        };
        int i12 = org.telegram.ui.ActionBar.k6.a7;
        ci ciVar = new ci(i12, context, f6Var);
        this.c2 = ciVar;
        ciVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b2 = frameLayout;
        r00 r00Var = new r00(context, f6Var);
        r00Var.r.setOnFocusChangeListener(new v6(this, i11));
        r00Var.x = true;
        r00Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        r00Var.updateColors();
        r00Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        r00Var.r.addTextChangedListener(new ah.j(this, 5));
        r00Var.r.setHint(hd.M0(2131745837, null));
        frameLayout.addView(ciVar, c8.ha.g());
        frameLayout.addView(r00Var, c8.ha.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        r00Var.setupBlurredBackground(this.f2.c(r00Var, c8.g0.o(f6Var), false));
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f) + this.t0, 0, org.telegram.messenger.g0.L(8.0f) + this.t0, 0);
        this.b.addView(frameLayout, c8.ha.e(-1, -2, 55));
        w0(i12);
        pj0 pj0Var = this.k1;
        int i13 = this.t0;
        pj0Var.setPadding(i13, 0, i13, 0);
        this.k1.r1();
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        this.k1.setItemAnimator(kVar);
        if (z9) {
            this.W1 = null;
            if (this.R1 && !this.C2) {
                this.C2 = true;
                Utilities.e.c(new Runnable(this) { // from class: fi.s6
                    public final /* synthetic */ w6 b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v1 */
                    /* JADX WARN: Type inference failed for: r4v24 */
                    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Cursor cursor;
                        switch (i11) {
                            case 0:
                                w6 w6Var2 = this.b;
                                String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                                ArrayList arrayList = new ArrayList();
                                ?? r42 = 1;
                                try {
                                    int i112 = -2000000000;
                                    Cursor cursor2 = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                                    while (cursor2.moveToNext()) {
                                        try {
                                            cursor2.getInt(0);
                                            String string = cursor2.getString(r42);
                                            String string2 = cursor2.getString(2);
                                            String string3 = cursor2.getString(3);
                                            int i122 = (int) (cursor2.getLong(4) / 1000);
                                            cursor2.getString(5);
                                            File file = new File(string3);
                                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                            tL_message.out = r42;
                                            tL_message.id = i112;
                                            tL_message.peer_id = new TLRPC.TL_peerUser();
                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                            tL_message.from_id = tL_peerUser;
                                            TLRPC.Peer peer = tL_message.peer_id;
                                            cursor = cursor2;
                                            try {
                                                long e10 = p10.i(w6Var2.a).e();
                                                tL_peerUser.user_id = e10;
                                                peer.user_id = e10;
                                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                                tL_message.message = "";
                                                tL_message.attachPath = string3;
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                                tL_message.media = tL_messageMediaDocument;
                                                tL_messageMediaDocument.flags |= 3;
                                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                                tL_message.flags |= 768;
                                                String D = org.telegram.messenger.w7.D(file);
                                                TLRPC.Document document = tL_message.media.document;
                                                document.id = 0L;
                                                document.access_hash = 0L;
                                                document.file_reference = new byte[0];
                                                document.date = tL_message.date;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("audio/");
                                                if (D.length() <= 0) {
                                                    D = "mp3";
                                                }
                                                sb2.append(D);
                                                document.mime_type = sb2.toString();
                                                tL_message.media.document.size = (int) file.length();
                                                tL_message.media.document.dc_id = 0;
                                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                                tL_documentAttributeAudio.duration = i122;
                                                tL_documentAttributeAudio.title = string2;
                                                tL_documentAttributeAudio.performer = string;
                                                tL_documentAttributeAudio.flags |= 3;
                                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                                tL_documentAttributeFilename.file_name = file.getName();
                                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                                arrayList.add(new ij(w6Var2.a, tL_message, false, true));
                                                i112--;
                                                cursor2 = cursor;
                                                r42 = 1;
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
                                        } catch (Throwable th5) {
                                            th = th5;
                                            cursor = cursor2;
                                        }
                                    }
                                    cursor2.close();
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                                org.telegram.messenger.g0.h3(new f2.h(14, w6Var2, arrayList));
                                return;
                            case 1:
                                this.b.h1();
                                return;
                            default:
                                this.b.g1();
                                return;
                        }
                    }
                });
            }
        } else {
            int i14 = this.a;
            kp kpVar = new kp(i14, p10.i(i14).e());
            this.W1 = kpVar;
            kpVar.b();
            h1();
            g1();
        }
        this.k1.setOnScrollListener(new ai.b(this, 12));
        this.k1.setOnItemClickListener(new di.f0(this, c20Var, f6Var, 1));
        this.X0.b(this.k1);
        this.X0.i(this.b);
        oi.q qVar = this.X0;
        qVar.a = new t6(this);
        qVar.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
    }

    public static boolean i1(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || jg.g.A(" ", str, lowerCase)) {
            return true;
        }
        String O3 = org.telegram.messenger.g0.O3(lowerCase);
        return O3.startsWith(str2) || O3.contains(" ".concat(str2));
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        f41 f41Var = new f41(pj0Var, getContext(), this.a, 0, false, new r6(this, 0), this.I0);
        this.h2 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        ij ijVar = this.Y1;
        if (ijVar == null || !TextUtils.equals(ijVar.S0(), str)) {
            return;
        }
        this.X1.a(this.Y1);
        w6 w6Var = this.S1;
        if (w6Var != null) {
            w6Var.dismiss();
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return hd.M0(2131744609, null);
    }

    @Override // org.telegram.ui.Components.na
    public final void W0(Canvas canvas, View view) {
        j1();
        super.W0(canvas, view);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            ci ciVar = this.c2;
            ciVar.setAlpha(f10);
            ciVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final int d1(boolean z9, ArrayList arrayList, String str, ArrayList arrayList2, boolean z10, boolean z11, int i7) {
        int i10;
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z10)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.j2;
            String lowerCase = str2 == null ? null : str2.toLowerCase();
            String O3 = org.telegram.messenger.g0.O3(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (true) {
                i10 = 1;
                if (i13 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i13);
                i13++;
                ij ijVar = (ij) obj;
                if (!z9) {
                    ijVar.L5(this.j2, true);
                    arrayList3.add(ijVar);
                } else if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.U1) {
                    ijVar.L5(null, true);
                    arrayList3.add(ijVar);
                } else {
                    String z12 = ijVar.z1(true);
                    String x12 = ijVar.x1(true);
                    if (i1(lowerCase, O3, z12) || i1(lowerCase, O3, x12)) {
                        ijVar.L5(this.j2, true);
                        arrayList3.add(ijVar);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z10) {
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    i11 = 0;
                } else {
                    arrayList.add(r31.C(null));
                    i11 = org.telegram.messenger.g0.L(12.0f);
                }
                this.h2.V();
                arrayList.add(r31.u(str));
                int size2 = arrayList3.size();
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    fc fcVar = new fc(this, i10);
                    int i14 = org.telegram.ui.Cells.f7.b;
                    r31 K = r31.K(org.telegram.ui.Cells.f7.class);
                    K.G = (ij) obj2;
                    K.H = fcVar;
                    arrayList.add(K);
                    i11 += org.telegram.messenger.g0.L(56.0f);
                }
                if (z10) {
                    arrayList.add(r31.p(4));
                    arrayList.add(r31.p(4));
                    arrayList.add(r31.p(4));
                    i11 += org.telegram.messenger.g0.L(56.0f) * 3;
                }
                if (z11 && !z10) {
                    r31 c10 = r31.c(i7, R.drawable.arrow_more, hd.M0(2131745340, null));
                    c10.q = true;
                    arrayList.add(c10);
                    i11 += org.telegram.messenger.g0.L(50.0f);
                }
                this.h2.U();
                return i11;
            }
        }
        return 0;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.T3) {
            this.h2.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        if (this.i2 != null && MediaController.B().I(this.i2)) {
            MediaController.B().q(true, true, false, false);
        }
        this.i2 = null;
    }

    public final void e1() {
        if (this.y2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.y2, true);
        }
        this.y2 = -1;
        this.r2 = "";
        this.s2 = false;
        this.V1.clear();
        this.t2 = false;
        this.u2 = false;
    }

    public final void f1() {
        if (this.p2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.p2, true);
        }
        this.p2 = -1;
        this.k2 = 0;
        this.U1.clear();
        this.m2 = false;
        this.n2 = false;
    }

    public final void g1() {
        String str;
        String str2 = ((org.telegram.messenger.n0) qp.s1(this.a).x7.F.b).c;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = this.z2;
        String str4 = this.j2;
        if (str4 == null) {
            str4 = "";
        }
        if (!TextUtils.equals(str3, str4)) {
            e1();
        }
        if (this.t2 || TextUtils.isEmpty(this.j2) || this.j2.length() < 3) {
            return;
        }
        ArrayList arrayList = this.V1;
        if (arrayList.isEmpty() || this.s2) {
            if (this.v2 == null) {
                TLObject f22 = qp.s1(this.a).f2(str2);
                this.v2 = f22 instanceof TLRPC.User ? (TLRPC.User) f22 : null;
            }
            if (this.v2 == null) {
                if (this.w2 || this.x2) {
                    return;
                }
                this.w2 = true;
                qp.s1(this.a).d2().a(str2, null, new ai.i(this, 25));
                return;
            }
            this.t2 = true;
            TLRPC.User f10 = p10.i(this.a).f();
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = qp.s1(this.a).q1(this.v2);
            tL_messages_getInlineBotResults.peer = qp.n1(f10);
            if (arrayList.isEmpty() || (str = this.r2) == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.offset = str;
            String str5 = this.j2;
            String str6 = str5 != null ? str5 : "";
            this.z2 = str6;
            tL_messages_getInlineBotResults.query = str6;
            this.y2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new r6(this, 1));
            this.h2.O(true);
        }
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.Q1;
    }

    public final void h1() {
        if (this.R1) {
            return;
        }
        String str = this.o2;
        String str2 = this.j2;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            f1();
        }
        if (this.m2) {
            return;
        }
        ArrayList arrayList = this.U1;
        if (arrayList.isEmpty() || this.l2) {
            this.m2 = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str3 = this.j2;
            String str4 = str3 != null ? str3 : "";
            this.o2 = str4;
            tL_messages_searchGlobal.q = str4;
            tL_messages_searchGlobal.limit = 20;
            if (arrayList.size() > 0) {
                ij ijVar = (ij) jg.g.i(1, arrayList);
                tL_messages_searchGlobal.offset_id = ijVar.f1();
                tL_messages_searchGlobal.offset_rate = this.k2;
                tL_messages_searchGlobal.offset_peer = qp.s1(this.a).j1(ij.C1(ijVar.k.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.p2 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_searchGlobal, new bi.j0(this, 9));
            this.h2.O(true);
        }
    }

    public final void j1() {
        float f10 = org.telegram.messenger.g0.q.y;
        int i7 = 0;
        while (true) {
            pj0 pj0Var = this.k1;
            if (i7 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        this.b2.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m, f10));
        this.P1.a(f10 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)), true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.a).c(this, qs.T3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.a).n(this, qs.T3);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        try {
            super.s0();
            ri.c cVar = this.e2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
