package androidx.biometric;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ j(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // androidx.lifecycle.a0
    public final void m0(Object obj) {
        int i10;
        int i11 = this.a;
        r rVar = this.b;
        switch (i11) {
            case 0:
                f fVar = (f) obj;
                if (fVar != null) {
                    int i12 = fVar.a;
                    CharSequence charSequence = fVar.b;
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
                    Context n10 = rVar.n();
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 < 29 && ((i12 == 7 || i12 == 9) && n10 != null && j7.m.b(n10) && com.google.android.gms.internal.cast.n.a(rVar.i0.c()))) {
                        rVar.S();
                    } else if (rVar.R()) {
                        if (charSequence == null) {
                            charSequence = h7.s.a(rVar.n(), i12);
                        }
                        if (i12 == 5) {
                            int i14 = rVar.i0.l;
                            if (i14 == 0 || i14 == 3) {
                                rVar.U(i12, charSequence);
                            }
                            rVar.O();
                        } else {
                            if (rVar.i0.w) {
                                rVar.T(i12, charSequence);
                            } else {
                                rVar.W(charSequence);
                                Handler handler = rVar.h0;
                                g gVar = new g(rVar, i12, charSequence, 1);
                                Context n11 = rVar.n();
                                if (n11 != null) {
                                    String str = Build.MODEL;
                                    if (i13 == 28 && str != null) {
                                        i10 = 0;
                                        for (String str2 : n11.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                            if (str.startsWith(str2)) {
                                                handler.postDelayed(gVar, i10);
                                            }
                                        }
                                    }
                                }
                                i10 = 2000;
                                handler.postDelayed(gVar, i10);
                            }
                            rVar.i0.w = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = rVar.q(R.string.default_error_msg) + " " + i12;
                        }
                        rVar.T(i12, charSequence);
                    }
                    rVar.i0.d(null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    rVar.N(1);
                    rVar.O();
                    a0 a0Var = rVar.i0;
                    if (a0Var.x == null) {
                        a0Var.x = new androidx.lifecycle.z();
                    }
                    a0.h(a0Var.x, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
