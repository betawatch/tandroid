package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l01 extends zk0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.T2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.zk0
    public final boolean E0(float f10) {
        return f10 >= ((float) ((AndroidUtilities.dp(48.0f) + this.T2.A) + AndroidUtilities.statusBarHeight));
    }
}
