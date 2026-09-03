package androidx.biometric;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ i(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // androidx.lifecycle.a0
    public final void G(Object obj) {
        int i10;
        int i11 = this.a;
        q qVar = this.b;
        switch (i11) {
            case 0:
                e eVar = (e) obj;
                if (eVar != null) {
                    int i12 = eVar.a;
                    CharSequence charSequence = eVar.b;
                    switch (i12) {
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
                            i12 = 8;
                            break;
                    }
                    Context n10 = qVar.n();
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 < 29 && ((i12 == 7 || i12 == 9) && n10 != null && j7.m.b(n10) && com.google.android.gms.internal.cast.n.a(qVar.i0.c()))) {
                        qVar.S();
                    } else if (qVar.R()) {
                        if (charSequence == null) {
                            charSequence = h7.s.a(qVar.n(), i12);
                        }
                        if (i12 == 5) {
                            int i14 = qVar.i0.l;
                            if (i14 == 0 || i14 == 3) {
                                qVar.U(i12, charSequence);
                            }
                            qVar.O();
                        } else {
                            if (qVar.i0.w) {
                                qVar.T(i12, charSequence);
                            } else {
                                qVar.W(charSequence);
                                Handler handler = qVar.h0;
                                f fVar = new f(qVar, i12, charSequence, 1);
                                Context n11 = qVar.n();
                                if (n11 != null) {
                                    String str = Build.MODEL;
                                    if (i13 == 28 && str != null) {
                                        i10 = 0;
                                        for (String str2 : n11.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                            if (str.startsWith(str2)) {
                                                handler.postDelayed(fVar, i10);
                                            }
                                        }
                                    }
                                }
                                i10 = 2000;
                                handler.postDelayed(fVar, i10);
                            }
                            qVar.i0.w = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = qVar.q(R.string.default_error_msg) + " " + i12;
                        }
                        qVar.T(i12, charSequence);
                    }
                    qVar.i0.d(null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    qVar.N(1);
                    qVar.O();
                    z zVar = qVar.i0;
                    if (zVar.x == null) {
                        zVar.x = new androidx.lifecycle.z();
                    }
                    z.h(zVar.x, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
