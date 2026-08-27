package androidx.biometric;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.internal.play_billing.r1;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ i(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // androidx.lifecycle.a0
    public final void J(Object obj) {
        int i10;
        switch (this.a) {
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
                    p pVar = this.b;
                    Context n10 = pVar.n();
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 < 29 && ((i11 == 7 || i11 == 9) && n10 != null && g7.o.b(n10) && r1.a(pVar.h0.c()))) {
                        pVar.S();
                    } else if (pVar.R()) {
                        if (charSequence == null) {
                            charSequence = g7.n.a(pVar.n(), i11);
                        }
                        if (i11 == 5) {
                            int i13 = pVar.h0.l;
                            if (i13 == 0 || i13 == 3) {
                                pVar.U(i11, charSequence);
                            }
                            pVar.O();
                        } else {
                            if (pVar.h0.w) {
                                pVar.T(i11, charSequence);
                            } else {
                                pVar.W(charSequence);
                                Handler handler = pVar.g0;
                                f fVar = new f(pVar, i11, charSequence, 1);
                                Context n11 = pVar.n();
                                if (n11 != null) {
                                    String str = Build.MODEL;
                                    if (i12 == 28 && str != null) {
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
                            pVar.h0.w = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = pVar.q(R.string.default_error_msg) + " " + i11;
                        }
                        pVar.T(i11, charSequence);
                    }
                    pVar.h0.d(null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    p pVar2 = this.b;
                    pVar2.N(1);
                    pVar2.O();
                    y yVar = pVar2.h0;
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
