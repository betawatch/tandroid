package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class c21 extends zl0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.e3 = editorAlert;
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean F0(float f7) {
        return f7 >= ((float) ((AndroidUtilities.dp(48.0f) + this.e3.E) + AndroidUtilities.statusBarHeight));
    }
}
