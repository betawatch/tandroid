package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;

/* loaded from: classes4.dex */
public final /* synthetic */ class ChatActivity$$ExternalSyntheticLambda252 implements IBlur3Capture {
    public final /* synthetic */ ChatActivity.ChatActivityFragmentView f$0;

    public /* synthetic */ ChatActivity$$ExternalSyntheticLambda252(ChatActivity.ChatActivityFragmentView chatActivityFragmentView) {
        this.f$0 = chatActivityFragmentView;
    }

    @Override // org.telegram.ui.Components.blur3.capture.IBlur3Capture
    public final void capture(Canvas canvas, RectF rectF) {
        this.f$0.drawList(canvas, rectF);
    }

    @Override // org.telegram.ui.Components.blur3.capture.IBlur3Capture
    public /* synthetic */ void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
        iBlur3Hash.unsupported();
    }
}
