package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public interface ny {
    boolean A();

    long a();

    boolean b();

    boolean c();

    void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10);

    void e(Object obj, Object obj2);

    int f();

    boolean g();

    void h(TLRPC.StickerSetCovered stickerSetCovered);

    void i(int i10);

    boolean j();

    boolean k();

    void l(String str);

    void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10);

    void n();

    void o(t51 t51Var);

    float p();

    void q();

    void r(TLRPC.StickerSetCovered stickerSetCovered);

    void s(int i10);

    void t(ArrayList arrayList);

    void u();

    void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11);

    void w();

    void x(long j3, TLRPC.Document document, String str, boolean z10);

    void y(long j3);

    boolean z();
}
