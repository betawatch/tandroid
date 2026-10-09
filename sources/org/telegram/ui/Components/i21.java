package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i21 extends qm0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.V2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean E0(float f7) {
        return f7 >= ((float) ((AndroidUtilities.dp(48.0f) + this.V2.E) + AndroidUtilities.statusBarHeight));
    }
}
