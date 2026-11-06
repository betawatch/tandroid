package org.telegram.ui.ActionBar;

import a8.wa;
import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ec;
import com.google.android.gms.tasks.OnSuccessListener;
import di.o7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.lc;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.cn0;
import org.telegram.ui.up0;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m3 implements r0.m, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.b1, lc, d5.a, r1, c0.j, p4.c0, p4.a1, h2.j, p4.y0, g9.k, sg.z, te.b, t0.e, sg.l1, OnSuccessListener, w5.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        n3 n3Var = (n3) this.b;
        n3Var.e = k1Var;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        i0.b I02 = org.telegram.messenger.g0.I0(k1Var, true);
        if (!n3Var.f.equals(I0) || !n3Var.h.equals(I02)) {
            org.telegram.messenger.g0.m = I0.b;
            org.telegram.messenger.g0.n = I0.d;
            n3Var.f = I0;
            n3Var.h = I02;
            n3Var.requestLayout();
        }
        int childCount = n3Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = n3Var.getChildAt(i7);
            if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                r0.i0.b(childAt, k1Var);
            }
        }
        n3Var.invalidate();
        return r0.k1.b;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        switch (this.a) {
            case 17:
                sh.b.a((sh.b) this.b);
                break;
            default:
                ((Switch) this.b).invalidate();
                break;
        }
    }

    @Override // sg.z
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 9:
                ((p4.g1) obj).e((e2.w0) this.b);
                break;
            default:
                ((q2.j) obj).a((qb.a) this.b);
                break;
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 12:
                j2.n nVar = (j2.n) this.b;
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                l9.a aVar = (l9.a) nVar.c;
                if (!aVar.a(Math.max(height, width))) {
                    return bitmap;
                }
                if (aVar.a(height)) {
                    height--;
                }
                if (aVar.a(width)) {
                    width--;
                }
                return bg.o0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
            default:
                f5.u uVar = (f5.u) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i7 = uVar.b;
                if (width2 > i7 || bitmap2.getHeight() > i7) {
                    float f10 = i7;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f10 / width3, f10 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return bg.o0.e(bitmap2);
        }
    }

    @Override // p4.c0
    public void b(p4.u uVar, int i7) {
        uVar.e(i7, (e2.y0) this.b);
    }

    @Override // p4.y0
    public void c(p4.g1 g1Var, p4.v vVar) {
        ((h2.j) this.b).accept(g1Var);
    }

    @Override // c0.j
    public Object d(c0.i iVar) {
        p4.d0 d0Var = (p4.d0) this.b;
        d0Var.o.post(new org.telegram.ui.web.w(15, d0Var, iVar));
        return "onPlayRequested";
    }

    @Override // sg.l1
    public void f() {
        up0 up0Var = (up0) this.b;
        TextView textView = up0Var.h1;
        boolean a10 = up0Var.o0.a();
        ImageView imageView = up0Var.f1;
        imageView.animate().cancel();
        imageView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        textView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        zg0 B;
        switch (this.a) {
            case 3:
                org.telegram.ui.Components.voip.e1 e1Var = (org.telegram.ui.Components.voip.e1) this.b;
                if (z9 && !z10) {
                    e1Var.a();
                    break;
                }
                break;
            default:
                tg.d2 d2Var = (tg.d2) this.b;
                if (z9 && !z10 && (B = imageReceiver.B()) != null) {
                    d2Var.q(B);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 5:
                ((org.telegram.ui.web.x) this.b).run();
                break;
            case 21:
                ((cn0) this.b).run();
                break;
            default:
                ((tg.a0) this.b).a.O1.r();
                break;
        }
    }

    @Override // w5.b
    public Object h() {
        SQLiteDatabase a10;
        int i7 = this.a;
        boolean z9 = false;
        Object obj = this.b;
        switch (i7) {
            case 27:
                v5.g gVar = (v5.g) ((v5.c) obj);
                gVar.getClass();
                int i10 = r5.a.e;
                ab.b0 b0Var = new ab.b0(13, z9);
                b0Var.c = null;
                b0Var.d = new ArrayList();
                b0Var.e = null;
                b0Var.b = "";
                HashMap hashMap = new HashMap();
                a10 = gVar.a();
                a10.beginTransaction();
                try {
                    r5.a aVar = (r5.a) v5.g.h(a10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new hr(gVar, hashMap, b0Var, 15));
                    a10.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 28:
                v5.g gVar2 = (v5.g) ((v5.d) obj);
                long s5 = gVar2.b.s() - gVar2.d.d;
                a10 = gVar2.a();
                a10.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(s5)};
                    Cursor rawQuery = a10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            gVar2.e(rawQuery.getInt(0), r5.c.c, rawQuery.getString(1));
                        } catch (Throwable th2) {
                            rawQuery.close();
                            throw th2;
                        }
                    }
                    rawQuery.close();
                    int delete = a10.delete("events", "timestamp_ms < ?", strArr);
                    a10.setTransactionSuccessful();
                    a10.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            default:
                v5.g gVar3 = (v5.g) ((v5.c) ((ia.c) obj).i);
                a10 = gVar3.a();
                a10.beginTransaction();
                try {
                    a10.compileStatement("DELETE FROM log_event_dropped").execute();
                    a10.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.b.s()).execute();
                    a10.setTransactionSuccessful();
                    return null;
                } finally {
                }
        }
    }

    @Override // p4.a1
    public Object i(p4.d0 d0Var, p4.v vVar, int i7) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 8:
                return d0Var.l(vVar, (h9.i0) obj);
            default:
                p4.y0 y0Var = (p4.y0) obj;
                m9.w wVar = m9.w.b;
                if (!d0Var.j()) {
                    y0Var.c(d0Var.t, vVar);
                    p4.c1.R0(d0Var, vVar, i7, new p4.m1(0));
                }
                return m9.w.b;
        }
    }

    @Override // t0.e
    public boolean k(qt qtVar, int i7, Bundle bundle) {
        r0.d dVar;
        m.t tVar = (m.t) this.b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) qtVar.b).e();
                Parcelable parcelable = (Parcelable) ((t0.h) qtVar.b).h();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        t0.h hVar = (t0.h) qtVar.b;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i10 >= 31) {
            dVar = new m2.i(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.b = clipData;
            eVar.c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.f());
        dVar.setExtras(bundle);
        return r0.i0.h(tVar, dVar.build()) == null;
    }

    @Override // d5.a
    public void l(WebView webView, wa waVar, Uri uri, boolean z9, e5.f fVar) {
        org.telegram.ui.web.u0 u0Var = (org.telegram.ui.web.u0) this.b;
        org.telegram.ui.web.x0 x0Var = u0Var.Q;
        if (webView != u0Var || x0Var == null) {
            return;
        }
        if (webView != x0Var.a || waVar.b != 0) {
            x0Var.g("onBotWebMessage ignored: invalid source or payload");
            return;
        }
        String k10 = org.telegram.ui.web.x0.k(uri == null ? null : uri.toString());
        if (x0Var.t0 && (TextUtils.isEmpty(x0Var.G0) || !TextUtils.equals(x0Var.G0, k10) || !TextUtils.equals(x0Var.G0, x0Var.getOriginHost()))) {
            x0Var.g("onBotWebMessage ignored: untrusted origin");
            return;
        }
        o7 f10 = x0Var.f();
        try {
            waVar.f(0);
            String str = (String) waVar.c;
            if (str != null && str.length() <= 1048576) {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("eventType");
                if (!string.isEmpty() && string.length() <= 128) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.web.x(x0Var, webView, f10, string, jSONObject.optString("eventData", null), 2));
                    return;
                }
                x0Var.g("onBotWebMessage ignored: invalid event type");
                return;
            }
            x0Var.g("onBotWebMessage ignored: invalid payload length");
        } catch (JSONException e10) {
            a8.g(e10, true);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 23:
                tg.n1 n1Var = (tg.n1) obj2;
                n1Var.C0 = true;
                n1Var.B0 = false;
                break;
            case 24:
                hi.d4 d4Var = (hi.d4) obj2;
                zb.b bVar = (zb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar.a.size(); i10++) {
                    zb.a aVar = (zb.a) bVar.a.get(i10);
                    tg.b2 b2Var = new tg.b2();
                    b2Var.a = aVar.a;
                    b2Var.b = aVar.d;
                    b2Var.c = aVar.e;
                    b2Var.d = aVar.b;
                    b2Var.e = aVar.c;
                    arrayList.add(b2Var);
                }
                d4Var.a(arrayList);
                break;
            default:
                tg.c2 c2Var = (tg.c2) obj2;
                List list = (List) obj;
                if (list.size() <= 0) {
                    a8.b("objimg: no objects");
                    break;
                } else {
                    int i11 = ((wb.a) list.get(0)).c;
                    String str = null;
                    if (ec.a == null) {
                        ec.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    }
                    if (i11 >= 0) {
                        String[] strArr = ec.a;
                        if (i11 < strArr.length) {
                            str = strArr[i11];
                        }
                    }
                    c2Var.c0 = str;
                    StringBuilder sb2 = new StringBuilder("objimg: detected #");
                    sb2.append(((wb.a) list.get(0)).c);
                    sb2.append(" ");
                    sb2.append(c2Var.c0);
                    sb2.append(" ");
                    org.telegram.ui.Cells.f1.u(((wb.a) list.get(0)).a, sb2);
                    org.telegram.messenger.i6.g(c2Var.c0);
                    break;
                }
        }
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i7) {
        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / qs.K2));
        org.telegram.messenger.g0.h3(new l51(5, yVar, bitmap));
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    public /* synthetic */ m3(qe.h hVar, s4.r0 r0Var) {
        this.a = 15;
        this.b = hVar;
    }

    private final /* synthetic */ void m(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void n(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void e(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void j(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void o(float f10, int i7) {
    }

    private final /* synthetic */ void p(float f10, int i7) {
    }
}
