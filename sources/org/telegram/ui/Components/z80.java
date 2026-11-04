package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public interface z80 {
    void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i3);

    Paint.FontMetricsInt n();

    void q(TLRPC.TL_document tL_document, String str, Object obj);

    void t(int i3, int i10, CharSequence charSequence, boolean z10);

    void w(String str);
}
