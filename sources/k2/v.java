package k2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.widget.ImageView;
import android.widget.TextView;
import b2.x0;
import ci.m8;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnSuccessListener;
import ei.r4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import m4.d1;
import m4.f1;
import m4.g1;
import m4.k1;
import m4.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.h5;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.au0;
import org.telegram.ui.ir0;
import org.webrtc.GlGenericDrawer;
import p4.r0;
import p4.s0;
import pg.s1;
import qg.o2;
import qg.p2;
import qg.q2;
import w7.l6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements le.d, m4.z, f1, d1, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, m1, a2, pg.h0, s1, m8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, r2.v, t5.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
        int i11 = this.a;
    }

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        switch (this.a) {
            case 1:
                ((Switch) this.b).invalidate();
                break;
            default:
                qh.c.a((qh.c) this.b);
                break;
        }
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        switch (this.a) {
            case 6:
                return new na.c((Context) cVar.a(Context.class), ((k9.h) cVar.a(k9.h.class)).d(), cVar.w(na.d.class), cVar.c(xa.b.class), (Executor) cVar.i((q9.r) this.b));
            default:
                return this.b;
        }
    }

    @Override // pg.h0
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

    @Override // ci.m8
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.b, options);
    }

    @Override // m4.z
    public void d(m4.q qVar, int i10) {
        qVar.c(i10, (x0) this.b);
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

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        q2 q2Var = (q2) this.b;
        if (!z10 || z11 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        q2Var.q(lottieAnimation);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override // pg.s1
    public void e() {
        au0 au0Var = (au0) this.b;
        TextView textView = au0Var.y1;
        boolean a2 = au0Var.F0.a();
        ImageView imageView = au0Var.w1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 14:
                ((org.telegram.ui.web.b0) this.b).run();
                break;
            case 19:
                ((ir0) this.b).run();
                break;
            default:
                ((qg.d0) this.b).a.f2.r();
                break;
        }
    }

    @Override // m4.d1
    public void g(k1 k1Var, m4.r rVar) {
        ((e2.h) this.b).accept(k1Var);
    }

    @Override // m4.f1
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 3:
                return a0Var.l(rVar, (e9.i0) obj);
            default:
                d1 d1Var = (d1) obj;
                i9.u uVar = i9.u.b;
                if (!a0Var.j()) {
                    d1Var.g(a0Var.t, rVar);
                    g1.O0(a0Var, rVar, i10, new q1(0));
                }
                return i9.u.b;
        }
    }

    @Override // t5.b
    public Object i() {
        SQLiteDatabase a2;
        int i10 = this.a;
        Object obj = this.b;
        boolean z10 = false;
        switch (i10) {
            case 28:
                s5.g gVar = (s5.g) ((s5.c) obj);
                gVar.getClass();
                int i11 = o5.a.e;
                com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(7, z10);
                tVar.c = null;
                tVar.d = new ArrayList();
                tVar.e = null;
                tVar.b = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new s50(gVar, hashMap, tVar, 9));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            default:
                s5.g gVar2 = (s5.g) ((s5.d) obj);
                long q6 = gVar2.b.q() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(q6)};
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
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 22:
                qg.a2 a2Var = (qg.a2) obj2;
                a2Var.C0 = true;
                a2Var.B0 = false;
                break;
            case 23:
                r4 r4Var = (r4) obj2;
                ac.b bVar = (ac.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar.a.size(); i11++) {
                    ac.a aVar = (ac.a) bVar.a.get(i11);
                    o2 o2Var = new o2();
                    o2Var.a = aVar.a;
                    o2Var.b = aVar.d;
                    o2Var.c = aVar.e;
                    o2Var.d = aVar.b;
                    o2Var.e = aVar.c;
                    arrayList.add(o2Var);
                }
                r4Var.run(arrayList);
                break;
            default:
                p2 p2Var = (p2) obj2;
                List list = (List) obj;
                p2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    break;
                } else {
                    int i12 = ((xb.a) list.get(0)).c;
                    String str = null;
                    if (l6.a == null) {
                        l6.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    }
                    if (i12 >= 0) {
                        String[] strArr = l6.a;
                        if (i12 < strArr.length) {
                            str = strArr[i12];
                        }
                    }
                    p2Var.c0 = str;
                    StringBuilder sb2 = new StringBuilder("objimg: detected #");
                    sb2.append(((xb.a) list.get(0)).c);
                    sb2.append(" ");
                    sb2.append(p2Var.c0);
                    sb2.append(" ");
                    e2.t(((xb.a) list.get(0)).a, sb2);
                    Emoji.getEmojiDrawable(p2Var.c0);
                    break;
                }
        }
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new ar0(21, uVar, bitmap));
    }

    public /* synthetic */ v(s0 s0Var, r0 r0Var) {
        this.a = 15;
        this.b = s0Var;
    }

    private final /* synthetic */ void j(float f7, int i10) {
    }

    private final /* synthetic */ void k(float f7, int i10) {
    }
}
