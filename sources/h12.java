// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class h12 extends p02 implements gk7, x74 {
    public String E;
    public int F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public final HashSet J;
    public final ia7 K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public e12 O;
    public k27 P;
    public final boolean Q;
    public final byte R;
    public final byte S;
    public final y02 T;
    public int U;
    public int V;
    public String W;
    public boolean a0;
    public final y02 b0;
    public int c0;
    public boolean d0;
    public int e0;
    public String f0;
    public final y02 g0;
    public boolean h0;
    public TLRPC.User i0;
    public boolean j0;
    public boolean k0;
    public String l0;
    public int m0;
    public final fm0 n;
    public boolean n0;
    public final FrameLayout r;
    public final t02 s;
    public final va w;
    public final w02 x;
    public final fj3 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [y02] */
    /* JADX WARN: Type inference failed for: r3v2, types: [y02] */
    /* JADX WARN: Type inference failed for: r3v3, types: [y02] */
    public h12(x02 x02Var, wjb wjbVar, Context context) {
        super(x02Var, wjbVar, context);
        ViewGroup viewGroup;
        this.n = new fm0(0, this, s33.h, 380L, false);
        this.F = -1;
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        final byte b = 1;
        this.Q = true;
        final byte b2 = 2;
        this.R = (byte) 2;
        final byte b3 = 3;
        this.S = (byte) 3;
        final byte b4 = 0;
        this.T = new Runnable(this) { // from class: y02
            public final /* synthetic */ h12 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b4) {
                    case 0:
                        va vaVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = vaVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < vaVar.getChildCount()) {
                                View childAt = vaVar.getChildAt(i3);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i2 = top;
                                    i = R;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = R;
                                }
                            }
                        }
                        vaVar.g3.O(true);
                        if (!canScrollVertically) {
                            vaVar.f3.g1(0, 0);
                            return;
                        } else {
                            if (i >= 0) {
                                vaVar.f3.g1(i, i2 - vaVar.getPaddingTop());
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
                        h12 h12Var = this.b;
                        h12Var.P();
                        h12Var.b.H1(h12Var, 0);
                        return;
                    default:
                        h12 h12Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    yl6 yl6Var = new yl6();
                                    query.getInt(0);
                                    yl6Var.a = query.getString(1);
                                    yl6Var.b = query.getString(2);
                                    yl6Var.d = query.getString(3);
                                    yl6Var.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(yl6Var.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i4;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = y6c.h(h12Var2.b.G3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = yl6Var.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = ba4.D(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (D.length() <= 0) {
                                        D = "mp3";
                                    }
                                    sb.append(D);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = yl6Var.c;
                                    tL_documentAttributeAudio.title = yl6Var.b;
                                    tL_documentAttributeAudio.performer = yl6Var.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    yl6Var.e = new k27(h12Var2.b.G3, tL_message, false, true);
                                    g00 a = g00.a(file);
                                    if (a != null && a.o != null) {
                                        int L = gl.L(44.0f);
                                        Bitmap bitmap = a.o;
                                        if (bitmap.getWidth() > L || bitmap.getHeight() > L) {
                                            float f = L;
                                            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            yl6Var.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                        } else {
                                            yl6Var.e.J1 = bitmap;
                                        }
                                    }
                                    arrayList.add(yl6Var);
                                    i4--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        gl.d3(new kx1(h12Var2, arrayList, (byte) 9));
                        return;
                }
            }
        };
        this.V = -1;
        this.b0 = new Runnable(this) { // from class: y02
            public final /* synthetic */ h12 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b) {
                    case 0:
                        va vaVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = vaVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < vaVar.getChildCount()) {
                                View childAt = vaVar.getChildAt(i3);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i2 = top;
                                    i = R;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = R;
                                }
                            }
                        }
                        vaVar.g3.O(true);
                        if (!canScrollVertically) {
                            vaVar.f3.g1(0, 0);
                            return;
                        } else {
                            if (i >= 0) {
                                vaVar.f3.g1(i, i2 - vaVar.getPaddingTop());
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
                        h12 h12Var = this.b;
                        h12Var.P();
                        h12Var.b.H1(h12Var, 0);
                        return;
                    default:
                        h12 h12Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    yl6 yl6Var = new yl6();
                                    query.getInt(0);
                                    yl6Var.a = query.getString(1);
                                    yl6Var.b = query.getString(2);
                                    yl6Var.d = query.getString(3);
                                    yl6Var.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(yl6Var.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i4;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = y6c.h(h12Var2.b.G3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = yl6Var.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = ba4.D(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (D.length() <= 0) {
                                        D = "mp3";
                                    }
                                    sb.append(D);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = yl6Var.c;
                                    tL_documentAttributeAudio.title = yl6Var.b;
                                    tL_documentAttributeAudio.performer = yl6Var.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    yl6Var.e = new k27(h12Var2.b.G3, tL_message, false, true);
                                    g00 a = g00.a(file);
                                    if (a != null && a.o != null) {
                                        int L = gl.L(44.0f);
                                        Bitmap bitmap = a.o;
                                        if (bitmap.getWidth() > L || bitmap.getHeight() > L) {
                                            float f = L;
                                            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            yl6Var.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                        } else {
                                            yl6Var.e.J1 = bitmap;
                                        }
                                    }
                                    arrayList.add(yl6Var);
                                    i4--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        gl.d3(new kx1(h12Var2, arrayList, (byte) 9));
                        return;
                }
            }
        };
        this.e0 = -1;
        this.g0 = new Runnable(this) { // from class: y02
            public final /* synthetic */ h12 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b2) {
                    case 0:
                        va vaVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = vaVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < vaVar.getChildCount()) {
                                View childAt = vaVar.getChildAt(i3);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i2 = top;
                                    i = R;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = R;
                                }
                            }
                        }
                        vaVar.g3.O(true);
                        if (!canScrollVertically) {
                            vaVar.f3.g1(0, 0);
                            return;
                        } else {
                            if (i >= 0) {
                                vaVar.f3.g1(i, i2 - vaVar.getPaddingTop());
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
                        h12 h12Var = this.b;
                        h12Var.P();
                        h12Var.b.H1(h12Var, 0);
                        return;
                    default:
                        h12 h12Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    yl6 yl6Var = new yl6();
                                    query.getInt(0);
                                    yl6Var.a = query.getString(1);
                                    yl6Var.b = query.getString(2);
                                    yl6Var.d = query.getString(3);
                                    yl6Var.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(yl6Var.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i4;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = y6c.h(h12Var2.b.G3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = yl6Var.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = ba4.D(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (D.length() <= 0) {
                                        D = "mp3";
                                    }
                                    sb.append(D);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = yl6Var.c;
                                    tL_documentAttributeAudio.title = yl6Var.b;
                                    tL_documentAttributeAudio.performer = yl6Var.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    yl6Var.e = new k27(h12Var2.b.G3, tL_message, false, true);
                                    g00 a = g00.a(file);
                                    if (a != null && a.o != null) {
                                        int L = gl.L(44.0f);
                                        Bitmap bitmap = a.o;
                                        if (bitmap.getWidth() > L || bitmap.getHeight() > L) {
                                            float f = L;
                                            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            yl6Var.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                        } else {
                                            yl6Var.e.J1 = bitmap;
                                        }
                                    }
                                    arrayList.add(yl6Var);
                                    i4--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        gl.d3(new kx1(h12Var2, arrayList, (byte) 9));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        kk7.f(this.b.G3).b(this, kk7.e2);
        kk7.f(this.b.G3).b(this, kk7.g2);
        kk7.f(this.b.G3).b(this, kk7.f2);
        kk7.f(this.b.G3).b(this, kk7.V3);
        this.H = true;
        final byte b5 = 4;
        Utilities.e.c(new Runnable(this) { // from class: y02
            public final /* synthetic */ h12 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b5) {
                    case 0:
                        va vaVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = vaVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < vaVar.getChildCount()) {
                                View childAt = vaVar.getChildAt(i3);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i2 = top;
                                    i = R;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = R;
                                }
                            }
                        }
                        vaVar.g3.O(true);
                        if (!canScrollVertically) {
                            vaVar.f3.g1(0, 0);
                            return;
                        } else {
                            if (i >= 0) {
                                vaVar.f3.g1(i, i2 - vaVar.getPaddingTop());
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
                        h12 h12Var = this.b;
                        h12Var.P();
                        h12Var.b.H1(h12Var, 0);
                        return;
                    default:
                        h12 h12Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    yl6 yl6Var = new yl6();
                                    query.getInt(0);
                                    yl6Var.a = query.getString(1);
                                    yl6Var.b = query.getString(2);
                                    yl6Var.d = query.getString(3);
                                    yl6Var.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(yl6Var.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i4;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = y6c.h(h12Var2.b.G3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = yl6Var.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = ba4.D(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (D.length() <= 0) {
                                        D = "mp3";
                                    }
                                    sb.append(D);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = yl6Var.c;
                                    tL_documentAttributeAudio.title = yl6Var.b;
                                    tL_documentAttributeAudio.performer = yl6Var.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    yl6Var.e = new k27(h12Var2.b.G3, tL_message, false, true);
                                    g00 a = g00.a(file);
                                    if (a != null && a.o != null) {
                                        int L = gl.L(44.0f);
                                        Bitmap bitmap = a.o;
                                        if (bitmap.getWidth() > L || bitmap.getHeight() > L) {
                                            float f = L;
                                            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            yl6Var.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                        } else {
                                            yl6Var.e.J1 = bitmap;
                                        }
                                    }
                                    arrayList.add(yl6Var);
                                    i4--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        gl.d3(new kx1(h12Var2, arrayList, (byte) 9));
                        return;
                }
            }
        });
        w02 w02Var = new w02(bkb.c6, wjbVar, context);
        this.x = w02Var;
        w02Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        t02 t02Var = new t02(this.b, wjbVar, context);
        this.s = t02Var;
        t02Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        t02Var.r.addTextChangedListener(new b7(this, (byte) 7));
        t02Var.r.setHint(k96.M0(2131745548, null));
        frameLayout.addView(w02Var, nme.g());
        FrameLayout.LayoutParams d = nme.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += gl.m;
        frameLayout.addView(t02Var, d);
        fj3 fj3Var = new fj3(context);
        this.y = fj3Var;
        fj3Var.setPadding(gl.L(11.0f), gl.L(21.0f), gl.L(11.0f), gl.L(21.0f));
        fj3Var.setOnAnimatedHeightChangedListener(new Runnable(this) { // from class: y02
            public final /* synthetic */ h12 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b3) {
                    case 0:
                        va vaVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = vaVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < vaVar.getChildCount()) {
                                View childAt = vaVar.getChildAt(i3);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i2 = top;
                                    i = R;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = R;
                                }
                            }
                        }
                        vaVar.g3.O(true);
                        if (!canScrollVertically) {
                            vaVar.f3.g1(0, 0);
                            return;
                        } else {
                            if (i >= 0) {
                                vaVar.f3.g1(i, i2 - vaVar.getPaddingTop());
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
                        h12 h12Var = this.b;
                        h12Var.P();
                        h12Var.b.H1(h12Var, 0);
                        return;
                    default:
                        h12 h12Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    yl6 yl6Var = new yl6();
                                    query.getInt(0);
                                    yl6Var.a = query.getString(1);
                                    yl6Var.b = query.getString(2);
                                    yl6Var.d = query.getString(3);
                                    yl6Var.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(yl6Var.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i4;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = y6c.h(h12Var2.b.G3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = yl6Var.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = ba4.D(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (D.length() <= 0) {
                                        D = "mp3";
                                    }
                                    sb.append(D);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = yl6Var.c;
                                    tL_documentAttributeAudio.title = yl6Var.b;
                                    tL_documentAttributeAudio.performer = yl6Var.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    yl6Var.e = new k27(h12Var2.b.G3, tL_message, false, true);
                                    g00 a = g00.a(file);
                                    if (a != null && a.o != null) {
                                        int L = gl.L(44.0f);
                                        Bitmap bitmap = a.o;
                                        if (bitmap.getWidth() > L || bitmap.getHeight() > L) {
                                            float f = L;
                                            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            yl6Var.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                        } else {
                                            yl6Var.e.J1 = bitmap;
                                        }
                                    }
                                    arrayList.add(yl6Var);
                                    i4--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        gl.d3(new kx1(h12Var2, arrayList, (byte) 9));
                        return;
                }
            }
        });
        if (x02Var.Z1 != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            fj3Var.addView(frameLayout2);
            fj3Var.j(frameLayout2, true, false);
            FragmentContextView d12Var = new d12(this, context, x02Var.Z1, frameLayout, wjbVar, frameLayout2);
            viewGroup = frameLayout;
            frameLayout2.addView(d12Var);
            fj3Var.setCallFragmentContextView(d12Var);
        } else {
            viewGroup = frameLayout;
        }
        FrameLayout.LayoutParams d2 = nme.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = de9.w(27.0f, gl.m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        viewGroup.addView(fj3Var, d2);
        va vaVar = new va(this, context, x02Var.G3, new f(this, (byte) 27), new b12(this), new b12(this), wjbVar);
        this.w = vaVar;
        vaVar.g3.r = false;
        vaVar.r1();
        setBlur3Capture(vaVar);
        this.d = vaVar;
        this.h = true;
        this.f = true;
        vaVar.setClipToPadding(false);
        vaVar.setHorizontalScrollBarEnabled(false);
        vaVar.setVerticalScrollBarEnabled(false);
        addView(vaVar, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        zkb.l(vaVar, 21, bkb.z5, wjbVar);
        vaVar.setOnScrollListener(new y(this, (byte) 16));
        addView(viewGroup, nme.e(-1, kk7.d3, 51));
        vaVar.g3.O(false);
        P();
        int i = this.b.G3;
        this.K = new ia7(i, y6c.h(i).e());
    }

    @Override // p02
    public final void C(int i, int i2) {
        this.U = i2;
        P();
    }

    @Override // p02
    public final void I(p02 p02Var) {
        R();
        this.K.b();
        va vaVar = this.w;
        vaVar.f3.g1(0, 0);
        vaVar.g3.O(false);
    }

    @Override // p02
    public final void K() {
        this.w.z0(0);
    }

    @Override // p02
    public final boolean M(final boolean z, final int i, final int i2, final long j, final boolean z2) {
        HashSet hashSet = this.J;
        if (hashSet.size() == 0 || this.O == null || this.G) {
            return false;
        }
        this.G = true;
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((yl6) it.next()).e);
        }
        x02 x02Var = this.b;
        return ij.Y(x02Var.G3, x02Var.V0(), x02Var.R0() + arrayList.size(), new p8c() { // from class: c12
            @Override // p8c
            public final void a(Object obj) {
                h12 h12Var = h12.this;
                e12 e12Var = h12Var.O;
                x02 x02Var2 = h12Var.b;
                e12Var.g(arrayList, x02Var2.U0().getText(), z, i, i2, j, z2, ((Long) obj).longValue());
                x02Var2.a(true);
            }
        }, 0L);
    }

    public final void P() {
        int i;
        x02 x02Var = this.b;
        if (x02Var.o3.Q() > gl.L(20.0f)) {
            i = gl.L(8.0f);
            x02Var.r0 = false;
        } else {
            if (!gl.O1()) {
                Point point = gl.q;
                if (point.x > point.y) {
                    i = (int) (this.U / 3.5f);
                    x02Var.r0 = true;
                }
            }
            i = (this.U / 5) << 1;
            x02Var.r0 = true;
        }
        this.w.setPadding(0, (int) (this.y.c(0.0f) + gl.L(56.0f) + i + gl.m), 0, this.e);
    }

    public final void Q(c4c c4cVar, View view) {
        if (c4cVar != null) {
            int i = c4cVar.d;
            if (i == this.S) {
                this.K.b();
                return;
            } else if (i == this.Q) {
                R();
                return;
            } else if (i == this.R) {
                S();
                return;
            }
        }
        if (view instanceof eba) {
            eba ebaVar = (eba) view;
            yl6 yl6Var = (yl6) ebaVar.getTag();
            x02 x02Var = this.b;
            x02Var.getClass();
            int i2 = 1;
            if (x02Var.B1) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(yl6Var.e);
                this.O.g(arrayList, x02Var.U0().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(yl6Var)) {
                    hashSet.remove(yl6Var);
                    c4cVar.e = false;
                    ebaVar.e(false, true);
                    i2 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i3 = this.F;
                        if (size >= i3) {
                            String a0 = k96.a0(null, null, 2131747258, k96.G(i3, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
                            String M0 = k96.M0(R.string.AppName, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            hdVar.U = a0;
                            b00.t(null, 2131747638, alertDialog$Builder, null);
                            return;
                        }
                    }
                    c4cVar.e = true;
                    hashSet.add(yl6Var);
                    ebaVar.e(true, true);
                }
            }
            x02Var.F1(i2);
        }
    }

    public final void R() {
        gl.r(this.b0);
        String str = this.E;
        byte b = 0;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.a0) {
                this.a0 = false;
                T();
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
                T();
                return;
            }
            return;
        }
        int i = this.b.G3;
        na7 q1 = na7.q1(i);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        int i2 = this.V;
        byte b2 = 1;
        if (i2 >= 0) {
            connectionsManager.cancelRequest(i2, true);
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
            k27 k27Var = ((yl6) b00.f(1, arrayList)).e;
            tL_messages_searchGlobal.offset_id = k27Var.e1();
            tL_messages_searchGlobal.offset_rate = this.c0;
            tL_messages_searchGlobal.offset_peer = q1.h1(k27.B1(k27Var.k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new hc(b), new a12(this, q1, i, b2));
        T();
    }

    public final void S() {
        String str;
        gl.r(this.g0);
        byte b = 0;
        if (!TextUtils.isEmpty(this.E)) {
            byte b2 = 3;
            if (this.E.length() >= 3) {
                if (!TextUtils.equals(this.f0, this.E)) {
                    this.N.clear();
                    this.h0 = false;
                }
                int i = this.b.G3;
                na7 q1 = na7.q1(i);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                int i2 = this.e0;
                if (i2 >= 0) {
                    connectionsManager.cancelRequest(i2, true);
                    this.e0 = -1;
                }
                String str2 = q1.k4.J.f;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                TLRPC.User user = this.i0;
                if (user == null) {
                    TLObject a2 = q1.a2(str2);
                    user = a2 instanceof TLRPC.User ? (TLRPC.User) a2 : null;
                    this.i0 = user;
                }
                if (user == null) {
                    if (this.j0 || this.k0) {
                        return;
                    }
                    this.j0 = true;
                    q1.Y1().a(str2, null, new pz1(this, q1, b2));
                    return;
                }
                TLRPC.User f = y6c.h(i).f();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = q1.o1(this.i0);
                tL_messages_getInlineBotResults.peer = na7.l1(f);
                if (this.N.isEmpty() || (str = this.l0) == null) {
                    str = "";
                }
                tL_messages_getInlineBotResults.offset = str;
                String str3 = this.E;
                String str4 = str3 != null ? str3 : "";
                this.f0 = str4;
                tL_messages_getInlineBotResults.query = str4;
                this.e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new hc(b), new a12(this, q1, i, b));
                T();
                return;
            }
        }
        if (this.n0) {
            this.n0 = false;
            T();
        }
    }

    public final void T() {
        y02 y02Var = this.T;
        gl.r(y02Var);
        gl.d3(y02Var);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.f2;
        int i4 = kk7.g2;
        va vaVar = this.w;
        int i5 = kk7.e2;
        if (i != i5 && i != i4 && i != i3) {
            if (i == kk7.V3 && objArr[0] == this.K && vaVar != null) {
                vaVar.g3.O(true);
                return;
            }
            return;
        }
        if (i == i5 || i == i3) {
            int childCount = vaVar.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = vaVar.getChildAt(i6);
                if (childAt instanceof eba) {
                    eba ebaVar = (eba) childAt;
                    if (ebaVar.getMessage() != null) {
                        ebaVar.g(false, true);
                    }
                }
            }
            return;
        }
        if (i == i4 && ((k27) objArr[0]).T == 0) {
            int childCount2 = vaVar.getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = vaVar.getChildAt(i7);
                if (childAt2 instanceof eba) {
                    eba ebaVar2 = (eba) childAt2;
                    if (ebaVar2.getMessage() != null) {
                        ebaVar2.g(false, true);
                    }
                }
            }
        }
    }

    @Override // p02
    public int getCurrentItemTop() {
        va vaVar = this.w;
        if (vaVar.getChildCount() > 0) {
            boolean z = false;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < vaVar.getChildCount(); i2++) {
                View childAt = vaVar.getChildAt(i2);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z = true;
                }
                if (R >= 0 && childAt.getTop() < i) {
                    i = childAt.getTop();
                }
            }
            if (i != Integer.MAX_VALUE) {
                int L = (((i - gl.L(56.0f)) - ((int) this.y.c(0.0f))) - gl.m) - gl.L(8.0f);
                int i3 = (L <= 0 || !z) ? 0 : L;
                fm0 fm0Var = this.n;
                if (L < 0 || !z) {
                    fm0Var.a(true, true);
                    L = i3;
                } else {
                    fm0Var.a(false, true);
                }
                this.r.setTranslationY(L);
                return gl.L(12.0f) + L;
            }
        }
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(4.0f) + getListTopPadding();
    }

    @Override // p02
    public int getListTopPadding() {
        return (this.w.getPaddingTop() - gl.L(56.0f)) - ((int) this.y.c(0.0f));
    }

    public ArrayList<k27> getSelected() {
        ArrayList<k27> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((yl6) it.next()).e);
        }
        return arrayList;
    }

    @Override // p02
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override // p02
    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        int i = bkb.z5;
        va vaVar = this.w;
        arrayList.add(new blb(vaVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(vaVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.h6));
        arrayList.add(new blb(vaVar, 0, new Class[]{View.class}, bkb.j0, (Drawable[]) null, (alb) null, bkb.c7));
        arrayList.add(new blb(vaVar, TLObject.FLAG_13, new Class[]{eba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.h7));
        arrayList.add(new blb(vaVar, TLObject.FLAG_14, new Class[]{eba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.j7));
        arrayList.add(new blb(vaVar, 4, new Class[]{eba.class}, bkb.e3, (Drawable[]) null, (alb) null, bkb.F6));
        arrayList.add(new blb(vaVar, 4, new Class[]{eba.class}, bkb.f3, (Drawable[]) null, (alb) null, bkb.y6));
        return arrayList;
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            w02 w02Var = this.x;
            w02Var.setAlpha(f);
            w02Var.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    @Override // p02
    public final void q() {
        v();
        x02 x02Var = this.b;
        kk7.f(x02Var.G3).n(this, kk7.e2);
        int i = x02Var.G3;
        kk7.f(i).n(this, kk7.g2);
        kk7.f(i).n(this, kk7.f2);
        kk7.f(i).n(this, kk7.V3);
    }

    @Override // p02
    public final boolean r() {
        if (this.P != null && MediaController.w().D(this.P)) {
            MediaController.w().l(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(e12 e12Var) {
        this.O = e12Var;
    }

    public void setMaxSelectedFiles(int i) {
        this.F = i;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(kl0 kl0Var) {
        wjb wjbVar = this.a;
        t02 t02Var = this.s;
        if (t02Var != null) {
            t02Var.setupBlurredBackground(kl0Var.c(t02Var, nod.n(wjbVar), false));
        }
        fj3 fj3Var = this.y;
        if (fj3Var != null) {
            il0 c = kl0Var.c(fj3Var, nod.n(wjbVar), false);
            c.r(gl.L(24.0f));
            c.q(gl.L(7.0f));
            fj3Var.setBlurredBackground(c);
        }
    }

    @Override // p02
    public final void u() {
        this.J.clear();
    }

    @Override // p02
    public final void v() {
        if (this.P != null && MediaController.w().D(this.P)) {
            MediaController.w().l(true, true, false, false);
        }
        this.P = null;
    }

    @Override // p02
    public final void m(float f) {
    }

    @Override // x74
    public final void D(float f, int i) {
    }
}
