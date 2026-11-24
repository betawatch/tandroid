// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ajc implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gjc b;

    public /* synthetic */ ajc(gjc gjcVar, byte b) {
        this.a = b;
        this.b = gjcVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        jjc jjcVar;
        int F0;
        byte b = this.a;
        byte b2 = 0;
        gjc gjcVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                if (gjcVar.c == 3 && (jjcVar = gjcVar.h) != null) {
                    jjcVar.setBusy(false);
                    if (str != null && !str.trim().isEmpty()) {
                        gjcVar.n = str;
                        gjcVar.h.r(str);
                        break;
                    }
                }
                break;
            default:
                if (!gjcVar.n.trim().isEmpty()) {
                    c cVar = gjcVar.b;
                    String trim = gjcVar.n.trim();
                    if (!trim.isEmpty() && gjcVar.h != null) {
                        gl.r(gjcVar.k0);
                        gl.r(gjcVar.j0);
                        Drawable drawable = null;
                        if (xxe.a == gjcVar) {
                            xxe.a = null;
                        }
                        ln3 ln3Var = gjcVar.f;
                        if (ln3Var != null) {
                            ln3Var.c();
                            gjcVar.f = null;
                        }
                        am3 am3Var = gjcVar.d;
                        if (am3Var != null) {
                            am3Var.d();
                            gjcVar.d = null;
                        }
                        gjcVar.e = null;
                        gjcVar.c = (byte) 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        gjcVar.h.setListening(false);
                        cVar.e();
                        if (gjcVar.H == null) {
                            gjcVar.H = trim;
                        }
                        boolean z = obj instanceof kl3;
                        gjcVar.h.setStyleLabel(z ? ((kl3) obj).a() : null);
                        jjc jjcVar2 = gjcVar.h;
                        ChatActivityEnterView chatActivityEnterView = cVar.a;
                        if (z) {
                            kl3 kl3Var = (kl3) obj;
                            long j = kl3Var.b;
                            if (j != 0) {
                                drawable = vl.m(chatActivityEnterView.R, j, null, 2);
                            } else if (kl3Var.d) {
                                drawable = new gc(chatActivityEnterView.getContext());
                                if (bkb.I.o()) {
                                    F0 = -1;
                                } else {
                                    int i = bkb.F6;
                                    int i2 = ChatActivityEnterView.r7;
                                    F0 = chatActivityEnterView.F0(i);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(F0, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        jjcVar2.setStyleIcon(drawable);
                        gjcVar.h.setReview(true);
                        gjcVar.h.setBusy(true);
                        cVar.f(obj, gjcVar.H, new ajc(gjcVar, b2));
                        gl.e3(gjcVar.I, 400L);
                        break;
                    }
                }
                break;
        }
    }
}
