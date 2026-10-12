package ji;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.nz;
import org.telegram.ui.hu0;
import org.telegram.ui.or0;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class m5 implements v5, c0.j, m4.e0, m4.h1, e2.j, m4.f1, d9.k, ne.d, r9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.k1, org.telegram.ui.ActionBar.z1, qg.h0, t5.b, qg.s1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // qg.h0
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 5:
                ((m4.n1) obj).f((b2.a1) this.b);
                break;
            default:
                ((n2.k) obj).a((oa.d) this.b);
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                n4.s sVar = (n4.s) this.b;
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                i9.a aVar = (i9.a) sVar.c;
                if (!aVar.a(Math.max(height, width))) {
                    return bitmap;
                }
                if (aVar.a(height)) {
                    height--;
                }
                if (aVar.a(width)) {
                    width--;
                }
                return e0.f0.c(Bitmap.createScaledBitmap(bitmap, width, height, true));
            default:
                c5.c0 c0Var = (c5.c0) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i10 = c0Var.b;
                if (width2 > i10 || bitmap2.getHeight() > i10) {
                    float f7 = i10;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f7 / width3, f7 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return e0.f0.c(bitmap2);
        }
    }

    @Override // c0.j
    public Object b(c0.i iVar) {
        m4.f0 f0Var = (m4.f0) this.b;
        f0Var.o.post(new v2(16, f0Var, iVar));
        return "onPlayRequested";
    }

    @Override // m4.h1
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 4:
                return f0Var.l(wVar, (e9.n0) obj);
            default:
                m4.f1 f1Var = (m4.f1) obj;
                j9.w wVar2 = j9.w.b;
                if (!f0Var.j()) {
                    f1Var.e(f0Var.t, wVar);
                    m4.j1.P0(f0Var, wVar, i10, new m4.t1(0));
                }
                return j9.w.b;
        }
    }

    @Override // m4.e0
    public void d(m4.v vVar, int i10) {
        vVar.c(i10, (b2.c1) this.b);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 14:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override // m4.f1
    public void e(m4.n1 n1Var, m4.w wVar) {
        ((e2.j) this.b).accept(n1Var);
    }

    @Override // qg.s1
    public void f() {
        hu0 hu0Var = (hu0) this.b;
        TextView textView = hu0Var.y1;
        boolean a2 = hu0Var.F0.a();
        ImageView imageView = hu0Var.w1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 19:
                ((org.telegram.ui.web.a0) this.b).run();
                break;
            default:
                ((or0) this.b).run();
                break;
        }
    }

    @Override // t5.b
    public Object h() {
        SQLiteDatabase a2;
        int i10 = this.a;
        boolean z10 = false;
        Object obj = this.b;
        switch (i10) {
            case 23:
                s5.g gVar = (s5.g) ((s5.c) obj);
                gVar.getClass();
                int i11 = o5.a.e;
                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(7, z10);
                sVar.c = null;
                sVar.d = new ArrayList();
                sVar.e = null;
                sVar.b = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new nz(gVar, hashMap, sVar, 9));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 24:
                s5.g gVar2 = (s5.g) ((s5.d) obj);
                long d = gVar2.b.d() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(d)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            gVar2.e(rawQuery.getInt(0), o5.c.c, rawQuery.getString(1));
                        } catch (Throwable th2) {
                            rawQuery.close();
                            throw th2;
                        }
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 25:
                s5.g gVar3 = (s5.g) ((s5.c) ((ea.b) obj).i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.b.d()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) obj;
                Iterator it = ((Iterable) ((s5.g) ((s5.d) sVar2.c)).c(new r0.h(22))).iterator();
                while (it.hasNext()) {
                    ((li.k) sVar2.d).U((l5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // r9.d
    public Object j2(com.google.android.gms.internal.cast.z5 z5Var) {
        switch (this.a) {
            case 12:
                return new oa.c((Context) z5Var.a(Context.class), ((l9.h) z5Var.a(l9.h.class)).d(), z5Var.v(oa.d.class), z5Var.b(ya.b.class), (Executor) z5Var.e((r9.r) this.b));
            default:
                return this.b;
        }
    }

    @Override // ne.d
    public void p(int i10, float f7, float f10, ne.e eVar) {
        ((Switch) this.b).invalidate();
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new k31(13, tVar, bitmap));
    }

    public /* synthetic */ m5(p4.t0 t0Var, p4.s0 s0Var) {
        this.a = 20;
        this.b = t0Var;
    }

    @Override // ne.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
