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
import m4.e1;
import m4.k1;
import m4.q;
import m4.x0;
import m4.z;
import m4.z0;
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
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.ar0;
import org.telegram.ui.st0;
import org.telegram.ui.web.a0;
import org.webrtc.GlGenericDrawer;
import p4.r0;
import p4.s0;
import pg.i0;
import pg.v1;
import q9.r;
import qg.c0;
import qg.m2;
import qg.n2;
import qg.o2;
import qg.y1;
import r2.v;
import r2.w;
import w7.m6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements e, z, z0, e2.h, x0, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, n1, z1, i0, v1, j8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, v, t5.b {
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
                return new na.c((Context) cVar.a(Context.class), ((k9.h) cVar.a(k9.h.class)).d(), cVar.x(na.d.class), cVar.c(xa.b.class), (Executor) cVar.i((r) this.b));
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
                ((e1) obj).f((v0) this.b);
                break;
            default:
                ((e1) obj).n((Surface) this.b);
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

    @Override // m4.z
    public void c(q qVar, int i10) {
        qVar.c(i10, (b2.x0) this.b);
    }

    @Override // m4.x0
    public void d(e1 e1Var, m4.r rVar) {
        ((e2.h) this.b).accept(e1Var);
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
        ij0 lottieAnimation;
        o2 o2Var = (o2) this.b;
        if (!z10 || z11 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        o2Var.q(lottieAnimation);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override // pg.v1
    public void e() {
        st0 st0Var = (st0) this.b;
        TextView textView = st0Var.y1;
        boolean a2 = st0Var.F0.a();
        ImageView imageView = st0Var.w1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
        switch (this.a) {
            case 15:
                ((a0) this.b).run();
                break;
            case 20:
                ((ar0) this.b).run();
                break;
            default:
                ((c0) this.b).a.f2.r();
                break;
        }
    }

    @Override // ci.j8
    public Bitmap g(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.b, options);
    }

    @Override // m4.z0
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 2:
                return a0Var.l(rVar, (e9.i0) obj);
            default:
                x0 x0Var = (x0) obj;
                u uVar = u.b;
                if (!a0Var.j()) {
                    x0Var.d(a0Var.t, rVar);
                    a1.O0(a0Var, rVar, i10, new k1(0));
                }
                return u.b;
        }
    }

    @Override // t5.b
    public Object i() {
        s5.h hVar = (s5.h) ((s5.c) this.b);
        hVar.getClass();
        int i10 = o5.a.e;
        t tVar = new t(7, false);
        tVar.c = null;
        tVar.d = new ArrayList();
        tVar.e = null;
        tVar.b = "";
        HashMap hashMap = new HashMap();
        SQLiteDatabase a2 = hVar.a();
        a2.beginTransaction();
        try {
            o5.a aVar = (o5.a) s5.h.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new s50(hVar, hashMap, tVar, 9));
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
                y1 y1Var = (y1) obj2;
                y1Var.C0 = true;
                y1Var.B0 = false;
                break;
            case 24:
                r4 r4Var = (r4) obj2;
                ac.b bVar = (ac.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar.a.size(); i11++) {
                    ac.a aVar = (ac.a) bVar.a.get(i11);
                    m2 m2Var = new m2();
                    m2Var.a = aVar.a;
                    m2Var.b = aVar.d;
                    m2Var.c = aVar.e;
                    m2Var.d = aVar.b;
                    m2Var.e = aVar.c;
                    arrayList.add(m2Var);
                }
                r4Var.run(arrayList);
                break;
            default:
                n2 n2Var = (n2) obj2;
                List list = (List) obj;
                n2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    break;
                } else {
                    int i12 = ((xb.a) list.get(0)).c;
                    String str = null;
                    if (m6.a == null) {
                        m6.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    }
                    if (i12 >= 0) {
                        String[] strArr = m6.a;
                        if (i12 < strArr.length) {
                            str = strArr[i12];
                        }
                    }
                    n2Var.c0 = str;
                    StringBuilder sb2 = new StringBuilder("objimg: detected #");
                    sb2.append(((xb.a) list.get(0)).c);
                    sb2.append(" ");
                    sb2.append(n2Var.c0);
                    sb2.append(" ");
                    e2.t(((xb.a) list.get(0)).a, sb2);
                    Emoji.getEmojiDrawable(n2Var.c0);
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
        AndroidUtilities.runOnUIThread(new wn0(26, uVar, bitmap));
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
