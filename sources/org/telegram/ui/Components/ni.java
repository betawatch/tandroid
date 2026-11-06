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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ni extends vh implements org.telegram.messenger.ls, te.b {
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
    public ki N;
    public org.telegram.messenger.ij O;
    public final int P;
    public final int Q;
    public final int R;
    public final ei S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public final ei a0;
    public int b0;
    public boolean c0;
    public int d0;
    public String e0;
    public final ei f0;
    public boolean g0;
    public TLRPC.User h0;
    public boolean i0;
    public boolean j0;
    public String k0;
    public int l0;
    public boolean m0;
    public final te.a n;
    public final FrameLayout r;
    public final zh s;
    public final fi.w3 w;
    public final ci x;
    public final pr y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Components.ei] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Components.ei] */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.telegram.ui.Components.ei] */
    public ni(Context context, org.telegram.ui.ActionBar.f6 f6Var, di diVar) {
        super(context, f6Var, diVar);
        ViewGroup viewGroup;
        this.n = new te.a(0, this, xq.h, 380L, false);
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
        this.S = new Runnable(this) { // from class: org.telegram.ui.Components.ei
            public final /* synthetic */ ni b;

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
                        ni niVar = this.b;
                        niVar.P();
                        niVar.b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.b;
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
                                    long e10 = org.telegram.messenger.p10.i(niVar2.b.D3).e();
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
                                    xeVar.e = new org.telegram.messenger.ij(niVar2.b.D3, tL_message, false, true);
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
                        org.telegram.messenger.g0.h3(new f(16, niVar2, arrayList));
                        return;
                }
            }
        };
        this.U = -1;
        this.a0 = new Runnable(this) { // from class: org.telegram.ui.Components.ei
            public final /* synthetic */ ni b;

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
                        ni niVar = this.b;
                        niVar.P();
                        niVar.b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.b;
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
                                    long e10 = org.telegram.messenger.p10.i(niVar2.b.D3).e();
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
                                    xeVar.e = new org.telegram.messenger.ij(niVar2.b.D3, tL_message, false, true);
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
                        org.telegram.messenger.g0.h3(new f(16, niVar2, arrayList));
                        return;
                }
            }
        };
        this.d0 = -1;
        this.f0 = new Runnable(this) { // from class: org.telegram.ui.Components.ei
            public final /* synthetic */ ni b;

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
                        ni niVar = this.b;
                        niVar.P();
                        niVar.b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.b;
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
                                    long e10 = org.telegram.messenger.p10.i(niVar2.b.D3).e();
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
                                    xeVar.e = new org.telegram.messenger.ij(niVar2.b.D3, tL_message, false, true);
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
                        org.telegram.messenger.g0.h3(new f(16, niVar2, arrayList));
                        return;
                }
            }
        };
        this.l0 = -1000000000;
        org.telegram.messenger.qs.f(this.b.D3).c(this, org.telegram.messenger.qs.f2);
        org.telegram.messenger.qs.f(this.b.D3).c(this, org.telegram.messenger.qs.h2);
        org.telegram.messenger.qs.f(this.b.D3).c(this, org.telegram.messenger.qs.g2);
        org.telegram.messenger.qs.f(this.b.D3).c(this, org.telegram.messenger.qs.T3);
        this.G = true;
        final int i13 = 4;
        Utilities.e.c(new Runnable(this) { // from class: org.telegram.ui.Components.ei
            public final /* synthetic */ ni b;

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
                        ni niVar = this.b;
                        niVar.P();
                        niVar.b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.b;
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
                                    long e10 = org.telegram.messenger.p10.i(niVar2.b.D3).e();
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
                                    xeVar.e = new org.telegram.messenger.ij(niVar2.b.D3, tL_message, false, true);
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
                        org.telegram.messenger.g0.h3(new f(16, niVar2, arrayList));
                        return;
                }
            }
        });
        ci ciVar = new ci(org.telegram.ui.ActionBar.k6.d6, context, f6Var);
        this.x = ciVar;
        ciVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        zh zhVar = new zh(context, f6Var, this.b);
        this.s = zhVar;
        zhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        zhVar.r.addTextChangedListener(new ah.j(this, 15));
        zhVar.r.setHint(org.telegram.messenger.hd.M0(2131745741, null));
        frameLayout.addView(ciVar, c8.ha.g());
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(zhVar, d);
        pr prVar = new pr(context);
        this.y = prVar;
        prVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        prVar.setOnAnimatedHeightChangedListener(new Runnable(this) { // from class: org.telegram.ui.Components.ei
            public final /* synthetic */ ni b;

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
                        ni niVar = this.b;
                        niVar.P();
                        niVar.b.M1(niVar, 0);
                        return;
                    default:
                        ni niVar2 = this.b;
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
                                    long e10 = org.telegram.messenger.p10.i(niVar2.b.D3).e();
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
                                    xeVar.e = new org.telegram.messenger.ij(niVar2.b.D3, tL_message, false, true);
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
                        org.telegram.messenger.g0.h3(new f(16, niVar2, arrayList));
                        return;
                }
            }
        });
        if (diVar.W1 != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            prVar.addView(frameLayout2);
            prVar.i(frameLayout2, true, false);
            FragmentContextView jiVar = new ji(this, context, diVar.W1, frameLayout, f6Var, frameLayout2);
            viewGroup = frameLayout;
            frameLayout2.addView(jiVar);
            prVar.setCallFragmentContextView(jiVar);
        } else {
            viewGroup = frameLayout;
        }
        FrameLayout.LayoutParams d2 = c8.ha.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = org.telegram.messenger.k5.C(27.0f, org.telegram.messenger.g0.m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        viewGroup.addView(prVar, d2);
        fi.w3 w3Var = new fi.w3(this, context, diVar.D3, new d(this, 5), new hi(this), new hi(this), f6Var);
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
        org.telegram.ui.ActionBar.r6.m(w3Var, 21, org.telegram.ui.ActionBar.k6.A5, f6Var);
        w3Var.setOnScrollListener(new ai.b(this, 28));
        addView(viewGroup, c8.ha.e(-1, org.telegram.messenger.qs.e3, 51));
        w3Var.f3.O(false);
        P();
        int i14 = this.b.D3;
        this.J = new org.telegram.messenger.kp(i14, org.telegram.messenger.p10.i(i14).e());
    }

    public static boolean O(ni niVar, org.telegram.messenger.ij ijVar) {
        niVar.O = ijVar;
        return MediaController.B().o0(org.telegram.messenger.k5.k(ijVar), ijVar, 0L, true, null, 0L);
    }

    @Override // org.telegram.ui.Components.vh
    public final void B(int i7, int i10) {
        this.T = i10;
        P();
    }

    @Override // org.telegram.ui.Components.vh
    public final void H(vh vhVar) {
        R();
        this.J.b();
        fi.w3 w3Var = this.w;
        w3Var.e3.h1(0, 0);
        w3Var.f3.O(false);
    }

    @Override // org.telegram.ui.Components.vh
    public final void J() {
        this.w.y0(0);
    }

    @Override // org.telegram.ui.Components.vh
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
        di diVar = this.b;
        return v4.Y(diVar.D3, diVar.b1(), diVar.X0() + arrayList.size(), new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ii
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                ni niVar = ni.this;
                ki kiVar = niVar.N;
                di diVar2 = niVar.b;
                kiVar.e(arrayList, diVar2.a1().getText(), z9, i7, i10, j3, z10, ((Long) obj).longValue());
                diVar2.a(true);
            }
        }, 0L);
    }

    public final void P() {
        int i7;
        di diVar = this.b;
        if (diVar.l3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i7 = org.telegram.messenger.g0.L(8.0f);
            diVar.q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i7 = (int) (this.T / 3.5f);
                    diVar.q0 = true;
                }
            }
            i7 = (this.T / 5) * 2;
            diVar.q0 = true;
        }
        this.w.setPadding(0, (int) (this.y.c(0.0f) + org.telegram.messenger.g0.L(56.0f) + i7 + org.telegram.messenger.g0.m), 0, this.e);
    }

    public final void Q(r31 r31Var, View view) {
        if (r31Var != null && r31Var.d == this.R) {
            this.J.b();
            return;
        }
        if (r31Var != null && r31Var.d == this.P) {
            R();
            return;
        }
        if (r31Var != null && r31Var.d == this.Q) {
            S();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) g7Var.getTag();
            di diVar = this.b;
            diVar.getClass();
            int i7 = 1;
            if (diVar.y1) {
                this.F = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(xeVar.e);
                this.N.e(arrayList, diVar.a1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.I;
                if (hashSet.contains(xeVar)) {
                    hashSet.remove(xeVar);
                    r31Var.e = false;
                    g7Var.e(false, true);
                    i7 = 2;
                } else {
                    if (this.E >= 0) {
                        int size = hashSet.size();
                        int i10 = this.E;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.hd.a0(null, null, 2131747450, org.telegram.messenger.hd.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
                            String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            u1Var.T = a02;
                            jg.g.C(null, 2131747830, alertDialog$Builder, null);
                            return;
                        }
                    }
                    r31Var.e = true;
                    hashSet.add(xeVar);
                    g7Var.e(true, true);
                }
            }
            diVar.K1(i7);
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
        int i7 = this.b.D3;
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
            tL_messages_searchGlobal.offset_id = ijVar.f1();
            tL_messages_searchGlobal.offset_rate = this.b0;
            tL_messages_searchGlobal.offset_peer = s12.j1(org.telegram.messenger.ij.C1(ijVar.k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.U = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new d3.b(1), new gi(this, s12, i7, 1));
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
        int i7 = this.b.D3;
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
        this.d0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new gi(this, s12, i7, 0));
        T();
    }

    public final void T() {
        ei eiVar = this.S;
        org.telegram.messenger.g0.r(eiVar);
        org.telegram.messenger.g0.h3(eiVar);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            ci ciVar = this.x;
            ciVar.setAlpha(f10);
            ciVar.setVisibility(f10 > 0.0f ? 0 : 4);
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

    @Override // org.telegram.ui.Components.vh
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

    @Override // org.telegram.ui.Components.vh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.vh
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

    @Override // org.telegram.ui.Components.vh
    public int getSelectedItemsCount() {
        return this.I.size();
    }

    @Override // org.telegram.ui.Components.vh
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.k6.A5;
        fi.w3 w3Var = this.w;
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.k6.f3, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w3Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.k6.g3, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.z6));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.vh
    public final void p() {
        u();
        di diVar = this.b;
        org.telegram.messenger.qs.f(diVar.D3).n(this, org.telegram.messenger.qs.f2);
        int i7 = diVar.D3;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.h2);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.g2);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.T3);
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean q() {
        if (this.O != null && MediaController.B().I(this.O)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(ki kiVar) {
        this.N = kiVar;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        zh zhVar = this.s;
        if (zhVar != null) {
            zhVar.setupBlurredBackground(cVar.c(zhVar, c8.g0.o(f6Var), false));
        }
        pr prVar = this.y;
        if (prVar != null) {
            fh.g c10 = cVar.c(prVar, c8.g0.o(f6Var), false);
            c10.r(org.telegram.messenger.g0.L(24.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            prVar.setBlurredBackground(c10);
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void t() {
        this.I.clear();
    }

    @Override // org.telegram.ui.Components.vh
    public final void u() {
        if (this.O != null && MediaController.B().I(this.O)) {
            MediaController.B().q(true, true, false, false);
        }
        this.O = null;
    }

    @Override // org.telegram.ui.Components.vh
    public final void m(float f10) {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
