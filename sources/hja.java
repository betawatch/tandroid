// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class hja implements on5, ovc, jcc, yv4, ay2, s84, ncc, z28, nf0, OnSuccessListener, fd, fcb, rpa, CameraController.VideoTakeCallback, nr7, ot2, Vector.TLDeserializer, uka {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hja(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        lcb lcbVar = (lcb) this.b;
        mq5 H0 = hl.H0(l2dVar, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lcbVar.w.getLayoutParams();
        marginLayoutParams.topMargin = lcbVar.c ? 0 : l2dVar.d();
        marginLayoutParams.bottomMargin = lcbVar.c ? l2dVar.a.f(2).d : l2dVar.a();
        marginLayoutParams.leftMargin = H0.a;
        marginLayoutParams.rightMargin = H0.c;
        zbb zbbVar = lcbVar.s;
        if (zbbVar != null) {
            zbbVar.requestLayout();
        }
        acb acbVar = lcbVar.w;
        if (acbVar != null) {
            acbVar.requestLayout();
        }
        return l2d.b;
    }

    @Override // yv4
    public final void a(Canvas canvas) {
        woa woaVar = (woa) this.b;
        canvas.save();
        canvas.translate(woaVar.a.getX(), woaVar.a.getY());
        woaVar.a.draw(canvas);
        canvas.restore();
    }

    @Override // ot2
    public final void accept(Object obj) {
        ((mo5) this.b).c((p43) obj);
    }

    @Override // uka
    public final float b(RecyclerView recyclerView) {
        return wka.j(recyclerView);
    }

    @Override // z28
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                icc iccVar = (icc) obj;
                if (i != 1) {
                    if (i != 3) {
                        iccVar.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    iccVar.a(Boolean.TRUE, null);
                    break;
                }
                break;
            case 8:
                iv4 iv4Var = (iv4) obj;
                if (i != 1) {
                    if (i != 3) {
                        iv4Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    iv4Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                qe2 qe2Var = (qe2) obj;
                if (i != 1) {
                    if (i != 3) {
                        qe2Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    qe2Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // rpa
    public final void d(npa npaVar, float f, float f2) {
        e7b e7bVar = (e7b) this.b;
        if (e7bVar.v.y) {
            return;
        }
        npaVar.q = new d7b(e7bVar, (byte) 2);
        float sqrt = (float) Math.sqrt(Math.pow(r0.getHeight(), 2.0d) + Math.pow(r0.getWidth(), 2.0d));
        ArrayList arrayList = e7bVar.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((npa) obj).j(f, f2, sqrt, false);
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 24:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) obj).lambda$readParams$0(inputSerializedData, i, z);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) obj).lambda$readParams$0(inputSerializedData, i, z);
                return lambda$readParams$02;
        }
    }

    @Override // ovc
    public final void e(int i, int i2) {
        wma wmaVar = (wma) this.b;
        wmaVar.x = i;
        wmaVar.y = i2;
        nf9 nf9Var = wmaVar.M;
        if (nf9Var != null) {
            nf9Var.invalidate();
        }
    }

    @Override // fcb
    public final void f(float f, Canvas canvas, RectF rectF, boolean z) {
        Path path = (Path) this.b;
        if (z) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f, 2.0d);
        path.addCircle((rectF.right + hl.L(7.0f)) - (hl.L(14.0f) * pow), (rectF.bottom + hl.L(7.0f)) - (hl.L(14.0f) * pow), hl.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // jcc
    public final Object g(Integer num, Object obj) {
        return (CharSequence) ((sb) this.b).a((Integer) obj);
    }

    @Override // uka
    public final RecyclerView h(View view) {
        ((mza) this.b).getClass();
        return ((kza) view).a;
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        e S;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 6:
                ((jxa) obj3).S((ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                break;
            case 10:
                kza kzaVar = (kza) obj3;
                b8c b8cVar = (b8c) obj;
                Object obj4 = b8cVar.H;
                if (!(obj4 instanceof TL_stars.StarsTransaction)) {
                    if ((obj4 instanceof TL_wallet.walletTransaction) && (S = LaunchActivity.S()) != null) {
                        S.presentFragment(new uqc());
                        break;
                    }
                } else {
                    nza.l1(kzaVar.getContext(), false, 0L, kzaVar.c, (TL_stars.StarsTransaction) b8cVar.H, kzaVar.b);
                    break;
                }
                break;
            case 23:
                ((bfb) obj3).Z((b8c) obj);
                break;
            default:
                ((vsb) obj3).Z((b8c) obj, (View) obj2);
                break;
        }
    }

    @Override // ay2
    public final void l(long j) {
        ((kua) this.b).f();
    }

    @Override // uka
    public final /* synthetic */ void o(RecyclerView recyclerView) {
        uh9.d(recyclerView);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public final void onFinishVideoRecording(String str, long j) {
        sab sabVar = (sab) this.b;
        sbb sbbVar = sabVar.a;
        u59 u59Var = sbbVar.P0;
        int i = sbbVar.c;
        if (u59Var != null) {
            u59Var.g(true);
        }
        if (sbbVar.p0()) {
            sbbVar.s.d();
        }
        if (sbbVar.H1 == null || sbbVar.C0 == null) {
            return;
        }
        sbbVar.R1 = false;
        sbbVar.S1 = false;
        oy8 oy8Var = sbbVar.D0;
        if (oy8Var != null) {
            oy8Var.f(false);
        }
        if (j <= 800) {
            sbbVar.e(false, true);
            sbbVar.c0(false);
            sbbVar.K0.b(false, true);
            u59 u59Var2 = sbbVar.P0;
            if (u59Var2 != null) {
                u59Var2.g(true);
            }
            try {
                sbbVar.H1.delete();
                sbbVar.H1 = null;
            } catch (Exception e) {
                cc4.g(e, true);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            }
            return;
        }
        sbbVar.h0(false, true);
        c8b o = c8b.o(sbbVar.H1, str, j);
        o.J0 = sbbVar.w0;
        o.K0 = sbbVar.x0;
        o.A();
        sbbVar.e(false, true);
        sbbVar.c0(false);
        sbbVar.K0.b(false, true);
        u59 u59Var3 = sbbVar.P0;
        if (u59Var3 != null) {
            u59Var3.g(true);
        }
        if (!sbbVar.B0.i()) {
            sbbVar.L1 = o;
            y9b.a(i, o);
            sbbVar.M1 = false;
            int videoWidth = sbbVar.C0.getVideoWidth();
            int videoHeight = sbbVar.C0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                c8b c8bVar = sbbVar.L1;
                c8bVar.k0 = videoWidth;
                c8bVar.l0 = videoHeight;
                c8bVar.z();
            }
            sbbVar.J(new qab(sabVar, (byte) 3), 0L);
            return;
        }
        sbbVar.H1 = null;
        o.P = 1.0f;
        if (sbbVar.B0.l(o)) {
            c8b a = c8b.a(sbbVar.B0.getLayout(), sbbVar.B0.getContent());
            sbbVar.L1 = a;
            y9b.a(i, a);
            sbbVar.M1 = false;
            int videoWidth2 = sbbVar.C0.getVideoWidth();
            int videoHeight2 = sbbVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                c8b c8bVar2 = sbbVar.L1;
                c8bVar2.k0 = videoWidth2;
                c8bVar2.l0 = videoHeight2;
                c8bVar2.z();
            }
        }
        sbbVar.l0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 12:
                i61 i61Var = (i61) obj2;
                beb bebVar = (beb) obj;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < bebVar.a.size(); i++) {
                    aeb aebVar = (aeb) bebVar.a.get(i);
                    j3b j3bVar = new j3b();
                    j3bVar.a = aebVar.a;
                    j3bVar.b = aebVar.d;
                    j3bVar.c = aebVar.e;
                    j3bVar.d = aebVar.b;
                    j3bVar.e = aebVar.c;
                    arrayList.add(j3bVar);
                }
                i61Var.a(arrayList);
                break;
            default:
                k3b k3bVar = (k3b) obj2;
                List list = (List) obj;
                if (list.size() <= 0) {
                    cc4.b("objimg: no objects");
                    break;
                } else {
                    int i2 = ((im5) list.get(0)).c;
                    String[] strArr = sue.a;
                    String str = null;
                    if (strArr == null) {
                        strArr = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                        sue.a = strArr;
                    }
                    if (i2 >= 0 && i2 < strArr.length) {
                        str = strArr[i2];
                    }
                    k3bVar.d0 = str;
                    StringBuilder sb = new StringBuilder("objimg: detected #");
                    sb.append(((im5) list.get(0)).c);
                    sb.append(" ");
                    sb.append(k3bVar.d0);
                    sb.append(" ");
                    uh9.s(((im5) list.get(0)).a, sb);
                    pv3.g(k3bVar.d0);
                    break;
                }
                break;
        }
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        View view = ((yua) this.b).b;
        if (view instanceof dl1) {
            ((dl1) view).V();
        } else {
            view.invalidate();
        }
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        int v;
        r47 r47Var;
        b29 y;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                jja jjaVar = (jja) obj;
                ImageReceiver imageReceiver2 = jjaVar.d;
                ImageReceiver imageReceiver3 = jjaVar.c;
                if (z && !z2 && (r47Var = jjaVar.n) != null && r47Var.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.f0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z && !z2 && jjaVar.x0 && imageReceiver3.n() != null) {
                    int I0 = hl.I0(imageReceiver3.n());
                    jjaVar.a = I0;
                    CheckBoxBase checkBoxBase = jjaVar.Q;
                    if (checkBoxBase != null && checkBoxBase.x != (v = aob.v(I0, aob.p1(0.25f, -1)))) {
                        checkBoxBase.x = v;
                        checkBoxBase.b();
                        break;
                    }
                }
                break;
            default:
                w3b w3bVar = (w3b) obj;
                if (z && !z2 && (y = imageReceiver.y()) != null) {
                    w3bVar.q(y);
                    break;
                }
                break;
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        int i2;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                u4b u4bVar = (u4b) obj;
                u4bVar.e.presentFragment(new StickersActivity(u4bVar.d ? 1 : 0, null));
                idVar.dismiss();
                break;
            case 16:
                hl.t1((v4b) obj);
                idVar.dismiss();
                break;
            case 27:
                ThemeActivity themeActivity = ((kob) obj).a;
                boolean D0 = themeActivity.D0(hl.O1() ? 18 : 16);
                if (themeActivity.C0(17, true)) {
                    D0 = true;
                }
                if (D0) {
                    d0 d0Var = themeActivity.a;
                    i2 = themeActivity.textSizeRow;
                    d0Var.h(i2, new Object());
                    d0 d0Var2 = themeActivity.a;
                    i3 = themeActivity.bubbleRadiusRow;
                    d0Var2.h(i3, new Object());
                }
                if (themeActivity.c != null) {
                    znb O0 = aob.O0("Blue");
                    znb B0 = aob.B0();
                    SparseArray sparseArray = O0.b0;
                    byte b2 = aob.n;
                    ynb ynbVar = (ynb) sparseArray.get(b2);
                    if (ynbVar != null) {
                        unb unbVar = new unb();
                        unbVar.c = "d";
                        unbVar.a = "Blue_99_wp.jpg";
                        unbVar.b = "Blue_99_wp.jpg";
                        ynbVar.y = unbVar;
                        O0.v(unbVar);
                    }
                    if (O0 == B0) {
                        if (O0.Z == b2) {
                            aob.s1(true);
                            break;
                        } else {
                            aob.I1(B0, themeActivity.f == 1, b2, null);
                            themeActivity.a.g(themeActivity.r0);
                            break;
                        }
                    } else {
                        O0.u(b2);
                        aob.x1(O0, true, false, true, false, false);
                        themeActivity.c.C1(O0, null);
                        themeActivity.c.A0(0);
                        break;
                    }
                }
                break;
            default:
                pqb pqbVar = ((tpb) obj).a;
                znb znbVar = pqbVar.g0;
                aob.j0(znbVar, pqbVar.w, true);
                aob.o();
                aob.r1(false, false);
                jn7.e().k(jn7.w4, znbVar, Boolean.valueOf(pqbVar.h0), null, -1);
                pqbVar.finishFragment();
                break;
        }
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
        byte b = this.a;
    }

    private final void m(ImageReceiver imageReceiver) {
    }

    private final void n(ImageReceiver imageReceiver) {
    }

    private final void i(int i, Drawable drawable) {
    }

    private final void j(int i, Drawable drawable) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
