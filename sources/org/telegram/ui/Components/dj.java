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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class dj extends li implements org.telegram.messenger.fs, te.b {
    public String E;
    public int F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public final HashSet J;
    public final org.telegram.messenger.gp K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public aj O;
    public org.telegram.messenger.fj P;
    public final int Q;
    public final int R;
    public final int S;
    public final ui T;
    public int U;
    public int V;
    public String W;
    public boolean a0;
    public final ui b0;
    public int c0;
    public boolean d0;
    public int e0;
    public String f0;
    public final ui g0;
    public boolean h0;
    public TLRPC.User i0;
    public boolean j0;
    public boolean k0;
    public String l0;
    public int m0;
    public final te.a n;
    public boolean n0;
    public final FrameLayout r;
    public final pi s;
    public final bi.i6 w;
    public final si x;
    public final bs y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Components.ui] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Components.ui] */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.telegram.ui.Components.ui] */
    public dj(Context context, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar) {
        super(context, i6Var, tiVar);
        ViewGroup viewGroup;
        this.n = new te.a(0, this, kr.h, 380L, false);
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
        this.T = new Runnable(this) { // from class: org.telegram.ui.Components.ui
            public final /* synthetic */ dj b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        bi.i6 i6Var2 = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = i6Var2.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < i6Var2.getChildCount()) {
                                View childAt = i6Var2.getChildAt(i15);
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
                        i6Var2.g3.O(true);
                        if (!canScrollVertically) {
                            i6Var2.f3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                i6Var2.f3.h1(i13, i14 - i6Var2.getPaddingTop());
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
                        dj djVar = this.b;
                        djVar.Q();
                        djVar.b.N1(djVar, 0);
                        return;
                    default:
                        dj djVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.ve veVar = new org.telegram.messenger.ve();
                                    query.getInt(0);
                                    veVar.a = query.getString(1);
                                    veVar.b = query.getString(2);
                                    veVar.d = query.getString(3);
                                    veVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(veVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.i10.i(djVar2.b.H3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = veVar.d;
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
                                    tL_documentAttributeAudio.duration = veVar.c;
                                    tL_documentAttributeAudio.title = veVar.b;
                                    tL_documentAttributeAudio.performer = veVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    veVar.e = new org.telegram.messenger.fj(djVar2.b.H3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            veVar.e.J1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        veVar.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(veVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new xd(10, djVar2, arrayList));
                        return;
                }
            }
        };
        this.V = -1;
        this.b0 = new Runnable(this) { // from class: org.telegram.ui.Components.ui
            public final /* synthetic */ dj b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        bi.i6 i6Var2 = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = i6Var2.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < i6Var2.getChildCount()) {
                                View childAt = i6Var2.getChildAt(i15);
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
                        i6Var2.g3.O(true);
                        if (!canScrollVertically) {
                            i6Var2.f3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                i6Var2.f3.h1(i13, i14 - i6Var2.getPaddingTop());
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
                        dj djVar = this.b;
                        djVar.Q();
                        djVar.b.N1(djVar, 0);
                        return;
                    default:
                        dj djVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.ve veVar = new org.telegram.messenger.ve();
                                    query.getInt(0);
                                    veVar.a = query.getString(1);
                                    veVar.b = query.getString(2);
                                    veVar.d = query.getString(3);
                                    veVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(veVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.i10.i(djVar2.b.H3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = veVar.d;
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
                                    tL_documentAttributeAudio.duration = veVar.c;
                                    tL_documentAttributeAudio.title = veVar.b;
                                    tL_documentAttributeAudio.performer = veVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    veVar.e = new org.telegram.messenger.fj(djVar2.b.H3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            veVar.e.J1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        veVar.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(veVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new xd(10, djVar2, arrayList));
                        return;
                }
            }
        };
        this.e0 = -1;
        this.g0 = new Runnable(this) { // from class: org.telegram.ui.Components.ui
            public final /* synthetic */ dj b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        bi.i6 i6Var2 = this.b.w;
                        int i13 = -1;
                        boolean canScrollVertically = i6Var2.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < i6Var2.getChildCount()) {
                                View childAt = i6Var2.getChildAt(i15);
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
                        i6Var2.g3.O(true);
                        if (!canScrollVertically) {
                            i6Var2.f3.h1(0, 0);
                            return;
                        } else {
                            if (i13 >= 0) {
                                i6Var2.f3.h1(i13, i14 - i6Var2.getPaddingTop());
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
                        dj djVar = this.b;
                        djVar.Q();
                        djVar.b.N1(djVar, 0);
                        return;
                    default:
                        dj djVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.ve veVar = new org.telegram.messenger.ve();
                                    query.getInt(0);
                                    veVar.a = query.getString(1);
                                    veVar.b = query.getString(2);
                                    veVar.d = query.getString(3);
                                    veVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(veVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.i10.i(djVar2.b.H3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = veVar.d;
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
                                    tL_documentAttributeAudio.duration = veVar.c;
                                    tL_documentAttributeAudio.title = veVar.b;
                                    tL_documentAttributeAudio.performer = veVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    veVar.e = new org.telegram.messenger.fj(djVar2.b.H3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            veVar.e.J1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        veVar.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(veVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new xd(10, djVar2, arrayList));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        org.telegram.messenger.ks.f(this.b.H3).c(this, org.telegram.messenger.ks.f2);
        org.telegram.messenger.ks.f(this.b.H3).c(this, org.telegram.messenger.ks.h2);
        org.telegram.messenger.ks.f(this.b.H3).c(this, org.telegram.messenger.ks.g2);
        org.telegram.messenger.ks.f(this.b.H3).c(this, org.telegram.messenger.ks.W3);
        this.H = true;
        final int i13 = 4;
        Utilities.e.c(new Runnable(this) { // from class: org.telegram.ui.Components.ui
            public final /* synthetic */ dj b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        bi.i6 i6Var2 = this.b.w;
                        int i132 = -1;
                        boolean canScrollVertically = i6Var2.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < i6Var2.getChildCount()) {
                                View childAt = i6Var2.getChildAt(i15);
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
                        i6Var2.g3.O(true);
                        if (!canScrollVertically) {
                            i6Var2.f3.h1(0, 0);
                            return;
                        } else {
                            if (i132 >= 0) {
                                i6Var2.f3.h1(i132, i14 - i6Var2.getPaddingTop());
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
                        dj djVar = this.b;
                        djVar.Q();
                        djVar.b.N1(djVar, 0);
                        return;
                    default:
                        dj djVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.ve veVar = new org.telegram.messenger.ve();
                                    query.getInt(0);
                                    veVar.a = query.getString(1);
                                    veVar.b = query.getString(2);
                                    veVar.d = query.getString(3);
                                    veVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(veVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.i10.i(djVar2.b.H3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = veVar.d;
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
                                    tL_documentAttributeAudio.duration = veVar.c;
                                    tL_documentAttributeAudio.title = veVar.b;
                                    tL_documentAttributeAudio.performer = veVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    veVar.e = new org.telegram.messenger.fj(djVar2.b.H3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            veVar.e.J1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        veVar.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(veVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new xd(10, djVar2, arrayList));
                        return;
                }
            }
        });
        si siVar = new si(org.telegram.ui.ActionBar.n6.d6, context, i6Var);
        this.x = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        pi piVar = new pi(context, i6Var, this.b);
        this.s = piVar;
        piVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        piVar.r.addTextChangedListener(new ah.j(this, 18));
        piVar.r.setHint(org.telegram.messenger.gd.N0(2131745544, null));
        frameLayout.addView(siVar, c8.na.g());
        FrameLayout.LayoutParams d = c8.na.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(piVar, d);
        bs bsVar = new bs(context);
        this.y = bsVar;
        bsVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        bsVar.setOnAnimatedHeightChangedListener(new Runnable(this) { // from class: org.telegram.ui.Components.ui
            public final /* synthetic */ dj b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        bi.i6 i6Var2 = this.b.w;
                        int i132 = -1;
                        boolean canScrollVertically = i6Var2.canScrollVertically(-1);
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < i6Var2.getChildCount()) {
                                View childAt = i6Var2.getChildAt(i15);
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
                        i6Var2.g3.O(true);
                        if (!canScrollVertically) {
                            i6Var2.f3.h1(0, 0);
                            return;
                        } else {
                            if (i132 >= 0) {
                                i6Var2.f3.h1(i132, i14 - i6Var2.getPaddingTop());
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
                        dj djVar = this.b;
                        djVar.Q();
                        djVar.b.N1(djVar, 0);
                        return;
                    default:
                        dj djVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i16 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    org.telegram.messenger.ve veVar = new org.telegram.messenger.ve();
                                    query.getInt(0);
                                    veVar.a = query.getString(1);
                                    veVar.b = query.getString(2);
                                    veVar.d = query.getString(3);
                                    veVar.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(veVar.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i16;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e10 = org.telegram.messenger.i10.i(djVar2.b.H3).e();
                                    tL_peerUser.user_id = e10;
                                    peer.user_id = e10;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = veVar.d;
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
                                    tL_documentAttributeAudio.duration = veVar.c;
                                    tL_documentAttributeAudio.title = veVar.b;
                                    tL_documentAttributeAudio.performer = veVar.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    veVar.e = new org.telegram.messenger.fj(djVar2.b.H3, tL_message, false, true);
                                    rf.a a10 = rf.a.a(file);
                                    if (a10 != null && a10.o != null) {
                                        int L = org.telegram.messenger.g0.L(44.0f);
                                        Bitmap bitmap = a10.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            veVar.e.J1 = bitmap;
                                        }
                                        float f10 = L;
                                        float min = Math.min(f10 / bitmap.getWidth(), f10 / bitmap.getHeight());
                                        veVar.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(veVar);
                                    i16--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new xd(10, djVar2, arrayList));
                        return;
                }
            }
        });
        if (tiVar.a2 != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            bsVar.addView(frameLayout2);
            bsVar.j(frameLayout2, true, false);
            FragmentContextView ziVar = new zi(this, context, tiVar.a2, frameLayout, i6Var, frameLayout2);
            viewGroup = frameLayout;
            frameLayout2.addView(ziVar);
            bsVar.setCallFragmentContextView(ziVar);
        } else {
            viewGroup = frameLayout;
        }
        FrameLayout.LayoutParams d2 = c8.na.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = org.telegram.messenger.f3.C(27.0f, org.telegram.messenger.g0.m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        viewGroup.addView(bsVar, d2);
        bi.i6 i6Var2 = new bi.i6(this, context, tiVar.H3, new d(this, 6), new xi(this), new xi(this), i6Var);
        this.w = i6Var2;
        i6Var2.g3.r = false;
        i6Var2.r1();
        setBlur3Capture(i6Var2);
        this.d = i6Var2;
        this.h = true;
        this.f = true;
        i6Var2.setClipToPadding(false);
        i6Var2.setHorizontalScrollBarEnabled(false);
        i6Var2.setVerticalScrollBarEnabled(false);
        addView(i6Var2, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u6.l(i6Var2, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        i6Var2.setOnScrollListener(new na(this, i7));
        addView(viewGroup, c8.na.e(-1, org.telegram.messenger.ks.e3, 51));
        i6Var2.g3.O(false);
        Q();
        int i14 = this.b.H3;
        this.K = new org.telegram.messenger.gp(i14, org.telegram.messenger.i10.i(i14).e());
    }

    public static boolean P(dj djVar, org.telegram.messenger.fj fjVar) {
        djVar.P = fjVar;
        return MediaController.B().o0(org.telegram.messenger.f3.i(fjVar), fjVar, 0L, true, null, 0L);
    }

    @Override // org.telegram.ui.Components.li
    public final void B(int i7, int i10) {
        this.U = i10;
        Q();
    }

    @Override // org.telegram.ui.Components.li
    public final void H(li liVar) {
        S();
        this.K.b();
        bi.i6 i6Var = this.w;
        i6Var.f3.h1(0, 0);
        i6Var.g3.O(false);
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.w.y0(0);
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            si siVar = this.x;
            siVar.setAlpha(f10);
            siVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean M(final boolean z10, final int i7, final int i10, final long j3, final boolean z11) {
        HashSet hashSet = this.J;
        if (hashSet.size() == 0 || this.O == null || this.G) {
            return false;
        }
        this.G = true;
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.ve) it.next()).e);
        }
        ti tiVar = this.b;
        return b5.Y(tiVar.H3, tiVar.c1(), tiVar.Y0() + arrayList.size(), new org.telegram.messenger.w10() { // from class: org.telegram.ui.Components.yi
            @Override // org.telegram.messenger.w10
            public final void a(Object obj) {
                dj djVar = dj.this;
                aj ajVar = djVar.O;
                ti tiVar2 = djVar.b;
                ajVar.e(arrayList, tiVar2.b1().getText(), z10, i7, i10, j3, z11, ((Long) obj).longValue());
                tiVar2.a(true);
            }
        }, 0L);
    }

    public final void Q() {
        int i7;
        ti tiVar = this.b;
        if (tiVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i7 = org.telegram.messenger.g0.L(8.0f);
            tiVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i7 = (int) (this.U / 3.5f);
                    tiVar.r0 = true;
                }
            }
            i7 = (this.U / 5) * 2;
            tiVar.r0 = true;
        }
        this.w.setPadding(0, (int) (this.y.d(0.0f) + org.telegram.messenger.g0.L(56.0f) + i7 + org.telegram.messenger.g0.m), 0, this.e);
    }

    public final void R(n41 n41Var, View view) {
        if (n41Var != null && n41Var.d == this.S) {
            this.K.b();
            return;
        }
        if (n41Var != null && n41Var.d == this.Q) {
            S();
            return;
        }
        if (n41Var != null && n41Var.d == this.R) {
            T();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.ve veVar = (org.telegram.messenger.ve) g7Var.getTag();
            ti tiVar = this.b;
            tiVar.getClass();
            int i7 = 1;
            if (tiVar.C1) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(veVar.e);
                this.O.e(arrayList, tiVar.b1().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(veVar)) {
                    hashSet.remove(veVar);
                    n41Var.e = false;
                    g7Var.e(false, true);
                    i7 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i10 = this.F;
                        if (size >= i10) {
                            String a02 = org.telegram.messenger.gd.a0(null, null, 2131747257, org.telegram.messenger.gd.G(i10, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
                            String N0 = org.telegram.messenger.gd.N0(R.string.AppName, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            t1Var.U = a02;
                            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                            return;
                        }
                    }
                    n41Var.e = true;
                    hashSet.add(veVar);
                    g7Var.e(true, true);
                }
            }
            tiVar.L1(i7);
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
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
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
            org.telegram.messenger.fj fjVar = ((org.telegram.messenger.ve) i5.c.h(1, arrayList)).e;
            tL_messages_searchGlobal.offset_id = fjVar.e1();
            tL_messages_searchGlobal.offset_rate = this.c0;
            tL_messages_searchGlobal.offset_peer = u12.l1(org.telegram.messenger.fj.B1(fjVar.k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new d3.b(1), new wi(this, u12, i7, 1));
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
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
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
            u12.f2().a(str2, null, new ph(2, this, u12));
            return;
        }
        TLRPC.User f10 = org.telegram.messenger.i10.i(i7).f();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = u12.s1(this.i0);
        tL_messages_getInlineBotResults.peer = org.telegram.messenger.mp.p1(f10);
        if (arrayList.isEmpty() || (str = this.l0) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.E;
        String str4 = str3 != null ? str3 : "";
        this.f0 = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new wi(this, u12, i7, 0));
        U();
    }

    public final void U() {
        ui uiVar = this.T;
        org.telegram.messenger.g0.r(uiVar);
        org.telegram.messenger.g0.g3(uiVar);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.g2;
        int i12 = org.telegram.messenger.ks.h2;
        bi.i6 i6Var = this.w;
        int i13 = org.telegram.messenger.ks.f2;
        if (i7 != i13 && i7 != i12 && i7 != i11) {
            if (i7 == org.telegram.messenger.ks.W3 && objArr[0] == this.K && i6Var != null) {
                i6Var.g3.O(true);
                return;
            }
            return;
        }
        if (i7 == i13 || i7 == i11) {
            int childCount = i6Var.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = i6Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (g7Var.getMessage() != null) {
                        g7Var.g(false, true);
                    }
                }
            }
            return;
        }
        if (i7 == i12 && ((org.telegram.messenger.fj) objArr[0]).T == 0) {
            int childCount2 = i6Var.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = i6Var.getChildAt(i15);
                if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                    if (g7Var2.getMessage() != null) {
                        g7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        bi.i6 i6Var = this.w;
        if (i6Var.getChildCount() > 0) {
            boolean z10 = false;
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < i6Var.getChildCount(); i10++) {
                View childAt = i6Var.getChildAt(i10);
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

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return (this.w.getPaddingTop() - org.telegram.messenger.g0.L(56.0f)) - ((int) this.y.d(0.0f));
    }

    public ArrayList<org.telegram.messenger.fj> getSelected() {
        ArrayList<org.telegram.messenger.fj> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.telegram.messenger.ve) it.next()).e);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.li
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override // org.telegram.ui.Components.li
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.n6.A5;
        bi.i6 i6Var = this.w;
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.n6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.n6.f3, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(i6Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.n6.g3, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.z6));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.li
    public final void p() {
        u();
        ti tiVar = this.b;
        org.telegram.messenger.ks.f(tiVar.H3).n(this, org.telegram.messenger.ks.f2);
        int i7 = tiVar.H3;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.h2);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.g2);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.W3);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean q() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(aj ajVar) {
        this.O = ajVar;
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
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        pi piVar = this.s;
        if (piVar != null) {
            piVar.setupBlurredBackground(cVar.c(piVar, c8.j0.o(i6Var), false));
        }
        bs bsVar = this.y;
        if (bsVar != null) {
            fh.g c10 = cVar.c(bsVar, c8.j0.o(i6Var), false);
            c10.r(org.telegram.messenger.g0.L(24.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            bsVar.setBlurredBackground(c10);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void t() {
        this.J.clear();
    }

    @Override // org.telegram.ui.Components.li
    public final void u() {
        if (this.P != null && MediaController.B().I(this.P)) {
            MediaController.B().q(true, true, false, false);
        }
        this.P = null;
    }

    @Override // org.telegram.ui.Components.li
    public final void m(float f10) {
    }

    @Override // te.b
    public final /* synthetic */ void G(float f10, int i7) {
    }
}
