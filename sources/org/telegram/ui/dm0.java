package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dm0 implements Comparator {
    public final /* synthetic */ wm0 a;

    public dm0(wm0 wm0Var) {
        this.a = wm0Var;
    }

    public final int a(TLRPC.SecureValueError secureValueError) {
        if (secureValueError instanceof TLRPC.TL_secureValueError) {
            return 0;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
            return 1;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
            return 2;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
            return 3;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
            return 4;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
            return 5;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
            return 6;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
            return 7;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
            return wm0.B0(this.a, ((TLRPC.TL_secureValueErrorData) secureValueError).field);
        }
        return 100;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((TLRPC.SecureValueError) obj);
        int a3 = a((TLRPC.SecureValueError) obj2);
        if (a2 < a3) {
            return -1;
        }
        return a2 > a3 ? 1 : 0;
    }
}
