package ji;

import ai.e2;
import ai.z;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.messenger.g0;
import org.telegram.messenger.vr;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.rf;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ g(o oVar, int i7) {
        this.a = i7;
        this.b = oVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        r rVar;
        int G0;
        int i7 = 0;
        switch (this.a) {
            case 0:
                o oVar = this.b;
                String str = (String) obj;
                if (oVar.c == 3 && (rVar = oVar.h) != null) {
                    rVar.setBusy(false);
                    if (str != null && !str.trim().isEmpty()) {
                        oVar.n = str;
                        oVar.h.r(str);
                        break;
                    }
                }
                break;
            default:
                o oVar2 = this.b;
                if (!oVar2.n.trim().isEmpty()) {
                    rf rfVar = oVar2.b;
                    String trim = oVar2.n.trim();
                    if (!trim.isEmpty() && oVar2.h != null) {
                        g0.r(oVar2.k0);
                        g0.r(oVar2.j0);
                        Drawable drawable = null;
                        if (vr.k == oVar2) {
                            vr.k = null;
                        }
                        e2 e2Var = oVar2.f;
                        if (e2Var != null) {
                            e2Var.c();
                            oVar2.f = null;
                        }
                        z zVar = oVar2.d;
                        if (zVar != null) {
                            zVar.d();
                            oVar2.d = null;
                        }
                        oVar2.e = null;
                        oVar2.c = 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        oVar2.h.setListening(false);
                        rfVar.e();
                        if (oVar2.H == null) {
                            oVar2.H = trim;
                        }
                        boolean z10 = obj instanceof ai.g;
                        oVar2.h.setStyleLabel(z10 ? ((ai.g) obj).a() : null);
                        r rVar2 = oVar2.h;
                        ChatActivityEnterView chatActivityEnterView = rfVar.a;
                        if (z10) {
                            ai.g gVar = (ai.g) obj;
                            long j3 = gVar.b;
                            if (j3 != 0) {
                                drawable = p5.m(chatActivityEnterView.R, j3, null, 2);
                            } else if (gVar.d) {
                                drawable = new v2(chatActivityEnterView.getContext());
                                if (m6.I.q()) {
                                    G0 = -1;
                                } else {
                                    int i10 = m6.G6;
                                    int i11 = ChatActivityEnterView.s7;
                                    G0 = chatActivityEnterView.G0(i10);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        rVar2.setStyleIcon(drawable);
                        oVar2.h.setReview(true);
                        oVar2.h.setBusy(true);
                        rfVar.f(obj, oVar2.H, new g(oVar2, i7));
                        g0.h3(oVar2.I, 400L);
                        break;
                    }
                }
                break;
        }
    }
}
