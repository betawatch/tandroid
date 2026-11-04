package gi;

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
import b8.cd;
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bp;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x6 extends org.telegram.ui.Components.ma implements cs, org.telegram.messenger.x5, qe.b {
    public String A2;
    public int B2;
    public final t6 C2;
    public boolean D2;
    public final qe.a Q1;
    public final int R1;
    public boolean S1;
    public final x6 T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final bp X1;
    public final u10 Y1;
    public zi Z1;
    public boolean a2;
    public boolean b2;
    public final FrameLayout c2;
    public final ai d2;
    public final eh.g e2;
    public final si.c f2;
    public final eh.c g2;
    public final v6 h2;
    public f41 i2;
    public zi j2;
    public String k2;
    public int l2;
    public boolean m2;
    public boolean n2;
    public boolean o2;
    public String p2;
    public int q2;
    public final t6 r2;
    public String s2;
    public boolean t2;
    public boolean u2;
    public boolean v2;
    public TLRPC.User w2;
    public boolean x2;
    public boolean y2;
    public int z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [gi.t6] */
    /* JADX WARN: Type inference failed for: r1v3, types: [gi.t6] */
    /* JADX WARN: Type inference failed for: r4v10, types: [gi.v6] */
    public x6(Context context, boolean z10, x6 x6Var, u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2, context, e6Var, true);
        final int i3 = 2;
        final int i10 = 1;
        xq xqVar = xq.h;
        this.Q1 = new qe.a(0, this, xqVar, 380L, false);
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.q2 = -1;
        this.r2 = new Runnable(this) { // from class: gi.t6
            public final /* synthetic */ x6 b;

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
                        x6 x6Var2 = this.b;
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
                                        long e10 = h10.i(x6Var2.a).e();
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
                                        arrayList.add(new zi(x6Var2.a, tL_message, false, true));
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
                        org.telegram.messenger.g0.h3(new g2.c(20, x6Var2, arrayList));
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
        this.z2 = -1;
        this.B2 = -2000000000;
        this.C2 = new Runnable(this) { // from class: gi.t6
            public final /* synthetic */ x6 b;

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
                switch (i3) {
                    case 0:
                        x6 x6Var2 = this.b;
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
                                        long e10 = h10.i(x6Var2.a).e();
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
                                        arrayList.add(new zi(x6Var2.a, tL_message, false, true));
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
                        org.telegram.messenger.g0.h3(new g2.c(20, x6Var2, arrayList));
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
        this.s1 = 0.35f;
        N();
        Y0();
        this.A1 = org.telegram.messenger.g0.L(4.0f);
        this.B1 = org.telegram.messenger.g0.L(-20.0f);
        this.S1 = z10;
        this.R1 = org.telegram.messenger.z5.q(this.a).k();
        this.T1 = x6Var;
        this.Y1 = u10Var;
        si.c d = this.Y0.d(new u6(this));
        this.f2 = d;
        final int i11 = 0;
        if (Build.VERSION.SDK_INT < 31 || !az.f()) {
            this.e2 = null;
            this.g2 = new eh.c(d, d, d);
        } else {
            eh.g gVar = new eh.g(false);
            this.e2 = gVar;
            this.Y0.a(gVar);
            si.f fVar = new si.f(d);
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            eh.c cVar = new eh.c(fVar, fVar, fVar);
            this.g2 = cVar;
            cVar.k = true;
            int L = lc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            cVar.j = this.Y0;
        }
        this.h2 = new fh.a() { // from class: gi.v6
            @Override // fh.a
            public final void b(eh.a aVar, RectF rectF) {
                aVar.a = true;
            }

            @Override // fh.a
            public final void d(Canvas canvas, RectF rectF) {
                x6 x6Var2 = x6.this;
                tj0 tj0Var = x6Var2.l1;
                jh.d.b(tj0Var, canvas, rectF, tj0Var, x6Var2.b, hs.e4);
            }
        };
        int i12 = org.telegram.ui.ActionBar.k6.a7;
        ai aiVar = new ai(i12, context, e6Var);
        this.d2 = aiVar;
        aiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c2 = frameLayout;
        n00 n00Var = new n00(context, e6Var);
        n00Var.r.setOnFocusChangeListener(new w6(this, i11));
        n00Var.x = true;
        n00Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        n00Var.updateColors();
        n00Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        n00Var.r.addTextChangedListener(new bh.h(this, 5));
        n00Var.r.setHint(bd.M0(2131745846, null));
        frameLayout.addView(aiVar, mf.g());
        frameLayout.addView(n00Var, mf.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        n00Var.setupBlurredBackground(this.g2.c(n00Var, cd.o(e6Var), false));
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f) + this.u0, 0, org.telegram.messenger.g0.L(8.0f) + this.u0, 0);
        this.b.addView(frameLayout, mf.e(-1, -2, 55));
        w0(i12);
        tj0 tj0Var = this.l1;
        int i13 = this.u0;
        tj0Var.setPadding(i13, 0, i13, 0);
        this.l1.r1();
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        this.l1.setItemAnimator(kVar);
        if (z10) {
            this.X1 = null;
            if (this.S1 && !this.D2) {
                this.D2 = true;
                Utilities.e.c(new Runnable(this) { // from class: gi.t6
                    public final /* synthetic */ x6 b;

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
                                x6 x6Var2 = this.b;
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
                                                long e10 = h10.i(x6Var2.a).e();
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
                                                arrayList.add(new zi(x6Var2.a, tL_message, false, true));
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
                                org.telegram.messenger.g0.h3(new g2.c(20, x6Var2, arrayList));
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
            bp bpVar = new bp(i14, h10.i(i14).e());
            this.X1 = bpVar;
            bpVar.b();
            h1();
            g1();
        }
        this.l1.setOnScrollListener(new ai.j5(this, 15));
        this.l1.setOnItemClickListener(new ei.h0(this, u10Var, e6Var, 1));
        this.Y0.b(this.l1);
        this.Y0.i(this.b);
        pi.q qVar = this.Y0;
        qVar.a = new u6(this);
        qVar.d = new ri.b(org.telegram.messenger.g0.L(48.0f));
    }

    public static boolean i1(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || k2.p1.z(" ", str, lowerCase)) {
            return true;
        }
        String O3 = org.telegram.messenger.g0.O3(lowerCase);
        return O3.startsWith(str2) || O3.contains(" ".concat(str2));
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.a, 0, false, new s6(this, 0), this.J0);
        this.i2 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        zi ziVar = this.Z1;
        if (ziVar == null || !TextUtils.equals(ziVar.S0(), str)) {
            return;
        }
        this.Y1.a(this.Z1);
        x6 x6Var = this.T1;
        if (x6Var != null) {
            x6Var.dismiss();
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return bd.M0(2131744618, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final void W0(Canvas canvas, View view) {
        j1();
        super.W0(canvas, view);
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            ai aiVar = this.d2;
            aiVar.setAlpha(f10);
            aiVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final int d1(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i3) {
        int i10;
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.k2;
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
                zi ziVar = (zi) obj;
                if (!z10) {
                    ziVar.L5(this.k2, true);
                    arrayList3.add(ziVar);
                } else if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.V1) {
                    ziVar.L5(null, true);
                    arrayList3.add(ziVar);
                } else {
                    String z13 = ziVar.z1(true);
                    String x12 = ziVar.x1(true);
                    if (i1(lowerCase, O3, z13) || i1(lowerCase, O3, x12)) {
                        ziVar.L5(this.k2, true);
                        arrayList3.add(ziVar);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    i11 = 0;
                } else {
                    arrayList.add(r31.C(null));
                    i11 = org.telegram.messenger.g0.L(12.0f);
                }
                this.i2.V();
                arrayList.add(r31.u(str));
                int size2 = arrayList3.size();
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    ci.ab abVar = new ci.ab(this, i10);
                    int i14 = org.telegram.ui.Cells.e7.b;
                    r31 K = r31.K(org.telegram.ui.Cells.e7.class);
                    K.G = (zi) obj2;
                    K.H = abVar;
                    arrayList.add(K);
                    i11 += org.telegram.messenger.g0.L(56.0f);
                }
                if (z11) {
                    arrayList.add(r31.p(4));
                    arrayList.add(r31.p(4));
                    arrayList.add(r31.p(4));
                    i11 += org.telegram.messenger.g0.L(56.0f) * 3;
                }
                if (z12 && !z11) {
                    r31 c2 = r31.c(i3, R.drawable.arrow_more, bd.M0(2131745349, null));
                    c2.q = true;
                    arrayList.add(c2);
                    i11 += org.telegram.messenger.g0.L(50.0f);
                }
                this.i2.U();
                return i11;
            }
        }
        return 0;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.T3) {
            this.i2.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        if (this.j2 != null && MediaController.B().I(this.j2)) {
            MediaController.B().q(true, true, false, false);
        }
        this.j2 = null;
    }

    public final void e1() {
        if (this.z2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.z2, true);
        }
        this.z2 = -1;
        this.s2 = "";
        this.t2 = false;
        this.W1.clear();
        this.u2 = false;
        this.v2 = false;
    }

    public final void f1() {
        if (this.q2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.q2, true);
        }
        this.q2 = -1;
        this.l2 = 0;
        this.V1.clear();
        this.n2 = false;
        this.o2 = false;
    }

    public final void g1() {
        String str;
        String str2 = ((org.telegram.messenger.n0) hp.s1(this.a).x7.F.b).c;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = this.A2;
        String str4 = this.k2;
        if (str4 == null) {
            str4 = "";
        }
        if (!TextUtils.equals(str3, str4)) {
            e1();
        }
        if (this.u2 || TextUtils.isEmpty(this.k2) || this.k2.length() < 3) {
            return;
        }
        ArrayList arrayList = this.W1;
        if (arrayList.isEmpty() || this.t2) {
            if (this.w2 == null) {
                TLObject f22 = hp.s1(this.a).f2(str2);
                this.w2 = f22 instanceof TLRPC.User ? (TLRPC.User) f22 : null;
            }
            if (this.w2 == null) {
                if (this.x2 || this.y2) {
                    return;
                }
                this.x2 = true;
                hp.s1(this.a).d2().a(str2, null, new ai.v2(this, 28));
                return;
            }
            this.u2 = true;
            TLRPC.User f10 = h10.i(this.a).f();
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = hp.s1(this.a).q1(this.w2);
            tL_messages_getInlineBotResults.peer = hp.n1(f10);
            if (arrayList.isEmpty() || (str = this.s2) == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.offset = str;
            String str5 = this.k2;
            String str6 = str5 != null ? str5 : "";
            this.A2 = str6;
            tL_messages_getInlineBotResults.query = str6;
            this.z2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getInlineBotResults, new c3.b(1), new s6(this, 1));
            this.i2.O(true);
        }
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.R1;
    }

    public final void h1() {
        if (this.S1) {
            return;
        }
        String str = this.p2;
        String str2 = this.k2;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            f1();
        }
        if (this.n2) {
            return;
        }
        ArrayList arrayList = this.V1;
        if (arrayList.isEmpty() || this.m2) {
            this.n2 = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str3 = this.k2;
            String str4 = str3 != null ? str3 : "";
            this.p2 = str4;
            tL_messages_searchGlobal.q = str4;
            tL_messages_searchGlobal.limit = 20;
            if (arrayList.size() > 0) {
                zi ziVar = (zi) k2.p1.h(1, arrayList);
                tL_messages_searchGlobal.offset_id = ziVar.f1();
                tL_messages_searchGlobal.offset_rate = this.l2;
                tL_messages_searchGlobal.offset_peer = hp.s1(this.a).j1(zi.C1(ziVar.k.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.q2 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_searchGlobal, new ci.d0(this, 9));
            this.i2.O(true);
        }
    }

    public final void j1() {
        float f10 = org.telegram.messenger.g0.q.y;
        int i3 = 0;
        while (true) {
            tj0 tj0Var = this.l1;
            if (i3 >= tj0Var.getChildCount()) {
                break;
            }
            View childAt = tj0Var.getChildAt(i3);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i3++;
        }
        this.c2.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m, f10));
        this.Q1.a(f10 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)), true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.a).c(this, hs.T3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.a).n(this, hs.T3);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        try {
            super.s0();
            si.c cVar = this.f2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
