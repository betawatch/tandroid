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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mi extends uh implements org.telegram.messenger.ls, te.b {
    public String D;
    public int E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final HashSet I;
    public final org.telegram.messenger.kp J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public ji N;
    public org.telegram.messenger.ij O;
    public final int P;
    public final int Q;
    public final int R;
    public final di S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public final di a0;
    public int b0;
    public boolean c0;
    public int d0;
    public String e0;
    public final di f0;
    public boolean g0;
    public TLRPC.User h0;
    public boolean i0;
    public boolean j0;
    public String k0;
    public int l0;
    public boolean m0;
    public final te.a n;
    public final FrameLayout r;
    public final yh s;
    public final fi.w3 w;
    public final bi x;
    public final or y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Components.di] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Components.di] */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.telegram.ui.Components.di] */
    public mi(Context context, org.telegram.ui.ActionBar.h6 h6Var, ci ciVar) {
        super(context, h6Var, ciVar);
        ViewGroup viewGroup;
        this.n = new te.a(0, this, wq.h, 380L, false);
        this.E = -1;
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        final int i7 = 1;
        this.P = 1;
        final int i10 = 2;
        this.Q = 2;
        final int i11 = 3;
        this.R = 3;
        final int i12 = 0;
        this.S = new Runnable(this) { // from class: org.telegram.ui.Components.di
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        fi.w3 w3Var = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = w3Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < w3Var.getChildCount()) {
                                View childAt = w3Var.getChildAt(i15);
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
                        w3Var.f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.e3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                w3Var.e3.h1(i13, i14 - w3Var.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.R();
                        return;
                    case 2:
                        this.b.S();
                        return;
                    case 3:
                        mi miVar = this.b;
                        miVar.P();
                        miVar.b.M1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.xe xeVar = new org.telegram.messenger.xe();
                                    query.getInt(0);
                                    xeVar.a = query.getString(1);
                                    xeVar.b = query.getString(2);
                                    xeVar.d = query.getString(3);
                                    xeVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(xeVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.p10.i(miVar2.b.G3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = xeVar.d;
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
                                    tL_documentAttributeAudio.duration = xeVar.c;
                                    tL_documentAttributeAudio.title = xeVar.b;
                                    tL_documentAttributeAudio.performer = xeVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    xeVar.e = new org.telegram.messenger.ij(miVar2.b.G3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            xeVar.e.H1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        xeVar.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(xeVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.fq(17, miVar2, arrayList));
                        return;
                }
            }
        };
        this.U = -1;
        this.a0 = new Runnable(this) { // from class: org.telegram.ui.Components.di
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        fi.w3 w3Var = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = w3Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < w3Var.getChildCount()) {
                                View childAt = w3Var.getChildAt(i15);
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
                        w3Var.f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.e3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                w3Var.e3.h1(i13, i14 - w3Var.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.R();
                        return;
                    case 2:
                        this.b.S();
                        return;
                    case 3:
                        mi miVar = this.b;
                        miVar.P();
                        miVar.b.M1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.xe xeVar = new org.telegram.messenger.xe();
                                    query.getInt(0);
                                    xeVar.a = query.getString(1);
                                    xeVar.b = query.getString(2);
                                    xeVar.d = query.getString(3);
                                    xeVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(xeVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.p10.i(miVar2.b.G3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = xeVar.d;
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
                                    tL_documentAttributeAudio.duration = xeVar.c;
                                    tL_documentAttributeAudio.title = xeVar.b;
                                    tL_documentAttributeAudio.performer = xeVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    xeVar.e = new org.telegram.messenger.ij(miVar2.b.G3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            xeVar.e.H1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        xeVar.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(xeVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.fq(17, miVar2, arrayList));
                        return;
                }
            }
        };
        this.d0 = -1;
        this.f0 = new Runnable(this) { // from class: org.telegram.ui.Components.di
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        fi.w3 w3Var = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = w3Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < w3Var.getChildCount()) {
                                View childAt = w3Var.getChildAt(i15);
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
                        w3Var.f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.e3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                w3Var.e3.h1(i13, i14 - w3Var.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.R();
                        return;
                    case 2:
                        this.b.S();
                        return;
                    case 3:
                        mi miVar = this.b;
                        miVar.P();
                        miVar.b.M1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.xe xeVar = new org.telegram.messenger.xe();
                                    query.getInt(0);
                                    xeVar.a = query.getString(1);
                                    xeVar.b = query.getString(2);
                                    xeVar.d = query.getString(3);
                                    xeVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(xeVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.p10.i(miVar2.b.G3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = xeVar.d;
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
                                    tL_documentAttributeAudio.duration = xeVar.c;
                                    tL_documentAttributeAudio.title = xeVar.b;
                                    tL_documentAttributeAudio.performer = xeVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    xeVar.e = new org.telegram.messenger.ij(miVar2.b.G3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            xeVar.e.H1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        xeVar.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(xeVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.fq(17, miVar2, arrayList));
                        return;
                }
            }
        };
        this.l0 = -1000000000;
        org.telegram.messenger.qs.f(this.b.G3).c(this, org.telegram.messenger.qs.f2);
        org.telegram.messenger.qs.f(this.b.G3).c(this, org.telegram.messenger.qs.h2);
        org.telegram.messenger.qs.f(this.b.G3).c(this, org.telegram.messenger.qs.g2);
        org.telegram.messenger.qs.f(this.b.G3).c(this, org.telegram.messenger.qs.T3);
        this.G = true;
        final int i13 = 4;
        Utilities.e.c(new Runnable(this) { // from class: org.telegram.ui.Components.di
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        fi.w3 w3Var = this.b.w;
                        int i132 = -1;
                        boolean canScrollVertically = w3Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < w3Var.getChildCount()) {
                                View childAt = w3Var.getChildAt(i15);
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
                        w3Var.f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.e3.h1(0, 0);
                            return;
                        } else {
                            if (i132 >= 0) {
                                w3Var.e3.h1(i132, i14 - w3Var.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.R();
                        return;
                    case 2:
                        this.b.S();
                        return;
                    case 3:
                        mi miVar = this.b;
                        miVar.P();
                        miVar.b.M1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.xe xeVar = new org.telegram.messenger.xe();
                                    query.getInt(0);
                                    xeVar.a = query.getString(1);
                                    xeVar.b = query.getString(2);
                                    xeVar.d = query.getString(3);
                                    xeVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(xeVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.p10.i(miVar2.b.G3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = xeVar.d;
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
                                    tL_documentAttributeAudio.duration = xeVar.c;
                                    tL_documentAttributeAudio.title = xeVar.b;
                                    tL_documentAttributeAudio.performer = xeVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    xeVar.e = new org.telegram.messenger.ij(miVar2.b.G3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            xeVar.e.H1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        xeVar.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(xeVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.fq(17, miVar2, arrayList));
                        return;
                }
            }
        });
        bi biVar = new bi(org.telegram.ui.ActionBar.m6.d6, context, h6Var);
        this.x = biVar;
        biVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        yh yhVar = new yh(context, h6Var, this.b);
        this.s = yhVar;
        yhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        yhVar.r.addTextChangedListener(new ah.j(this, 15));
        yhVar.r.setHint(org.telegram.messenger.id.M0(2131745740, null));
        frameLayout.addView(biVar, c8.ha.g());
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(yhVar, d);
        or orVar = new or(context);
        this.y = orVar;
        orVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        orVar.setOnAnimatedHeightChangedListener(new Runnable(this) { // from class: org.telegram.ui.Components.di
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        fi.w3 w3Var = this.b.w;
                        int i132 = -1;
                        boolean canScrollVertically = w3Var.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < w3Var.getChildCount()) {
                                View childAt = w3Var.getChildAt(i15);
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
                        w3Var.f3.O(true);
                        if (!canScrollVertically) {
                            w3Var.e3.h1(0, 0);
                            return;
                        } else {
                            if (i132 >= 0) {
                                w3Var.e3.h1(i132, i14 - w3Var.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.R();
                        return;
                    case 2:
                        this.b.S();
                        return;
                    case 3:
                        mi miVar = this.b;
                        miVar.P();
                        miVar.b.M1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.xe xeVar = new org.telegram.messenger.xe();
                                    query.getInt(0);
                                    xeVar.a = query.getString(1);
                                    xeVar.b = query.getString(2);
                                    xeVar.d = query.getString(3);
                                    xeVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(xeVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.p10.i(miVar2.b.G3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = xeVar.d;
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
                                    tL_documentAttributeAudio.duration = xeVar.c;
                                    tL_documentAttributeAudio.title = xeVar.b;
                                    tL_documentAttributeAudio.performer = xeVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    xeVar.e = new org.telegram.messenger.ij(miVar2.b.G3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            xeVar.e.H1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        xeVar.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(xeVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.h3(new org.telegram.ui.fq(17, miVar2, arrayList));
                        return;
                }
            }
        });
        if (ciVar.Z1 != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            orVar.addView(frameLayout2);
            orVar.i(frameLayout2, true, false);
            FragmentContextView iiVar = new ii(this, context, ciVar.Z1, frameLayout, h6Var, frameLayout2);
            viewGroup = frameLayout;
            frameLayout2.addView(iiVar);
            orVar.setCallFragmentContextView(iiVar);
        } else {
            viewGroup = frameLayout;
        }
        FrameLayout.LayoutParams d2 = c8.ha.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = org.telegram.messenger.k5.C(27.0f, org.telegram.messenger.g0.m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        viewGroup.addView(orVar, d2);
        fi.w3 w3Var = new fi.w3(this, context, ciVar.G3, new d(this, 5), new gi(this), new gi(this), h6Var);
        this.w = w3Var;
        w3Var.f3.r = false;
        w3Var.r1();
        setBlur3Capture(w3Var);
        this.d = w3Var;
        this.h = true;
        this.f = true;
        w3Var.setClipToPadding(false);
        w3Var.setHorizontalScrollBarEnabled(false);
        w3Var.setVerticalScrollBarEnabled(false);
        addView(w3Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.l(w3Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        w3Var.setOnScrollListener(new ai.b(this, 28));
        addView(viewGroup, c8.ha.e(-1, org.telegram.messenger.qs.e3, 51));
        w3Var.f3.O(false);
        P();
        int i14 = this.b.G3;
        this.J = new org.telegram.messenger.kp(i14, org.telegram.messenger.p10.i(i14).e());
    }

    public static boolean O(mi miVar, org.telegram.messenger.ij ijVar) {
        miVar.O = ijVar;
        return MediaController.B().o0(org.telegram.messenger.k5.k(ijVar), ijVar, 0L, true, null, 0L);
    }

    @Override // org.telegram.ui.Components.uh
    public final void B(int i7, int i10) {
        this.T = i10;
        P();
    }

    @Override // org.telegram.ui.Components.uh
    public final void H(uh uhVar) {
        R();
        this.J.b();
        fi.w3 w3Var = this.w;
        w3Var.e3.h1(0, 0);
        w3Var.f3.O(false);
    }

    @Override // org.telegram.ui.Components.uh
    public final void J() {
        this.w.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean L(final boolean z9, final int i7, final int i10, final long j3, final boolean z10) {
        HashSet hashSet = this.I;
        if (hashSet.size() == 0 || this.N == null || this.F) {
            return false;
        }
        this.F = true;
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.xe) it.next()).e);
        }
        ci ciVar = this.b;
        return u4.Y(ciVar.G3, ciVar.b1(), ciVar.X0() + arrayList.size(), new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.hi
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                mi miVar = mi.this;
                ji jiVar = miVar.N;
                ci ciVar2 = miVar.b;
                jiVar.e(arrayList, ciVar2.a1().getText(), z9, i7, i10, j3, z10, ((Long) obj).longValue());
                ciVar2.a(true);
            }
        }, 0L);
    }

    public final void P() {
        int i7;
        ci ciVar = this.b;
        if (ciVar.o3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i7 = org.telegram.messenger.g0.L(8.0f);
            ciVar.q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i7 = (int) (this.T / 3.5f);
                    ciVar.q0 = true;
                }
            }
            i7 = (this.T / 5) * 2;
            ciVar.q0 = true;
        }
        this.w.setPadding(0, (int) (this.y.c(0.0f) + org.telegram.messenger.g0.L(56.0f) + i7 + org.telegram.messenger.g0.m), 0, this.e);
    }

    public final void Q(x31 x31Var, View view) {
        if (x31Var != null && x31Var.d == this.R) {
            this.J.b();
            return;
        }
        if (x31Var != null && x31Var.d == this.P) {
            R();
            return;
        }
        if (x31Var != null && x31Var.d == this.Q) {
            S();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) g7Var.getTag();
            ci ciVar = this.b;
            ciVar.getClass();
            int i7 = 1;
            if (ciVar.B1) {
                this.F = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(xeVar.e);
                this.N.e(arrayList, ciVar.a1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.I;
                if (hashSet.contains(xeVar)) {
                    hashSet.remove(xeVar);
                    x31Var.e = false;
                    g7Var.e(false, true);
                    i7 = 2;
                } else {
                    if (this.E >= 0) {
                        int size = hashSet.size();
                        int i10 = this.E;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.id.a0(null, null, 2131747451, org.telegram.messenger.id.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
                            String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            u1Var.T = a02;
                            jg.g.C(null, 2131747831, alertDialog$Builder, null);
                            return;
                        }
                    }
                    x31Var.e = true;
                    hashSet.add(xeVar);
                    g7Var.e(true, true);
                }
            }
            ciVar.K1(i7);
        }
    }

    public final void R() {
        org.telegram.messenger.g0.r(this.a0);
        String str = this.D;
        if (str != null && str.length() > 0 && this.D.length() < 3) {
            if (this.W) {
                this.W = false;
                T();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.V, this.D);
        ArrayList arrayList = this.L;
        if (!equals) {
            arrayList.clear();
            this.b0 = 0;
            this.c0 = false;
        }
        if (!arrayList.isEmpty() && !this.c0) {
            if (this.W) {
                this.W = false;
                T();
                return;
            }
            return;
        }
        int i7 = this.b.G3;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        int i10 = this.U;
        if (i10 >= 0) {
            connectionsManager.cancelRequest(i10, true);
            this.U = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.D;
        this.V = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.q = str2;
        tL_messages_searchGlobal.limit = arrayList.isEmpty() ? 3 : 15;
        if (arrayList.size() > 0) {
            org.telegram.messenger.ij ijVar = ((org.telegram.messenger.xe) jg.g.i(1, arrayList)).e;
            tL_messages_searchGlobal.offset_id = ijVar.e1();
            tL_messages_searchGlobal.offset_rate = this.b0;
            tL_messages_searchGlobal.offset_peer = s12.j1(org.telegram.messenger.ij.B1(ijVar.k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.U = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new d3.b(1), new fi(this, s12, i7, 1));
        T();
    }

    public final void S() {
        String str;
        org.telegram.messenger.g0.r(this.f0);
        if (TextUtils.isEmpty(this.D) || this.D.length() < 3) {
            if (this.m0) {
                this.m0 = false;
                T();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.e0, this.D);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.g0 = false;
        }
        int i7 = this.b.G3;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        int i10 = this.d0;
        if (i10 >= 0) {
            connectionsManager.cancelRequest(i10, true);
            this.d0 = -1;
        }
        String str2 = ((org.telegram.messenger.n0) s12.x7.F.b).c;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.h0 == null) {
            TLObject f22 = s12.f2(str2);
            this.h0 = f22 instanceof TLRPC.User ? (TLRPC.User) f22 : null;
        }
        if (this.h0 == null) {
            if (this.i0 || this.j0) {
                return;
            }
            this.i0 = true;
            s12.d2().a(str2, null, new org.telegram.messenger.voip.k(26, this, s12));
            return;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = s12.q1(this.h0);
        tL_messages_getInlineBotResults.peer = org.telegram.messenger.qp.n1(f10);
        if (arrayList.isEmpty() || (str = this.k0) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.D;
        String str4 = str3 != null ? str3 : "";
        this.e0 = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.d0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new fi(this, s12, i7, 0));
        T();
    }

    public final void T() {
        di diVar = this.S;
        org.telegram.messenger.g0.r(diVar);
        org.telegram.messenger.g0.h3(diVar);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            bi biVar = this.x;
            biVar.setAlpha(f10);
            biVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.g2;
        int i12 = org.telegram.messenger.qs.h2;
        fi.w3 w3Var = this.w;
        int i13 = org.telegram.messenger.qs.f2;
        if (i7 != i13 && i7 != i12 && i7 != i11) {
            if (i7 == org.telegram.messenger.qs.T3 && objArr[0] == this.J && w3Var != null) {
                w3Var.f3.O(true);
                return;
            }
            return;
        }
        if (i7 == i13 || i7 == i11) {
            int childCount = w3Var.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = w3Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (g7Var.getMessage() != null) {
                        g7Var.g(false, true);
                    }
                }
            }
            return;
        }
        if (i7 == i12 && ((org.telegram.messenger.ij) objArr[0]).T == 0) {
            int childCount2 = w3Var.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = w3Var.getChildAt(i15);
                if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                    if (g7Var2.getMessage() != null) {
                        g7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        fi.w3 w3Var = this.w;
        if (w3Var.getChildCount() > 0) {
            boolean z9 = false;
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < w3Var.getChildCount(); i10++) {
                View childAt = w3Var.getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z9 = true;
                }
                if (R >= 0 && childAt.getTop() < i7) {
                    i7 = childAt.getTop();
                }
            }
            if (i7 != Integer.MAX_VALUE) {
                int L = (((i7 - org.telegram.messenger.g0.L(56.0f)) - ((int) this.y.c(0.0f))) - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
                int i11 = (L <= 0 || !z9) ? 0 : L;
                te.a aVar = this.n;
                if (L < 0 || !z9) {
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

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return (this.w.getPaddingTop() - org.telegram.messenger.g0.L(56.0f)) - ((int) this.y.c(0.0f));
    }

    public ArrayList<org.telegram.messenger.ij> getSelected() {
        ArrayList<org.telegram.messenger.ij> arrayList = new ArrayList<>();
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.xe) it.next()).e);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.uh
    public int getSelectedItemsCount() {
        return this.I.size();
    }

    @Override // org.telegram.ui.Components.uh
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.m6.A5;
        fi.w3 w3Var = this.w;
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.m6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.m6.f3, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(w3Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.m6.g3, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.z6));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.uh
    public final void p() {
        u();
        ci ciVar = this.b;
        org.telegram.messenger.qs.f(ciVar.G3).n(this, org.telegram.messenger.qs.f2);
        int i7 = ciVar.G3;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.h2);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.g2);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.T3);
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean q() {
        if (this.O != null && MediaController.B().I(this.O)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(ji jiVar) {
        this.N = jiVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.E = i7;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        yh yhVar = this.s;
        if (yhVar != null) {
            yhVar.setupBlurredBackground(cVar.c(yhVar, c8.g0.n(h6Var), false));
        }
        or orVar = this.y;
        if (orVar != null) {
            fh.g c10 = cVar.c(orVar, c8.g0.n(h6Var), false);
            c10.r(org.telegram.messenger.g0.L(24.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            orVar.setBlurredBackground(c10);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void t() {
        this.I.clear();
    }

    @Override // org.telegram.ui.Components.uh
    public final void u() {
        if (this.O != null && MediaController.B().I(this.O)) {
            MediaController.B().q(true, true, false, false);
        }
        this.O = null;
    }

    @Override // org.telegram.ui.Components.uh
    public final void m(float f10) {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
