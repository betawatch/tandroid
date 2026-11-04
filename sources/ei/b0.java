package ei;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import b8.mf;
import gi.ha;
import gi.oa;
import gi.qa;
import gi.ua;
import gi.va;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u10;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.wo;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0231 A[Catch: all -> 0x01bc, TryCatch #1 {all -> 0x01bc, blocks: (B:90:0x0172, B:93:0x0182, B:95:0x01a2, B:97:0x01ad, B:99:0x01c2, B:101:0x01c8, B:104:0x0219, B:106:0x0231, B:107:0x0236, B:112:0x01ec, B:114:0x01f0), top: B:89:0x0172 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        g1 g1Var;
        ua uaVar;
        q9 q9Var;
        int i3;
        boolean z10;
        m3 m3Var;
        i4 i4Var;
        int i10;
        int i11 = 12;
        String str = null;
        switch (this.a) {
            case 0:
                ((r9) this.b).V(ProfileActivity.A4(((u0) this.c).c));
                break;
            case 1:
                k2 k2Var = (k2) this.b;
                org.telegram.messenger.g0.g(((p0) this.c).w);
                if (org.telegram.messenger.g0.I3()) {
                    Toast.makeText(k2Var.getContext(), bd.M0(2131744204, null), 0).show();
                    break;
                }
                break;
            case 2:
                k2 k2Var2 = (k2) this.b;
                u0 u0Var = (u0) this.c;
                long j10 = u0Var.c;
                j4 j4Var = k2Var2.j0;
                if (j10 != h10.i(j4Var.m2).e() && ((g1Var = k2Var2.i0.B0) == null || j10 != org.telegram.messenger.m5.o(g1Var.i()))) {
                    if (j4Var.y3 != null) {
                        for (int i12 = 0; i12 < j4Var.y3.peers.size(); i12++) {
                            if (j10 != org.telegram.messenger.m5.o(j4Var.y3.peers.get(i12).peer)) {
                            }
                        }
                    }
                    Context context = k2Var2.getContext();
                    long j11 = u0Var.c;
                    d0 d0Var = new d0(r8, k2Var2, u0Var);
                    k0 k0Var = new k0(1);
                    org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, context, (org.telegram.ui.ActionBar.e6) k0Var, false);
                    t2Var.N();
                    LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                    TextView g7 = org.telegram.messenger.k5.g(context, 1, 20.0f);
                    org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.j5, k0Var);
                    g7.setTypeface(org.telegram.messenger.g0.o());
                    g7.setText(bd.M0(2131751497, null));
                    f10.addView(g7, mf.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, k0Var);
                    n4Var.setText(bd.M0(2131751594, null));
                    f10.addView(n4Var, mf.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 4, 21, true, k0Var);
                    wo checkBoxRound = c2Var.getCheckBoxRound();
                    int i13 = org.telegram.ui.ActionBar.k6.V6;
                    int i14 = org.telegram.ui.ActionBar.k6.g7;
                    int i15 = org.telegram.ui.ActionBar.k6.k7;
                    checkBoxRound.b(i13, i14, i15);
                    c2Var.e(bd.M0(2131751503, null), null, false, true, false);
                    c2Var.setOnClickListener(new View.OnClickListener() { // from class: ei.e0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    c2Var.c(!r3.b(), true);
                                    break;
                                case 1:
                                    c2Var.c(!r3.b(), true);
                                    break;
                                default:
                                    c2Var.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    int i16 = org.telegram.ui.ActionBar.k6.i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i16, k0Var), 2, -1);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
                    c2Var.setBackground(h02);
                    org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, k0Var);
                    f10.addView(c2Var, mf.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(context, 4, 21, true, k0Var);
                    c2Var2.getCheckBoxRound().b(i13, i14, i15);
                    c2Var2.e(bd.a0(null, null, 2131751588, org.telegram.messenger.m5.l(h10.t0, j11)), null, false, true, false);
                    final int i17 = 1;
                    c2Var2.setOnClickListener(new View.OnClickListener() { // from class: ei.e0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i17) {
                                case 0:
                                    c2Var2.c(!r3.b(), true);
                                    break;
                                case 1:
                                    c2Var2.c(!r3.b(), true);
                                    break;
                                default:
                                    c2Var2.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i16, k0Var), 2, -1);
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
                    c2Var2.setBackground(h03);
                    org.telegram.ui.ActionBar.r6.k(c2Var2, h03, null, N2, k0Var);
                    f10.addView(c2Var2, mf.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(context, 4, 21, true, k0Var);
                    c2Var3.getCheckBoxRound().b(i13, i14, i15);
                    c2Var3.e(bd.a0(null, null, 2131751569, org.telegram.messenger.m5.l(h10.t0, j11)), null, false, false, false);
                    final int i18 = 2;
                    c2Var3.setOnClickListener(new View.OnClickListener() { // from class: ei.e0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    c2Var3.c(!r3.b(), true);
                                    break;
                                case 1:
                                    c2Var3.c(!r3.b(), true);
                                    break;
                                default:
                                    c2Var3.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i16, k0Var), 2, -1);
                    org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i16);
                    c2Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.r6.k(c2Var3, h04, null, N3, k0Var);
                    f10.addView(c2Var3, mf.o(-1, -2));
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, k0Var);
                    y8Var.setBackgroundColor(-16777216);
                    y8Var.setFixedSize(12);
                    f10.addView(y8Var, mf.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    gi.d dVar = new gi.d(context, k0Var, true);
                    dVar.i(bd.M0(2131751514, null), false, true);
                    dVar.setOnClickListener(new f0(c2Var, c2Var2, c2Var3, d0Var, t2Var, 0));
                    frameLayout.addView(dVar, mf.d(-1, 48.0f, hs.E1, 16.0f, 16.0f, 16.0f, 16.0f));
                    f10.addView(frameLayout, mf.o(-1, -2));
                    t2Var.O = f10;
                    t2Var.show();
                    break;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = k2Var2.P;
                deletegroupcallmessages.messages.add(Integer.valueOf(u0Var.a));
                ConnectionsManager.getInstance(k2Var2.O).sendRequest(deletegroupcallmessages, null);
                k2Var2.c(u0Var.a);
                break;
            case 3:
                g1 g1Var2 = (g1) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    hs.f(g1Var2.e).k(hs.H2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                break;
            case 4:
                ((g1) this.b).G.remove((String) this.c);
                break;
            case 5:
                j4 j4Var2 = (j4) this.b;
                gi.l3 l3Var = (gi.l3) this.c;
                j4Var2.removeView(l3Var);
                if (j4Var2.N1 == l3Var) {
                    j4Var2.N1 = null;
                    break;
                }
                break;
            case 6:
                j4 j4Var3 = (j4) this.b;
                va D = va.D((Activity) this.c, j4Var3.m2);
                i4 i4Var2 = j4Var3.w2;
                long j12 = (i4Var2 == null || (q9Var = (q9) i4Var2.c) == null) ? 0L : q9Var.currentPosition;
                File h = j4Var3.y1.h();
                TL_stories.StoryItem storyItem = j4Var3.y1.a;
                gi.f7 f7Var = new gi.f7();
                f7Var.n = true;
                f7Var.t = storyItem.media;
                int i20 = f7Var.a;
                f7Var.q = hp.s1(i20).z1(storyItem.dialogId);
                f7Var.r = storyItem.id;
                f7Var.s = storyItem.caption;
                f7Var.L = h;
                f7Var.M = false;
                f7Var.k0 = 720;
                f7Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    f7Var.K = false;
                    if (h != null) {
                        f7Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    f7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i21 = 0;
                        while (true) {
                            if (i21 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i21);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    f7Var.k0 = documentAttribute.w;
                                    f7Var.l0 = documentAttribute.h;
                                    f7Var.i = documentAttribute.duration;
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            f7Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i22 = 0; i22 < storyItem.media.document.thumbs.size(); i22++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i22);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    f7Var.O = zb.F(null, photoSize.bytes);
                                } else {
                                    org.telegram.messenger.w7.G(i20);
                                    File K = org.telegram.messenger.w7.K(photoSize, null, true, true);
                                    if (K != null && K.exists()) {
                                        f7Var.N = K.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                f7Var.A();
                f7Var.e(storyItem);
                oa d = qa.d(j4Var3.t0);
                RectF rectF = D.I;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f;
                int i23 = D.c;
                if (!D.d) {
                    if (hp.s1(i23).v2()) {
                        org.telegram.ui.b.b(i23);
                    } else {
                        D.v0 = false;
                        D.e = false;
                        D.C2 = false;
                        if (windowManager != null && (uaVar = D.n) != null && uaVar.getParent() == null) {
                            org.telegram.messenger.g0.y3(windowManager, D.n, layoutParams);
                            windowManager.addView(D.n, layoutParams);
                            D.f0();
                        }
                        D.L1 = f7Var;
                        gi.u8.a(i23, f7Var);
                        gi.f7 f7Var2 = D.L1;
                        D.P1 = (f7Var2 == null || !f7Var2.K) ? 0 : 1;
                        D.t0.g = false;
                        if (d != null) {
                            D.G = d;
                            D.K = d.a;
                            rectF.set(d.c);
                            D.H = d.b;
                            D.G.e();
                        } else {
                            D.K = 0;
                            float L = org.telegram.messenger.g0.L(100.0f);
                            Point point = org.telegram.messenger.g0.q;
                            rectF.set(0.0f, L, point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
                            D.H = org.telegram.messenger.g0.L(8.0f);
                        }
                        D.r.c();
                        ha haVar = D.i0;
                        int i24 = D.K;
                        haVar.setBackgroundColor((i24 == 1 || i24 == 0) ? 0 : -14737633);
                        D.r.setTranslationX(0.0f);
                        D.r.setTranslationY(0.0f);
                        D.r.b(0.0f);
                        D.r.setScaleX(1.0f);
                        D.r.setScaleY(1.0f);
                        D.L = 0.0f;
                        org.telegram.messenger.g0.g2(D.b);
                        gi.f7 f7Var3 = D.L1;
                        if (f7Var3 != null) {
                            D.d1.setText(f7Var3.C0);
                        }
                        D.K(new gi.v8(D, 7), j12);
                        D.c1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.w0 = 0L;
                        D.x0 = "";
                    }
                }
                D.R = new a2(j4Var3, i11);
                D.S = new f2(r8, j4Var3, D);
                break;
            case 7:
                b4 b4Var = (b4) this.c;
                r9 r9Var = (r9) this.b;
                b4Var.getClass();
                ((i9) b4Var.x.A1).h(new vg.v0(r9Var.f, 14, false));
                break;
            case 8:
                v4 v4Var = (v4) this.b;
                String str3 = (String) this.c;
                v4Var.f = null;
                k5 k5Var = v4Var.h;
                k5Var.R = false;
                k5Var.P.c = str3.toLowerCase();
                k5.b(k5Var);
                break;
            case 9:
                u10 u10Var = (u10) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (u10Var != null) {
                    u10Var.a(Boolean.valueOf(tL_error == null));
                    break;
                }
                break;
            case 10:
                l6 l6Var = (l6) this.b;
                TLObject tLObject = (TLObject) this.c;
                o6 o6Var = l6Var.q;
                int i25 = l6Var.c;
                ArrayList arrayList2 = l6Var.i;
                l6Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    hp.s1(i25).Y3(tL_foundStories.users, false);
                    hp.s1(i25).S3(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList3 = tL_foundStories.stories;
                    int size2 = arrayList3.size();
                    int i26 = 0;
                    while (i26 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList3.get(i26);
                        i26++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = org.telegram.messenger.m5.o(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList2.size();
                        zi ziVar = new zi(i25, tL_foundStory2.storyItem);
                        ziVar.r0(false);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(Integer.valueOf(arrayList2.size()));
                        l6Var.F.add(arrayList4);
                        arrayList2.add(ziVar);
                    }
                    l6Var.J = Math.max(arrayList2.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        l6Var.J = arrayList2.size();
                    }
                    if (arrayList2.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    l6Var.H = str;
                    l6Var.G = false;
                    org.telegram.messenger.g0.r(o6Var);
                    org.telegram.messenger.g0.h3(o6Var);
                    break;
                }
                break;
            case 11:
                n6 n6Var = (n6) this.b;
                List list = (List) this.c;
                ArrayList arrayList5 = n6Var.h;
                arrayList5.clear();
                arrayList5.addAll(list);
                n6Var.d = true;
                n6Var.e = false;
                n6Var.d();
                hs.f(n6Var.a).k(hs.j3, Long.valueOf(n6Var.b), n6Var);
                break;
            case 12:
                n6 n6Var2 = (n6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList6 = n6Var2.g;
                ArrayList arrayList7 = n6Var2.h;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList8 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList9 = tL_albums.albums;
                    int size3 = arrayList9.size();
                    int i27 = 0;
                    while (i27 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList9.get(i27);
                        i27++;
                        arrayList8.add(s6.a(tL_storyAlbum));
                    }
                    arrayList7.clear();
                    arrayList7.addAll(arrayList8);
                    arrayList6.clear();
                    arrayList6.addAll(arrayList8);
                    n6Var2.f = true;
                    n6Var2.e = false;
                    n6Var2.f(true);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList7.clear();
                    arrayList7.addAll(arrayList6);
                    n6Var2.f = true;
                    n6Var2.e = false;
                    hs.f(n6Var2.a).k(hs.j3, Long.valueOf(n6Var2.b), n6Var2);
                    break;
                }
                break;
            case 13:
                r6 r6Var = (r6) this.b;
                u10 u10Var2 = (u10) this.c;
                r6Var.getClass();
                u10Var2.a(r6Var);
                break;
            case 14:
                hp.s1(((y6) this.b).N.a).P1().c0((TL_stories.TL_updateStory) this.c);
                break;
            case 15:
                y6 y6Var = (y6) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                gi.f7 f7Var4 = y6Var.c;
                f7Var4.w = true;
                z6 z6Var = y6Var.N;
                if (z6Var.n(tL_error2)) {
                    f7Var4.x = null;
                } else {
                    f7Var4.x = tL_error2;
                }
                y6Var.d = true;
                y6Var.J = true;
                y6Var.I = true;
                z6Var.w.d(f7Var4);
                break;
            case 16:
                y6 y6Var2 = (y6) this.b;
                y6Var2.c.c((File) this.c);
                org.telegram.messenger.g0.h3(new w6(y6Var2, r8));
                break;
            case 17:
                m7.a((m7) this.b, (y5) this.c);
                break;
            case 18:
                m7 m7Var = (m7) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                qr qrVar = m7Var.b;
                SQLiteDatabase sQLiteDatabase = qrVar.b;
                try {
                    long o10 = org.telegram.messenger.m5.o(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    int i28 = storyItem2.id;
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + o10 + " AND story_id = " + i28, new Object[0]);
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue != null) {
                                m8.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                                byteBufferValue.reuse();
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        queryFinalized.dispose();
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + o10 + " AND story_id = " + i28).stepThis().dispose();
                        if (z10) {
                            i3 = -1;
                            SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o10, new Object[0]);
                            r8 = queryFinalized2.next() ? queryFinalized2.intValue(1) : 0;
                            queryFinalized2.dispose();
                            Locale locale2 = Locale.US;
                            sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r8 + i3) + " WHERE dialog_id = " + o10).stepThis().dispose();
                            break;
                        }
                        i3 = 0;
                        SQLiteCursor queryFinalized22 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o10, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r8 + i3) + " WHERE dialog_id = " + o10).stepThis().dispose();
                    } else {
                        if (storyItem2 instanceof TL_stories.TL_storyItem) {
                            m7Var.l(o10, storyItem2);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = sQLiteDatabase.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + o10 + " AND story_id = " + i28, new Object[0]);
                            boolean next = queryFinalized3.next();
                            queryFinalized3.dispose();
                            if (!next) {
                                i3 = 1;
                                SQLiteCursor queryFinalized222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o10, new Object[0]);
                                if (queryFinalized222.next()) {
                                }
                                queryFinalized222.dispose();
                                Locale locale222 = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r8 + i3) + " WHERE dialog_id = " + o10).stepThis().dispose();
                            }
                        }
                        i3 = 0;
                        SQLiteCursor queryFinalized2222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o10, new Object[0]);
                        if (queryFinalized2222.next()) {
                        }
                        queryFinalized2222.dispose();
                        Locale locale2222 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r8 + i3) + " WHERE dialog_id = " + o10).stepThis().dispose();
                    }
                } catch (Throwable th2) {
                    qrVar.o(th2, true);
                    return;
                }
            case 19:
                ((m7) this.b).j((ArrayList) this.c);
                break;
            case 20:
                m7 m7Var2 = (m7) this.b;
                y5 y5Var = (y5) this.c;
                qr qrVar2 = m7Var2.b;
                SQLiteDatabase sQLiteDatabase2 = qrVar2.b;
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = sQLiteDatabase2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e10) {
                    qrVar2.o(e10, true);
                }
                org.telegram.messenger.g0.h3(new b0(22, y5Var, longSparseIntArray));
                break;
            case 21:
                ((y5) this.b).a((TL_stories.TL_stories_allStories) this.c);
                break;
            case 22:
                ((y5) this.b).b.f = (LongSparseIntArray) this.c;
                break;
            case 23:
                p7 p7Var = (p7) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!p7Var.b) {
                    runnable.run();
                    break;
                }
                break;
            case 24:
                Runnable[] runnableArr = (Runnable[]) this.b;
                p7 p7Var2 = (p7) this.c;
                runnableArr[0] = null;
                ((b0) p7Var2.d).run();
                n7 n7Var = (n7) p7Var2.e;
                if (n7Var != null) {
                    n7Var.R();
                    break;
                }
                break;
            case 25:
                o7 o7Var = (o7) this.b;
                View view = (View) this.c;
                o7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                gc gcVar = o7Var.H;
                if (gcVar != null) {
                    gcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                o7Var.N = false;
                o7Var.e();
                break;
            case 26:
                f8 f8Var = (f8) this.b;
                t70 t70Var = (t70) this.c;
                t70 t70Var2 = f8Var.a;
                if (t70Var == t70Var2 && t70Var2 != null) {
                    CharacterStyle characterStyle = t70Var2.i;
                    if (characterStyle instanceof URLSpan) {
                        g8 g8Var = f8Var.v;
                        m2.p0 p0Var = f8Var.c;
                        Objects.requireNonNull(p0Var);
                        g8Var.K.H((URLSpan) characterStyle, g8Var, new z5(p0Var, 6));
                        f8Var.a = null;
                        break;
                    }
                }
                break;
            case 27:
                t8 t8Var = (t8) this.b;
                gi.l3 l3Var2 = (gi.l3) this.c;
                t8Var.d.removeView(l3Var2);
                if (l3Var2 == t8Var.c) {
                    t8Var.b = null;
                    t8Var.invalidate();
                    t8Var.b(false);
                    break;
                }
                break;
            case 28:
                i9 i9Var = (i9) this.b;
                q9 q9Var2 = (q9) this.c;
                r9 r9Var2 = i9Var.d;
                j4 currentPeerView = r9Var2.o0.getCurrentPeerView();
                if (currentPeerView != null && (m3Var = currentPeerView.M0) != null && (i4Var = r9Var2.H0) != null && ((q9) i4Var.c) == q9Var2) {
                    m3Var.invalidate();
                    break;
                }
                break;
            default:
                fi.q qVar = (fi.q) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList10 = qVar.f;
                while (true) {
                    if (r8 >= arrayList10.size()) {
                        i10 = -1;
                    } else if (TextUtils.equals(((k6) arrayList10.get(r8)).E, str4)) {
                        i10 = r8;
                    } else {
                        r8++;
                    }
                }
                if (i10 >= 0) {
                    qVar.r.d(str4.hashCode(), i10 + 1);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b0(b4 b4Var, r9 r9Var) {
        this.a = 7;
        this.c = b4Var;
        this.b = r9Var;
    }
}
