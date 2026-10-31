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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mi extends uh implements org.telegram.messenger.us, fe.e {
    public String D;
    public int E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final HashSet I;
    public final org.telegram.messenger.pp J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public ji N;
    public org.telegram.messenger.jj O;
    public final int P;
    public final int Q;
    public final int R;
    public final ci S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public final ci a0;
    public int b0;
    public boolean c0;
    public int d0;
    public String e0;
    public final ci f0;
    public boolean g0;
    public TLRPC.User h0;
    public boolean i0;
    public boolean j0;
    public String k0;
    public int l0;
    public boolean m0;
    public final fe.b n;
    public final FrameLayout r;
    public final yh s;
    public final ii w;
    public final ih.e x;
    public final zr y;

    /* JADX WARN: Type inference failed for: r3v1, types: [org.telegram.ui.Components.ci] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.ui.Components.ci] */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.telegram.ui.Components.ci] */
    public mi(Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
        ViewGroup viewGroup;
        this.n = new fe.b(0, this, gr.h, 380L, false);
        this.E = -1;
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        final int i10 = 1;
        this.P = 1;
        final int i11 = 2;
        this.Q = 2;
        final int i12 = 3;
        this.R = 3;
        final int i13 = 0;
        this.S = new Runnable(this) { // from class: org.telegram.ui.Components.ci
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        ii iiVar = this.b.w;
                        int i14 = -1;
                        boolean canScrollVertically = iiVar.canScrollVertically(-1);
                        int i15 = -1;
                        int i16 = 0;
                        while (true) {
                            if (i16 < iiVar.getChildCount()) {
                                View childAt = iiVar.getChildAt(i16);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i15 = top;
                                    i14 = R;
                                } else {
                                    i16++;
                                    i15 = top;
                                    i14 = R;
                                }
                            }
                        }
                        iiVar.f3.O(true);
                        if (!canScrollVertically) {
                            iiVar.e3.h1(0, 0);
                            return;
                        } else {
                            if (i14 >= 0) {
                                iiVar.e3.h1(i14, i15 - iiVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        mi miVar = this.b;
                        miVar.O();
                        miVar.b.L1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.w0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i17 = -2000000000;
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
                                    tL_message.id = i17;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = org.telegram.messenger.d20.i(miVar2.b.D3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = xeVar.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = org.telegram.messenger.b8.D(file);
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
                                    xeVar.e = new org.telegram.messenger.jj(miVar2.b.D3, tL_message, false, true);
                                    cf.a a2 = cf.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int L = org.telegram.messenger.i0.L(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            xeVar.e.H1 = bitmap;
                                        }
                                        float f7 = L;
                                        float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                        xeVar.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(xeVar);
                                    i17--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new cd(10, miVar2, arrayList));
                        return;
                }
            }
        };
        this.U = -1;
        this.a0 = new Runnable(this) { // from class: org.telegram.ui.Components.ci
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        ii iiVar = this.b.w;
                        int i14 = -1;
                        boolean canScrollVertically = iiVar.canScrollVertically(-1);
                        int i15 = -1;
                        int i16 = 0;
                        while (true) {
                            if (i16 < iiVar.getChildCount()) {
                                View childAt = iiVar.getChildAt(i16);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i15 = top;
                                    i14 = R;
                                } else {
                                    i16++;
                                    i15 = top;
                                    i14 = R;
                                }
                            }
                        }
                        iiVar.f3.O(true);
                        if (!canScrollVertically) {
                            iiVar.e3.h1(0, 0);
                            return;
                        } else {
                            if (i14 >= 0) {
                                iiVar.e3.h1(i14, i15 - iiVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        mi miVar = this.b;
                        miVar.O();
                        miVar.b.L1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.w0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i17 = -2000000000;
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
                                    tL_message.id = i17;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = org.telegram.messenger.d20.i(miVar2.b.D3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = xeVar.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = org.telegram.messenger.b8.D(file);
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
                                    xeVar.e = new org.telegram.messenger.jj(miVar2.b.D3, tL_message, false, true);
                                    cf.a a2 = cf.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int L = org.telegram.messenger.i0.L(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            xeVar.e.H1 = bitmap;
                                        }
                                        float f7 = L;
                                        float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                        xeVar.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(xeVar);
                                    i17--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new cd(10, miVar2, arrayList));
                        return;
                }
            }
        };
        this.d0 = -1;
        this.f0 = new Runnable(this) { // from class: org.telegram.ui.Components.ci
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        ii iiVar = this.b.w;
                        int i14 = -1;
                        boolean canScrollVertically = iiVar.canScrollVertically(-1);
                        int i15 = -1;
                        int i16 = 0;
                        while (true) {
                            if (i16 < iiVar.getChildCount()) {
                                View childAt = iiVar.getChildAt(i16);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i15 = top;
                                    i14 = R;
                                } else {
                                    i16++;
                                    i15 = top;
                                    i14 = R;
                                }
                            }
                        }
                        iiVar.f3.O(true);
                        if (!canScrollVertically) {
                            iiVar.e3.h1(0, 0);
                            return;
                        } else {
                            if (i14 >= 0) {
                                iiVar.e3.h1(i14, i15 - iiVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        mi miVar = this.b;
                        miVar.O();
                        miVar.b.L1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.w0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i17 = -2000000000;
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
                                    tL_message.id = i17;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = org.telegram.messenger.d20.i(miVar2.b.D3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = xeVar.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = org.telegram.messenger.b8.D(file);
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
                                    xeVar.e = new org.telegram.messenger.jj(miVar2.b.D3, tL_message, false, true);
                                    cf.a a2 = cf.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int L = org.telegram.messenger.i0.L(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            xeVar.e.H1 = bitmap;
                                        }
                                        float f7 = L;
                                        float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                        xeVar.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(xeVar);
                                    i17--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new cd(10, miVar2, arrayList));
                        return;
                }
            }
        };
        this.l0 = -1000000000;
        org.telegram.messenger.zs.f(this.b.D3).c(this, org.telegram.messenger.zs.f2);
        org.telegram.messenger.zs.f(this.b.D3).c(this, org.telegram.messenger.zs.h2);
        org.telegram.messenger.zs.f(this.b.D3).c(this, org.telegram.messenger.zs.g2);
        org.telegram.messenger.zs.f(this.b.D3).c(this, org.telegram.messenger.zs.T3);
        this.G = true;
        final int i14 = 4;
        Utilities.e.c(new Runnable(this) { // from class: org.telegram.ui.Components.ci
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        ii iiVar = this.b.w;
                        int i142 = -1;
                        boolean canScrollVertically = iiVar.canScrollVertically(-1);
                        int i15 = -1;
                        int i16 = 0;
                        while (true) {
                            if (i16 < iiVar.getChildCount()) {
                                View childAt = iiVar.getChildAt(i16);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i15 = top;
                                    i142 = R;
                                } else {
                                    i16++;
                                    i15 = top;
                                    i142 = R;
                                }
                            }
                        }
                        iiVar.f3.O(true);
                        if (!canScrollVertically) {
                            iiVar.e3.h1(0, 0);
                            return;
                        } else {
                            if (i142 >= 0) {
                                iiVar.e3.h1(i142, i15 - iiVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        mi miVar = this.b;
                        miVar.O();
                        miVar.b.L1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.w0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i17 = -2000000000;
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
                                    tL_message.id = i17;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = org.telegram.messenger.d20.i(miVar2.b.D3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = xeVar.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = org.telegram.messenger.b8.D(file);
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
                                    xeVar.e = new org.telegram.messenger.jj(miVar2.b.D3, tL_message, false, true);
                                    cf.a a2 = cf.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int L = org.telegram.messenger.i0.L(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            xeVar.e.H1 = bitmap;
                                        }
                                        float f7 = L;
                                        float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                        xeVar.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(xeVar);
                                    i17--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new cd(10, miVar2, arrayList));
                        return;
                }
            }
        });
        ih.e eVar = new ih.e(org.telegram.ui.ActionBar.t6.d6, context, p6Var);
        this.x = eVar;
        eVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        yh yhVar = new yh(context, p6Var, this.b);
        this.s = yhVar;
        yhVar.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        yhVar.r.addTextChangedListener(new ag.a1(this, 10));
        yhVar.r.setHint(org.telegram.messenger.cd.L0(2131745757, null));
        frameLayout.addView(eVar, w7.b6.g());
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.i0.m;
        frameLayout.addView(yhVar, d);
        zr zrVar = new zr(context);
        this.y = zrVar;
        zrVar.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f));
        zrVar.setOnAnimatedHeightChangedListener(new Runnable(this) { // from class: org.telegram.ui.Components.ci
            public final /* synthetic */ mi b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        ii iiVar = this.b.w;
                        int i142 = -1;
                        boolean canScrollVertically = iiVar.canScrollVertically(-1);
                        int i15 = -1;
                        int i16 = 0;
                        while (true) {
                            if (i16 < iiVar.getChildCount()) {
                                View childAt = iiVar.getChildAt(i16);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i15 = top;
                                    i142 = R;
                                } else {
                                    i16++;
                                    i15 = top;
                                    i142 = R;
                                }
                            }
                        }
                        iiVar.f3.O(true);
                        if (!canScrollVertically) {
                            iiVar.e3.h1(0, 0);
                            return;
                        } else {
                            if (i142 >= 0) {
                                iiVar.e3.h1(i142, i15 - iiVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        mi miVar = this.b;
                        miVar.O();
                        miVar.b.L1(miVar, 0);
                        return;
                    default:
                        mi miVar2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = org.telegram.messenger.w0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i17 = -2000000000;
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
                                    tL_message.id = i17;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = org.telegram.messenger.d20.i(miVar2.b.D3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = xeVar.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = org.telegram.messenger.b8.D(file);
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
                                    xeVar.e = new org.telegram.messenger.jj(miVar2.b.D3, tL_message, false, true);
                                    cf.a a2 = cf.a.a(file);
                                    if (a2 != null && a2.o != null) {
                                        int L = org.telegram.messenger.i0.L(44.0f);
                                        Bitmap bitmap = a2.o;
                                        if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                            xeVar.e.H1 = bitmap;
                                        }
                                        float f7 = L;
                                        float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
                                        xeVar.e.H1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                    arrayList.add(xeVar);
                                    i17--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new cd(10, miVar2, arrayList));
                        return;
                }
            }
        });
        if (biVar.W1 != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            zrVar.addView(frameLayout2);
            zrVar.i(frameLayout2, true, false);
            FragmentContextView hiVar = new hi(this, context, biVar.W1, frameLayout, p6Var, frameLayout2);
            viewGroup = frameLayout;
            frameLayout2.addView(hiVar);
            zrVar.setCallFragmentContextView(hiVar);
        } else {
            viewGroup = frameLayout;
        }
        FrameLayout.LayoutParams d10 = w7.b6.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d10).topMargin = org.telegram.messenger.m5.C(27.0f, org.telegram.messenger.i0.m, ((ViewGroup.MarginLayoutParams) d10).topMargin);
        viewGroup.addView(zrVar, d10);
        ii iiVar = new ii(this, context, biVar.D3, new d(this, 5), new fi(this), new fi(this), p6Var);
        this.w = iiVar;
        iiVar.f3.r = false;
        iiVar.r1();
        setBlur3Capture(iiVar);
        this.d = iiVar;
        this.h = true;
        this.f = true;
        iiVar.setClipToPadding(false);
        iiVar.setHorizontalScrollBarEnabled(false);
        iiVar.setVerticalScrollBarEnabled(false);
        addView(iiVar, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.a7.m(iiVar, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        iiVar.setOnScrollListener(new ag.u(this, 13));
        addView(viewGroup, w7.b6.e(-1, org.telegram.messenger.zs.e3, 51));
        iiVar.f3.O(false);
        O();
        int i15 = this.b.D3;
        this.J = new org.telegram.messenger.pp(i15, org.telegram.messenger.d20.i(i15).e());
    }

    public static boolean N(mi miVar, org.telegram.messenger.jj jjVar) {
        miVar.O = jjVar;
        return MediaController.B().o0(org.telegram.messenger.m5.j(jjVar), jjVar, 0L, true, null);
    }

    @Override // org.telegram.ui.Components.uh
    public final void B(int i10, int i11) {
        this.T = i11;
        O();
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        Q();
        this.J.b();
        ii iiVar = this.w;
        iiVar.e3.h1(0, 0);
        iiVar.f3.O(false);
    }

    @Override // org.telegram.ui.Components.uh
    public final void I() {
        this.w.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean J(final boolean z10, final int i10, final int i11, final long j10, final boolean z11) {
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
        bi biVar = this.b;
        return s4.a0(biVar.D3, biVar.a1(), biVar.W0() + arrayList.size(), new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.gi
            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                mi miVar = mi.this;
                ji jiVar = miVar.N;
                bi biVar2 = miVar.b;
                jiVar.l(arrayList, biVar2.Z0().getText(), z10, i10, i11, j10, z11, ((Long) obj).longValue());
                biVar2.a(true);
            }
        }, 0L);
    }

    public final void O() {
        int i10;
        bi biVar = this.b;
        if (biVar.l3.Q() > org.telegram.messenger.i0.L(20.0f)) {
            i10 = org.telegram.messenger.i0.L(8.0f);
            biVar.q0 = false;
        } else {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.q;
                if (point.x > point.y) {
                    i10 = (int) (this.T / 3.5f);
                    biVar.q0 = true;
                }
            }
            i10 = (this.T / 5) * 2;
            biVar.q0 = true;
        }
        this.w.setPadding(0, (int) (this.y.c(0.0f) + org.telegram.messenger.i0.L(56.0f) + i10 + org.telegram.messenger.i0.m), 0, this.e);
    }

    public final void P(a51 a51Var, View view) {
        if (a51Var != null && a51Var.d == this.R) {
            this.J.b();
            return;
        }
        if (a51Var != null && a51Var.d == this.P) {
            Q();
            return;
        }
        if (a51Var != null && a51Var.d == this.Q) {
            R();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) k7Var.getTag();
            bi biVar = this.b;
            biVar.getClass();
            int i10 = 1;
            if (biVar.y1) {
                this.F = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(xeVar.e);
                this.N.l(arrayList, biVar.Z0().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.I;
                if (hashSet.contains(xeVar)) {
                    hashSet.remove(xeVar);
                    a51Var.e = false;
                    k7Var.e(false, true);
                    i10 = 2;
                } else {
                    if (this.E >= 0) {
                        int size = hashSet.size();
                        int i11 = this.E;
                        if (size >= i11) {
                            String a02 = org.telegram.messenger.cd.a0(null, null, 2131747467, org.telegram.messenger.cd.G(i11, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
                            String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            x1Var.T = a02;
                            i0.a.w(null, 2131747847, alertDialog$Builder, null);
                            return;
                        }
                    }
                    a51Var.e = true;
                    hashSet.add(xeVar);
                    k7Var.e(true, true);
                }
            }
            biVar.J1(i10);
        }
    }

    public final void Q() {
        org.telegram.messenger.i0.r(this.a0);
        String str = this.D;
        if (str != null && str.length() > 0 && this.D.length() < 3) {
            if (this.W) {
                this.W = false;
                S();
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
                S();
                return;
            }
            return;
        }
        int i10 = this.b.D3;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.U;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
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
            org.telegram.messenger.jj jjVar = ((org.telegram.messenger.xe) i0.a.g(1, arrayList)).e;
            tL_messages_searchGlobal.offset_id = jjVar.f1();
            tL_messages_searchGlobal.offset_rate = this.b0;
            tL_messages_searchGlobal.offset_peer = r12.i1(org.telegram.messenger.jj.C1(jjVar.k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.U = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new a3.b(1), new ei(this, r12, i10, 1));
        S();
    }

    public final void R() {
        String str;
        org.telegram.messenger.i0.r(this.f0);
        if (TextUtils.isEmpty(this.D) || this.D.length() < 3) {
            if (this.m0) {
                this.m0 = false;
                S();
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
        int i10 = this.b.D3;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        int i11 = this.d0;
        if (i11 >= 0) {
            connectionsManager.cancelRequest(i11, true);
            this.d0 = -1;
        }
        String str2 = ((org.telegram.messenger.q0) r12.y7.F.b).c;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.h0 == null) {
            TLObject e22 = r12.e2(str2);
            this.h0 = e22 instanceof TLRPC.User ? (TLRPC.User) e22 : null;
        }
        if (this.h0 == null) {
            if (this.i0 || this.j0) {
                return;
            }
            this.i0 = true;
            r12.c2().a(str2, null, new vg(3, this, r12));
            return;
        }
        TLRPC.User f7 = org.telegram.messenger.d20.i(i10).f();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = r12.p1(this.h0);
        tL_messages_getInlineBotResults.peer = org.telegram.messenger.vp.m1(f7);
        if (arrayList.isEmpty() || (str = this.k0) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.D;
        String str4 = str3 != null ? str3 : "";
        this.e0 = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.d0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new a3.b(1), new ei(this, r12, i10, 0));
        S();
    }

    public final void S() {
        ci ciVar = this.S;
        org.telegram.messenger.i0.r(ciVar);
        org.telegram.messenger.i0.g3(ciVar);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.g2;
        int i13 = org.telegram.messenger.zs.h2;
        ii iiVar = this.w;
        int i14 = org.telegram.messenger.zs.f2;
        if (i10 != i14 && i10 != i13 && i10 != i12) {
            if (i10 == org.telegram.messenger.zs.T3 && objArr[0] == this.J && iiVar != null) {
                iiVar.f3.O(true);
                return;
            }
            return;
        }
        if (i10 == i14 || i10 == i12) {
            int childCount = iiVar.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = iiVar.getChildAt(i15);
                if (childAt instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                    if (k7Var.getMessage() != null) {
                        k7Var.g(false, true);
                    }
                }
            }
            return;
        }
        if (i10 == i13 && ((org.telegram.messenger.jj) objArr[0]).T == 0) {
            int childCount2 = iiVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = iiVar.getChildAt(i16);
                if (childAt2 instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) childAt2;
                    if (k7Var2.getMessage() != null) {
                        k7Var2.g(false, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        ii iiVar = this.w;
        if (iiVar.getChildCount() > 0) {
            boolean z10 = false;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < iiVar.getChildCount(); i11++) {
                View childAt = iiVar.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z10 = true;
                }
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 != Integer.MAX_VALUE) {
                int L = (((i10 - org.telegram.messenger.i0.L(56.0f)) - ((int) this.y.c(0.0f))) - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(8.0f);
                int i12 = (L <= 0 || !z10) ? 0 : L;
                fe.b bVar = this.n;
                if (L < 0 || !z10) {
                    bVar.a(true, true);
                    L = i12;
                } else {
                    bVar.a(false, true);
                }
                this.r.setTranslationY(L);
                return org.telegram.messenger.i0.L(12.0f) + L;
            }
        }
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return (this.w.getPaddingTop() - org.telegram.messenger.i0.L(56.0f)) - ((int) this.y.c(0.0f));
    }

    public ArrayList<org.telegram.messenger.jj> getSelected() {
        ArrayList<org.telegram.messenger.jj> arrayList = new ArrayList<>();
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
    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.t6.A5;
        ii iiVar = this.w;
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.t6.k0, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, org.telegram.ui.ActionBar.t6.f3, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(iiVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, org.telegram.ui.ActionBar.t6.g3, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.z6));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.uh
    public final void o() {
        t();
        bi biVar = this.b;
        org.telegram.messenger.zs.f(biVar.D3).n(this, org.telegram.messenger.zs.f2);
        int i10 = biVar.D3;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.h2);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.g2);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.T3);
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean p() {
        if (this.O != null && MediaController.B().I(this.O)) {
            MediaController.B().q(true, true, false, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.uh
    public final void s() {
        this.I.clear();
    }

    public void setDelegate(ji jiVar) {
        this.N = jiVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.E = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(tg.b bVar) {
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        yh yhVar = this.s;
        if (yhVar != null) {
            yhVar.setupBlurredBackground(bVar.c(yhVar, w7.b9.o(p6Var), false));
        }
        zr zrVar = this.y;
        if (zrVar != null) {
            vg.f c10 = bVar.c(zrVar, w7.b9.o(p6Var), false);
            c10.q(org.telegram.messenger.i0.L(24.0f));
            c10.p(org.telegram.messenger.i0.L(7.0f));
            zrVar.setBlurredBackground(c10);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void t() {
        if (this.O != null && MediaController.B().I(this.O)) {
            MediaController.B().q(true, true, false, false);
        }
        this.O = null;
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            ih.e eVar = this.x;
            eVar.setAlpha(f7);
            eVar.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void l(float f7) {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
