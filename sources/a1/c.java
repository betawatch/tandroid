package a1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import c2.y0;
import c2.z0;
import c5.j;
import cg.h2;
import cg.r0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b0;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.r;
import d4.n;
import d4.x;
import d4.y;
import dg.j3;
import dg.p3;
import dg.q3;
import dg.r3;
import dg.v2;
import f3.h;
import gg.e1;
import gg.x1;
import j3.n0;
import j7.o5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.j5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ft0;
import org.telegram.ui.mq0;
import org.telegram.ui.yh;
import ph.s6;
import y2.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, c9.e, r0, Continuation, OnCompleteListener, x, h2, c2, s6, ImageReceiver.ImageReceiverDelegate, xd.b, g3.b, ba.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(z0 z0Var, y0 y0Var) {
        this.a = 2;
        this.b = z0Var;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        dh.f.a((dh.f) this.b);
    }

    @Override // cg.r0
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // d4.x
    public int b(Object obj) {
        n0 n0Var = (n0) this.b;
        n nVar = (n) obj;
        String str = nVar.b;
        return ((str.equals(n0Var.C) || str.equals(y.b(n0Var))) && nVar.c(n0Var, false)) ? 1 : 0;
    }

    @Override // ph.s6
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.b, options);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        gj0 lottieAnimation;
        r3 r3Var = (r3) this.b;
        if (!z4 || z10 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        r3Var.q(lottieAnimation);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override // cg.h2
    public void e() {
        ft0 ft0Var = (ft0) this.b;
        TextView textView = ft0Var.v1;
        boolean a2 = ft0Var.C0.a();
        ImageView imageView = ft0Var.t1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // ba.a
    public void f(ba.b bVar) {
        f9.a aVar = (f9.a) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.b.set((f9.a) bVar.get());
    }

    @Override // c9.e
    public Object f0(j jVar) {
        return this.b;
    }

    @Override // g3.b
    public Object g() {
        SQLiteDatabase a2;
        int i10 = this.a;
        int i11 = 1;
        boolean z4 = false;
        Object obj = this.b;
        switch (i10) {
            case 22:
                h hVar = (h) ((f3.c) obj);
                hVar.getClass();
                int i12 = b3.a.e;
                r rVar = new r(3, z4);
                rVar.c = null;
                rVar.d = new ArrayList();
                rVar.e = null;
                rVar.b = "";
                HashMap hashMap = new HashMap();
                a2 = hVar.a();
                a2.beginTransaction();
                try {
                    b3.a aVar = (b3.a) h.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new androidx.car.app.utils.a(hVar, hashMap, rVar, 7));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 23:
                h hVar2 = (h) ((f3.d) obj);
                long X = hVar2.b.X() - hVar2.d.d;
                a2 = hVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(X)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar2.e(rawQuery.getInt(0), b3.c.c, rawQuery.getString(1));
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
            case 24:
                h hVar3 = (h) ((f3.c) ((e3.g) obj).i);
                a2 = hVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.b.X()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                r rVar2 = (r) obj;
                Iterator it = ((Iterable) ((h) ((f3.d) rVar2.c)).c(new f0.d(i11))).iterator();
                while (it.hasNext()) {
                    ((androidx.biometric.e) rVar2.d).A((i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(d2 d2Var, int i10) {
        switch (this.a) {
            case 13:
                ((mq0) this.b).run();
                break;
            case 14:
                ((dg.r0) this.b).a.c2.r();
                break;
            case 28:
                ((x1) this.b).run();
                break;
            default:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                p2 R = LaunchActivity.R();
                if (R != null) {
                    e1.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 7:
                b0.b((Intent) this.b);
                break;
            case 8:
                ((d0) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z4;
        switch (this.a) {
            case 0:
                ((f) this.b).invoke(obj);
                return;
            case 1:
                ((b1.f) this.b).invoke(obj);
                return;
            case 5:
                com.google.firebase.messaging.y yVar = (com.google.firebase.messaging.y) obj;
                if (!((FirebaseMessaging) this.b).e.o() || yVar.h.a() == null) {
                    return;
                }
                synchronized (yVar) {
                    z4 = yVar.g;
                }
                if (z4) {
                    return;
                }
                yVar.h(0L);
                return;
            case 10:
                ((b1.f) this.b).invoke(obj);
                return;
            case 16:
                v2 v2Var = (v2) this.b;
                v2Var.z0 = true;
                v2Var.y0 = false;
                return;
            case 17:
                j3 j3Var = (j3) this.b;
                mb.b bVar = (mb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar.a.size(); i10++) {
                    mb.a aVar = (mb.a) bVar.a.get(i10);
                    p3 p3Var = new p3();
                    p3Var.a = aVar.a;
                    p3Var.b = aVar.d;
                    p3Var.c = aVar.e;
                    p3Var.d = aVar.b;
                    p3Var.e = aVar.c;
                    arrayList.add(p3Var);
                }
                j3Var.run(arrayList);
                return;
            case 18:
                q3 q3Var = (q3) this.b;
                List list = (List) obj;
                q3Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i11 = ((jb.a) list.get(0)).c;
                String str = null;
                if (o5.a == null) {
                    o5.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i11 >= 0) {
                    String[] strArr = o5.a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                    }
                }
                q3Var.W = str;
                StringBuilder sb = new StringBuilder("objimg: detected #");
                sb.append(((jb.a) list.get(0)).c);
                sb.append(" ");
                sb.append(q3Var.W);
                sb.append(" ");
                yh.w(((jb.a) list.get(0)).a, sb);
                Emoji.getEmojiDrawable(q3Var.W);
                return;
            case 21:
                ((e1.b) this.b).invoke(obj);
                return;
            default:
                ((e1.b) this.b).invoke(obj);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((a9.a) this.b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
