package androidx.biometric;

import a8.k1;
import a8.n1;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ i(q qVar, int i7) {
        this.a = i7;
        this.b = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
    
        if (r11 == false) goto L75;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(Object obj) {
        boolean z9;
        int i7 = this.a;
        int i10 = 0;
        CharSequence charSequence = null;
        q qVar = this.b;
        switch (i7) {
            case 0:
                e eVar = (e) obj;
                if (eVar != null) {
                    int i11 = eVar.a;
                    CharSequence charSequence2 = eVar.b;
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
                    if (i12 < 29 && ((i11 == 7 || i11 == 9) && n10 != null)) {
                        KeyguardManager a10 = h0.a(n10);
                        if ((a10 == null ? false : h0.b(a10)) && k1.a(qVar.l0.c())) {
                            qVar.S();
                            qVar.l0.d(null);
                            break;
                        }
                    }
                    if (qVar.R()) {
                        if (charSequence2 == null) {
                            charSequence2 = n1.a(qVar.n(), i11);
                        }
                        if (i11 == 5) {
                            int i13 = qVar.l0.l;
                            if (i13 == 0 || i13 == 3) {
                                qVar.U(i11, charSequence2);
                            }
                            qVar.O();
                        } else {
                            if (qVar.l0.w) {
                                qVar.T(i11, charSequence2);
                            } else {
                                qVar.W(charSequence2);
                                Handler handler = qVar.k0;
                                f fVar = new f(qVar, i11, charSequence2, 1);
                                Context n11 = qVar.n();
                                if (n11 != null) {
                                    String str = Build.MODEL;
                                    if (i12 == 28 && str != null) {
                                        for (String str2 : n11.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                            if (str.startsWith(str2)) {
                                                z9 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z9 = false;
                                    break;
                                }
                                i10 = 2000;
                                handler.postDelayed(fVar, i10);
                            }
                            qVar.l0.w = true;
                        }
                    } else {
                        if (charSequence2 == null) {
                            charSequence2 = qVar.q(R.string.default_error_msg) + " " + i11;
                        }
                        qVar.T(i11, charSequence2);
                    }
                    qVar.l0.d(null);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.Q()) {
                        qVar.S();
                    } else {
                        z zVar = qVar.l0;
                        String str3 = zVar.k;
                        if (str3 != null) {
                            charSequence = str3;
                        } else {
                            m6.n nVar = zVar.f;
                            if (nVar != null && (charSequence = (CharSequence) nVar.d) == null) {
                                charSequence = "";
                            }
                        }
                        if (charSequence == null) {
                            charSequence = qVar.q(R.string.default_error_msg);
                        }
                        qVar.T(13, charSequence);
                        qVar.N(2);
                    }
                    qVar.l0.g(false);
                    break;
                }
                break;
        }
    }
}
