package org.telegram.ui.Components;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class vi extends ci implements org.telegram.messenger.is, te.b {
    public String E;
    public int F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public final HashSet J;
    public final org.telegram.messenger.hp K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public si O;
    public org.telegram.messenger.gj P;
    public final int Q;
    public final int R;
    public final int S;
    public final li T;
    public int U;
    public int V;
    public String W;
    public boolean a0;
    public final li b0;
    public int c0;
    public boolean d0;
    public int e0;
    public String f0;
    public final li g0;
    public boolean h0;
    public TLRPC.User i0;
    public boolean j0;
    public boolean k0;
    public String l0;
    public int m0;
    public final te.a n;
    public boolean n0;
    public final FrameLayout r;
    public final gi s;
    public final bi.v3 w;
    public final ji x;
    public final vr y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Components.li] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Components.li] */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.telegram.ui.Components.li] */
    public vi(Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar) {
        super(context, e6Var, kiVar);
        ViewGroup viewGroup;
        this.n = new te.a(0, this, er.h, 380L, false);
        this.F = -1;
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        final int i7 = 1;
        this.Q = 1;
        final int i10 = 2;
        this.R = 2;
        final int i11 = 3;
        this.S = 3;
        final int i12 = 0;
        this.T = new Runnable(this) { // from class: org.telegram.ui.Components.li
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        bi.v3 v3Var = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = v3Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < v3Var.getChildCount()) {
                                View childAt = v3Var.getChildAt(i15);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i14 = top;
                                    i13 = R;
                                } else {
                                    i15++;
                                    i14 = top;
                                    i13 = R;
                                }
                            }
                        }
                        v3Var.g3.O(true);
                        if (!canScrollVertically) {
                            v3Var.f3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                v3Var.f3.h1(i13, i14 - v3Var.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.S();
                        return;
                    case 2:
                        this.b.T();
                        return;
                    case 3:
                        vi viVar = this.b;
                        viVar.Q();
                        viVar.b.M1(viVar, 0);
                        return;
                    default:
                        vi viVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.we weVar = new org.telegram.messenger.we();
                                    query.getInt(0);
                                    weVar.a = query.getString(1);
                                    weVar.b = query.getString(2);
                                    weVar.d = query.getString(3);
                                    weVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(weVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.m10.i(viVar2.b.H3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = weVar.d;
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
                                    tL_documentAttributeAudio.duration = weVar.c;
                                    tL_documentAttributeAudio.title = weVar.b;
                                    tL_documentAttributeAudio.performer = weVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    weVar.e = new org.telegram.messenger.gj(viVar2.b.H3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            weVar.e.J1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        weVar.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(weVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new od(10, viVar2, arrayList));
                        return;
                }
            }
        };
        this.V = -1;
        this.b0 = new Runnable(this) { // from class: org.telegram.ui.Components.li
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        bi.v3 v3Var = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = v3Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < v3Var.getChildCount()) {
                                View childAt = v3Var.getChildAt(i15);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i14 = top;
                                    i13 = R;
                                } else {
                                    i15++;
                                    i14 = top;
                                    i13 = R;
                                }
                            }
                        }
                        v3Var.g3.O(true);
                        if (!canScrollVertically) {
                            v3Var.f3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                v3Var.f3.h1(i13, i14 - v3Var.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.S();
                        return;
                    case 2:
                        this.b.T();
                        return;
                    case 3:
                        vi viVar = this.b;
                        viVar.Q();
                        viVar.b.M1(viVar, 0);
                        return;
                    default:
                        vi viVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.we weVar = new org.telegram.messenger.we();
                                    query.getInt(0);
                                    weVar.a = query.getString(1);
                                    weVar.b = query.getString(2);
                                    weVar.d = query.getString(3);
                                    weVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(weVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.m10.i(viVar2.b.H3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = weVar.d;
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
                                    tL_documentAttributeAudio.duration = weVar.c;
                                    tL_documentAttributeAudio.title = weVar.b;
                                    tL_documentAttributeAudio.performer = weVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    weVar.e = new org.telegram.messenger.gj(viVar2.b.H3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            weVar.e.J1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        weVar.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(weVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new od(10, viVar2, arrayList));
                        return;
                }
            }
        };
        this.e0 = -1;
        this.g0 = new Runnable(this) { // from class: org.telegram.ui.Components.li
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        bi.v3 v3Var = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = v3Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < v3Var.getChildCount()) {
                                View childAt = v3Var.getChildAt(i15);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i14 = top;
                                    i13 = R;
                                } else {
                                    i15++;
                                    i14 = top;
                                    i13 = R;
                                }
                            }
                        }
                        v3Var.g3.O(true);
                        if (!canScrollVertically) {
                            v3Var.f3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                v3Var.f3.h1(i13, i14 - v3Var.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.S();
                        return;
                    case 2:
                        this.b.T();
                        return;
                    case 3:
                        vi viVar = this.b;
                        viVar.Q();
                        viVar.b.M1(viVar, 0);
                        return;
                    default:
                        vi viVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.we weVar = new org.telegram.messenger.we();
                                    query.getInt(0);
                                    weVar.a = query.getString(1);
                                    weVar.b = query.getString(2);
                                    weVar.d = query.getString(3);
                                    weVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(weVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.m10.i(viVar2.b.H3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = weVar.d;
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
                                    tL_documentAttributeAudio.duration = weVar.c;
                                    tL_documentAttributeAudio.title = weVar.b;
                                    tL_documentAttributeAudio.performer = weVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    weVar.e = new org.telegram.messenger.gj(viVar2.b.H3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            weVar.e.J1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        weVar.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(weVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new od(10, viVar2, arrayList));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        org.telegram.messenger.ns.f(this.b.H3).c(this, org.telegram.messenger.ns.f2);
        org.telegram.messenger.ns.f(this.b.H3).c(this, org.telegram.messenger.ns.h2);
        org.telegram.messenger.ns.f(this.b.H3).c(this, org.telegram.messenger.ns.g2);
        org.telegram.messenger.ns.f(this.b.H3).c(this, org.telegram.messenger.ns.T3);
        this.H = true;
        final int i13 = 4;
        Utilities.e.c(new Runnable(this) { // from class: org.telegram.ui.Components.li
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        bi.v3 v3Var = this.b.w;
                        int i132 = -1;
                        boolean canScrollVertically = v3Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < v3Var.getChildCount()) {
                                View childAt = v3Var.getChildAt(i15);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i14 = top;
                                    i132 = R;
                                } else {
                                    i15++;
                                    i14 = top;
                                    i132 = R;
                                }
                            }
                        }
                        v3Var.g3.O(true);
                        if (!canScrollVertically) {
                            v3Var.f3.h1(0, 0);
                            return;
                        } else {
                            if (i132 >= 0) {
                                v3Var.f3.h1(i132, i14 - v3Var.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.S();
                        return;
                    case 2:
                        this.b.T();
                        return;
                    case 3:
                        vi viVar = this.b;
                        viVar.Q();
                        viVar.b.M1(viVar, 0);
                        return;
                    default:
                        vi viVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.we weVar = new org.telegram.messenger.we();
                                    query.getInt(0);
                                    weVar.a = query.getString(1);
                                    weVar.b = query.getString(2);
                                    weVar.d = query.getString(3);
                                    weVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(weVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.m10.i(viVar2.b.H3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = weVar.d;
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
                                    tL_documentAttributeAudio.duration = weVar.c;
                                    tL_documentAttributeAudio.title = weVar.b;
                                    tL_documentAttributeAudio.performer = weVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    weVar.e = new org.telegram.messenger.gj(viVar2.b.H3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            weVar.e.J1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        weVar.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(weVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new od(10, viVar2, arrayList));
                        return;
                }
            }
        });
        ji jiVar = new ji(org.telegram.ui.ActionBar.j6.d6, context, e6Var);
        this.x = jiVar;
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        gi giVar = new gi(context, e6Var, this.b);
        this.s = giVar;
        giVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        giVar.r.addTextChangedListener(new ah.j(this, 17));
        giVar.r.setHint(org.telegram.messenger.hd.M0(2131745740, null));
        frameLayout.addView(jiVar, c8.ja.g());
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(giVar, d);
        vr vrVar = new vr(context);
        this.y = vrVar;
        vrVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        vrVar.setOnAnimatedHeightChangedListener(new Runnable(this) { // from class: org.telegram.ui.Components.li
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        bi.v3 v3Var = this.b.w;
                        int i132 = -1;
                        boolean canScrollVertically = v3Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < v3Var.getChildCount()) {
                                View childAt = v3Var.getChildAt(i15);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i14 = top;
                                    i132 = R;
                                } else {
                                    i15++;
                                    i14 = top;
                                    i132 = R;
                                }
                            }
                        }
                        v3Var.g3.O(true);
                        if (!canScrollVertically) {
                            v3Var.f3.h1(0, 0);
                            return;
                        } else {
                            if (i132 >= 0) {
                                v3Var.f3.h1(i132, i14 - v3Var.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.S();
                        return;
                    case 2:
                        this.b.T();
                        return;
                    case 3:
                        vi viVar = this.b;
                        viVar.Q();
                        viVar.b.M1(viVar, 0);
                        return;
                    default:
                        vi viVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.we weVar = new org.telegram.messenger.we();
                                    query.getInt(0);
                                    weVar.a = query.getString(1);
                                    weVar.b = query.getString(2);
                                    weVar.d = query.getString(3);
                                    weVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(weVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.m10.i(viVar2.b.H3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = weVar.d;
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
                                    tL_documentAttributeAudio.duration = weVar.c;
                                    tL_documentAttributeAudio.title = weVar.b;
                                    tL_documentAttributeAudio.performer = weVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    weVar.e = new org.telegram.messenger.gj(viVar2.b.H3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            weVar.e.J1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        weVar.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(weVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new od(10, viVar2, arrayList));
                        return;
                }
            }
        });
        if (kiVar.a2 != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            vrVar.addView(frameLayout2);
            vrVar.i(frameLayout2, true, false);
            FragmentContextView qiVar = new qi(this, context, kiVar.a2, frameLayout, e6Var, frameLayout2);
            viewGroup = frameLayout;
            frameLayout2.addView(qiVar);
            vrVar.setCallFragmentContextView(qiVar);
        } else {
            viewGroup = frameLayout;
        }
        FrameLayout.LayoutParams d2 = c8.ja.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = org.telegram.messenger.k5.C(27.0f, org.telegram.messenger.g0.m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        viewGroup.addView(vrVar, d2);
        bi.v3 v3Var = new bi.v3(this, context, kiVar.H3, new d(this, 5), new oi(this), new oi(this), e6Var);
        this.w = v3Var;
        v3Var.g3.r = false;
        v3Var.r1();
        setBlur3Capture(v3Var);
        this.d = v3Var;
        this.h = true;
        this.f = true;
        v3Var.setClipToPadding(false);
        v3Var.setHorizontalScrollBarEnabled(false);
        v3Var.setVerticalScrollBarEnabled(false);
        addView(v3Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.q6.l(v3Var, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
        v3Var.setOnScrollListener(new ri(this, i12));
        addView(viewGroup, c8.ja.e(-1, org.telegram.messenger.ns.e3, 51));
        v3Var.g3.O(false);
        Q();
        int i14 = this.b.H3;
        this.K = new org.telegram.messenger.hp(i14, org.telegram.messenger.m10.i(i14).e());
    }

    public static boolean P(vi viVar, org.telegram.messenger.gj gjVar) {
        viVar.P = gjVar;
        return MediaController.B().o0(org.telegram.messenger.k5.j(gjVar), gjVar, 0L, true, null, 0L);
    }

    @Override // org.telegram.ui.Components.ci
    public final void B(int i7, int i10) {
        this.U = i10;
        Q();
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            ji jiVar = this.x;
            jiVar.setAlpha(f10);
            jiVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void I(ci ciVar) {
        S();
        this.K.b();
        bi.v3 v3Var = this.w;
        v3Var.f3.h1(0, 0);
        v3Var.g3.O(false);
    }

    @Override // org.telegram.ui.Components.ci
    public final void K() {
        this.w.y0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean M(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        HashSet hashSet = this.J;
        if (hashSet.size() == 0 || this.O == null || this.G) {
            return false;
        }
        this.G = true;
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.we) it.next()).e);
        }
        ki kiVar = this.b;
        return t4.Y(kiVar.H3, kiVar.b1(), kiVar.X0() + arrayList.size(), new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.pi
            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                vi viVar = vi.this;
                si siVar = viVar.O;
                ki kiVar2 = viVar.b;
                siVar.k(arrayList, kiVar2.a1().getText(), z10, i7, i10, j3, z11, ((Long) obj).longValue());
                kiVar2.a(true);
            }
        }, 0L);
    }

    public final void Q() {
        int i7;
        ki kiVar = this.b;
        if (kiVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i7 = org.telegram.messenger.g0.L(8.0f);
            kiVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i7 = (int) (this.U / 3.5f);
                    kiVar.r0 = true;
                }
            }
            i7 = (this.U / 5) * 2;
            kiVar.r0 = true;
        }
        this.w.setPadding(0, (int) (this.y.c(0.0f) + org.telegram.messenger.g0.L(56.0f) + i7 + org.telegram.messenger.g0.m), 0, this.e);
    }

    public final void R(b41 b41Var, View view) {
        if (b41Var != null && b41Var.d == this.S) {
            this.K.b();
            return;
        }
        if (b41Var != null && b41Var.d == this.Q) {
            S();
            return;
        }
        if (b41Var != null && b41Var.d == this.R) {
            T();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            org.telegram.messenger.we weVar = (org.telegram.messenger.we) f7Var.getTag();
            ki kiVar = this.b;
            kiVar.getClass();
            int i7 = 1;
            if (kiVar.C1) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(weVar.e);
                this.O.k(arrayList, kiVar.a1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(weVar)) {
                    hashSet.remove(weVar);
                    b41Var.e = false;
                    f7Var.e(false, true);
                    i7 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i10 = this.F;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.hd.a0(null, null, 2131747451, org.telegram.messenger.hd.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
                            String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = M0;
                            t1Var.U = a02;
                            i5.c.C(null, 2131747831, alertDialog$Builder, null);
                            return;
                        }
                    }
                    b41Var.e = true;
                    hashSet.add(weVar);
                    f7Var.e(true, true);
                }
            }
            kiVar.K1(i7);
        }
    }

    public final void S() {
        org.telegram.messenger.g0.r(this.b0);
        String str = this.E;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.a0) {
                this.a0 = false;
                U();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.W, this.E);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.c0 = 0;
            this.d0 = false;
        }
        if (!arrayList.isEmpty() && !this.d0) {
            if (this.a0) {
                this.a0 = false;
                U();
                return;
            }
            return;
        }
        int i7 = this.b.H3;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        int i10 = this.V;
        if (i10 >= 0) {
            connectionsManager.cancelRequest(i10, true);
            this.V = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.E;
        this.W = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.q = str2;
        tL_messages_searchGlobal.limit = arrayList.isEmpty() ? 3 : 15;
        if (arrayList.size() > 0) {
            org.telegram.messenger.gj gjVar = ((org.telegram.messenger.we) i5.c.h(1, arrayList)).e;
            tL_messages_searchGlobal.offset_id = gjVar.e1();
            tL_messages_searchGlobal.offset_rate = this.c0;
            tL_messages_searchGlobal.offset_peer = s12.j1(org.telegram.messenger.gj.B1(gjVar.k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new d3.b(1), new ni(this, s12, i7, 1));
        U();
    }

    public final void T() {
        String str;
        org.telegram.messenger.g0.r(this.g0);
        if (TextUtils.isEmpty(this.E) || this.E.length() < 3) {
            if (this.n0) {
                this.n0 = false;
                U();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.f0, this.E);
        ArrayList arrayList = this.N;
        if (!equals) {
            arrayList.clear();
            this.h0 = false;
        }
        int i7 = this.b.H3;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        int i10 = this.e0;
        if (i10 >= 0) {
            connectionsManager.cancelRequest(i10, true);
            this.e0 = -1;
        }
        String str2 = ((org.telegram.messenger.n0) s12.y7.F.b).c;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.i0 == null) {
            TLObject f22 = s12.f2(str2);
            this.i0 = f22 instanceof TLRPC.User ? (TLRPC.User) f22 : null;
        }
        if (this.i0 == null) {
            if (this.j0 || this.k0) {
                return;
            }
            this.j0 = true;
            s12.d2().a(str2, null, new gh(1, this, s12));
            return;
        }
        TLRPC.User f10 = org.telegram.messenger.m10.i(i7).f();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = s12.q1(this.i0);
        tL_messages_getInlineBotResults.peer = org.telegram.messenger.np.n1(f10);
        if (arrayList.isEmpty() || (str = this.l0) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.E;
        String str4 = str3 != null ? str3 : "";
        this.f0 = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new ni(this, s12, i7, 0));
        U();
    }

    public final void U() {
        li liVar = this.T;
        org.telegram.messenger.g0.r(liVar);
        org.telegram.messenger.g0.h3(liVar);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.g2;
        int i12 = org.telegram.messenger.ns.h2;
        bi.v3 v3Var = this.w;
        int i13 = org.telegram.messenger.ns.f2;
        if (i7 != i13 && i7 != i12 && i7 != i11) {
            if (i7 == org.telegram.messenger.ns.T3 && objArr[0] == this.K && v3Var != null) {
                v3Var.g3.O(true);
                return;
            }
            return;
        }
        if (i7 == i13 || i7 == i11) {
            int childCount = v3Var.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = v3Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Cells.f7) {
                    org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                    if (f7Var.getMessage() != null) {
                        f7Var.g(false, true);
                    }
                }
            }
            return;
        }
        if (i7 == i12 && ((org.telegram.messenger.gj) objArr[0]).T == 0) {
            int childCount2 = v3Var.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = v3Var.getChildAt(i15);
                if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                    org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) childAt2;
                    if (f7Var2.getMessage() != null) {
                        f7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        bi.v3 v3Var = this.w;
        if (v3Var.getChildCount() > 0) {
            boolean z10 = false;
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < v3Var.getChildCount(); i10++) {
                View childAt = v3Var.getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i7) {
                    i7 = childAt.getTop();
                }
            }
            if (i7 != Integer.MAX_VALUE) {
                int L = (((i7 - org.telegram.messenger.g0.L(56.0f)) - ((int) this.y.c(0.0f))) - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
                int i11 = (L <= 0 || !z10) ? 0 : L;
                te.a aVar = this.n;
                if (L < 0 || !z10) {
                    aVar.a(true, true);
                    L = i11;
                } else {
                    aVar.a(false, true);
                }
                this.r.setTranslationY(L);
                return org.telegram.messenger.g0.L(12.0f) + L;
            }
        }
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return (this.w.getPaddingTop() - org.telegram.messenger.g0.L(56.0f)) - ((int) this.y.c(0.0f));
    }

    public ArrayList<org.telegram.messenger.gj> getSelected() {
        ArrayList<org.telegram.messenger.gj> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.we) it.next()).e);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ci
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override // org.telegram.ui.Components.ci
    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.s6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.j6.A5;
        bi.v3 v3Var = this.w;
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.j6.f3, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(v3Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.j6.g3, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.z6));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ci
    public final void p() {
        u();
        ki kiVar = this.b;
        org.telegram.messenger.ns.f(kiVar.H3).n(this, org.telegram.messenger.ns.f2);
        int i7 = kiVar.H3;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.h2);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.g2);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.T3);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean q() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(si siVar) {
        this.O = siVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.F = i7;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        gi giVar = this.s;
        if (giVar != null) {
            giVar.setupBlurredBackground(cVar.c(giVar, c8.g0.n(e6Var), false));
        }
        vr vrVar = this.y;
        if (vrVar != null) {
            fh.g c10 = cVar.c(vrVar, c8.g0.n(e6Var), false);
            c10.r(org.telegram.messenger.g0.L(24.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            vrVar.setBlurredBackground(c10);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void t() {
        this.J.clear();
    }

    @Override // org.telegram.ui.Components.ci
    public final void u() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        this.P = null;
    }

    @Override // org.telegram.ui.Components.ci
    public final void m(float f10) {
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
