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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ej extends mi implements org.telegram.messenger.gs, te.b {
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
    public bj O;
    public org.telegram.messenger.gj P;
    public final int Q;
    public final int R;
    public final int S;
    public final vi T;
    public int U;
    public int V;
    public String W;
    public boolean a0;
    public final vi b0;
    public int c0;
    public boolean d0;
    public int e0;
    public String f0;
    public final vi g0;
    public boolean h0;
    public TLRPC.User i0;
    public boolean j0;
    public boolean k0;
    public String l0;
    public int m0;
    public final te.a n;
    public boolean n0;
    public final FrameLayout r;
    public final qi s;
    public final bi.f6 w;
    public final ti x;
    public final es y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Components.vi] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Components.vi] */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.telegram.ui.Components.vi] */
    public ej(Context context, org.telegram.ui.ActionBar.h6 h6Var, ui uiVar) {
        super(context, h6Var, uiVar);
        ViewGroup viewGroup;
        this.n = new te.a(0, this, nr.h, 380L, false);
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
        this.T = new Runnable(this) { // from class: org.telegram.ui.Components.vi
            public final /* synthetic */ ej b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        bi.f6 f6Var = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = f6Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < f6Var.getChildCount()) {
                                View childAt = f6Var.getChildAt(i15);
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
                        f6Var.g3.O(true);
                        if (!canScrollVertically) {
                            f6Var.f3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                f6Var.f3.h1(i13, i14 - f6Var.getPaddingTop());
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
                        ej ejVar = this.b;
                        ejVar.Q();
                        ejVar.b.N1(ejVar, 0);
                        return;
                    default:
                        ej ejVar2 = this.b;
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
                                    long e10 = org.telegram.messenger.k10.i(ejVar2.b.H3).e();
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
                                    weVar.e = new org.telegram.messenger.gj(ejVar2.b.H3, tL_message, false, true);
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
                        org.telegram.messenger.g0.g3(new mf(8, ejVar2, arrayList));
                        return;
                }
            }
        };
        this.V = -1;
        this.b0 = new Runnable(this) { // from class: org.telegram.ui.Components.vi
            public final /* synthetic */ ej b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        bi.f6 f6Var = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = f6Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < f6Var.getChildCount()) {
                                View childAt = f6Var.getChildAt(i15);
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
                        f6Var.g3.O(true);
                        if (!canScrollVertically) {
                            f6Var.f3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                f6Var.f3.h1(i13, i14 - f6Var.getPaddingTop());
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
                        ej ejVar = this.b;
                        ejVar.Q();
                        ejVar.b.N1(ejVar, 0);
                        return;
                    default:
                        ej ejVar2 = this.b;
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
                                    long e10 = org.telegram.messenger.k10.i(ejVar2.b.H3).e();
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
                                    weVar.e = new org.telegram.messenger.gj(ejVar2.b.H3, tL_message, false, true);
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
                        org.telegram.messenger.g0.g3(new mf(8, ejVar2, arrayList));
                        return;
                }
            }
        };
        this.e0 = -1;
        this.g0 = new Runnable(this) { // from class: org.telegram.ui.Components.vi
            public final /* synthetic */ ej b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        bi.f6 f6Var = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = f6Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < f6Var.getChildCount()) {
                                View childAt = f6Var.getChildAt(i15);
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
                        f6Var.g3.O(true);
                        if (!canScrollVertically) {
                            f6Var.f3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                f6Var.f3.h1(i13, i14 - f6Var.getPaddingTop());
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
                        ej ejVar = this.b;
                        ejVar.Q();
                        ejVar.b.N1(ejVar, 0);
                        return;
                    default:
                        ej ejVar2 = this.b;
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
                                    long e10 = org.telegram.messenger.k10.i(ejVar2.b.H3).e();
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
                                    weVar.e = new org.telegram.messenger.gj(ejVar2.b.H3, tL_message, false, true);
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
                        org.telegram.messenger.g0.g3(new mf(8, ejVar2, arrayList));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        org.telegram.messenger.ls.f(this.b.H3).c(this, org.telegram.messenger.ls.f2);
        org.telegram.messenger.ls.f(this.b.H3).c(this, org.telegram.messenger.ls.h2);
        org.telegram.messenger.ls.f(this.b.H3).c(this, org.telegram.messenger.ls.g2);
        org.telegram.messenger.ls.f(this.b.H3).c(this, org.telegram.messenger.ls.W3);
        this.H = true;
        final int i13 = 4;
        Utilities.e.c(new Runnable(this) { // from class: org.telegram.ui.Components.vi
            public final /* synthetic */ ej b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        bi.f6 f6Var = this.b.w;
                        int i132 = -1;
                        boolean canScrollVertically = f6Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < f6Var.getChildCount()) {
                                View childAt = f6Var.getChildAt(i15);
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
                        f6Var.g3.O(true);
                        if (!canScrollVertically) {
                            f6Var.f3.h1(0, 0);
                            return;
                        } else {
                            if (i132 >= 0) {
                                f6Var.f3.h1(i132, i14 - f6Var.getPaddingTop());
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
                        ej ejVar = this.b;
                        ejVar.Q();
                        ejVar.b.N1(ejVar, 0);
                        return;
                    default:
                        ej ejVar2 = this.b;
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
                                    long e10 = org.telegram.messenger.k10.i(ejVar2.b.H3).e();
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
                                    weVar.e = new org.telegram.messenger.gj(ejVar2.b.H3, tL_message, false, true);
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
                        org.telegram.messenger.g0.g3(new mf(8, ejVar2, arrayList));
                        return;
                }
            }
        });
        ti tiVar = new ti(org.telegram.ui.ActionBar.m6.d6, context, h6Var);
        this.x = tiVar;
        tiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        qi qiVar = new qi(context, h6Var, this.b);
        this.s = qiVar;
        qiVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        qiVar.r.addTextChangedListener(new ah.j(this, 18));
        qiVar.r.setHint(org.telegram.messenger.hd.N0(2131745544, null));
        frameLayout.addView(tiVar, c8.ma.g());
        FrameLayout.LayoutParams d = c8.ma.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(qiVar, d);
        es esVar = new es(context);
        this.y = esVar;
        esVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        esVar.setOnAnimatedHeightChangedListener(new Runnable(this) { // from class: org.telegram.ui.Components.vi
            public final /* synthetic */ ej b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        bi.f6 f6Var = this.b.w;
                        int i132 = -1;
                        boolean canScrollVertically = f6Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < f6Var.getChildCount()) {
                                View childAt = f6Var.getChildAt(i15);
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
                        f6Var.g3.O(true);
                        if (!canScrollVertically) {
                            f6Var.f3.h1(0, 0);
                            return;
                        } else {
                            if (i132 >= 0) {
                                f6Var.f3.h1(i132, i14 - f6Var.getPaddingTop());
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
                        ej ejVar = this.b;
                        ejVar.Q();
                        ejVar.b.N1(ejVar, 0);
                        return;
                    default:
                        ej ejVar2 = this.b;
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
                                    long e10 = org.telegram.messenger.k10.i(ejVar2.b.H3).e();
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
                                    weVar.e = new org.telegram.messenger.gj(ejVar2.b.H3, tL_message, false, true);
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
                        org.telegram.messenger.g0.g3(new mf(8, ejVar2, arrayList));
                        return;
                }
            }
        });
        if (uiVar.a2 != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            esVar.addView(frameLayout2);
            esVar.j(frameLayout2, true, false);
            FragmentContextView ajVar = new aj(this, context, uiVar.a2, frameLayout, h6Var, frameLayout2);
            viewGroup = frameLayout;
            frameLayout2.addView(ajVar);
            esVar.setCallFragmentContextView(ajVar);
        } else {
            viewGroup = frameLayout;
        }
        FrameLayout.LayoutParams d2 = c8.ma.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = org.telegram.messenger.f3.C(27.0f, org.telegram.messenger.g0.m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        viewGroup.addView(esVar, d2);
        bi.f6 f6Var = new bi.f6(this, context, uiVar.H3, new d(this, 6), new yi(this), new yi(this), h6Var);
        this.w = f6Var;
        f6Var.g3.r = false;
        f6Var.r1();
        setBlur3Capture(f6Var);
        this.d = f6Var;
        this.h = true;
        this.f = true;
        f6Var.setClipToPadding(false);
        f6Var.setHorizontalScrollBarEnabled(false);
        f6Var.setVerticalScrollBarEnabled(false);
        addView(f6Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.l(f6Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        f6Var.setOnScrollListener(new oa(this, i7));
        addView(viewGroup, c8.ma.e(-1, org.telegram.messenger.ls.e3, 51));
        f6Var.g3.O(false);
        Q();
        int i14 = this.b.H3;
        this.K = new org.telegram.messenger.hp(i14, org.telegram.messenger.k10.i(i14).e());
    }

    public static boolean P(ej ejVar, org.telegram.messenger.gj gjVar) {
        ejVar.P = gjVar;
        return MediaController.B().o0(org.telegram.messenger.f3.i(gjVar), gjVar, 0L, true, null, 0L);
    }

    @Override // org.telegram.ui.Components.mi
    public final void B(int i7, int i10) {
        this.U = i10;
        Q();
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            ti tiVar = this.x;
            tiVar.setAlpha(f10);
            tiVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.mi
    public final void I(mi miVar) {
        S();
        this.K.b();
        bi.f6 f6Var = this.w;
        f6Var.f3.h1(0, 0);
        f6Var.g3.O(false);
    }

    @Override // org.telegram.ui.Components.mi
    public final void K() {
        this.w.y0(0);
    }

    @Override // org.telegram.ui.Components.mi
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
        ui uiVar = this.b;
        return c5.Y(uiVar.H3, uiVar.c1(), uiVar.Y0() + arrayList.size(), new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.zi
            @Override // org.telegram.messenger.y10
            public final void a(Object obj) {
                ej ejVar = ej.this;
                bj bjVar = ejVar.O;
                ui uiVar2 = ejVar.b;
                bjVar.i(arrayList, uiVar2.b1().getText(), z10, i7, i10, j3, z11, ((Long) obj).longValue());
                uiVar2.a(true);
            }
        }, 0L);
    }

    public final void Q() {
        int i7;
        ui uiVar = this.b;
        if (uiVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i7 = org.telegram.messenger.g0.L(8.0f);
            uiVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i7 = (int) (this.U / 3.5f);
                    uiVar.r0 = true;
                }
            }
            i7 = (this.U / 5) * 2;
            uiVar.r0 = true;
        }
        this.w.setPadding(0, (int) (this.y.d(0.0f) + org.telegram.messenger.g0.L(56.0f) + i7 + org.telegram.messenger.g0.m), 0, this.e);
    }

    public final void R(o41 o41Var, View view) {
        if (o41Var != null && o41Var.d == this.S) {
            this.K.b();
            return;
        }
        if (o41Var != null && o41Var.d == this.Q) {
            S();
            return;
        }
        if (o41Var != null && o41Var.d == this.R) {
            T();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.we weVar = (org.telegram.messenger.we) h7Var.getTag();
            ui uiVar = this.b;
            uiVar.getClass();
            int i7 = 1;
            if (uiVar.C1) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(weVar.e);
                this.O.i(arrayList, uiVar.b1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(weVar)) {
                    hashSet.remove(weVar);
                    o41Var.e = false;
                    h7Var.e(false, true);
                    i7 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i10 = this.F;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.hd.a0(null, null, 2131747257, org.telegram.messenger.hd.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
                            String N0 = org.telegram.messenger.hd.N0(R.string.AppName, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            t1Var.U = a02;
                            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                            return;
                        }
                    }
                    o41Var.e = true;
                    hashSet.add(weVar);
                    h7Var.e(true, true);
                }
            }
            uiVar.L1(i7);
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
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
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
            tL_messages_searchGlobal.offset_peer = u12.l1(org.telegram.messenger.gj.B1(gjVar.k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new d3.b(1), new xi(this, u12, i7, 1));
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
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        int i10 = this.e0;
        if (i10 >= 0) {
            connectionsManager.cancelRequest(i10, true);
            this.e0 = -1;
        }
        String str2 = ((org.telegram.messenger.n0) u12.A7.K.b).c;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.i0 == null) {
            TLObject h22 = u12.h2(str2);
            this.i0 = h22 instanceof TLRPC.User ? (TLRPC.User) h22 : null;
        }
        if (this.i0 == null) {
            if (this.j0 || this.k0) {
                return;
            }
            this.j0 = true;
            u12.f2().a(str2, null, new rh(1, this, u12));
            return;
        }
        TLRPC.User f10 = org.telegram.messenger.k10.i(i7).f();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = u12.s1(this.i0);
        tL_messages_getInlineBotResults.peer = org.telegram.messenger.np.p1(f10);
        if (arrayList.isEmpty() || (str = this.l0) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.E;
        String str4 = str3 != null ? str3 : "";
        this.f0 = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new xi(this, u12, i7, 0));
        U();
    }

    public final void U() {
        vi viVar = this.T;
        org.telegram.messenger.g0.r(viVar);
        org.telegram.messenger.g0.g3(viVar);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.g2;
        int i12 = org.telegram.messenger.ls.h2;
        bi.f6 f6Var = this.w;
        int i13 = org.telegram.messenger.ls.f2;
        if (i7 != i13 && i7 != i12 && i7 != i11) {
            if (i7 == org.telegram.messenger.ls.W3 && objArr[0] == this.K && f6Var != null) {
                f6Var.g3.O(true);
                return;
            }
            return;
        }
        if (i7 == i13 || i7 == i11) {
            int childCount = f6Var.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = f6Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage() != null) {
                        h7Var.g(false, true);
                    }
                }
            }
            return;
        }
        if (i7 == i12 && ((org.telegram.messenger.gj) objArr[0]).T == 0) {
            int childCount2 = f6Var.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = f6Var.getChildAt(i15);
                if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) childAt2;
                    if (h7Var2.getMessage() != null) {
                        h7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.mi
    public int getCurrentItemTop() {
        bi.f6 f6Var = this.w;
        if (f6Var.getChildCount() > 0) {
            boolean z10 = false;
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < f6Var.getChildCount(); i10++) {
                View childAt = f6Var.getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i7) {
                    i7 = childAt.getTop();
                }
            }
            if (i7 != Integer.MAX_VALUE) {
                int L = (((i7 - org.telegram.messenger.g0.L(56.0f)) - ((int) this.y.d(0.0f))) - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
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

    @Override // org.telegram.ui.Components.mi
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.mi
    public int getListTopPadding() {
        return (this.w.getPaddingTop() - org.telegram.messenger.g0.L(56.0f)) - ((int) this.y.d(0.0f));
    }

    public ArrayList<org.telegram.messenger.gj> getSelected() {
        ArrayList<org.telegram.messenger.gj> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.we) it.next()).e);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.mi
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override // org.telegram.ui.Components.mi
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.m6.A5;
        bi.f6 f6Var = this.w;
        arrayList.add(new org.telegram.ui.ActionBar.v6(f6Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f6Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f6Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.m6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f6Var, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f6Var, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f6Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.m6.f3, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(f6Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.m6.g3, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.z6));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.mi
    public final void p() {
        u();
        ui uiVar = this.b;
        org.telegram.messenger.ls.f(uiVar.H3).n(this, org.telegram.messenger.ls.f2);
        int i7 = uiVar.H3;
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.h2);
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.g2);
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.W3);
    }

    @Override // org.telegram.ui.Components.mi
    public final boolean q() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(bj bjVar) {
        this.O = bjVar;
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
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        qi qiVar = this.s;
        if (qiVar != null) {
            qiVar.setupBlurredBackground(cVar.c(qiVar, c8.i0.o(h6Var), false));
        }
        es esVar = this.y;
        if (esVar != null) {
            fh.g c10 = cVar.c(esVar, c8.i0.o(h6Var), false);
            c10.r(org.telegram.messenger.g0.L(24.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            esVar.setBlurredBackground(c10);
        }
    }

    @Override // org.telegram.ui.Components.mi
    public final void t() {
        this.J.clear();
    }

    @Override // org.telegram.ui.Components.mi
    public final void u() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        this.P = null;
    }

    @Override // org.telegram.ui.Components.mi
    public final void m(float f10) {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
