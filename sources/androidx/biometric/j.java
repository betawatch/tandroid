package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class j implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ j(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        if (r10 == false) goto L62;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(Object obj) {
        boolean z10;
        int i10 = this.a;
        q qVar = this.b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                if (fVar != null) {
                    int i11 = fVar.a;
                    CharSequence charSequence = fVar.b;
                    switch (i11) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i11 = 8;
                            break;
                    }
                    Context n10 = qVar.n();
                    int i12 = Build.VERSION.SDK_INT;
                    int i13 = 0;
                    if (i12 < 29 && ((i11 == 7 || i11 == 9) && n10 != null)) {
                        KeyguardManager a2 = g0.a(n10);
                        if ((a2 == null ? false : g0.b(a2)) && v7.k.a(qVar.l0.c())) {
                            qVar.S();
                            qVar.l0.d(null);
                            break;
                        }
                    }
                    if (qVar.R()) {
                        if (charSequence == null) {
                            charSequence = v7.n.a(qVar.n(), i11);
                        }
                        if (i11 == 5) {
                            int i14 = qVar.l0.l;
                            if (i14 == 0 || i14 == 3) {
                                qVar.U(i11, charSequence);
                            }
                            qVar.O();
                        } else {
                            if (qVar.l0.w) {
                                qVar.T(i11, charSequence);
                            } else {
                                qVar.W(charSequence);
                                Handler handler = qVar.k0;
                                g gVar = new g(qVar, i11, charSequence, 1);
                                Context n11 = qVar.n();
                                if (n11 != null) {
                                    String str = Build.MODEL;
                                    if (i12 == 28 && str != null) {
                                        for (String str2 : n11.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                            if (str.startsWith(str2)) {
                                                z10 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z10 = false;
                                    break;
                                }
                                i13 = 2000;
                                handler.postDelayed(gVar, i13);
                            }
                            qVar.l0.w = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = qVar.q(R.string.default_error_msg) + " " + i11;
                        }
                        qVar.T(i11, charSequence);
                    }
                    qVar.l0.d(null);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    qVar.N(1);
                    qVar.O();
                    y yVar = qVar.l0;
                    if (yVar.x == null) {
                        yVar.x = new androidx.lifecycle.z();
                    }
                    y.h(yVar.x, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
