package k2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Build;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b2.v0;
import ci.i8;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnSuccessListener;
import ei.s4;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m4.a1;
import m4.e1;
import m4.k1;
import m4.x0;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.dr0;
import org.telegram.ui.vt0;
import org.webrtc.GlGenericDrawer;
import p4.r0;
import p4.s0;
import pg.v1;
import qg.m2;
import qg.n2;
import qg.o2;
import qg.x1;
import w7.n6;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements le.d, li.l, m4.z, z0, e2.h, x0, q9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, n1, a2, pg.i0, v1, i8, OnSuccessListener, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q9.d
    public Object E(cf.c cVar) {
        switch (this.a) {
            case 9:
                return new na.c((Context) cVar.a(Context.class), ((k9.h) cVar.a(k9.h.class)).d(), cVar.q(na.d.class), cVar.d(xa.b.class), (Executor) cVar.g((q9.r) this.b));
            default:
                return this.b;
        }
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
        int i11 = this.a;
    }

    @Override // pg.i0
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        switch (this.a) {
            case 1:
                ((Switch) this.b).invalidate();
                break;
            default:
                qh.c.a((qh.c) this.b);
                break;
        }
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 5:
                ((e1) obj).f((v0) this.b);
                break;
            default:
                ((e1) obj).n((Surface) this.b);
                break;
        }
    }

    @Override // m4.z
    public void b(m4.q qVar, int i10) {
        qVar.c(i10, (b2.x0) this.b);
    }

    @Override // m4.x0
    public void c(e1 e1Var, m4.r rVar) {
        ((e2.h) this.b).accept(e1Var);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 11:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kj0 lottieAnimation;
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

    @Override // ci.i8
    public Bitmap f(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.b, options);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 16:
                ((org.telegram.ui.web.b0) this.b).run();
                break;
            case 21:
                ((dr0) this.b).run();
                break;
            default:
                ((qg.b0) this.b).a.f2.r();
                break;
        }
    }

    @Override // m4.z0
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 4:
                return a0Var.l(rVar, (e9.i0) obj);
            default:
                x0 x0Var = (x0) obj;
                i9.u uVar = i9.u.b;
                if (!a0Var.j()) {
                    x0Var.c(a0Var.t, rVar);
                    a1.O0(a0Var, rVar, i10, new k1(0));
                }
                return i9.u.b;
        }
    }

    @Override // pg.v1
    public void j() {
        vt0 vt0Var = (vt0) this.b;
        TextView textView = vt0Var.y1;
        boolean a2 = vt0Var.F0.a();
        ImageView imageView = vt0Var.w1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // li.l
    public void k(int i10) {
        li.a aVar = (li.a) this.b;
        li.p pVar = aVar.a;
        ah.i iVar = aVar.d;
        li.d dVar = aVar.e;
        if (Build.VERSION.SDK_INT < 31 || iVar == null) {
            return;
        }
        if (w7.e0.a(i10, 4) || w7.e0.a(i10, 2)) {
            ni.a e7 = pVar.e();
            ViewGroup viewGroup = aVar.h;
            if (viewGroup != null) {
                e7.b(viewGroup.getY(), aVar.g.getWidth(), aVar.h.getY() + aVar.h.getHeight());
            }
            if (dVar != null) {
                ArrayList arrayList = dVar.a;
                dVar.b = e7.b;
                while (dVar.b > arrayList.size()) {
                    arrayList.add(new li.b(arrayList.size()));
                }
                for (int i11 = 0; i11 < dVar.b; i11++) {
                    li.b bVar = (li.b) arrayList.get(i11);
                    bVar.a.set(e7.c(i11));
                    bVar.b(dVar.j, dVar.k, dVar.l);
                    int i12 = dVar.m;
                    int i13 = dVar.n;
                    int i14 = dVar.o;
                    int i15 = dVar.p;
                    bVar.r = i12;
                    bVar.s = i13;
                    bVar.t = i14;
                    bVar.u = i15;
                }
            }
            iVar.h(e7);
        }
        if (dVar != null) {
            dVar.c = aVar.i;
            dVar.d = aVar.g;
            boolean z10 = pVar.h > 0;
            boolean z11 = !z10;
            if (dVar.i != z11) {
                dVar.i = z11;
                int i16 = !z10 ? 5 : 1;
                dVar.j = i16;
                int i17 = z10 ? 1 : 10;
                dVar.k = i17;
                dVar.l = Math.max(i16, i17);
                for (int i18 = 0; i18 < dVar.b; i18++) {
                    ((li.b) dVar.a.get(i18)).b(dVar.j, dVar.k, dVar.l);
                }
                dVar.f();
            }
            int i19 = pVar.i;
            int i20 = pVar.j;
            dVar.q = i19;
            dVar.r = i20;
            dVar.f();
            dVar.e();
        }
        iVar.e(aVar.i, aVar.g.getWidth(), aVar.g.getHeight());
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
            case 24:
                x1 x1Var = (x1) obj2;
                x1Var.C0 = true;
                x1Var.B0 = false;
                break;
            case 25:
                s4 s4Var = (s4) obj2;
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
                s4Var.run(arrayList);
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
        AndroidUtilities.runOnUIThread(new vo0(25, uVar, bitmap));
    }

    public /* synthetic */ v(s0 s0Var, r0 r0Var) {
        this.a = 17;
        this.b = s0Var;
    }

    private final /* synthetic */ void d(float f7, int i10) {
    }

    private final /* synthetic */ void e(float f7, int i10) {
    }
}
