package androidx.biometric;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ i(q qVar, int i9) {
        this.a = i9;
        this.b = qVar;
    }

    @Override // androidx.lifecycle.a0
    public final void E(Object obj) {
        int i9;
        int i10 = this.a;
        q qVar = this.b;
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
                    Context n10 = qVar.n();
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 < 29 && ((i11 == 7 || i11 == 9) && n10 != null && f7.q.b(n10) && f7.m.a(qVar.h0.c()))) {
                        qVar.S();
                    } else if (qVar.R()) {
                        if (charSequence == null) {
                            charSequence = f7.p.a(qVar.n(), i11);
                        }
                        if (i11 == 5) {
                            int i13 = qVar.h0.l;
                            if (i13 == 0 || i13 == 3) {
                                qVar.U(i11, charSequence);
                            }
                            qVar.O();
                        } else {
                            if (qVar.h0.w) {
                                qVar.T(i11, charSequence);
                            } else {
                                qVar.W(charSequence);
                                Handler handler = qVar.g0;
                                f fVar = new f(qVar, i11, charSequence, 1);
                                Context n11 = qVar.n();
                                if (n11 != null) {
                                    String str = Build.MODEL;
                                    if (i12 == 28 && str != null) {
                                        i9 = 0;
                                        for (String str2 : n11.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                            if (str.startsWith(str2)) {
                                                handler.postDelayed(fVar, i9);
                                            }
                                        }
                                    }
                                }
                                i9 = 2000;
                                handler.postDelayed(fVar, i9);
                            }
                            qVar.h0.w = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = qVar.q(R.string.default_error_msg) + " " + i11;
                        }
                        qVar.T(i11, charSequence);
                    }
                    qVar.h0.d(null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    qVar.N(1);
                    qVar.O();
                    y yVar = qVar.h0;
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
