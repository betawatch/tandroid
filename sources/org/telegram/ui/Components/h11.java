package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h11 extends tl0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.U2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean E0(float f10) {
        return f10 >= ((float) ((AndroidUtilities.dp(48.0f) + this.U2.B) + AndroidUtilities.statusBarHeight));
    }
}
