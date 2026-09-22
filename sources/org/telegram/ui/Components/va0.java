package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public interface va0 {
    void M(int i10, int i11, CharSequence charSequence, boolean z10);

    void P(String str);

    void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt t();

    void z(TLRPC.TL_document tL_document, String str, Object obj);
}
