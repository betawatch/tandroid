package le;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.view.Surface;
import android.widget.ImageView;
import android.widget.TextView;
import b2.s;
import b2.v0;
import b2.x0;
import ci.j8;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.t;
import ei.r4;
import i9.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import m4.a1;
import m4.b1;
import m4.f1;
import m4.l1;
import m4.q;
import m4.y0;
import m4.z;
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
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.cr0;
import org.telegram.ui.tt0;
import org.telegram.ui.web.a0;
import org.webrtc.GlGenericDrawer;
import p4.r0;
import p4.s0;
import pg.i0;
import pg.t1;
import q9.r;
import qg.d0;
import qg.o2;
import qg.p2;
import qg.q2;
import r2.v;
import r2.w;
import w7.l6;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements e, z, a1, e2.h, y0, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, m1, a2, i0, t1, j8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, v, t5.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // le.e
    public /* synthetic */ void C(float f7, int i10) {
        int i11 = this.a;
    }

    @Override // le.e
    public void D(int i10, float f7, float f10, f fVar) {
        switch (this.a) {
            case 0:
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
            case 7:
                return new na.c((Context) cVar.a(Context.class), ((k9.h) cVar.a(k9.h.class)).d(), cVar.w(na.d.class), cVar.c(xa.b.class), (Executor) cVar.i((r) this.b));
            default:
                return this.b;
        }
    }

    @Override // pg.i0
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((f1) obj).f((v0) this.b);
                break;
            default:
                ((f1) obj).n((Surface) this.b);
                break;
        }
    }

    @Override // r2.v
    public int b(Object obj) {
        s sVar = (s) this.b;
        r2.o oVar = (r2.o) obj;
        String str = oVar.b;
        return ((str.equals(sVar.r) || str.equals(w.b(sVar))) && oVar.c(sVar, false) && oVar.d(sVar)) ? 1 : 0;
    }

    @Override // ci.j8
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.b, options);
    }

    @Override // m4.z
    public void d(q qVar, int i10) {
        qVar.c(i10, (x0) this.b);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 10:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yi0 lottieAnimation;
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

    @Override // pg.t1
    public void e() {
        tt0 tt0Var = (tt0) this.b;
        TextView textView = tt0Var.y1;
        boolean a2 = tt0Var.F0.a();
        ImageView imageView = tt0Var.w1;
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
            case 15:
                ((a0) this.b).run();
                break;
            case 20:
                ((cr0) this.b).run();
                break;
            default:
                ((d0) this.b).a.f2.r();
                break;
        }
    }

    @Override // m4.y0
    public void g(f1 f1Var, m4.r rVar) {
        ((e2.h) this.b).accept(f1Var);
    }

    @Override // m4.a1
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 2:
                return a0Var.l(rVar, (e9.i0) obj);
            default:
                y0 y0Var = (y0) obj;
                u uVar = u.b;
                if (!a0Var.j()) {
                    y0Var.g(a0Var.t, rVar);
                    b1.O0(a0Var, rVar, i10, new l1(0));
                }
                return u.b;
        }
    }

    @Override // t5.b
    public Object i() {
        s5.g gVar = (s5.g) ((s5.c) this.b);
        gVar.getClass();
        int i10 = o5.a.e;
        t tVar = new t(7, false);
        tVar.c = null;
        tVar.d = new ArrayList();
        tVar.e = null;
        tVar.b = "";
        HashMap hashMap = new HashMap();
        SQLiteDatabase a2 = gVar.a();
        a2.beginTransaction();
        try {
            o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new t50(gVar, hashMap, tVar, 9));
            a2.setTransactionSuccessful();
            return aVar;
        } finally {
            a2.endTransaction();
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
            case 23:
                qg.a2 a2Var = (qg.a2) obj2;
                a2Var.C0 = true;
                a2Var.B0 = false;
                break;
            case 24:
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

    public /* synthetic */ b(s0 s0Var, r0 r0Var) {
        this.a = 16;
        this.b = s0Var;
    }

    private final /* synthetic */ void j(float f7, int i10) {
    }

    private final /* synthetic */ void k(float f7, int i10) {
    }
}
