// default package

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class hza implements OnSuccessListener, ll5, ed, g8b, ula, CameraController.VideoTakeCallback, no7, us2, n8c, Vector.TLDeserializer, bha, l8, e39, zw5, eja, xcb, g79, yr9, Continuation, q3b {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hza(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        oy8 y;
        boolean z4;
        dcc dccVar;
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                yza yzaVar = (yza) obj;
                if (z && !z2 && (y = imageReceiver.y()) != null) {
                    yzaVar.q(y);
                    break;
                }
                break;
            default:
                ecc eccVar = (ecc) obj;
                ImageReceiver imageReceiver2 = eccVar.R;
                if (z) {
                    if (eccVar.O != null || eccVar.e0 != null) {
                        int L = gl.L(150.0f);
                        x88 x88Var = eccVar.O;
                        if (x88Var != null) {
                            int i5 = (int) eccVar.P;
                            ArrayList arrayList = x88Var.w;
                            int indexOf = arrayList.indexOf(x88Var.b(i5));
                            if (indexOf == -1) {
                                z4 = true;
                                i4 = 0;
                            } else if (indexOf == arrayList.size() - 1) {
                                int videoDuration = x88Var.getVideoDuration() / 1000;
                                z4 = true;
                                i4 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                            } else {
                                z4 = true;
                                i4 = 25;
                            }
                            float q = imageReceiver2.q() / Math.min(i4, 5);
                            float o = imageReceiver2.o() / ((int) Math.ceil(i4 / 5.0f));
                            x88 x88Var2 = eccVar.O;
                            int i6 = (int) eccVar.P;
                            int videoDuration2 = x88Var2.getVideoDuration() / 1000;
                            int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i6)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i6 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i6 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i6 / 5.0f)) % 25 : ((int) Math.ceil(i6 / 10.0f)) % 25, i4 - 1);
                            eccVar.S = (int) ((min % 5) * q);
                            eccVar.T = (int) ((min / 5) * o);
                            i = (int) q;
                            eccVar.U = i;
                            i2 = (int) o;
                            eccVar.V = i2;
                        } else {
                            z4 = true;
                            int i7 = 0;
                            while (true) {
                                if (i7 < eccVar.e0.size()) {
                                    dccVar = (dcc) eccVar.e0.get(i7);
                                    double d = i7 == 0 ? 0.0d : dccVar.a;
                                    double d2 = i7 == eccVar.e0.size() + (-1) ? 9.9999999E7d : ((dcc) eccVar.e0.get(i7 + 1)).a;
                                    double d3 = eccVar.P;
                                    if (d3 < d || d3 > d2) {
                                        i7++;
                                    }
                                } else {
                                    dccVar = null;
                                }
                            }
                            if (dccVar != null) {
                                eccVar.S = dccVar.b;
                                eccVar.T = dccVar.c;
                                i = eccVar.c0;
                                eccVar.U = i;
                                i2 = eccVar.d0;
                                eccVar.V = i2;
                            }
                        }
                        eccVar.Q = z4;
                        float f = i / i2;
                        if (f > 1.0f) {
                            i3 = (int) (L / f);
                        } else {
                            L = (int) (L * f);
                            i3 = L;
                        }
                        ViewGroup.LayoutParams layoutParams = eccVar.getLayoutParams();
                        if (eccVar.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i3) {
                            layoutParams.width = L;
                            layoutParams.height = i3;
                            eccVar.setVisibility(0);
                            eccVar.requestLayout();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override // yr9
    public final vf6 O0() {
        return null;
    }

    @Override // yr9
    public final boolean U1(int i) {
        return true;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        View fragmentView;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                m8b m8bVar = (m8b) obj;
                io5 H0 = gl.H0(vxcVar, false);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) m8bVar.w.getLayoutParams();
                marginLayoutParams.topMargin = m8bVar.c ? 0 : vxcVar.d();
                marginLayoutParams.bottomMargin = m8bVar.c ? vxcVar.a.f(2).d : vxcVar.a();
                marginLayoutParams.leftMargin = H0.a;
                marginLayoutParams.rightMargin = H0.c;
                a8b a8bVar = m8bVar.s;
                if (a8bVar != null) {
                    a8bVar.requestLayout();
                }
                b8b b8bVar = m8bVar.w;
                if (b8bVar != null) {
                    b8bVar.requestLayout();
                }
                break;
            default:
                ah6 ah6Var = (ah6) ((jec) obj);
                io5 H02 = gl.H0(vxcVar, false);
                int i = H02.a;
                ah6Var.N = i;
                int i2 = H02.c;
                ah6Var.O = i2;
                ah6Var.M = H02.d;
                boolean a = ah6Var.E.a();
                int L = a ? gl.L(44.0f) : 0;
                ah6Var.E.setPadding(0, 0, 0, ah6Var.M);
                int L2 = gl.L(72.0f) + ah6Var.M + L;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ah6Var.I.getLayoutParams();
                if (marginLayoutParams2.height != L2) {
                    marginLayoutParams2.height = L2;
                    ah6Var.I.setLayoutParams(marginLayoutParams2);
                }
                int i3 = a ? ah6Var.M + L : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ah6Var.c.getLayoutParams();
                if (marginLayoutParams3.bottomMargin != i3 || marginLayoutParams3.leftMargin != i || marginLayoutParams3.rightMargin != i2) {
                    marginLayoutParams3.leftMargin = i;
                    marginLayoutParams3.rightMargin = i2;
                    marginLayoutParams3.bottomMargin = i3;
                    ah6Var.c.setLayoutParams(marginLayoutParams3);
                }
                ah6Var.F.setPadding(i, 0, i2, ah6Var.M);
                if (a) {
                    vxcVar = vxcVar.a.m(0, 0, 0, ah6Var.M);
                }
                ah6Var.i0();
                ah6Var.h0();
                SparseArray sparseArray = ah6Var.a;
                int size = sparseArray.size();
                while (r0 < size) {
                    hec hecVar = (hec) sparseArray.valueAt(r0);
                    if (hecVar != null && (fragmentView = hecVar.a.getFragmentView()) != null) {
                        jdc.b(fragmentView, vxcVar);
                    }
                    r0++;
                }
                break;
        }
        return vxc.b;
    }

    @Override // zw5
    public final void a(String str) {
        c0c c0cVar = (c0c) this.b;
        c0cVar.Z1 = str;
        c0cVar.e2.O(true);
    }

    @Override // us2
    public final void accept(Object obj) {
        ((jm5) this.b).c((x33) obj);
    }

    @Override // l8
    public final void b() {
        ((jpb) this.b).e();
    }

    @Override // bha
    public final float c(RecyclerView recyclerView) {
        return dha.j(recyclerView);
    }

    @Override // e39
    public final boolean d(int i, View view) {
        ((zsb) this.b).K.d(i, view);
        return true;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) obj).lambda$readParams$0(inputSerializedData, i, z);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) obj).lambda$readParams$0(inputSerializedData, i, z);
                return lambda$readParams$02;
        }
    }

    @Override // ula
    public final void e(qla qlaVar, float f, float f2) {
        i3b i3bVar = (i3b) this.b;
        if (i3bVar.v.y) {
            return;
        }
        qlaVar.q = new h3b(i3bVar, (byte) 2);
        float sqrt = (float) Math.sqrt(Math.pow(r0.getHeight(), 2.0d) + Math.pow(r0.getWidth(), 2.0d));
        ArrayList arrayList = i3bVar.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qla) obj).j(f, f2, sqrt, false);
        }
    }

    @Override // g8b
    public final void g(float f, Canvas canvas, RectF rectF, boolean z) {
        Path path = (Path) this.b;
        if (z) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f, 2.0d);
        path.addCircle((rectF.right + gl.L(7.0f)) - (gl.L(14.0f) * pow), (rectF.bottom + gl.L(7.0f)) - (gl.L(14.0f) * pow), gl.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // q3b
    public final long get() {
        lbc lbcVar = ((c78) this.b).a.G2;
        if (lbcVar != null) {
            return lbcVar.S();
        }
        return 0L;
    }

    @Override // bha
    public final RecyclerView h(View view) {
        ((iva) this.b).getClass();
        return ((gva) view).a;
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 10:
                ((fbb) obj3).Z((c4c) obj);
                break;
            default:
                ((vob) obj3).Z((c4c) obj, (View) obj2);
                break;
        }
    }

    @Override // eja
    public final void k(int i) {
        p8c p8cVar = ((c4c) this.b).D;
        if (p8cVar != null) {
            p8cVar.a(Integer.valueOf(i));
        }
    }

    @Override // xcb
    public final Object m() {
        lo9 lo9Var = (lo9) ((z90) this.b).i;
        SQLiteDatabase a = lo9Var.a();
        a.beginTransaction();
        try {
            a.compileStatement("DELETE FROM log_event_dropped").execute();
            a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + lo9Var.b.e()).execute();
            a.setTransactionSuccessful();
            a.endTransaction();
            return null;
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public final void onFinishVideoRecording(String str, long j) {
        t6b t6bVar = (t6b) this.b;
        t7b t7bVar = t6bVar.a;
        f29 f29Var = t7bVar.P0;
        int i = t7bVar.c;
        if (f29Var != null) {
            f29Var.g(true);
        }
        if (t7bVar.p0()) {
            t7bVar.s.d();
        }
        if (t7bVar.H1 == null || t7bVar.C0 == null) {
            return;
        }
        t7bVar.R1 = false;
        t7bVar.S1 = false;
        dv8 dv8Var = t7bVar.D0;
        if (dv8Var != null) {
            dv8Var.f(false);
        }
        if (j <= 800) {
            t7bVar.e(false, true);
            t7bVar.c0(false);
            t7bVar.K0.b(false, true);
            f29 f29Var2 = t7bVar.P0;
            if (f29Var2 != null) {
                f29Var2.g(true);
            }
            try {
                t7bVar.H1.delete();
                t7bVar.H1 = null;
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            }
            return;
        }
        t7bVar.h0(false, true);
        f4b o = f4b.o(t7bVar.H1, str, j);
        o.J0 = t7bVar.w0;
        o.K0 = t7bVar.x0;
        o.A();
        t7bVar.e(false, true);
        t7bVar.c0(false);
        t7bVar.K0.b(false, true);
        f29 f29Var3 = t7bVar.P0;
        if (f29Var3 != null) {
            f29Var3.g(true);
        }
        if (!t7bVar.B0.i()) {
            t7bVar.L1 = o;
            a6b.a(i, o);
            t7bVar.M1 = false;
            int videoWidth = t7bVar.C0.getVideoWidth();
            int videoHeight = t7bVar.C0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                f4b f4bVar = t7bVar.L1;
                f4bVar.k0 = videoWidth;
                f4bVar.l0 = videoHeight;
                f4bVar.z();
            }
            t7bVar.J(new r6b(t6bVar, (byte) 3), 0L);
            return;
        }
        t7bVar.H1 = null;
        o.P = 1.0f;
        if (t7bVar.B0.l(o)) {
            f4b a = f4b.a(t7bVar.B0.getLayout(), t7bVar.B0.getContent());
            t7bVar.L1 = a;
            a6b.a(i, a);
            t7bVar.M1 = false;
            int videoWidth2 = t7bVar.C0.getVideoWidth();
            int videoHeight2 = t7bVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                f4b f4bVar2 = t7bVar.L1;
                f4bVar2.k0 = videoWidth2;
                f4bVar2.l0 = videoHeight2;
                f4bVar2.z();
            }
        }
        t7bVar.l0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        mza mzaVar = (mza) this.b;
        List list = (List) obj;
        if (list.size() <= 0) {
            fa4.b("objimg: no objects");
            return;
        }
        int i = ((fk5) list.get(0)).c;
        String[] strArr = aqe.a;
        String str = null;
        if (strArr == null) {
            strArr = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
            aqe.a = strArr;
        }
        if (i >= 0 && i < strArr.length) {
            str = strArr[i];
        }
        mzaVar.d0 = str;
        StringBuilder sb = new StringBuilder("objimg: detected #");
        sb.append(((fk5) list.get(0)).c);
        sb.append(" ");
        sb.append(mzaVar.d0);
        sb.append(" ");
        de9.s(((fk5) list.get(0)).a, sb);
        vu3.g(mzaVar.d0);
    }

    @Override // yr9
    public final void r(int i) {
        b8c b8cVar = (b8c) this.b;
        if (b8cVar.h == null && !b8cVar.f.e()) {
            b8cVar.w.f.e(false, true);
        }
        b8cVar.f();
    }

    @Override // g79
    public final void s(long j, xu7 xu7Var) {
        sqd.b(j, xu7Var, ((uv9) this.b).c);
    }

    @Override // bha
    public final /* synthetic */ void t(RecyclerView recyclerView) {
        de9.d(recyclerView);
    }

    @Override // yr9
    public final vf6 t1() {
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        int i2;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                x0b x0bVar = (x0b) obj;
                x0bVar.e.presentFragment(new StickersActivity(x0bVar.d ? 1 : 0, null));
                hdVar.dismiss();
                break;
            case 3:
                gl.t1((y0b) obj);
                hdVar.dismiss();
                break;
            case 14:
                ThemeActivity themeActivity = ((lkb) obj).a;
                boolean C0 = themeActivity.C0(gl.O1() ? 18 : 16);
                if (themeActivity.B0(17, true)) {
                    C0 = true;
                }
                if (C0) {
                    d0 d0Var = themeActivity.a;
                    i2 = themeActivity.textSizeRow;
                    d0Var.h(i2, new Object());
                    d0 d0Var2 = themeActivity.a;
                    i3 = themeActivity.bubbleRadiusRow;
                    d0Var2.h(i3, new Object());
                }
                if (themeActivity.c != null) {
                    akb O0 = bkb.O0("Blue");
                    akb B0 = bkb.B0();
                    SparseArray sparseArray = O0.b0;
                    byte b2 = bkb.n;
                    zjb zjbVar = (zjb) sparseArray.get(b2);
                    if (zjbVar != null) {
                        vjb vjbVar = new vjb();
                        vjbVar.c = "d";
                        vjbVar.a = "Blue_99_wp.jpg";
                        vjbVar.b = "Blue_99_wp.jpg";
                        zjbVar.y = vjbVar;
                        O0.v(vjbVar);
                    }
                    if (O0 == B0) {
                        if (O0.Z == b2) {
                            bkb.s1(true);
                            break;
                        } else {
                            bkb.I1(B0, themeActivity.f == 1, b2, null);
                            themeActivity.a.g(themeActivity.r0);
                            break;
                        }
                    } else {
                        O0.u(b2);
                        bkb.x1(O0, true, false, true, false, false);
                        themeActivity.c.B1(O0, null);
                        themeActivity.c.z0(0);
                        break;
                    }
                }
                break;
            case 15:
                qmb qmbVar = ((ulb) obj).a;
                akb akbVar = qmbVar.g0;
                bkb.j0(akbVar, qmbVar.w, true);
                bkb.o();
                bkb.r1(false, false);
                kk7.e().k(kk7.v4, akbVar, Boolean.valueOf(qmbVar.h0), null, -1);
                qmbVar.finishFragment();
                break;
            default:
                ((n3c) obj).a.I0(true);
                break;
        }
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override // eja
    public final void n() {
    }

    private final void l(ImageReceiver imageReceiver) {
    }

    private final void o(ImageReceiver imageReceiver) {
    }

    @Override // yr9
    public final void m2(ArrayList arrayList) {
    }

    private final void f(int i, Drawable drawable) {
    }

    private final void i(int i, Drawable drawable) {
    }
}
