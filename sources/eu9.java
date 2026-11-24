// default package

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eu9 implements f59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ eu9(FrameLayout frameLayout, int i, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = i;
    }

    @Override // f59
    public final void g(int i, View view) {
        k39 k39Var;
        TLRPC.Document document;
        byte b = this.a;
        int i2 = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                ju9 ju9Var = (ju9) frameLayout;
                d dVar = ju9Var.H;
                ny0 ny0Var = ju9Var.c;
                k47 E = ny0Var.E(i);
                if (E != null) {
                    if (!ju9Var.J.u()) {
                        if (view instanceof gu9) {
                            ida idaVar = ((gu9) view).a;
                            k47 message = idaVar.getMessage();
                            TLRPC.Document F0 = message.F0();
                            if (idaVar.H) {
                                if (message.g4() || k47.Q4(message.k)) {
                                    MediaController.w().R(message);
                                    break;
                                } else {
                                    boolean x = message.x();
                                    if (!x) {
                                        TLRPC.Message message2 = message.k;
                                        boolean z = message2 != null && message2.noforwards;
                                        TLRPC.Chat L0 = E.k.peer_id.channel_id != 0 ? oc7.r1(z8c.t0).L0(Long.valueOf(E.k.peer_id.channel_id)) : null;
                                        if (L0 == null) {
                                            L0 = E.k.peer_id.chat_id != 0 ? oc7.r1(z8c.t0).L0(Long.valueOf(E.k.peer_id.chat_id)) : null;
                                        }
                                        if (L0 != null) {
                                            z = L0.noforwards;
                                        }
                                        x = x || z;
                                    }
                                    if (x) {
                                        PhotoViewer.r0().T1(null, dVar, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.r0().T1(null, dVar, null);
                                        PhotoViewer.r0().n1(arrayList, 0, 0L, 0L, 0L, new jb8());
                                        break;
                                    } else {
                                        gm.q2(message, ju9Var.G, dVar);
                                    }
                                }
                            } else if (idaVar.G) {
                                bc4.G(j5.a(z8c.t0).a).f(F0);
                                idaVar.f(true);
                            } else {
                                E.P = true;
                                bc4.G(j5.a(z8c.t0).a).X(F0, E, 0, 0);
                                idaVar.f(true);
                                er3.q(i2).y();
                            }
                            ju9Var.d(true);
                        }
                        if (view instanceof eda) {
                            ((eda) view).a();
                            break;
                        }
                    } else {
                        ju9Var.J.i(E, view, 0);
                        ug4 ug4Var = ju9Var.K;
                        int e1 = E.e1();
                        ug4Var.a = k47.B0(E.k);
                        ug4Var.b = e1;
                        ny0Var.g(i);
                        if (!ju9Var.J.u()) {
                            ny0Var.l(0, ((ju9) ny0Var.d).r);
                            break;
                        }
                    }
                }
                break;
            default:
                vz9 vz9Var = (vz9) frameLayout;
                try {
                    if (!(view instanceof fz9)) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof az9)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                vz9Var.h(i, (az9) view);
                                if (i2 != 1 && i2 != 11) {
                                    vz9Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            vz9Var.n(view, null);
                            if (i2 != 1 && i2 != 11) {
                                vz9Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        fz9 fz9Var = (fz9) view;
                        if (fz9Var.s || (((k39Var = fz9Var.y) != null && k39Var.a) || i2 == 13 || i2 == 14)) {
                            vz9Var.k();
                            vz9Var.q(fz9Var, fz9Var.y);
                        } else if (!fz9Var.R || (document = fz9Var.d) == null) {
                            vz9Var.n(fz9Var, fz9Var.e);
                        } else if (vz9Var.a0 == 6) {
                            vz9Var.o(fz9Var, Long.valueOf(document.id), document, fz9Var.w, null);
                        } else {
                            vz9Var.o(fz9Var, null, document, fz9Var.w, null);
                        }
                        if (i2 != 1 && i2 != 11) {
                            vz9Var.performHapticFeedback(3, 1);
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
