package a1;

import a4.a0;
import a4.b0;
import a4.q;
import a5.j;
import ag.m2;
import ag.s0;
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
import bg.n3;
import bg.t3;
import bg.u3;
import bg.v3;
import bg.y2;
import c2.a1;
import c2.b1;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.z;
import eg.f1;
import eg.y1;
import f3.h;
import j3.t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import nh.m7;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.i5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gq0;
import org.telegram.ui.th;
import org.telegram.ui.ws0;
import y2.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, a0, a9.e, s0, m2, b2, m7, ImageReceiver.ImageReceiverDelegate, vd.b, Continuation, OnCompleteListener, z9.a, g3.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(b1 b1Var, a1 a1Var) {
        this.a = 14;
        this.b = b1Var;
    }

    @Override // a9.e
    public Object I0(j jVar) {
        return this.b;
    }

    @Override // vd.b
    public void N(int i10, float f9, float f10, vd.c cVar) {
        bh.f.a((bh.f) this.b);
    }

    @Override // ag.s0
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // a4.a0
    public int b(Object obj) {
        t0 t0Var = (t0) this.b;
        q qVar = (q) obj;
        String str = qVar.b;
        return ((str.equals(t0Var.B) || str.equals(b0.b(t0Var))) && qVar.c(t0Var, false)) ? 1 : 0;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        v3 v3Var = (v3) this.b;
        if (!z10 || z11 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        v3Var.q(lottieAnimation);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override // ag.m2
    public void e() {
        ws0 ws0Var = (ws0) this.b;
        TextView textView = ws0Var.u1;
        boolean a2 = ws0Var.B0.a();
        ImageView imageView = ws0Var.s1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // g3.b
    public Object f() {
        SQLiteDatabase a2;
        int i10 = this.a;
        boolean z10 = false;
        Object obj = this.b;
        switch (i10) {
            case 23:
                h hVar = (h) ((f3.c) obj);
                hVar.getClass();
                int i11 = b3.a.e;
                s sVar = new s(3, z10);
                sVar.c = null;
                sVar.d = new ArrayList();
                sVar.e = null;
                sVar.b = "";
                HashMap hashMap = new HashMap();
                a2 = hVar.a();
                a2.beginTransaction();
                try {
                    b3.a aVar = (b3.a) h.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new androidx.car.app.utils.a(hVar, hashMap, sVar, 7));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 24:
                h hVar2 = (h) ((f3.d) obj);
                long e10 = hVar2.b.e() - hVar2.d.d;
                a2 = hVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(e10)};
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
            case 25:
                h hVar3 = (h) ((f3.c) ((e3.f) obj).i);
                a2 = hVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.b.e()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                s sVar2 = (s) obj;
                Iterator it = ((Iterable) ((h) ((f3.d) sVar2.c)).c(new eg.c(6))).iterator();
                while (it.hasNext()) {
                    ((androidx.biometric.e) sVar2.d).A((i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 5:
                ((gq0) this.b).run();
                break;
            case 6:
                ((bg.s0) this.b).a.b2.r();
                break;
            case 27:
                ((y1) this.b).run();
                break;
            case 28:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                o2 R = LaunchActivity.R();
                if (R != null) {
                    f1.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            default:
                ((eg.t0) this.b).run();
                break;
        }
    }

    @Override // nh.m7
    public Bitmap h(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.b, options);
    }

    @Override // z9.a
    public void j(z9.b bVar) {
        d9.b bVar2 = (d9.b) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        bVar2.b.set((d9.b) bVar.get());
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 17:
                c0.b((Intent) this.b);
                break;
            case 18:
                ((e0) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                ((f) this.b).invoke(obj);
                return;
            case 8:
                y2 y2Var = (y2) this.b;
                y2Var.y0 = true;
                y2Var.x0 = false;
                return;
            case 9:
                n3 n3Var = (n3) this.b;
                kb.b bVar = (kb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar.a.size(); i10++) {
                    kb.a aVar = (kb.a) bVar.a.get(i10);
                    t3 t3Var = new t3();
                    t3Var.a = aVar.a;
                    t3Var.b = aVar.d;
                    t3Var.c = aVar.e;
                    t3Var.d = aVar.b;
                    t3Var.e = aVar.c;
                    arrayList.add(t3Var);
                }
                n3Var.run(arrayList);
                return;
            case 10:
                u3 u3Var = (u3) this.b;
                List list = (List) obj;
                u3Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i11 = ((hb.a) list.get(0)).c;
                String str = null;
                if (h7.s.a == null) {
                    h7.s.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i11 >= 0) {
                    String[] strArr = h7.s.a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                    }
                }
                u3Var.V = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((hb.a) list.get(0)).c);
                sb2.append(" ");
                sb2.append(u3Var.V);
                sb2.append(" ");
                th.v(((hb.a) list.get(0)).a, sb2);
                Emoji.getEmojiDrawable(u3Var.V);
                return;
            case 13:
                ((b1.f) this.b).invoke(obj);
                return;
            case 15:
                z zVar = (z) obj;
                if (!((FirebaseMessaging) this.b).e.l() || zVar.h.a() == null) {
                    return;
                }
                synchronized (zVar) {
                    z10 = zVar.g;
                }
                if (z10) {
                    return;
                }
                zVar.h(0L);
                return;
            case 20:
                ((b1.f) this.b).invoke(obj);
                return;
            default:
                ((e1.b) this.b).invoke(obj);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((bg.c2) this.b).getClass();
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

    @Override // vd.b
    public /* synthetic */ void z(float f9, int i10) {
    }
}
