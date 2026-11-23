package hi;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.gp;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.pc;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e7 extends org.telegram.ui.Components.ra implements fs, org.telegram.messenger.y5, te.b {
    public boolean A2;
    public boolean B2;
    public int C2;
    public String D2;
    public int E2;
    public final z6 F2;
    public boolean G2;
    public final te.a T1;
    public final int U1;
    public boolean V1;
    public final e7 W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final gp a2;
    public final w10 b2;
    public fj c2;
    public boolean d2;
    public boolean e2;
    public final FrameLayout f2;
    public final si g2;
    public final dh.g h2;
    public final ui.c i2;
    public final dh.c j2;
    public final b7 k2;
    public b51 l2;
    public fj m2;
    public String n2;
    public int o2;
    public boolean p2;
    public boolean q2;
    public boolean r2;
    public String s2;
    public int t2;
    public final z6 u2;
    public String v2;
    public boolean w2;
    public boolean x2;
    public boolean y2;
    public TLRPC.User z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [hi.z6] */
    /* JADX WARN: Type inference failed for: r1v3, types: [hi.z6] */
    public e7(Context context, boolean z10, e7 e7Var, w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(2, context, i6Var, true);
        final int i7 = 2;
        final int i10 = 1;
        kr krVar = kr.h;
        this.T1 = new te.a(0, this, krVar, 380L, false);
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.t2 = -1;
        this.u2 = new Runnable(this) { // from class: hi.z6
            public final /* synthetic */ e7 b;

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
                        e7 e7Var2 = this.b;
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
                                        long e10 = i10.i(e7Var2.a).e();
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
                                        arrayList.add(new fj(e7Var2.a, tL_message, false, true));
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
                        org.telegram.messenger.g0.g3(new c(14, e7Var2, arrayList));
                        return;
                    case 1:
                        this.b.i1();
                        return;
                    default:
                        this.b.h1();
                        return;
                }
            }
        };
        this.C2 = -1;
        this.E2 = -2000000000;
        this.F2 = new Runnable(this) { // from class: hi.z6
            public final /* synthetic */ e7 b;

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
                        e7 e7Var2 = this.b;
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
                                        long e10 = i10.i(e7Var2.a).e();
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
                                        arrayList.add(new fj(e7Var2.a, tL_message, false, true));
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
                        org.telegram.messenger.g0.g3(new c(14, e7Var2, arrayList));
                        return;
                    case 1:
                        this.b.i1();
                        return;
                    default:
                        this.b.h1();
                        return;
                }
            }
        };
        this.v1 = 0.35f;
        O();
        Z0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-20.0f);
        this.V1 = z10;
        this.U1 = org.telegram.messenger.a6.q(this.a).k();
        this.W1 = e7Var;
        this.b2 = w10Var;
        ui.c d = this.Y0.d(new a7(this));
        this.i2 = d;
        final int i11 = 0;
        if (Build.VERSION.SDK_INT < 31 || !bz.f()) {
            this.h2 = null;
            this.j2 = new dh.c(d, d, d);
        } else {
            dh.g gVar = new dh.g(false);
            this.h2 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(d);
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.j2 = cVar;
            cVar.k = true;
            int L = pc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            cVar.j = this.Y0;
        }
        this.k2 = new b7(this, 0);
        int i12 = org.telegram.ui.ActionBar.n6.a7;
        si siVar = new si(i12, context, i6Var);
        this.g2 = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2 = frameLayout;
        c10 c10Var = new c10(context, i6Var);
        c10Var.r.setOnFocusChangeListener(new d7(this, i11));
        c10Var.x = true;
        c10Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        c10Var.updateColors();
        c10Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        c10Var.r.addTextChangedListener(new ah.j(this, 7));
        c10Var.r.setHint(gd.N0(2131745640, null));
        frameLayout.addView(siVar, c8.na.g());
        frameLayout.addView(c10Var, c8.na.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        c10Var.setupBlurredBackground(this.j2.c(c10Var, c8.j0.o(i6Var), false));
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f) + this.u0, 0, org.telegram.messenger.g0.L(8.0f) + this.u0, 0);
        this.b.addView(frameLayout, c8.na.e(-1, -2, 55));
        w0(i12);
        ek0 ek0Var = this.o1;
        int i13 = this.u0;
        ek0Var.setPadding(i13, 0, i13, 0);
        this.o1.r1();
        v4.l lVar = new v4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(krVar);
        lVar.n(350L);
        this.o1.setItemAnimator(lVar);
        if (z10) {
            this.a2 = null;
            if (this.V1 && !this.G2) {
                this.G2 = true;
                Utilities.e.c(new Runnable(this) { // from class: hi.z6
                    public final /* synthetic */ e7 b;

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
                                e7 e7Var2 = this.b;
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
                                                long e10 = i10.i(e7Var2.a).e();
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
                                                arrayList.add(new fj(e7Var2.a, tL_message, false, true));
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
                                org.telegram.messenger.g0.g3(new c(14, e7Var2, arrayList));
                                return;
                            case 1:
                                this.b.i1();
                                return;
                            default:
                                this.b.h1();
                                return;
                        }
                    }
                });
            }
        } else {
            int i14 = this.a;
            gp gpVar = new gp(i14, i10.i(i14).e());
            this.a2 = gpVar;
            gpVar.b();
            i1();
            h1();
        }
        this.o1.setOnScrollListener(new bi.v1(this, 16));
        this.o1.setOnItemClickListener(new bi.u1(this, w10Var, i6Var, 2));
        this.Y0.b(this.o1);
        this.Y0.i(this.b);
        ri.q qVar = this.Y0;
        qVar.a = new a7(this);
        qVar.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
    }

    public static boolean j1(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || i5.c.B(" ", str, lowerCase)) {
            return true;
        }
        String M3 = org.telegram.messenger.g0.M3(lowerCase);
        return M3.startsWith(str2) || M3.contains(" ".concat(str2));
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            si siVar = this.g2;
            siVar.setAlpha(f10);
            siVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.a, 0, false, new y6(this, 0), this.J0);
        this.l2 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        fj fjVar = this.c2;
        if (fjVar == null || !TextUtils.equals(fjVar.S0(), str)) {
            return;
        }
        this.b2.a(this.c2);
        e7 e7Var = this.W1;
        if (e7Var != null) {
            e7Var.dismiss();
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return gd.N0(2131744364, null);
    }

    @Override // org.telegram.ui.Components.ra
    public final void X0(Canvas canvas, View view) {
        k1();
        super.X0(canvas, view);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.W3) {
            this.l2.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        if (this.m2 != null && MediaController.B().I(this.m2)) {
            MediaController.B().q(true, true, false, false);
        }
        this.m2 = null;
    }

    public final int e1(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i7) {
        int i10;
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.n2;
            String lowerCase = str2 == null ? null : str2.toLowerCase();
            String M3 = org.telegram.messenger.g0.M3(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (true) {
                i10 = 1;
                if (i13 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i13);
                i13++;
                fj fjVar = (fj) obj;
                if (!z10) {
                    fjVar.K5(this.n2, true);
                    arrayList3.add(fjVar);
                } else if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.Y1) {
                    fjVar.K5(null, true);
                    arrayList3.add(fjVar);
                } else {
                    String y12 = fjVar.y1(true);
                    String w12 = fjVar.w1(true);
                    if (j1(lowerCase, M3, y12) || j1(lowerCase, M3, w12)) {
                        fjVar.K5(this.n2, true);
                        arrayList3.add(fjVar);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    i11 = 0;
                } else {
                    arrayList.add(n41.C(null));
                    i11 = org.telegram.messenger.g0.L(12.0f);
                }
                this.l2.V();
                arrayList.add(n41.u(str));
                int size2 = arrayList3.size();
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    di.ta taVar = new di.ta(this, i10);
                    int i14 = org.telegram.ui.Cells.f7.b;
                    n41 K = n41.K(org.telegram.ui.Cells.f7.class);
                    K.H = (fj) obj2;
                    K.I = taVar;
                    arrayList.add(K);
                    i11 += org.telegram.messenger.g0.L(56.0f);
                }
                if (z11) {
                    arrayList.add(n41.p(4));
                    arrayList.add(n41.p(4));
                    arrayList.add(n41.p(4));
                    i11 += org.telegram.messenger.g0.L(56.0f) * 3;
                }
                if (z12 && !z11) {
                    n41 c10 = n41.c(i7, R.drawable.arrow_more, gd.N0(2131745143, null));
                    c10.r = true;
                    arrayList.add(c10);
                    i11 += org.telegram.messenger.g0.L(50.0f);
                }
                this.l2.U();
                return i11;
            }
        }
        return 0;
    }

    public final void f1() {
        if (this.C2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.C2, true);
        }
        this.C2 = -1;
        this.v2 = "";
        this.w2 = false;
        this.Z1.clear();
        this.x2 = false;
        this.y2 = false;
    }

    public final void g1() {
        if (this.t2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.t2, true);
        }
        this.t2 = -1;
        this.o2 = 0;
        this.Y1.clear();
        this.q2 = false;
        this.r2 = false;
    }

    @Override // org.telegram.messenger.y5
    public final int getObserverTag() {
        return this.U1;
    }

    public final void h1() {
        String str;
        String str2 = ((org.telegram.messenger.n0) mp.u1(this.a).A7.K.b).c;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = this.D2;
        String str4 = this.n2;
        if (str4 == null) {
            str4 = "";
        }
        if (!TextUtils.equals(str3, str4)) {
            f1();
        }
        if (this.x2 || TextUtils.isEmpty(this.n2) || this.n2.length() < 3) {
            return;
        }
        ArrayList arrayList = this.Z1;
        if (arrayList.isEmpty() || this.w2) {
            if (this.z2 == null) {
                TLObject h22 = mp.u1(this.a).h2(str2);
                this.z2 = h22 instanceof TLRPC.User ? (TLRPC.User) h22 : null;
            }
            if (this.z2 == null) {
                if (this.A2 || this.B2) {
                    return;
                }
                this.A2 = true;
                mp.u1(this.a).f2().a(str2, null, new c7(this, 0));
                return;
            }
            this.x2 = true;
            TLRPC.User f10 = i10.i(this.a).f();
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = mp.u1(this.a).s1(this.z2);
            tL_messages_getInlineBotResults.peer = mp.p1(f10);
            if (arrayList.isEmpty() || (str = this.v2) == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.offset = str;
            String str5 = this.n2;
            String str6 = str5 != null ? str5 : "";
            this.D2 = str6;
            tL_messages_getInlineBotResults.query = str6;
            this.C2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new y6(this, 1));
            this.l2.O(true);
        }
    }

    public final void i1() {
        if (this.V1) {
            return;
        }
        String str = this.s2;
        String str2 = this.n2;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            g1();
        }
        if (this.q2) {
            return;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList.isEmpty() || this.p2) {
            this.q2 = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str3 = this.n2;
            String str4 = str3 != null ? str3 : "";
            this.s2 = str4;
            tL_messages_searchGlobal.q = str4;
            tL_messages_searchGlobal.limit = 20;
            if (arrayList.size() > 0) {
                fj fjVar = (fj) i5.c.h(1, arrayList);
                tL_messages_searchGlobal.offset_id = fjVar.e1();
                tL_messages_searchGlobal.offset_rate = this.o2;
                tL_messages_searchGlobal.offset_peer = mp.u1(this.a).l1(fj.B1(fjVar.k.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.t2 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_searchGlobal, new ai.b1(this, 10));
            this.l2.O(true);
        }
    }

    public final void k1() {
        float f10 = org.telegram.messenger.g0.q.y;
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.o1;
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        this.f2.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m, f10));
        this.T1.a(f10 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)), true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.a).c(this, ks.W3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.a).n(this, ks.W3);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            ui.c cVar = this.i2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
    }

    @Override // te.b
    public final /* synthetic */ void G(float f10, int i7) {
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
