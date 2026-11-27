// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class mnc implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ snc b;

    public /* synthetic */ mnc(snc sncVar, byte b) {
        this.a = b;
        this.b = sncVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        vnc vncVar;
        int J0;
        byte b = this.a;
        byte b2 = 0;
        snc sncVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                if (sncVar.c == 3 && (vncVar = sncVar.h) != null) {
                    vncVar.setBusy(false);
                    if (str != null && !str.trim().isEmpty()) {
                        sncVar.n = str;
                        sncVar.h.r(str);
                        break;
                    }
                }
                break;
            default:
                if (!sncVar.n.trim().isEmpty()) {
                    c cVar = sncVar.b;
                    String trim = sncVar.n.trim();
                    if (!trim.isEmpty() && sncVar.h != null) {
                        hl.r(sncVar.m0);
                        hl.r(sncVar.l0);
                        Drawable drawable = null;
                        if (r2f.a == sncVar) {
                            r2f.a = null;
                        }
                        co3 co3Var = sncVar.f;
                        if (co3Var != null) {
                            co3Var.c();
                            sncVar.f = null;
                        }
                        sm3 sm3Var = sncVar.d;
                        if (sm3Var != null) {
                            sm3Var.d();
                            sncVar.d = null;
                        }
                        sncVar.e = null;
                        sncVar.c = (byte) 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        sncVar.h.setListening(false);
                        cVar.e();
                        if (sncVar.H == null) {
                            sncVar.H = trim;
                        }
                        boolean z = obj instanceof cm3;
                        sncVar.h.setStyleLabel(z ? ((cm3) obj).a() : null);
                        vnc vncVar2 = sncVar.h;
                        ChatActivityEnterView chatActivityEnterView = cVar.a;
                        if (z) {
                            cm3 cm3Var = (cm3) obj;
                            long j = cm3Var.b;
                            if (j != 0) {
                                drawable = wl.m(chatActivityEnterView.R, j, null, 2);
                            } else if (cm3Var.d) {
                                drawable = new hc(chatActivityEnterView.getContext());
                                if (aob.I.o()) {
                                    J0 = -1;
                                } else {
                                    int i = aob.G6;
                                    int i2 = ChatActivityEnterView.X7;
                                    J0 = chatActivityEnterView.J0(i);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(J0, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        vncVar2.setStyleIcon(drawable);
                        sncVar.h.setReview(true);
                        sncVar.h.setBusy(true);
                        cVar.f(obj, sncVar.H, new mnc(sncVar, b2));
                        hl.d3(sncVar.I, 400L);
                        break;
                    }
                }
                break;
        }
    }
}
