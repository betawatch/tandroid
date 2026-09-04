package ji;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import bi.k9;
import com.google.android.gms.tasks.OnSuccessListener;
import di.m8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.ir0;
import org.telegram.ui.zt0;
import org.webrtc.GlGenericDrawer;
import w7.t6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements t5, le.d, m4.z, m4.e1, m4.c1, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.k1, a5.b, org.telegram.ui.ActionBar.a2, qg.h0, r2.v, t5.b, qg.s1, m8, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q9.d
    public Object D(cf.c cVar) {
        switch (this.a) {
            case 7:
                return new na.c((Context) cVar.a(Context.class), ((k9.h) cVar.a(k9.h.class)).d(), cVar.s(na.d.class), cVar.c(xa.b.class), (Executor) cVar.i((q9.r) this.b));
            default:
                return this.b;
        }
    }

    @Override // le.d
    public void E(int i10, float f7, float f10, le.e eVar) {
        ((Switch) this.b).invalidate();
    }

    @Override // qg.h0
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // r2.v
    public int b(Object obj) {
        b2.s sVar = (b2.s) this.b;
        r2.o oVar = (r2.o) obj;
        String str = oVar.b;
        return ((str.equals(sVar.r) || str.equals(r2.w.b(sVar))) && oVar.c(sVar, false) && oVar.d(sVar)) ? 1 : 0;
    }

    @Override // a5.b
    public void c(WebView webView, a5.a aVar, Uri uri, boolean z10, b5.h hVar) {
        org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
        org.telegram.ui.web.d1 d1Var = z0Var.Q;
        if (webView != z0Var || d1Var == null) {
            return;
        }
        if (webView != d1Var.a || aVar.b != 0) {
            d1Var.h("onBotWebMessage ignored: invalid source or payload");
            return;
        }
        String l4 = org.telegram.ui.web.d1.l(uri == null ? null : uri.toString());
        if (d1Var.t0 && (TextUtils.isEmpty(d1Var.F0) || !TextUtils.equals(d1Var.F0, l4) || !TextUtils.equals(d1Var.F0, d1Var.getOriginHost()))) {
            d1Var.h("onBotWebMessage ignored: untrusted origin");
            return;
        }
        k9 g10 = d1Var.g();
        try {
            aVar.d(0);
            String str = (String) aVar.c;
            if (str != null && str.length() <= 1048576) {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("eventType");
                if (!string.isEmpty() && string.length() <= 128) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.c0(d1Var, webView, g10, string, jSONObject.optString("eventData", null), 2));
                    return;
                }
                d1Var.h("onBotWebMessage ignored: invalid event type");
                return;
            }
            d1Var.h("onBotWebMessage ignored: invalid payload length");
        } catch (JSONException e7) {
            FileLog.e(e7);
        }
    }

    @Override // di.m8
    public Bitmap d(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.b, options);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 9:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override // m4.z
    public void e(m4.q qVar, int i10) {
        qVar.c(i10, (b2.x0) this.b);
    }

    @Override // qg.s1
    public void f() {
        zt0 zt0Var = (zt0) this.b;
        TextView textView = zt0Var.y1;
        boolean a2 = zt0Var.F0.a();
        ImageView imageView = zt0Var.w1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 14:
                ((org.telegram.ui.web.c0) this.b).run();
                break;
            case 24:
                ((ir0) this.b).run();
                break;
            default:
                ((rg.d0) this.b).a.f2.r();
                break;
        }
    }

    @Override // m4.e1
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 4:
                return a0Var.l(rVar, (e9.i0) obj);
            default:
                m4.c1 c1Var = (m4.c1) obj;
                i9.u uVar = i9.u.b;
                if (!a0Var.j()) {
                    c1Var.j(a0Var.t, rVar);
                    m4.f1.O0(a0Var, rVar, i10, new m4.p1(0));
                }
                return i9.u.b;
        }
    }

    @Override // t5.b
    public Object i() {
        SQLiteDatabase a2;
        int i10 = this.a;
        boolean z10 = false;
        Object obj = this.b;
        switch (i10) {
            case 19:
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
                    o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new s50(gVar, hashMap, sVar, 8));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 20:
                s5.g gVar2 = (s5.g) ((s5.d) obj);
                long l4 = gVar2.b.l() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(l4)};
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
            case 21:
                s5.g gVar3 = (s5.g) ((s5.c) ((da.b) obj).i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.b.l()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) obj;
                Iterator it = ((Iterable) ((s5.g) ((s5.d) sVar2.c)).c(new r9.i(24))).iterator();
                while (it.hasNext()) {
                    ((m2.t) sVar2.d).O((l5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // m4.c1
    public void j(m4.j1 j1Var, m4.r rVar) {
        ((e2.h) this.b).accept(j1Var);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 27:
                rg.z1 z1Var = (rg.z1) obj2;
                z1Var.C0 = true;
                z1Var.B0 = false;
                break;
            case 28:
                fi.s4 s4Var = (fi.s4) obj2;
                ac.b bVar = (ac.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar.a.size(); i11++) {
                    ac.a aVar = (ac.a) bVar.a.get(i11);
                    rg.n2 n2Var = new rg.n2();
                    n2Var.a = aVar.a;
                    n2Var.b = aVar.d;
                    n2Var.c = aVar.e;
                    n2Var.d = aVar.b;
                    n2Var.e = aVar.c;
                    arrayList.add(n2Var);
                }
                s4Var.run(arrayList);
                break;
            default:
                rg.o2 o2Var = (rg.o2) obj2;
                List list = (List) obj;
                o2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    break;
                } else {
                    int i12 = ((xb.a) list.get(0)).c;
                    String str = null;
                    if (t6.a == null) {
                        t6.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    }
                    if (i12 >= 0) {
                        String[] strArr = t6.a;
                        if (i12 < strArr.length) {
                            str = strArr[i12];
                        }
                    }
                    o2Var.c0 = str;
                    StringBuilder sb2 = new StringBuilder("objimg: detected #");
                    sb2.append(((xb.a) list.get(0)).c);
                    sb2.append(" ");
                    sb2.append(o2Var.c0);
                    sb2.append(" ");
                    com.google.android.gms.internal.vision.e2.t(((xb.a) list.get(0)).a, sb2);
                    Emoji.getEmojiDrawable(o2Var.c0);
                    break;
                }
        }
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new jn0(27, tVar, bitmap));
    }

    public /* synthetic */ k5(p4.s0 s0Var, p4.r0 r0Var) {
        this.a = 15;
        this.b = s0Var;
    }

    @Override // le.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
