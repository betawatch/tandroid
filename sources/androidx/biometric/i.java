package androidx.biometric;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ i(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // androidx.lifecycle.a0
    public final void r0(Object obj) {
        int i10;
        int i11 = this.a;
        p pVar = this.b;
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
                    Context n10 = pVar.n();
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 < 29 && ((i12 == 7 || i12 == 9) && n10 != null && v7.q.b(n10) && v7.m.a(pVar.l0.c()))) {
                        pVar.S();
                    } else if (pVar.R()) {
                        if (charSequence == null) {
                            charSequence = v7.p.a(pVar.n(), i12);
                        }
                        if (i12 == 5) {
                            int i14 = pVar.l0.l;
                            if (i14 == 0 || i14 == 3) {
                                pVar.U(i12, charSequence);
                            }
                            pVar.O();
                        } else {
                            if (pVar.l0.w) {
                                pVar.T(i12, charSequence);
                            } else {
                                pVar.W(charSequence);
                                Handler handler = pVar.k0;
                                f fVar = new f(pVar, i12, charSequence, 1);
                                Context n11 = pVar.n();
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
                            pVar.l0.w = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = pVar.q(R.string.default_error_msg) + " " + i12;
                        }
                        pVar.T(i12, charSequence);
                    }
                    pVar.l0.d(null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    pVar.N(1);
                    pVar.O();
                    y yVar = pVar.l0;
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
