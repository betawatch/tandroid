package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.xs;
import org.telegram.messenger.zb;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fw;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dk0;
import org.telegram.ui.gd0;
import org.telegram.ui.hf0;
import org.telegram.ui.io;
import org.telegram.ui.la;
import org.telegram.ui.m21;
import org.telegram.ui.ml0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ k5(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = 0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.o(14));
                break;
            case 1:
                Comparator comparator = p6.X;
                break;
            case 2:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(i7));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(i7));
                break;
            case 4:
                int[] iArr = hi.d1.b0;
                break;
            case 5:
                org.telegram.messenger.g0.g3(new ai.o(21));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new ai.o(21));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new ai.o(21));
                break;
            case 8:
                org.telegram.messenger.q5 q5Var = org.telegram.messenger.f4.s;
                break;
            case 9:
                break;
            case 10:
                int i10 = zb.i;
                break;
            case 11:
                Pattern pattern = ri.U1;
                break;
            case 12:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.a(tL_error, 25));
                break;
            case 13:
                int i11 = mp.I8;
                break;
            case 14:
                String str = xs.k0;
                break;
            case 15:
                Paint paint = la.I;
                break;
            case 16:
                int i12 = io.j3;
                break;
            case 17:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(i7));
                break;
            case 18:
                Pattern pattern2 = org.telegram.ui.Components.b5.a;
                break;
            case 19:
                int i13 = fw.I0;
                break;
            case 20:
                int i14 = pz.H0;
                break;
            case 21:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(i7));
                break;
            case 22:
                int i15 = uy0.e;
                break;
            case 23:
                int i16 = gd0.w0;
                break;
            case 24:
                org.telegram.messenger.g0.g3(new hf0(tLObject, 5));
                break;
            case 25:
                int i17 = dk0.S;
                break;
            case 26:
                List list = ml0.h1;
                break;
            case 27:
                RectF rectF = ProfileActivity.Z6;
                break;
            default:
                int i18 = m21.p1;
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
