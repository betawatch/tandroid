package k2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Build;
import android.view.ViewGroup;
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
import m4.c1;
import m4.e1;
import m4.f1;
import m4.j1;
import m4.p1;
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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.au0;
import org.telegram.ui.jr0;
import org.webrtc.GlGenericDrawer;
import p4.r0;
import p4.s0;
import pg.u1;
import qg.m2;
import qg.n2;
import qg.o2;
import qg.y1;
import w7.n6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements le.d, li.f, m4.z, e1, c1, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, m1, a2, pg.i0, u1, m8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, r2.v, t5.b {
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
            case 7:
                return new na.c((Context) cVar.a(Context.class), ((k9.h) cVar.a(k9.h.class)).d(), cVar.x(na.d.class), cVar.c(xa.b.class), (Executor) cVar.i((q9.s) this.b));
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

    @Override // r2.v
    public int b(Object obj) {
        b2.s sVar = (b2.s) this.b;
        r2.o oVar = (r2.o) obj;
        String str = oVar.b;
        return ((str.equals(sVar.r) || str.equals(r2.w.b(sVar))) && oVar.c(sVar, false) && oVar.d(sVar)) ? 1 : 0;
    }

    @Override // m4.z
    public void c(m4.q qVar, int i10) {
        qVar.c(i10, (x0) this.b);
    }

    @Override // m4.c1
    public void d(j1 j1Var, m4.r rVar) {
        ((e2.h) this.b).accept(j1Var);
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
        hj0 lottieAnimation;
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

    @Override // pg.u1
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

    @Override // ci.m8
    public Bitmap f(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.b, options);
    }

    @Override // li.f
    public void g(int i10) {
        li.b bVar = (li.b) this.b;
        ah.i iVar = bVar.d;
        if (Build.VERSION.SDK_INT < 31 || iVar == null) {
            return;
        }
        if (w7.d0.a(i10, 4)) {
            mi.a b10 = bVar.a.b();
            ViewGroup viewGroup = bVar.f;
            if (viewGroup != null) {
                b10.b(viewGroup.getY(), bVar.e.getWidth(), bVar.f.getY() + bVar.f.getHeight());
            }
            iVar.h(b10);
        }
        iVar.e(bVar.g, bVar.e.getWidth(), bVar.e.getHeight());
    }

    @Override // m4.e1
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 4:
                return a0Var.l(rVar, (e9.i0) obj);
            default:
                c1 c1Var = (c1) obj;
                i9.u uVar = i9.u.b;
                if (!a0Var.j()) {
                    c1Var.d(a0Var.t, rVar);
                    f1.O0(a0Var, rVar, i10, new p1(0));
                }
                return i9.u.b;
        }
    }

    @Override // t5.b
    public Object i() {
        s5.h hVar = (s5.h) ((s5.c) this.b);
        hVar.getClass();
        int i10 = o5.a.e;
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(7, false);
        tVar.c = null;
        tVar.d = new ArrayList();
        tVar.e = null;
        tVar.b = "";
        HashMap hashMap = new HashMap();
        SQLiteDatabase a2 = hVar.a();
        a2.beginTransaction();
        try {
            o5.a aVar = (o5.a) s5.h.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new r50(hVar, hashMap, tVar, 9));
            a2.setTransactionSuccessful();
            return aVar;
        } finally {
            a2.endTransaction();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(b2 b2Var, int i10) {
        switch (this.a) {
            case 15:
                ((org.telegram.ui.web.b0) this.b).run();
                break;
            case 20:
                ((jr0) this.b).run();
                break;
            default:
                ((qg.c0) this.b).a.f2.r();
                break;
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
                    if (n6.a == null) {
                        n6.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    }
                    if (i12 >= 0) {
                        String[] strArr = n6.a;
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
        AndroidUtilities.runOnUIThread(new wn0(27, uVar, bitmap));
    }

    public /* synthetic */ v(s0 s0Var, r0 r0Var) {
        this.a = 16;
        this.b = s0Var;
    }

    private final /* synthetic */ void j(float f7, int i10) {
    }

    private final /* synthetic */ void l(float f7, int i10) {
    }
}
