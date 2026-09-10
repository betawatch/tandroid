package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ln implements sy {
    public final /* synthetic */ Utilities.Callback a;
    public final /* synthetic */ in b;

    public ln(Utilities.Callback callback, in inVar) {
        this.a = callback;
        this.b = inVar;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        this.a.run(new qh.h(document, obj));
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.sy
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        this.a.run(new qh.h(document, null));
        this.b.dismiss(true);
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void i(int i10) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void l(String str) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void o(r51 r51Var) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
