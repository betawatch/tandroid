package mg;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.o20;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.ActionBar.s3;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.hk0;
import org.webrtc.GlGenericDrawer;
import rh.h8;
import rh.x6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements org.telegram.ui.ActionBar.u1, hk0, mh.a, e2.j, r9.d, Vector.TLDeserializer, r0.m, org.telegram.ui.ActionBar.i1, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.u0, a5.b, rf.l, org.telegram.messenger.t1, t5.b, o20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        switch (this.a) {
            case 4:
                return new oa.c((Context) dVar.b(Context.class), ((l9.h) dVar.b(l9.h.class)).d(), dVar.J(oa.d.class), dVar.c(za.b.class), (Executor) dVar.d((r9.r) this.b));
            default:
                return this.b;
        }
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.v1;
                i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
                i0.c I02 = org.telegram.messenger.i0.I0(j1Var, true);
                actionBarLayout.t1 = I0;
                actionBarLayout.u1 = I02;
                actionBarLayout.s1 = j1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), j1Var);
                    i11++;
                }
                break;
            case 12:
                q3 q3Var = (q3) obj;
                q3Var.s = j1Var.a.f(2).d;
                q3Var.invalidate();
                break;
            case 13:
                s3 s3Var = (s3) obj;
                s3Var.e = j1Var;
                i0.c I03 = org.telegram.messenger.i0.I0(j1Var, false);
                i0.c I04 = org.telegram.messenger.i0.I0(j1Var, true);
                if (!s3Var.f.equals(I03) || !s3Var.h.equals(I04)) {
                    org.telegram.messenger.i0.m = I03.b;
                    org.telegram.messenger.i0.n = I03.d;
                    s3Var.f = I03;
                    s3Var.h = I04;
                    s3Var.requestLayout();
                }
                int childCount2 = s3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = s3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.h0.b(childAt, j1Var);
                    }
                    i11++;
                }
                s3Var.invalidate();
                break;
            default:
                ((ph.k0) obj).n1.j(j1Var);
                break;
        }
        return r0.j1.b;
    }

    @Override // org.telegram.messenger.t1
    public void a(c5.g gVar, List list) {
        int i10;
        ph.l1 l1Var = (ph.l1) this.b;
        ArrayList arrayList = l1Var.e2;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            c5.m mVar = (c5.m) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kg.m mVar2 = (kg.m) obj;
                    if (mVar2.h() != null && mVar2.h().equals(mVar.c)) {
                        mVar2.h = mVar;
                        if (mVar2.f() > j10) {
                            j10 = mVar2.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((kg.m) obj2).g = j10;
        }
        org.telegram.messenger.i0.g3(new w5(l1Var, 26));
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((n2.j) obj).a((oa.d) this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0120  */
    @Override // org.telegram.ui.Components.hk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(float f7, float f10, int i10, View view) {
        long j10;
        v1 v1Var = (v1) this.b;
        LinkedHashMap linkedHashMap = v1Var.d2;
        t1 t1Var = v1Var.Q1;
        HashSet hashSet = v1Var.W1;
        int i11 = 0;
        if (view instanceof p8) {
            linkedHashMap.clear();
            v1Var.i1(true);
        } else if (view instanceof qg.k) {
            qg.k kVar = (qg.k) view;
            TLRPC.User user = kVar.getUser();
            TLRPC.Chat chat = kVar.getChat();
            long j11 = user != null ? user.id : -chat.id;
            if (hashSet.contains(Long.valueOf(j11))) {
                hashSet.remove(Long.valueOf(j11));
            } else {
                hashSet.add(Long.valueOf(j11));
                Long valueOf = Long.valueOf(j11);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if (hashSet.size() != 11 || v1Var.j2 != 1) {
                j10 = 1;
                if (hashSet.size() != k0.f() + 1 || v1Var.j2 != 2) {
                    t1Var.b(true, hashSet, new p1(v1Var, 1), null);
                    v1Var.n1(true, false);
                    if (chat != null && !w3.t0(chat) && hashSet.contains(Long.valueOf(j11))) {
                        Context context = v1Var.o1.getContext();
                        p6 p6Var = v1Var.I0;
                        bi.e eVar = new bi.e(v1Var, j11, 4);
                        p1 p1Var = new p1(v1Var, 2);
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                        boolean V = w3.V(chat);
                        String L0 = cd.L0(V ? 2131753397 : 2131753395, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = cd.L0(V ? 2131753396 : 2131753394, null);
                        alertDialog$Builder.k(cd.L0(2131754486, "Add"), new ag.m(25, atomicBoolean, p1Var));
                        alertDialog$Builder.h(cd.L0(2131752589, "Cancel"), new m4.v0(13));
                        alertDialog$Builder.j(new g(i11, atomicBoolean, eVar));
                        alertDialog$Builder.p();
                    } else if (chat != null) {
                        v1Var.e1();
                    }
                    if (view instanceof qg.b) {
                        return;
                    }
                    long hashCode = ((qg.b) view).getCountry().default_name.hashCode();
                    if (hashSet.contains(Long.valueOf(hashCode))) {
                        hashSet.remove(Long.valueOf(hashCode));
                    } else {
                        hashSet.add(Long.valueOf(hashCode));
                    }
                    if (hashSet.size() == vp.r1(d20.s0).p0 + j10 && v1Var.j2 == 3) {
                        hashSet.remove(Long.valueOf(hashCode));
                        v1Var.k1();
                        return;
                    }
                    t1Var.b(true, hashSet, new p1(v1Var, 3), v1Var.c2);
                    if (TextUtils.isEmpty(v1Var.f2)) {
                        v1Var.n1(true, false);
                        return;
                    }
                    v1Var.f2 = null;
                    t1Var.setText("");
                    v1Var.n1(false, false);
                    v1Var.n1(true, true);
                    return;
                }
            }
            hashSet.remove(Long.valueOf(j11));
            v1Var.k1();
            return;
        }
        j10 = 1;
        if (view instanceof qg.b) {
        }
    }

    @Override // a5.b
    public void c(WebView webView, a5.a aVar, Uri uri, boolean z10, b5.h hVar) {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.b;
        org.telegram.ui.web.z0 z0Var = v0Var.Q;
        if (webView != v0Var || z0Var == null) {
            return;
        }
        if (webView != z0Var.a || aVar.b != 0) {
            z0Var.g("onBotWebMessage ignored: invalid source or payload");
            return;
        }
        String k10 = org.telegram.ui.web.z0.k(uri == null ? null : uri.toString());
        if (z0Var.t0 && (TextUtils.isEmpty(z0Var.G0) || !TextUtils.equals(z0Var.G0, k10) || !TextUtils.equals(z0Var.G0, z0Var.getOriginHost()))) {
            z0Var.g("onBotWebMessage ignored: untrusted origin");
            return;
        }
        org.telegram.ui.web.x0 f7 = z0Var.f();
        try {
            aVar.h(0);
            String str = (String) aVar.c;
            if (str != null && str.length() <= 1048576) {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("eventType");
                if (!string.isEmpty() && string.length() <= 128) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.web.x(z0Var, webView, f7, string, jSONObject.optString("eventData", null), 2));
                    return;
                }
                z0Var.g("onBotWebMessage ignored: invalid event type");
                return;
            }
            z0Var.g("onBotWebMessage ignored: invalid payload length");
        } catch (JSONException e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 6:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override // t5.b
    public Object g() {
        SQLiteDatabase a2;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 23:
                s5.g gVar = (s5.g) ((s5.c) obj);
                gVar.getClass();
                int i11 = o5.a.e;
                xa.n nVar = new xa.n();
                nVar.b = null;
                nVar.c = new ArrayList();
                nVar.d = null;
                nVar.a = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new q5.a(gVar, hashMap, nVar, 4));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 24:
                s5.g gVar2 = (s5.g) ((s5.d) obj);
                long g10 = gVar2.b.g() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(g10)};
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
                s5.g gVar3 = (s5.g) ((s5.c) ((ea.d) obj).i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.b.g()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                ji.f fVar = (ji.f) obj;
                Iterator it = ((Iterable) ((s5.g) ((s5.d) fVar.c)).c(new x6(15))).iterator();
                while (it.hasNext()) {
                    ((q5.d) fVar.d).x((l5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                ((p1) this.b).run();
                break;
            case 10:
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.b;
                DialogInterface.OnCancelListener onCancelListener = x1Var2.J;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(x1Var2);
                }
                x1Var2.dismiss();
                break;
            case 17:
                ((org.telegram.ui.web.x) this.b).run();
                break;
            default:
                ((org.telegram.ui.Cells.e1) this.b).run();
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i10;
        p6 p6Var;
        rh.h hVar = (rh.h) this.b;
        a51 a51Var = (a51) obj;
        rh.i iVar = hVar.r;
        if (!(a51Var.G instanceof TL_stars.StarsTransaction)) {
            if (hVar.h) {
                hVar.h = false;
                hVar.a();
                return;
            }
            return;
        }
        Context context = hVar.getContext();
        long j10 = iVar.b;
        i10 = ((k2) iVar).currentAccount;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) a51Var.G;
        p6Var = ((k2) iVar).resourceProvider;
        h8.j1(context, true, j10, i10, starsTransaction, p6Var);
    }

    @Override // rf.l
    public void l(long j10) {
        ((ph.d) this.b).a(j10, true);
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.b;
        t0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = t0Var.d) != null && k1Var.isShowing()) {
            t0Var.d.d(true);
        }
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / zs.K2));
        org.telegram.messenger.i0.g3(new gi0(28, rVar, bitmap));
    }

    @Override // mh.a
    public void s(Canvas canvas, int i10) {
        mh.j jVar = (mh.j) this.b;
        jVar.getClass();
        canvas.save();
        RectF rectF = jVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + org.telegram.messenger.i0.L(30.0f));
        jVar.e(canvas, true, i10);
        canvas.restore();
    }

    public /* synthetic */ l(p4.t0 t0Var, p4.s0 s0Var) {
        this.a = 18;
        this.b = t0Var;
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
