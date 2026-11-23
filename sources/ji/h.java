package ji;

import ai.v;
import ai.w1;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.messenger.g0;
import org.telegram.messenger.vr;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.qf;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ h(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        q qVar;
        int G0;
        int i7 = 0;
        switch (this.a) {
            case 0:
                n nVar = this.b;
                String str = (String) obj;
                if (nVar.c == 3 && (qVar = nVar.h) != null) {
                    qVar.setBusy(false);
                    if (str != null && !str.trim().isEmpty()) {
                        nVar.n = str;
                        nVar.h.r(str);
                        break;
                    }
                }
                break;
            default:
                n nVar2 = this.b;
                if (!nVar2.n.trim().isEmpty()) {
                    qf qfVar = nVar2.b;
                    String trim = nVar2.n.trim();
                    if (!trim.isEmpty() && nVar2.h != null) {
                        g0.r(nVar2.k0);
                        g0.r(nVar2.j0);
                        Drawable drawable = null;
                        if (vr.k == nVar2) {
                            vr.k = null;
                        }
                        w1 w1Var = nVar2.f;
                        if (w1Var != null) {
                            w1Var.c();
                            nVar2.f = null;
                        }
                        v vVar = nVar2.d;
                        if (vVar != null) {
                            vVar.d();
                            nVar2.d = null;
                        }
                        nVar2.e = null;
                        nVar2.c = 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        nVar2.h.setListening(false);
                        qfVar.e();
                        if (nVar2.H == null) {
                            nVar2.H = trim;
                        }
                        boolean z10 = obj instanceof ai.c;
                        nVar2.h.setStyleLabel(z10 ? ((ai.c) obj).a() : null);
                        q qVar2 = nVar2.h;
                        ChatActivityEnterView chatActivityEnterView = qfVar.a;
                        if (z10) {
                            ai.c cVar = (ai.c) obj;
                            long j3 = cVar.b;
                            if (j3 != 0) {
                                drawable = o5.m(chatActivityEnterView.R, j3, null, 2);
                            } else if (cVar.d) {
                                drawable = new v2(chatActivityEnterView.getContext());
                                if (n6.I.q()) {
                                    G0 = -1;
                                } else {
                                    int i10 = n6.G6;
                                    int i11 = ChatActivityEnterView.s7;
                                    G0 = chatActivityEnterView.G0(i10);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        qVar2.setStyleIcon(drawable);
                        nVar2.h.setReview(true);
                        nVar2.h.setBusy(true);
                        qfVar.f(obj, nVar2.H, new h(nVar2, i7));
                        g0.h3(nVar2.I, 400L);
                        break;
                    }
                }
                break;
        }
    }
}
