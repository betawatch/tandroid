package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g11 extends sl0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.U2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean E0(float f10) {
        return f10 >= ((float) ((AndroidUtilities.dp(48.0f) + this.U2.B) + AndroidUtilities.statusBarHeight));
    }
}
