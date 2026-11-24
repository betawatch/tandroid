// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class alc implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ glc b;

    public /* synthetic */ alc(glc glcVar, byte b) {
        this.a = b;
        this.b = glcVar;
    }

    @Override // qac
    public final void a(Object obj) {
        jlc jlcVar;
        int F0;
        byte b = this.a;
        byte b2 = 0;
        glc glcVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                if (glcVar.c == 3 && (jlcVar = glcVar.h) != null) {
                    jlcVar.setBusy(false);
                    if (str != null && !str.trim().isEmpty()) {
                        glcVar.n = str;
                        glcVar.h.r(str);
                        break;
                    }
                }
                break;
            default:
                if (!glcVar.n.trim().isEmpty()) {
                    c cVar = glcVar.b;
                    String trim = glcVar.n.trim();
                    if (!trim.isEmpty() && glcVar.h != null) {
                        gm.r(glcVar.k0);
                        gm.r(glcVar.j0);
                        Drawable drawable = null;
                        if (zze.a == glcVar) {
                            zze.a = null;
                        }
                        vo3 vo3Var = glcVar.f;
                        if (vo3Var != null) {
                            vo3Var.c();
                            glcVar.f = null;
                        }
                        ln3 ln3Var = glcVar.d;
                        if (ln3Var != null) {
                            ln3Var.d();
                            glcVar.d = null;
                        }
                        glcVar.e = null;
                        glcVar.c = (byte) 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        glcVar.h.setListening(false);
                        cVar.e();
                        if (glcVar.H == null) {
                            glcVar.H = trim;
                        }
                        boolean z = obj instanceof vm3;
                        glcVar.h.setStyleLabel(z ? ((vm3) obj).a() : null);
                        jlc jlcVar2 = glcVar.h;
                        ChatActivityEnterView chatActivityEnterView = cVar.a;
                        if (z) {
                            vm3 vm3Var = (vm3) obj;
                            long j = vm3Var.b;
                            if (j != 0) {
                                drawable = vm.m(chatActivityEnterView.R, j, null, 2);
                            } else if (vm3Var.d) {
                                drawable = new hd(chatActivityEnterView.getContext());
                                if (cmb.I.o()) {
                                    F0 = -1;
                                } else {
                                    int i = cmb.F6;
                                    int i2 = ChatActivityEnterView.z7;
                                    F0 = chatActivityEnterView.F0(i);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(F0, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        jlcVar2.setStyleIcon(drawable);
                        glcVar.h.setReview(true);
                        glcVar.h.setBusy(true);
                        cVar.f(obj, glcVar.H, new alc(glcVar, b2));
                        gm.d3(glcVar.I, 400L);
                        break;
                    }
                }
                break;
        }
    }
}
