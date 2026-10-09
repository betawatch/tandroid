package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ i(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        if (r10 == false) goto L62;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(Object obj) {
        boolean z10;
        int i10 = this.a;
        p pVar = this.b;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                if (eVar != null) {
                    int i11 = eVar.a;
                    CharSequence charSequence = eVar.b;
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
                    Context n10 = pVar.n();
                    int i12 = Build.VERSION.SDK_INT;
                    int i13 = 0;
                    if (i12 < 29 && ((i11 == 7 || i11 == 9) && n10 != null)) {
                        KeyguardManager a2 = f0.a(n10);
                        if ((a2 == null ? false : f0.b(a2)) && te.b.b(pVar.l0.c())) {
                            pVar.S();
                            pVar.l0.d(null);
                            break;
                        }
                    }
                    if (pVar.R()) {
                        if (charSequence == null) {
                            charSequence = v7.n.a(pVar.n(), i11);
                        }
                        if (i11 == 5) {
                            int i14 = pVar.l0.l;
                            if (i14 == 0 || i14 == 3) {
                                pVar.U(i11, charSequence);
                            }
                            pVar.O();
                        } else {
                            if (pVar.l0.w) {
                                pVar.T(i11, charSequence);
                            } else {
                                pVar.W(charSequence);
                                Handler handler = pVar.k0;
                                f fVar = new f(pVar, i11, charSequence, 1);
                                Context n11 = pVar.n();
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
                                handler.postDelayed(fVar, i13);
                            }
                            pVar.l0.w = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = pVar.q(R.string.default_error_msg) + " " + i11;
                        }
                        pVar.T(i11, charSequence);
                    }
                    pVar.l0.d(null);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    pVar.N(1);
                    pVar.O();
                    x xVar = pVar.l0;
                    if (xVar.x == null) {
                        xVar.x = new androidx.lifecycle.z();
                    }
                    x.h(xVar.x, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
