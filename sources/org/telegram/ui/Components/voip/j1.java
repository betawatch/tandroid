package org.telegram.ui.Components.voip;

import a8.me;
import a8.xf;
import android.content.ClipData;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.u7;
import hi.p4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.p5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pt0;
import org.telegram.ui.zq0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements n1, org.telegram.ui.ActionBar.b2, s9.d, rg.h0, u5.b, rg.s1, u7, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, oe.d, t0.e, ra.a, bm0, wh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        sh.c.a((sh.c) this.b);
    }

    @Override // rg.s1
    public void a() {
        pt0 pt0Var = (pt0) this.b;
        TextView textView = pt0Var.n1;
        boolean a2 = pt0Var.u0.a();
        ImageView imageView = pt0Var.l1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // rg.h0
    public Typeface b() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // t0.e
    public boolean d(t0.i iVar, int i10, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.a.b();
                Parcelable parcelable = (Parcelable) iVar.a.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        t0.h hVar = iVar.a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.a()));
        if (i11 >= 31) {
            dVar = new j2.i(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.b = clipData;
            eVar.c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.c());
        dVar.setExtras(bundle);
        return r0.i0.i(sVar, dVar.build()) == null;
    }

    @Override // s9.d
    public Object d1(me meVar) {
        switch (this.a) {
            case 4:
                return new pa.c((Context) meVar.a(Context.class), ((m9.h) meVar.a(m9.h.class)).d(), meVar.x(pa.d.class), meVar.d(za.b.class), (Executor) meVar.n((s9.s) this.b));
            default:
                return this.b;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        sg.p2 p2Var = (sg.p2) this.b;
        if (!z10 || z11 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        p2Var.q(lottieAnimation);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        vg.z0.Q((vg.z0) this.b, view);
    }

    @Override // u5.b
    public Object f() {
        SQLiteDatabase a2;
        int i10 = this.a;
        int i11 = 10;
        boolean z10 = false;
        Object obj = this.b;
        switch (i10) {
            case 6:
                t5.g gVar = (t5.g) ((t5.c) obj);
                gVar.getClass();
                int i12 = p5.a.e;
                ti.e eVar = new ti.e(i11, z10);
                eVar.b = null;
                eVar.c = new ArrayList();
                eVar.d = null;
                eVar.e = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    p5.a aVar = (p5.a) t5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new qy(gVar, hashMap, eVar, i11));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 7:
                t5.g gVar2 = (t5.g) ((t5.d) obj);
                long o10 = gVar2.b.o() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(o10)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            gVar2.e(rawQuery.getInt(0), p5.c.c, rawQuery.getString(1));
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
            case 8:
                t5.g gVar3 = (t5.g) ((t5.c) ((aa.b0) obj).i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.b.o()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) obj;
                Iterator it = ((Iterable) ((t5.g) ((t5.d) qVar.b)).c(new s0.b(i11))).iterator();
                while (it.hasNext()) {
                    ((s4.d) qVar.c).t((m5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // fi.u7
    public Bitmap g(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.b, options);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 2:
                ((org.telegram.ui.web.b0) this.b).run();
                break;
            case 12:
                ((zq0) this.b).run();
                break;
            case 13:
                ((sg.b0) this.b).a.U1.r();
                break;
            case 24:
                ((vg.t0) this.b).run();
                break;
            case 25:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    vg.c0.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            case 26:
                ((org.telegram.messenger.y2) this.b).run();
                break;
            default:
                ((vg.t0) this.b).run();
                break;
        }
    }

    @Override // ra.a
    public void i(ra.b bVar) {
        v9.a aVar = (v9.a) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.b.set((v9.a) bVar.get());
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        p5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 15:
                sg.y1 y1Var = (sg.y1) obj2;
                y1Var.C0 = true;
                y1Var.B0 = false;
                break;
            case 16:
                p4 p4Var = (p4) obj2;
                cc.b bVar = (cc.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar.a.size(); i11++) {
                    cc.a aVar = (cc.a) bVar.a.get(i11);
                    sg.n2 n2Var = new sg.n2();
                    n2Var.a = aVar.a;
                    n2Var.b = aVar.d;
                    n2Var.c = aVar.e;
                    n2Var.d = aVar.b;
                    n2Var.e = aVar.c;
                    arrayList.add(n2Var);
                }
                p4Var.run(arrayList);
                break;
            default:
                sg.o2 o2Var = (sg.o2) obj2;
                List list = (List) obj;
                o2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    break;
                } else {
                    int i12 = ((zb.a) list.get(0)).c;
                    String str = null;
                    if (xf.a == null) {
                        xf.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    }
                    if (i12 >= 0) {
                        String[] strArr = xf.a;
                        if (i12 < strArr.length) {
                            str = strArr[i12];
                        }
                    }
                    o2Var.c0 = str;
                    StringBuilder sb2 = new StringBuilder("objimg: detected #");
                    sb2.append(((zb.a) list.get(0)).c);
                    sb2.append(" ");
                    sb2.append(o2Var.c0);
                    sb2.append(" ");
                    ic.a.w(((zb.a) list.get(0)).a, sb2);
                    Emoji.getEmojiDrawable(o2Var.c0);
                    break;
                }
        }
    }

    @Override // wh.a
    public void p(Canvas canvas, int i10) {
        wh.h hVar = (wh.h) this.b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    public /* synthetic */ j1(p4.s0 s0Var, p4.r0 r0Var) {
        this.a = 3;
        this.b = s0Var;
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
