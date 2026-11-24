// default package

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cs9 implements c39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ cs9(FrameLayout frameLayout, int i, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = i;
    }

    @Override // c39
    public final void d(int i, View view) {
        h19 h19Var;
        TLRPC.Document document;
        byte b = this.a;
        int i2 = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                hs9 hs9Var = (hs9) frameLayout;
                d dVar = hs9Var.H;
                gx0 gx0Var = hs9Var.c;
                k27 E = gx0Var.E(i);
                if (E != null) {
                    if (!hs9Var.J.t()) {
                        if (view instanceof es9) {
                            iba ibaVar = ((es9) view).a;
                            k27 message = ibaVar.getMessage();
                            TLRPC.Document F0 = message.F0();
                            if (ibaVar.H) {
                                if (message.g4() || k27.Q4(message.k)) {
                                    MediaController.w().R(message);
                                    break;
                                } else {
                                    boolean x = message.x();
                                    if (!x) {
                                        TLRPC.Message message2 = message.k;
                                        boolean z = message2 != null && message2.noforwards;
                                        TLRPC.Chat K0 = E.k.peer_id.channel_id != 0 ? na7.q1(y6c.t0).K0(Long.valueOf(E.k.peer_id.channel_id)) : null;
                                        if (K0 == null) {
                                            K0 = E.k.peer_id.chat_id != 0 ? na7.q1(y6c.t0).K0(Long.valueOf(E.k.peer_id.chat_id)) : null;
                                        }
                                        if (K0 != null) {
                                            z = K0.noforwards;
                                        }
                                        x = x || z;
                                    }
                                    if (x) {
                                        PhotoViewer.r0().T1(null, dVar, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.r0().T1(null, dVar, null);
                                        PhotoViewer.r0().j1(arrayList, 0, 0L, 0L, 0L, new i98());
                                        break;
                                    } else {
                                        gl.q2(message, hs9Var.G, dVar);
                                    }
                                }
                            } else if (ibaVar.G) {
                                ba4.G(j5.a(y6c.t0).a).f(F0);
                                ibaVar.f(true);
                            } else {
                                E.P = true;
                                ba4.G(j5.a(y6c.t0).a).X(F0, E, 0, 0);
                                ibaVar.f(true);
                                up3.q(i2).y();
                            }
                            hs9Var.d(true);
                        }
                        if (view instanceof eba) {
                            ((eba) view).a();
                            break;
                        }
                    } else {
                        hs9Var.J.f(E, view, 0);
                        se4 se4Var = hs9Var.K;
                        int e1 = E.e1();
                        se4Var.a = k27.B0(E.k);
                        se4Var.b = e1;
                        gx0Var.g(i);
                        if (!hs9Var.J.t()) {
                            gx0Var.l(0, ((hs9) gx0Var.d).r);
                            break;
                        }
                    }
                }
                break;
            default:
                tx9 tx9Var = (tx9) frameLayout;
                try {
                    if (!(view instanceof dx9)) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof yw9)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                tx9Var.h(i, (yw9) view);
                                if (i2 != 1 && i2 != 11) {
                                    tx9Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            tx9Var.n(view, null);
                            if (i2 != 1 && i2 != 11) {
                                tx9Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        dx9 dx9Var = (dx9) view;
                        if (dx9Var.s || (((h19Var = dx9Var.y) != null && h19Var.a) || i2 == 13 || i2 == 14)) {
                            tx9Var.k();
                            tx9Var.q(dx9Var, dx9Var.y);
                        } else if (!dx9Var.R || (document = dx9Var.d) == null) {
                            tx9Var.n(dx9Var, dx9Var.e);
                        } else if (tx9Var.a0 == 6) {
                            tx9Var.o(dx9Var, Long.valueOf(document.id), document, dx9Var.w, null);
                        } else {
                            tx9Var.o(dx9Var, null, document, dx9Var.w, null);
                        }
                        if (i2 != 1 && i2 != 11) {
                            tx9Var.performHapticFeedback(3, 1);
                        }
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
