// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.ffmpeg.FfmpegAudioDecoder;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.WriteToSocketDelegate;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lu3 implements h69, n7, ncc, fd, b86, dz7, on5, t93, WriteToSocketDelegate, l8, o69, OnTokenCanceledListener, mi0, ta9, t69, OnSuccessListener, nr7, sy4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lu3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        ((hw4) this.b).q1.j(l2dVar);
        return l2d.b;
    }

    @Override // dz7
    public final void a(fz7 fz7Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.y;
        xea.B = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s ? 1 : 0);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.e0();
        if (hl.O1()) {
            externalActionActivity.d.e0();
        }
        jn7.e().k(jn7.o0, fz7Var);
    }

    @Override // t93
    public final void b(u93 u93Var) {
        ((FfmpegAudioDecoder) this.b).o((SimpleDecoderOutputBuffer) u93Var);
    }

    @Override // mi0
    public final long c(long j) {
        return gcc.j((j * r8.e) / 1000000, 0L, ((gk4) this.b).j - 1);
    }

    @Override // t69
    public final boolean e(int i, View view) {
        wt4 wt4Var = (wt4) this.b;
        ArrayList arrayList = wt4Var.c0;
        ArrayList arrayList2 = wt4Var.i0;
        if (i < 2 || wt4Var.a0 == null || !(view instanceof st4)) {
            return false;
        }
        int i2 = i - 2;
        if (wt4Var.d0) {
            if (i2 == 0) {
                return false;
            }
            i2 = i - 3;
        } else if (wt4Var.e0) {
            if (i2 >= 0 && i2 < arrayList.size()) {
                return false;
            }
            i2 -= arrayList.size();
        }
        if (i2 < 0 || i2 >= wt4Var.g0.size()) {
            return false;
        }
        no6 no6Var = (no6) wt4Var.g0.get(i2);
        if (!arrayList2.isEmpty() || wt4Var.R) {
            return false;
        }
        if (arrayList2.contains(no6Var)) {
            arrayList2.remove(no6Var);
        } else {
            if (arrayList2.size() + 1 > wt4Var.S) {
                int i3 = -wt4Var.O;
                wt4Var.O = i3;
                hl.A3(i3, view, null);
                yw0.E.a();
                return true;
            }
            arrayList2.add(no6Var);
        }
        hl.V3(wt4Var.d);
        wt4Var.j();
        return true;
    }

    @Override // h69
    public final void f() {
        ((dw3) this.b).invalidate();
    }

    @Override // n7
    public final void g(int i) {
        ArrayList arrayList;
        String str;
        ly3 ly3Var = (ly3) this.b;
        Pattern pattern = ly3.P1;
        e eVar = ly3Var.m1;
        xx3 xx3Var = ly3Var.o1;
        if (xx3Var == null || (arrayList = xx3Var.b) == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) xx3Var.b.get(0);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + uc7.s1(ly3Var.a).N2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
        } else {
            str = "https://" + uc7.s1(ly3Var.a).N2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
        }
        String str2 = str;
        if (i != 1) {
            if (i == 2) {
                try {
                    hl.g(str2);
                    new d31((FrameLayout) ly3Var.b, ly3Var.J0).k(false).j();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            }
            return;
        }
        Context parentActivity = eVar != null ? eVar.getParentActivity() : null;
        if (parentActivity == null) {
            parentActivity = ly3Var.getContext();
        }
        ay3 ay3Var = new ay3(ly3Var, parentActivity, str2, str2, ly3Var.J0);
        if (eVar != null) {
            eVar.showDialog(ay3Var);
        } else {
            ay3Var.show();
        }
    }

    @Override // sy4
    public final int h() {
        return aob.v0(aob.a7, ((bx4) this.b).J0);
    }

    @Override // b86
    public final void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                ((bg8) obj).B((nt6) obj2);
                break;
            case 8:
                ((bg8) obj).l((oz) obj2);
                break;
            case 9:
                ((bg8) obj).m((c2c) obj2);
                break;
            case 10:
                ((bg8) obj).x((n43) obj2);
                break;
            case 11:
                ((bg8) obj).B(((n64) obj2).a.Q);
                break;
            case 12:
                ((bg8) obj).L((uf7) obj2);
                break;
            default:
                ((bg8) obj).G((j99) obj2);
                break;
        }
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        float f;
        TLRPC.StickerSet stickerSet2;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 3:
                o14 o14Var = (o14) obj3;
                b8c b8cVar = (b8c) obj;
                View view = (View) obj2;
                j14 j14Var = o14Var.c;
                o24 o24Var = o14Var.G;
                fm0 fm0Var = o24Var.b;
                Object obj4 = b8cVar.H;
                if (obj4 instanceof TLRPC.StickerSetCovered) {
                    h14 h14Var = (h14) b8cVar.I;
                    long j = o14Var.d;
                    TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj4).set;
                    long j2 = stickerSet3.id;
                    if (j == j2) {
                        o14Var.d = 0L;
                        stickerSet3 = null;
                    } else {
                        o14Var.d = j2;
                        o14Var.f = h14Var.d;
                        o14Var.e = stickerSet3;
                    }
                    stickerSet = stickerSet3;
                } else {
                    if (obj4 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj4;
                        long j3 = o14Var.d;
                        TLRPC.StickerSet stickerSet4 = tL_messages_stickerSet.set;
                        long j4 = stickerSet4.id;
                        if (j3 == j4) {
                            o14Var.d = 0L;
                        } else {
                            o14Var.d = j4;
                            o14Var.f = tL_messages_stickerSet.documents;
                            o14Var.e = stickerSet4;
                            stickerSet = stickerSet4;
                        }
                    }
                    stickerSet = null;
                }
                int childCount = j14Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    ap4 ap4Var = (ap4) j14Var.getChildAt(i);
                    if (ap4Var != view) {
                        ap4Var.a(false, true);
                    }
                }
                if (o14Var.d != 0 && o14Var.f.size() < o14Var.e.count) {
                    ls6 d0 = ls6.d0(o24Var.d1);
                    TLRPC.StickerSet stickerSet5 = o14Var.e;
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    tL_inputStickerSetID.id = stickerSet5.id;
                    tL_inputStickerSetID.access_hash = stickerSet5.access_hash;
                    TLRPC.TL_messages_stickerSet n0 = d0.n0(tL_inputStickerSetID, false);
                    if (n0 != null) {
                        o14Var.f = n0.documents;
                    }
                }
                TLObject tLObject = (TLObject) b8cVar.H;
                zo4 zo4Var = o24Var.M;
                ArrayList arrayList = o14Var.f;
                o24Var.I(zo4Var, tLObject, stickerSet, (arrayList == null || arrayList.isEmpty()) ? null : (TLRPC.Document) o14Var.f.get(0), true, fm0Var.e > 0.0f);
                ((ap4) view).a(o14Var.d != 0, true);
                fm0Var.a(o14Var.d != 0, true);
                o14Var.f();
                o24Var.W.a();
                if (o14Var.d != 0) {
                    j14Var.M1(view);
                    break;
                }
                break;
            case 4:
            default:
                h34 h34Var = (h34) obj3;
                View view2 = (View) obj2;
                if (((b8c) obj).d == 1 && h34Var.b != null) {
                    boolean z = !h34Var.c;
                    h34Var.c = z;
                    qo0 qo0Var = h34Var.h;
                    if (qo0Var != null) {
                        qo0Var.a(Boolean.valueOf(z), Boolean.valueOf(h34Var.d), Boolean.valueOf(h34Var.e));
                    }
                    ((wkb) view2).setChecked(h34Var.c);
                    h34Var.f.g3.O(true);
                    break;
                }
                break;
            case 5:
                j24 j24Var = (j24) obj3;
                b8c b8cVar2 = (b8c) obj;
                View view3 = (View) obj2;
                j14 j14Var2 = j24Var.c;
                o24 o24Var2 = j24Var.R;
                fm0 fm0Var2 = o24Var2.a;
                Object obj5 = b8cVar2.H;
                if (obj5 instanceof TLRPC.StickerSetCovered) {
                    h14 h14Var2 = (h14) b8cVar2.I;
                    long j5 = j24Var.d;
                    TLRPC.StickerSet stickerSet6 = ((TLRPC.StickerSetCovered) obj5).set;
                    f = 0.0f;
                    long j6 = stickerSet6.id;
                    if (j5 == j6) {
                        j24Var.d = 0L;
                        stickerSet6 = null;
                    } else {
                        j24Var.d = j6;
                        j24Var.f = h14Var2.d;
                        j24Var.e = stickerSet6;
                    }
                    stickerSet2 = stickerSet6;
                } else {
                    f = 0.0f;
                    if (obj5 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj5;
                        long j7 = j24Var.d;
                        stickerSet2 = tL_messages_stickerSet2.set;
                        long j8 = stickerSet2.id;
                        if (j7 == j8) {
                            j24Var.d = 0L;
                        } else {
                            j24Var.d = j8;
                            j24Var.f = tL_messages_stickerSet2.documents;
                            j24Var.e = stickerSet2;
                        }
                    }
                    stickerSet2 = null;
                }
                int childCount2 = j14Var2.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    ap4 ap4Var2 = (ap4) j14Var2.getChildAt(i2);
                    if (ap4Var2 != view3) {
                        ap4Var2.a(false, true);
                    }
                }
                if (j24Var.d != 0 && j24Var.f.size() < j24Var.e.count) {
                    ls6 d02 = ls6.d0(o24Var2.d1);
                    TLRPC.StickerSet stickerSet7 = j24Var.e;
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                    tL_inputStickerSetID2.id = stickerSet7.id;
                    tL_inputStickerSetID2.access_hash = stickerSet7.access_hash;
                    TLRPC.TL_messages_stickerSet n02 = d02.n0(tL_inputStickerSetID2, false);
                    if (n02 != null) {
                        j24Var.f = n02.documents;
                    }
                }
                TLObject tLObject2 = (TLObject) b8cVar2.H;
                zo4 zo4Var2 = o24Var2.O;
                ArrayList arrayList2 = j24Var.f;
                o24Var2.I(zo4Var2, tLObject2, stickerSet2, (arrayList2 == null || arrayList2.isEmpty()) ? null : (TLRPC.Document) j24Var.f.get(0), false, fm0Var2.e > f);
                ((ap4) view3).a(j24Var.d != 0, true);
                fm0Var2.a(j24Var.d != 0, true);
                j24Var.f();
                o24Var2.H0.a();
                if (j24Var.d != 0) {
                    j14Var2.M1(view3);
                    break;
                }
                break;
        }
    }

    @Override // ta9
    public final void n(long j, ey7 ey7Var) {
        ivd.a(j, ey7Var, ((hr4) this.b).K);
    }

    @Override // l8
    public final void o(KeyEvent keyEvent) {
        he4 he4Var = (he4) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && he4Var.y.isShowing()) {
            he4Var.y.d(true);
        }
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        Runnable runnable = ((Runnable[]) this.b)[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((m13) this.b).invoke(obj);
    }

    @Override // org.telegram.tgnet.WriteToSocketDelegate
    public final void run() {
        Utilities.d.c(new jd4((nd4) this.b, (byte) 3));
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        v94 v94Var = (v94) this.b;
        if (!z || z2 || v94Var.R < 1.0f) {
            return;
        }
        v94Var.post(new lw3((Object) v94Var, (byte) 13));
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ls6 d0 = ls6.d0(((g24) obj).w.d1);
                d0.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new fp6(d0, (byte) 2));
                break;
            case 23:
                ((ze7) obj).run();
                break;
            default:
                ((by4) obj).F0();
                break;
        }
    }

    @Override // o69
    public final int run() {
        return ((FiltersSetupActivity) this.b).x;
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }
}
