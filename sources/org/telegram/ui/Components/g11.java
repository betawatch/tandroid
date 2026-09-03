package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
